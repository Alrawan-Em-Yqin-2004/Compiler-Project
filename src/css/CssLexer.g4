lexer grammar CssLexer;


fragment HEX     : [0-9a-fA-F] ;
fragment ESC     : '\\' ( HEX+ [ \t\r\n\f]? | ~[\r\n\f0-9a-fA-F] ) ;
fragment NMSTART : [a-zA-Z_] | ~[\u0000-\u007F] | ESC ;
fragment NMCHAR  : [a-zA-Z0-9_-] | ~[\u0000-\u007F] | ESC ;
fragment IDENT_F : '-'? '-'? NMSTART NMCHAR* ;
fragment NUM_F   : [0-9]+ ('.' [0-9]+)? | '.' [0-9]+ ;
fragment DQ_STR  : '"'  ( ~["\r\n\\] | '\\' . )* '"' ;
fragment SQ_STR  : '\'' ( ~['\r\n\\] | '\\' . )* '\'' ;

COMMENT : '/*' .*? '*/' -> skip ;
WS      : [ \t\r\n\f]+ ;

LBRACE  : '{' ;
RBRACE  : '}' ;
SEMI    : ';' ;
DCOLON  : '::' ;
COLON   : ':' ;
COMMA   : ',' ;
GT      : '>' ;
PLUS    : '+' ;
TILDE   : '~' ;
STAR    : '*' ;
DOT     : '.' ;
SLASH   : '/' ;
MINUS   : '-' ;
AMP     : '&' ;
LBRACK  : '[' ;
RBRACK  : ']' ;
LPAREN  : '(' ;
RPAREN  : ')' ;

EQ        : '=' ;
INCLUDES  : '~=' ;
DASHMATCH : '|=' ;
PREFIXM   : '^=' ;
SUFFIXM   : '$=' ;
SUBSTRM   : '*=' ;

AT_KEYWORD : '@' IDENT_F ;                             
IMPORTANT  : '!' [ \t\r\n\f]* [iI][mM][pP][oO][rR][tT][aA][nN][tT] ;

URL        : [uU][rR][lL] '(' [ \t\r\n\f]* ~[)"' \t\r\n\f(]+ [ \t\r\n\f]* ')' ;

UNICODE_RANGE : [uU] '+' ( HEX | '?' )+ ( '-' HEX+ )? ;  

STRING     : DQ_STR | SQ_STR ;
HASH       : '#' NMCHAR+ ;                                
FUNCTION   : IDENT_F '(' ;                                
DIMENSION  : [+-]? NUM_F IDENT_F ;                        
PERCENTAGE : [+-]? NUM_F '%' ;
NUMBER     : [+-]? NUM_F ;
IDENT      : IDENT_F ;

DELIM      : . ;
