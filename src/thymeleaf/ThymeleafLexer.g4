
lexer grammar ThymeleafLexer;

options { caseInsensitive = true; }

tokens { PIPE_CLOSE }

COMMENT     : '<!--' .*? '-->'                    -> skip ;   
DECLARATION : '<!' ~[>]* '>'                      -> skip ;  
SCRIPT_ELEM : '<script' ~[>]* '>' .*? '</script' ~[>]* '>' -> skip ;  
STYLE_ELEM  : '<style'  ~[>]* '>' .*? '</style'  ~[>]* '>' -> skip ;  
INLINE_OPEN : ('[[' | '[(')                       -> pushMode(INLINE) ;
TAG_OPEN    : '<'                                 -> pushMode(TAGNAME) ;
TEXT        : ~[<[]+ | '[' ;

mode TAGNAME;
TAG_SLASH : '/' ;
// void elements: no closing tag  (<br> <img ...> <meta ...>)
VOID_NAME : ('area' | 'base' | 'br' | 'col' | 'embed' | 'hr' | 'img' | 'input'
            | 'link' | 'meta' | 'param' | 'source' | 'track' | 'wbr')   -> mode(TAG) ;
TAG_NAME  : ~[ \t\r\n/>]+                         -> mode(TAG) ;

mode TAG;
TAG_END       : '>'                               -> popMode ;
TAG_SELF_END  : '/>'                              -> popMode ;
TH_ATTR_NAME  : ('th:' | 'data-th-') [a-z0-9_.-]+ -> pushMode(TH_ATTR) ;
ATTR_NAME     : ~[ \t\r\n"'<>/=]+ ;
ATTR_EQ       : '=' ;
ATTR_VALUE    : '"' ~["]* '"' | '\'' ~[']* '\'' ;
TAG_WS        : [ \t\r\n]+                        -> skip ;

mode TH_ATTR;
TH_EQUALS     : '=' ;
TH_DQ_OPEN    : '"'                               -> mode(EXPR) ;      
TH_RAW_VALUE  : '\'' ~['\r\n]* '\''               -> popMode ;        
TH_TAG_END    : '>'  -> type(TAG_END), popMode, popMode ;
TH_TAG_SELF   : '/>' -> type(TAG_SELF_END), popMode, popMode ;
TH_WS         : [ \t\r\n]+                        -> skip ;

mode EXPR;
DOLLAR_OPEN   : '${'  -> pushMode(EXPR) ;
SELECT_OPEN   : '*{'  -> pushMode(EXPR) ;
MESSAGE_OPEN  : '#{'  -> pushMode(EXPR) ;
LINK_OPEN     : '@{'  -> pushMode(EXPR) ;
FRAG_OPEN     : '~{'  -> pushMode(EXPR) ;
LBRACE        : '{'   -> pushMode(EXPR) ;
RBRACE        : '}'   -> popMode ;
DQ_CLOSE      : '"'   -> popMode ;                   
PIPE_OPEN     : '|'   -> pushMode(LITSUBST) ;

LPAREN : '(' ;  RPAREN : ')' ;  LBRACK : '[' ;  RBRACK : ']' ;
COMMA  : ',' ;  DOT : '.' ;
COLONCOLON : '::' ;  COLON : ':' ;
ELVIS  : '?:' ;      QUESTION : '?' ;
EQ : '==' ;  NEQ : '!=' ;  LE : '<=' ;  GE : '>=' ;  LT : '<' ;  GT : '>' ;
AND : '&&' ; OR : '||' ;  NOT : '!' ;
ASSIGN : '=' ;
PLUS : '+' ; MINUS : '-' ; MUL : '*' ; DIV : '/' ; MOD : '%' ;
AMP : '&' ;  HASH : '#' ;  TILDE : '~' ;  AT : '@' ;

AND_KW : 'and' ;  OR_KW : 'or' ;  NOT_KW : 'not' ;
EQ_KW  : 'eq'  ;  NE_KW : 'neq' | 'ne' ;
LT_KW  : 'lt'  ;  GT_KW : 'gt' ;  LE_KW : 'le' ;  GE_KW : 'ge' ;
TRUE   : 'true' ; FALSE : 'false' ; NULL : 'null' ;

STRING : '\'' ( ~['\\\r\n] | '\\' . )* '\'' ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
IDENT  : [a-z_] [a-z0-9_]* ;

EXPR_WS : [ \t\r\n]+ -> skip ;
ERRCHAR : . ;                                        
mode LITSUBST;
LS_DOLLAR  : '${' -> type(DOLLAR_OPEN),  pushMode(EXPR) ;
LS_SELECT  : '*{' -> type(SELECT_OPEN),  pushMode(EXPR) ;
LS_MESSAGE : '#{' -> type(MESSAGE_OPEN), pushMode(EXPR) ;
LS_LINK    : '@{' -> type(LINK_OPEN),    pushMode(EXPR) ;
LS_END     : '|'  -> type(PIPE_CLOSE),   popMode ;
LS_TEXT    : ~[|$*#@"]+ | [$*#@] ;


mode INLINE;
IN_DOLLAR  : '${' -> type(DOLLAR_OPEN),  pushMode(EXPR) ;
IN_SELECT  : '*{' -> type(SELECT_OPEN),  pushMode(EXPR) ;
IN_MESSAGE : '#{' -> type(MESSAGE_OPEN), pushMode(EXPR) ;
IN_LINK    : '@{' -> type(LINK_OPEN),    pushMode(EXPR) ;
INLINE_CLOSE : (']]' | ')]')                      -> popMode ;
IN_WS      : [ \t\r\n]+ -> skip ;
