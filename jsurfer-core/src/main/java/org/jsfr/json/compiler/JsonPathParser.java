// Generated from C:/work/JsonSurfer/jsurfer-core/src/main/resources\JsonPath.g4 by ANTLR 4.9.1

package org.jsfr.json.compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, OPEN_SQ_BRACKET=16, 
		CLOSE_SQ_BRACKET=17, TO=18, COMMA=19, COLON=20, NegationOperator=21, AndOperator=22, 
		OrOperator=23, NUM=24, QUOTED_STRING=25, REGEX=26, BOOL=27, KEY=28, WS=29;
	public static final int
		RULE_path = 0, RULE_relativePath = 1, RULE_searchChild = 2, RULE_search = 3, 
		RULE_anyChild = 4, RULE_anyIndex = 5, RULE_any = 6, RULE_index = 7, RULE_indexes = 8, 
		RULE_slicing = 9, RULE_childNode = 10, RULE_childrenNode = 11, RULE_filter = 12, 
		RULE_filterExpr = 13, RULE_filterExist = 14, RULE_filterGtNum = 15, RULE_filterLtNum = 16, 
		RULE_filterEqualNum = 17, RULE_filterEqualBool = 18, RULE_filterEqualStr = 19, 
		RULE_filterMatchRegex = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"path", "relativePath", "searchChild", "search", "anyChild", "anyIndex", 
			"any", "index", "indexes", "slicing", "childNode", "childrenNode", "filter", 
			"filterExpr", "filterExist", "filterGtNum", "filterLtNum", "filterEqualNum", 
			"filterEqualBool", "filterEqualStr", "filterMatchRegex"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'..'", "'.*'", "'[*]'", "'*'", "'.'", "'[?('", "')]'", 
			"'('", "')'", "'@'", "'>'", "'<'", "'=='", "'=~'", "'['", "']'", "'to'", 
			"','", "':'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "OPEN_SQ_BRACKET", "CLOSE_SQ_BRACKET", "TO", 
			"COMMA", "COLON", "NegationOperator", "AndOperator", "OrOperator", "NUM", 
			"QUOTED_STRING", "REGEX", "BOOL", "KEY", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JsonPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JsonPathParser.EOF, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OPEN_SQ_BRACKET))) != 0)) {
				{
				{
				setState(43);
				relativePath();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativePathContext extends ParserRuleContext {
		public SearchChildContext searchChild() {
			return getRuleContext(SearchChildContext.class,0);
		}
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public SlicingContext slicing() {
			return getRuleContext(SlicingContext.class,0);
		}
		public ChildNodeContext childNode() {
			return getRuleContext(ChildNodeContext.class,0);
		}
		public ChildrenNodeContext childrenNode() {
			return getRuleContext(ChildrenNodeContext.class,0);
		}
		public AnyChildContext anyChild() {
			return getRuleContext(AnyChildContext.class,0);
		}
		public AnyIndexContext anyIndex() {
			return getRuleContext(AnyIndexContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public RelativePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePath; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitRelativePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativePathContext relativePath() throws RecognitionException {
		RelativePathContext _localctx = new RelativePathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_relativePath);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				searchChild();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				search();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				index();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				indexes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				slicing();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				childNode();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				childrenNode();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				anyChild();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				anyIndex();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(60);
				any();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(61);
				filter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchChildContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(JsonPathParser.KEY, 0); }
		public SearchChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchChild; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitSearchChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchChildContext searchChild() throws RecognitionException {
		SearchChildContext _localctx = new SearchChildContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_searchChild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(65);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchContext extends ParserRuleContext {
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_search);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyChildContext extends ParserRuleContext {
		public AnyChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyChild; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitAnyChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyChildContext anyChild() throws RecognitionException {
		AnyChildContext _localctx = new AnyChildContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anyChild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyIndexContext extends ParserRuleContext {
		public AnyIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitAnyIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyIndexContext anyIndex() throws RecognitionException {
		AnyIndexContext _localctx = new AnyIndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_anyIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyContext extends ParserRuleContext {
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQ_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(75);
				match(OPEN_SQ_BRACKET);
				setState(76);
				match(NUM);
				setState(77);
				match(CLOSE_SQ_BRACKET);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78);
				match(T__5);
				setState(79);
				match(NUM);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexesContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public List<TerminalNode> NUM() { return getTokens(JsonPathParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(JsonPathParser.NUM, i);
		}
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public List<TerminalNode> TO() { return getTokens(JsonPathParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(JsonPathParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_indexes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(OPEN_SQ_BRACKET);
			setState(83);
			match(NUM);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(84);
				match(TO);
				setState(85);
				match(NUM);
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				match(NUM);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(90);
					match(TO);
					setState(91);
					match(NUM);
					}
				}

				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(CLOSE_SQ_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlicingContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(JsonPathParser.COLON, 0); }
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public List<TerminalNode> NUM() { return getTokens(JsonPathParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(JsonPathParser.NUM, i);
		}
		public SlicingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitSlicing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicingContext slicing() throws RecognitionException {
		SlicingContext _localctx = new SlicingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_slicing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(OPEN_SQ_BRACKET);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(102);
				match(NUM);
				}
			}

			setState(105);
			match(COLON);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(106);
				match(NUM);
				}
			}

			setState(109);
			match(CLOSE_SQ_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildNodeContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(JsonPathParser.KEY, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public ChildNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childNode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitChildNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildNodeContext childNode() throws RecognitionException {
		ChildNodeContext _localctx = new ChildNodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_childNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__5);
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildrenNodeContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ_BRACKET() { return getToken(JsonPathParser.OPEN_SQ_BRACKET, 0); }
		public List<TerminalNode> QUOTED_STRING() { return getTokens(JsonPathParser.QUOTED_STRING); }
		public TerminalNode QUOTED_STRING(int i) {
			return getToken(JsonPathParser.QUOTED_STRING, i);
		}
		public TerminalNode CLOSE_SQ_BRACKET() { return getToken(JsonPathParser.CLOSE_SQ_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public ChildrenNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childrenNode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitChildrenNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenNodeContext childrenNode() throws RecognitionException {
		ChildrenNodeContext _localctx = new ChildrenNodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_childrenNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(OPEN_SQ_BRACKET);
			setState(115);
			match(QUOTED_STRING);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				match(QUOTED_STRING);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(CLOSE_SQ_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterExprContext filterExpr() {
			return getRuleContext(FilterExprContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__6);
			setState(126);
			filterExpr(0);
			setState(127);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterExprContext extends ParserRuleContext {
		public TerminalNode NegationOperator() { return getToken(JsonPathParser.NegationOperator, 0); }
		public List<FilterExprContext> filterExpr() {
			return getRuleContexts(FilterExprContext.class);
		}
		public FilterExprContext filterExpr(int i) {
			return getRuleContext(FilterExprContext.class,i);
		}
		public FilterEqualNumContext filterEqualNum() {
			return getRuleContext(FilterEqualNumContext.class,0);
		}
		public FilterEqualStrContext filterEqualStr() {
			return getRuleContext(FilterEqualStrContext.class,0);
		}
		public FilterMatchRegexContext filterMatchRegex() {
			return getRuleContext(FilterMatchRegexContext.class,0);
		}
		public FilterEqualBoolContext filterEqualBool() {
			return getRuleContext(FilterEqualBoolContext.class,0);
		}
		public FilterGtNumContext filterGtNum() {
			return getRuleContext(FilterGtNumContext.class,0);
		}
		public FilterLtNumContext filterLtNum() {
			return getRuleContext(FilterLtNumContext.class,0);
		}
		public FilterExistContext filterExist() {
			return getRuleContext(FilterExistContext.class,0);
		}
		public TerminalNode AndOperator() { return getToken(JsonPathParser.AndOperator, 0); }
		public TerminalNode OrOperator() { return getToken(JsonPathParser.OrOperator, 0); }
		public FilterExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExprContext filterExpr() throws RecognitionException {
		return filterExpr(0);
	}

	private FilterExprContext filterExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterExprContext _localctx = new FilterExprContext(_ctx, _parentState);
		FilterExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_filterExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(130);
				match(NegationOperator);
				setState(131);
				match(T__8);
				setState(132);
				filterExpr(0);
				setState(133);
				match(T__9);
				}
				break;
			case 2:
				{
				setState(135);
				filterEqualNum();
				}
				break;
			case 3:
				{
				setState(136);
				filterEqualStr();
				}
				break;
			case 4:
				{
				setState(137);
				filterMatchRegex();
				}
				break;
			case 5:
				{
				setState(138);
				filterEqualBool();
				}
				break;
			case 6:
				{
				setState(139);
				filterGtNum();
				}
				break;
			case 7:
				{
				setState(140);
				filterLtNum();
				}
				break;
			case 8:
				{
				setState(141);
				filterExist();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(144);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(145);
						match(AndOperator);
						setState(146);
						filterExpr(10);
						}
						break;
					case 2:
						{
						_localctx = new FilterExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_filterExpr);
						setState(147);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(148);
						match(OrOperator);
						setState(149);
						filterExpr(9);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterExistContext extends ParserRuleContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExistContext filterExist() throws RecognitionException {
		FilterExistContext _localctx = new FilterExistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filterExist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__10);
			setState(157); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					relativePath();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterGtNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterGtNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterGtNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterGtNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterGtNumContext filterGtNum() throws RecognitionException {
		FilterGtNumContext _localctx = new FilterGtNumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filterGtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__10);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				relativePath();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OPEN_SQ_BRACKET))) != 0) );
			setState(167);
			match(T__11);
			setState(168);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterLtNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterLtNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterLtNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterLtNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterLtNumContext filterLtNum() throws RecognitionException {
		FilterLtNumContext _localctx = new FilterLtNumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_filterLtNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__10);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				relativePath();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OPEN_SQ_BRACKET))) != 0) );
			setState(176);
			match(T__12);
			setState(177);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterEqualNumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(JsonPathParser.NUM, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterEqualNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualNumContext filterEqualNum() throws RecognitionException {
		FilterEqualNumContext _localctx = new FilterEqualNumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_filterEqualNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__10);
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				relativePath();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OPEN_SQ_BRACKET))) != 0) );
			setState(185);
			match(T__13);
			setState(186);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterEqualBoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(JsonPathParser.BOOL, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterEqualBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualBoolContext filterEqualBool() throws RecognitionException {
		FilterEqualBoolContext _localctx = new FilterEqualBoolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_filterEqualBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__10);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				relativePath();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OPEN_SQ_BRACKET))) != 0) );
			setState(194);
			match(T__13);
			setState(195);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterEqualStrContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(JsonPathParser.QUOTED_STRING, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterEqualStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterEqualStr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterEqualStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterEqualStrContext filterEqualStr() throws RecognitionException {
		FilterEqualStrContext _localctx = new FilterEqualStrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_filterEqualStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__10);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				relativePath();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OPEN_SQ_BRACKET))) != 0) );
			setState(203);
			match(T__13);
			setState(204);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterMatchRegexContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(JsonPathParser.REGEX, 0); }
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public FilterMatchRegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterMatchRegex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonPathVisitor ) return ((JsonPathVisitor<? extends T>)visitor).visitFilterMatchRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterMatchRegexContext filterMatchRegex() throws RecognitionException {
		FilterMatchRegexContext _localctx = new FilterMatchRegexContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_filterMatchRegex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__10);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				relativePath();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << OPEN_SQ_BRACKET))) != 0) );
			setState(212);
			match(T__14);
			setState(213);
			match(REGEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return filterExpr_sempred((FilterExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filterExpr_sempred(FilterExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tS\n\t"+
		"\3\n\3\n\3\n\3\n\5\nY\n\n\3\n\3\n\3\n\3\n\5\n_\n\n\7\na\n\n\f\n\16\nd"+
		"\13\n\3\n\3\n\3\13\3\13\5\13j\n\13\3\13\3\13\5\13n\n\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0091\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0099\n\17\f\17\16"+
		"\17\u009c\13\17\3\20\3\20\6\20\u00a0\n\20\r\20\16\20\u00a1\3\21\3\21\6"+
		"\21\u00a6\n\21\r\21\16\21\u00a7\3\21\3\21\3\21\3\22\3\22\6\22\u00af\n"+
		"\22\r\22\16\22\u00b0\3\22\3\22\3\22\3\23\3\23\6\23\u00b8\n\23\r\23\16"+
		"\23\u00b9\3\23\3\23\3\23\3\24\3\24\6\24\u00c1\n\24\r\24\16\24\u00c2\3"+
		"\24\3\24\3\24\3\25\3\25\6\25\u00ca\n\25\r\25\16\25\u00cb\3\25\3\25\3\25"+
		"\3\26\3\26\6\26\u00d3\n\26\r\26\16\26\u00d4\3\26\3\26\3\26\3\26\2\3\34"+
		"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\4\2\33\33\36\36"+
		"\2\u00e6\2,\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fI\3\2"+
		"\2\2\16K\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24g\3\2\2\2\26q\3\2\2\2\30t\3"+
		"\2\2\2\32\177\3\2\2\2\34\u0090\3\2\2\2\36\u009d\3\2\2\2 \u00a3\3\2\2\2"+
		"\"\u00ac\3\2\2\2$\u00b5\3\2\2\2&\u00be\3\2\2\2(\u00c7\3\2\2\2*\u00d0\3"+
		"\2\2\2,\60\7\3\2\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3"+
		"\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65A\5\6"+
		"\4\2\66A\5\b\5\2\67A\5\20\t\28A\5\22\n\29A\5\24\13\2:A\5\26\f\2;A\5\30"+
		"\r\2<A\5\n\6\2=A\5\f\7\2>A\5\16\b\2?A\5\32\16\2@\65\3\2\2\2@\66\3\2\2"+
		"\2@\67\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2"+
		"\2\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BC\7\4\2\2CD\7\36\2\2D\7\3\2\2\2EF"+
		"\7\4\2\2F\t\3\2\2\2GH\7\5\2\2H\13\3\2\2\2IJ\7\6\2\2J\r\3\2\2\2KL\7\7\2"+
		"\2L\17\3\2\2\2MN\7\22\2\2NO\7\32\2\2OS\7\23\2\2PQ\7\b\2\2QS\7\32\2\2R"+
		"M\3\2\2\2RP\3\2\2\2S\21\3\2\2\2TU\7\22\2\2UX\7\32\2\2VW\7\24\2\2WY\7\32"+
		"\2\2XV\3\2\2\2XY\3\2\2\2Yb\3\2\2\2Z[\7\25\2\2[^\7\32\2\2\\]\7\24\2\2]"+
		"_\7\32\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\23\2\2f\23\3\2\2\2gi\7\22\2\2hj\7"+
		"\32\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\26\2\2ln\7\32\2\2ml\3\2\2\2"+
		"mn\3\2\2\2no\3\2\2\2op\7\23\2\2p\25\3\2\2\2qr\7\b\2\2rs\t\2\2\2s\27\3"+
		"\2\2\2tu\7\22\2\2uz\7\33\2\2vw\7\25\2\2wy\7\33\2\2xv\3\2\2\2y|\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\23\2\2~\31\3\2\2\2\177\u0080"+
		"\7\t\2\2\u0080\u0081\5\34\17\2\u0081\u0082\7\n\2\2\u0082\33\3\2\2\2\u0083"+
		"\u0084\b\17\1\2\u0084\u0085\7\27\2\2\u0085\u0086\7\13\2\2\u0086\u0087"+
		"\5\34\17\2\u0087\u0088\7\f\2\2\u0088\u0091\3\2\2\2\u0089\u0091\5$\23\2"+
		"\u008a\u0091\5(\25\2\u008b\u0091\5*\26\2\u008c\u0091\5&\24\2\u008d\u0091"+
		"\5 \21\2\u008e\u0091\5\"\22\2\u008f\u0091\5\36\20\2\u0090\u0083\3\2\2"+
		"\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c"+
		"\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u009a\3\2\2\2\u0092\u0093\f\13\2\2\u0093\u0094\7\30\2\2\u0094\u0099\5"+
		"\34\17\f\u0095\u0096\f\n\2\2\u0096\u0097\7\31\2\2\u0097\u0099\5\34\17"+
		"\13\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\35\3\2\2\2\u009c\u009a\3\2\2"+
		"\2\u009d\u009f\7\r\2\2\u009e\u00a0\5\4\3\2\u009f\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\37\3\2\2\2\u00a3"+
		"\u00a5\7\r\2\2\u00a4\u00a6\5\4\3\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\7\16\2\2\u00aa\u00ab\7\32\2\2\u00ab!\3\2\2\2\u00ac\u00ae\7\r\2"+
		"\2\u00ad\u00af\5\4\3\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\17\2\2"+
		"\u00b3\u00b4\7\32\2\2\u00b4#\3\2\2\2\u00b5\u00b7\7\r\2\2\u00b6\u00b8\5"+
		"\4\3\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\7"+
		"\32\2\2\u00bd%\3\2\2\2\u00be\u00c0\7\r\2\2\u00bf\u00c1\5\4\3\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00c6\7\35\2\2\u00c6\'\3\2\2"+
		"\2\u00c7\u00c9\7\r\2\2\u00c8\u00ca\5\4\3\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\7\20\2\2\u00ce\u00cf\7\33\2\2\u00cf)\3\2\2\2\u00d0\u00d2\7\r\2"+
		"\2\u00d1\u00d3\5\4\3\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\21\2\2"+
		"\u00d7\u00d8\7\34\2\2\u00d8+\3\2\2\2\25\60@RX^bimz\u0090\u0098\u009a\u00a1"+
		"\u00a7\u00b0\u00b9\u00c2\u00cb\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}