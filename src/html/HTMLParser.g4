parser grammar HTMLParser;

options { tokenVocab = HTMLLexer; }

htmlDocument
    : SEA_WS* DOCTYPE? content EOF
    ;

content
    : ( element | HTML_TEXT | SEA_WS )*
    ;


element
    : startTag content endTag                                         # normalElement
    | TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE                    # selfClosingElement
    | TAG_OPEN VOID_NAME attribute* ( TAG_CLOSE | TAG_SLASH_CLOSE )  # voidElement
    | SCRIPT_OPEN SCRIPT_BODY                                         # scriptElement
    | STYLE_OPEN STYLE_BODY                                           # styleElement
    ;

startTag : TAG_OPEN TAG_NAME attribute* TAG_CLOSE ;
endTag   : TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE ;

attribute
    : attributeName ( TAG_EQUALS ATTVALUE_VALUE )?
    ;


attributeName
    : TAG_NAME
    | VOID_NAME
    ;
