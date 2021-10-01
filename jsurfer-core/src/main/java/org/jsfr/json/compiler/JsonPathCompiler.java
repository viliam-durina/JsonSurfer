/*
 * MIT License
 *
 * Copyright (c) 2019 WANG Lingsong
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.jsfr.json.compiler;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jsfr.json.filter.EqualityBoolPredicate;
import org.jsfr.json.filter.EqualityNumPredicate;
import org.jsfr.json.filter.EqualityStrPredicate;
import org.jsfr.json.filter.ExistencePredicate;
import org.jsfr.json.filter.FilterBuilder;
import org.jsfr.json.filter.GreaterThanNumPredicate;
import org.jsfr.json.filter.LessThanNumPredicate;
import org.jsfr.json.filter.MatchRegexPredicate;
import org.jsfr.json.path.JsonPath;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * Created by Leo on 2015/4/1.
 */
public class JsonPathCompiler extends JsonPathBaseVisitor<Void> {

    private JsonPath.Builder pathBuilder;

    private FilterBuilder filterBuilder;

    private JsonPath.Builder filterPathBuilder;

    @Override
    public Void visitPath(JsonPathParser.PathContext ctx) {
        pathBuilder = JsonPath.Builder.start();
        return super.visitPath(ctx);
    }

    private JsonPath.Builder currentPathBuilder() {
        return filterPathBuilder != null ? filterPathBuilder : pathBuilder;
    }

    @Override
    public Void visitSearchChild(JsonPathParser.SearchChildContext ctx) {
        currentPathBuilder().scan().child(ctx.KEY().getText());
        return super.visitSearchChild(ctx);
    }

    @Override
    public Void visitSearch(JsonPathParser.SearchContext ctx) {
        currentPathBuilder().scan();
        return super.visitSearch(ctx);
    }

    @Override
    public Void visitChildNode(JsonPathParser.ChildNodeContext ctx) {
        currentPathBuilder().child(ctx.KEY().getText());
        return super.visitChildNode(ctx);
    }

    @Override
    public Void visitChildrenNode(JsonPathParser.ChildrenNodeContext ctx) {
        int i = 0;
        String[] strings = new String[ctx.QUOTED_STRING().size()];
        for (TerminalNode node : ctx.QUOTED_STRING()) {
            String quotedString = node.getText();
            strings[i++] = removeQuote(quotedString);
        }
        currentPathBuilder().children(strings);
        return super.visitChildren(ctx);
    }

    private String removeQuote(String quotedString) {
        return quotedString.substring(1, quotedString.length() - 1);
    }

    @Override
    public Void visitIndex(JsonPathParser.IndexContext ctx) {
        currentPathBuilder().index(Integer.parseInt(ctx.NUM().getText()));
        return super.visitIndex(ctx);
    }

    @Override
    public Void visitIndexes(JsonPathParser.IndexesContext ctx) {
        Set<Integer> indexes = new HashSet<>();
        TreeMap<Integer, Integer> ranges = new TreeMap<>();
        List<ParseTree> children = ctx.children;
        assert ((TerminalNode) children.get(0)).getSymbol().getType() == JsonPathParser.OPEN_SQ_BRACKET;
        assert ((TerminalNode) children.get(children.size() - 1)).getSymbol().getType() == JsonPathParser.CLOSE_SQ_BRACKET;

        for (int i = 1; i < children.size() - 1; i++) {
            if (((TerminalNode) children.get(i)).getSymbol().getType() == JsonPathParser.COMMA) {
                continue;
            }
            int index = Integer.parseInt(children.get(i).getText());
            if (i + 1 < children.size() && ((TerminalNode) children.get(i + 1)).getSymbol().getType() == JsonPathParser.TO) {
                i += 2;
                int rangeEnd = Integer.parseInt(children.get(i).getText());
                if (rangeEnd < index) {
                    // TODO exception type?
                    // TODO negative indexes?
                    throw new RuntimeException("Array subscript invalid range");
                }
                ranges.put(index, rangeEnd);
            } else {
                indexes.add(index);
            }
        }

        currentPathBuilder().indexes(indexes, ranges);
        return super.visitIndexes(ctx);
    }

    @Override
    public Void visitSlicing(JsonPathParser.SlicingContext ctx) {
        Integer left = null;
        Integer right;
        Integer temp = null;
        for (ParseTree node : ctx.children) {
            if (node instanceof TerminalNode) {
                TerminalNode tNode = (TerminalNode) node;
                if (((TerminalNode) node).getSymbol().getType() == JsonPathParser.COLON) {
                    left = temp;
                    temp = null;
                } else if (tNode.getSymbol().getType() == JsonPathParser.NUM) {
                    temp = Integer.parseInt(tNode.getText());
                }
            }
        }
        right = temp;
        pathBuilder.slicing(left, right);
        return super.visitSlicing(ctx);
    }

    @Override
    public Void visitAnyChild(JsonPathParser.AnyChildContext ctx) {
        currentPathBuilder().anyChild();
        return super.visitAnyChild(ctx);
    }

    @Override
    public Void visitAnyIndex(JsonPathParser.AnyIndexContext ctx) {
        currentPathBuilder().anyIndex();
        return super.visitAnyIndex(ctx);
    }

    @Override
    public Void visitAny(JsonPathParser.AnyContext ctx) {
        currentPathBuilder().any();
        return super.visitAny(ctx);
    }

    @Override
    public Void visitFilter(JsonPathParser.FilterContext ctx) {
        filterBuilder = new FilterBuilder();
        Void rst = super.visitFilter(ctx);
        pathBuilder.arrayFilter(filterBuilder.build());
        return rst;
    }

    @Override
    public Void visitFilterExpr(JsonPathParser.FilterExprContext ctx) {
        Void rst;
        if (ctx.NegationOperator() != null) {
            filterBuilder.startNegationPredicate();
            rst = super.visitFilterExpr(ctx);
            filterBuilder.endNegationAndPredicate();
        }
        else if (ctx.AndOperator() != null) {
            filterBuilder.startAndPredicate();
            rst = super.visitFilterExpr(ctx);
            filterBuilder.endAndPredicate();
        } else if (ctx.OrOperator() != null) {
            filterBuilder.startOrPredicate();
            rst = super.visitFilterExpr(ctx);
            filterBuilder.endOrPredicate();
        } else {
            rst = super.visitFilterExpr(ctx);
        }
        return rst;
    }

    private JsonPath.Builder createFilterPathBuilder() {
        return JsonPath.Builder.startFilterPath();
    }

    @Override
    public Void visitFilterEqualNum(JsonPathParser.FilterEqualNumContext ctx) {
//        JsonPath relativePath = JsonPath.Builder.start().child(ctx.KEY().getText()).build();
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterEqualNum(ctx);
        filterBuilder.append(new EqualityNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterEqualBool(JsonPathParser.FilterEqualBoolContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterEqualBool(ctx);
        filterBuilder.append(new EqualityBoolPredicate(filterPathBuilder.build(), Boolean.parseBoolean(ctx.BOOL().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterExist(JsonPathParser.FilterExistContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterExist(ctx);
        filterBuilder.append(new ExistencePredicate(filterPathBuilder.build()));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterGtNum(JsonPathParser.FilterGtNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterGtNum(ctx);
        filterBuilder.append(new GreaterThanNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterLtNum(JsonPathParser.FilterLtNumContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterLtNum(ctx);
        filterBuilder.append(new LessThanNumPredicate(filterPathBuilder.build(), new BigDecimal(ctx.NUM().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterEqualStr(JsonPathParser.FilterEqualStrContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterEqualStr(ctx);
        filterBuilder.append(new EqualityStrPredicate(filterPathBuilder.build(), removeQuote(ctx.QUOTED_STRING().getText())));
        filterPathBuilder = null;
        return rst;
    }

    @Override
    public Void visitFilterMatchRegex(JsonPathParser.FilterMatchRegexContext ctx) {
        filterPathBuilder = createFilterPathBuilder();
        Void rst = super.visitFilterMatchRegex(ctx);
        filterBuilder.append(new MatchRegexPredicate(filterPathBuilder.build(), toPattern(ctx.REGEX().getText())));
        filterPathBuilder = null;
        return rst;
    }

    private static Pattern toPattern(String str) {
        String[] split = str.split("(?<!\\\\)/"); // slash not escaped by backslash
        if (split.length == 3) { // includes flags
            String regex = split[1];
            String flagsStr = split[2];
            int flags = 0;
            if (flagsStr.contains("i")) flags |= Pattern.CASE_INSENSITIVE;
            if (flagsStr.contains("d")) flags |= Pattern.UNIX_LINES;
            if (flagsStr.contains("m")) flags |= Pattern.MULTILINE;
            if (flagsStr.contains("s")) flags |= Pattern.DOTALL;
            if (flagsStr.contains("u")) flags |= Pattern.UNICODE_CASE;
            if (flagsStr.contains("x")) flags |= Pattern.COMMENTS;
            if (flagsStr.contains("U")) flags |= Pattern.UNICODE_CHARACTER_CLASS;
            return Pattern.compile(regex, flags);
        } else if (split.length == 2 && str.endsWith("/")) { // no flags defined
            String regex = split[1];
            return Pattern.compile(regex);
        } else {
            throw new InputMismatchException("Invalid regex pattern");
        }
    }

    public static JsonPath[] compile(String... paths) {
        JsonPath[] jsonPaths = new JsonPath[paths.length];
        for (int i = 0; i < paths.length; i++) {
            jsonPaths[i] = compile(paths[i]);
        }
        return jsonPaths;
    }

    public static JsonPath compile(String path) {
        JsonPathLexer lexer = new JsonPathLexer(CharStreams.fromString(path));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonPathParser parser = new JsonPathParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());
        JsonPathParser.PathContext tree = parser.path();
        JsonPathCompiler compiler = new JsonPathCompiler();
        compiler.visit(tree);
        return compiler.pathBuilder.build();
    }

//    public static void main(String[] s) {
//        JsonPath path = compile("$..abc.c.d[1].e[2,3,6]");
//        System.out.println(path);
//    }

}
