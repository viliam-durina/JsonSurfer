grammar JsonPath;

@header {
package org.jsfr.json.compiler;
}

path: '$' relativePath* EOF;
relativePath: searchChild|search|index|indexes|slicing|childNode|childrenNode|anyChild|anyIndex|any|filter;
searchChild: '..' KEY;
search: '..' ;
anyChild: '.*' ;
anyIndex: '[*]' ;
any: '*' ;
index: ('[' NUM ']') | ('.' NUM);
OPEN_SQ_BRACKET: '[';
CLOSE_SQ_BRACKET: ']';
TO: 'to';
COMMA: ',';
indexes: OPEN_SQ_BRACKET NUM (TO NUM)? ( COMMA NUM (TO NUM)? ) * CLOSE_SQ_BRACKET ;
slicing: '[' NUM? COLON NUM? ']';
COLON : ':';
childNode: '.' KEY ;
childrenNode: '[' QUOTED_STRING ( ',' QUOTED_STRING )* ']' ;
filter: '[?(' filterExpr ')]';
filterExpr : NegationOperator '(' filterExpr ')'
           | filterExpr AndOperator filterExpr
           | filterExpr OrOperator filterExpr
           | filterEqualNum
           | filterEqualStr
           | filterMatchRegex
           | filterEqualBool
           | filterGtNum
           | filterLtNum
           | filterExist
           ;
filterExist:  '@' relativePath+;
filterGtNum:  '@' relativePath+ '>' NUM;
filterLtNum:  '@' relativePath+ '<' NUM;
filterEqualNum: '@' relativePath+ '==' NUM;
filterEqualBool: '@' relativePath+ '==' BOOL;
filterEqualStr: '@' relativePath+ '==' QUOTED_STRING;
filterMatchRegex: '@' relativePath+ '=~' REGEX;
//exprArrayIdx: '@.length-' NUM;
NegationOperator: '!';
AndOperator: '&&';
OrOperator: '||';
NUM
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;
QUOTED_STRING : ('\'' ( ~('\''|'\\') | ('\\' .) )* '\'') | ('"' ( ~('"'|'\\') | ('\\' .) )* '"');
REGEX : '/' ( ~('/'|'\\') | ('\\' .) )* '/' [idmsuxU]*;
BOOL: 'true'|'false';
KEY :  (ESC | ~(["\\] | '.' | '*' | '[' | ']' | '(' | ')' | ',' | ':'| '=' | '@' | '?' | '&' | '|' | '>' | '<' | '\''| '!' | [ \t\n\r]))+  ;

fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

WS  :   [ \t\n\r]+ -> skip ;


