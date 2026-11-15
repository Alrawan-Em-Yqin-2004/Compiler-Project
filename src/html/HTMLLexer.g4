lexer grammar HTMLLexer;

options { caseInsensitive = true; }


HTML_COMMENT : '<!--' .*? '-->' -> skip ;

CDATA : '<![CDATA[' .*? ']]>' -> skip ;

DOCTYPE : '<!doctype' ~'>'* '>' ;


OTHER_DECL : ( '<!' | '<?' ) .*? '>' -> skip ;


SCRIPT_OPEN : '<script' ( [ \t\r\n/] TAG_REST )? '>' -> pushMode(SCRIPT) ;
STYLE_OPEN  : '<style'  ( [ \t\r\n/] TAG_REST )? '>' -> pushMode(STYLE) ;

fragment TAG_REST
    : ( ~[>"']
      | '"'  ~["]* '"'
      | '\'' ~[']* '\''
      )*
    ;

TAG_OPEN : '<' -> pushMode(TAG) ;

SEA_WS    : [ \t\r\n]+ ;
HTML_TEXT : ~'<'+ ;

mode TAG;

TAG_CLOSE       : '>'  -> popMode ;           
TAG_SLASH_CLOSE : '/>' -> popMode ;           
TAG_SLASH       : '/' ;                       
TAG_EQUALS      : '=' -> pushMode(ATTVALUE) ;


VOID_NAME
    : 'area' | 'base' | 'br' | 'col' | 'embed' | 'hr' | 'img'
    | 'input' | 'link' | 'meta' | 'param' | 'source' | 'track' | 'wbr'
    ;


TAG_NAME : ~[ \t\r\n"'<>/=]+ ;

TAG_WS : [ \t\r\n]+ -> skip ;

mode ATTVALUE;

ATTVALUE_VALUE : [ \t\r\n]* ATTRIBUTE_VALUE -> popMode ;

fragment ATTRIBUTE_VALUE
    : '"'  ~["]*  '"'         
    | '\'' ~[']*  '\''         
    | ~[ \t\r\n"'=<>`]+       
    ;

mode SCRIPT;
SCRIPT_BODY : .*? '</script' [ \t\r\n]* '>' -> popMode ;

mode STYLE;
STYLE_BODY : .*? '</style' [ \t\r\n]* '>' -> popMode ;
