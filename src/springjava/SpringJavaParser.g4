parser grammar SpringJavaParser;

options { tokenVocab=SpringJavaLexer; }

compilationUnit
    : packageDeclaration? importDeclaration* (typeDeclaration | SEMI)* EOF
    ;

packageDeclaration: annotation* PACKAGE qualifiedName SEMI;
importDeclaration: IMPORT STATIC? qualifiedName (DOT MUL)? SEMI;

typeDeclaration
    : classDeclaration
    | interfaceDeclaration
    | enumDeclaration
    | annotationTypeDeclaration
    | recordDeclaration
    ;

classDeclaration
    : modifier* CLASS identifier typeParameters?
      (EXTENDS typeType)?
      (IMPLEMENTS typeList)?
      (PERMITS typeList)?
      classBody
    ;

interfaceDeclaration
    : modifier* INTERFACE identifier typeParameters?
      (EXTENDS typeList)?
      (PERMITS typeList)?
      interfaceBody
    ;

enumDeclaration
    : modifier* ENUM identifier (IMPLEMENTS typeList)? LBRACE
      enumConstants? COMMA? classBodyDeclaration* RBRACE
    ;

enumConstants: enumConstant (COMMA enumConstant)*;
enumConstant: annotation* identifier arguments? classBody?;

annotationTypeDeclaration
    : modifier* AT INTERFACE identifier annotationTypeBody
    ;
annotationTypeBody: LBRACE annotationTypeMemberDeclaration* RBRACE;
annotationTypeMemberDeclaration
    : modifier* (typeType identifier LPAREN RPAREN (DEFAULT elementValue)? SEMI
      | constantDeclaration
      | classDeclaration
      | interfaceDeclaration
      | SEMI)
    ;

recordDeclaration
    : modifier* RECORD identifier typeParameters? recordHeader
      (IMPLEMENTS typeList)?
      classBody
    ;
recordHeader: LPAREN recordComponentList? RPAREN;
recordComponentList: recordComponent (COMMA recordComponent)*;
recordComponent: annotation* typeType ELLIPSIS? variableDeclaratorId;

classBody: LBRACE classBodyDeclaration* RBRACE;
interfaceBody: LBRACE interfaceBodyDeclaration* RBRACE;

classBodyDeclaration
    : SEMI
    | STATIC? block
    | modifier* memberDeclaration
    ;

interfaceBodyDeclaration
    : SEMI
    | modifier* (constantDeclaration | interfaceMethodDeclaration
      | classDeclaration | interfaceDeclaration | enumDeclaration
      | recordDeclaration | annotationTypeDeclaration)
    ;

memberDeclaration
    : fieldDeclaration
    | methodDeclaration
    | genericMethodDeclaration
    | constructorDeclaration
    | genericConstructorDeclaration
    | classDeclaration
    | interfaceDeclaration
    | enumDeclaration
    | recordDeclaration
    | annotationTypeDeclaration
    ;

fieldDeclaration: typeType variableDeclarators SEMI;
constantDeclaration: typeType constantDeclarators SEMI;
constantDeclarators: constantDeclarator (COMMA constantDeclarator)*;
constantDeclarator: identifier ASSIGN variableInitializer;

methodDeclaration
    : typeTypeOrVoid identifier typeParameters? formalParameters dims?
      (THROWS qualifiedNameList)?
      (methodBody | SEMI)
    ;
interfaceMethodDeclaration
    : typeTypeOrVoid identifier typeParameters? formalParameters dims?
      (THROWS qualifiedNameList)?
      (methodBody | SEMI)
    ;
genericMethodDeclaration: typeParameters methodDeclaration;
constructorDeclaration
    : identifier typeParameters? formalParameters
      (THROWS qualifiedNameList)?
      constructorBody
    ;
genericConstructorDeclaration: typeParameters constructorDeclaration;
methodBody: block;
constructorBody: LBRACE explicitConstructorInvocation? blockStatement* RBRACE;
explicitConstructorInvocation
    : (typeArguments? (THIS | SUPER) arguments | primary DOT typeArguments? SUPER arguments) SEMI
    ;

formalParameters: LPAREN formalParameterList? RPAREN;
formalParameterList
    : receiverParameter (COMMA formalParameterList)?
    | formalParameter (COMMA formalParameter)* (COMMA lastFormalParameter)?
    | lastFormalParameter
    ;
receiverParameter: annotation* typeType (identifier DOT)? THIS;
formalParameter: variableModifier* typeType variableDeclaratorId;
lastFormalParameter: variableModifier* typeType ELLIPSIS variableDeclaratorId;
variableModifier: FINAL | annotation;

variableDeclarators: variableDeclarator (COMMA variableDeclarator)*;
variableDeclarator: variableDeclaratorId (ASSIGN variableInitializer)?;
variableDeclaratorId: identifier dims?;
variableInitializer: expression | arrayInitializer;
arrayInitializer: LBRACE (variableInitializer (COMMA variableInitializer)* COMMA?)? RBRACE;

typeTypeOrVoid: typeType | VOID;
typeType: annotation* (primitiveType | classOrInterfaceType) dims?;
classOrInterfaceType: identifier typeArguments? (DOT annotation* identifier typeArguments?)*;
primitiveType: BOOLEAN | BYTE | SHORT | INT | LONG | CHAR | FLOAT | DOUBLE;
typeArguments: LT typeArgumentList GT;
typeArgumentsOrDiamond: LT GT | typeArguments;
typeArgumentList: typeArgument (COMMA typeArgument)*;
typeArgument: typeType | QUESTION ((EXTENDS | SUPER) typeType)?;
typeParameters: LT typeParameter (COMMA typeParameter)* GT;
typeParameter: annotation* identifier (EXTENDS typeType (BITAND typeType)*)?;
typeList: typeType (COMMA typeType)*;
qualifiedNameList: qualifiedName (COMMA qualifiedName)*;
qualifiedName: identifier (DOT identifier)*;


identifier: Identifier | VAR | YIELD | RECORD | SEALED | PERMITS | springAnnotationName;
dims: (annotation* LBRACK RBRACK)+;

modifier
    : annotation
    | PUBLIC | PROTECTED | PRIVATE | ABSTRACT | STATIC | FINAL
    | STRICTFP | DEFAULT | SYNCHRONIZED | NATIVE | TRANSIENT | VOLATILE
    | SEALED | NON_SEALED
    ;
annotation: AT (springAnnotationName | qualifiedName) (LPAREN (elementValuePairs | elementValue)? RPAREN)?;

springAnnotationName
    : SPRING_SPRING_BOOT_APPLICATION
    | SPRING_ENABLE_AUTO_CONFIGURATION
    | SPRING_COMPONENT_SCAN
    | SPRING_CONFIGURATION
    | SPRING_BEAN
    | SPRING_COMPONENT
    | SPRING_SERVICE
    | SPRING_REPOSITORY
    | SPRING_CONTROLLER
    | SPRING_REST_CONTROLLER
    | SPRING_AUTOWIRED
    | SPRING_QUALIFIER
    | SPRING_PRIMARY
    | SPRING_LAZY
    | SPRING_VALUE
    | SPRING_SCOPE
    | SPRING_DEPENDS_ON
    | SPRING_REQUEST_MAPPING
    | SPRING_GET_MAPPING
    | SPRING_POST_MAPPING
    | SPRING_PUT_MAPPING
    | SPRING_PATCH_MAPPING
    | SPRING_DELETE_MAPPING
    | SPRING_REQUEST_PARAM
    | SPRING_PATH_VARIABLE
    | SPRING_REQUEST_BODY
    | SPRING_RESPONSE_BODY
    | SPRING_MODEL_ATTRIBUTE
    | SPRING_REQUEST_HEADER
    | SPRING_COOKIE_VALUE
    | SPRING_SESSION_ATTRIBUTE
    | SPRING_REQUEST_ATTRIBUTE
    | SPRING_MATRIX_VARIABLE
    | SPRING_CROSS_ORIGIN
    | SPRING_EXCEPTION_HANDLER
    | SPRING_CONTROLLER_ADVICE
    | SPRING_REST_CONTROLLER_ADVICE
    | SPRING_INIT_BINDER
    | SPRING_RESPONSE_STATUS
    | SPRING_VALIDATED
    | SPRING_VALID
    | SPRING_TRANSACTIONAL
    | SPRING_ASYNC
    | SPRING_SCHEDULED
    | SPRING_ENABLE_SCHEDULING
    | SPRING_CACHEABLE
    | SPRING_CACHE_PUT
    | SPRING_CACHE_EVICT
    | SPRING_ENABLE_CACHING
    | SPRING_PROFILE
    | SPRING_PROPERTY_SOURCE
    | SPRING_IMPORT
    | SPRING_IMPORT_RESOURCE
    | SPRING_CONFIGURATION_PROPERTIES
    | SPRING_ENABLE_CONFIGURATION_PROPERTIES
    | SPRING_CONDITIONAL_ON_PROPERTY
    | SPRING_CONDITIONAL_ON_CLASS
    | SPRING_CONDITIONAL_ON_MISSING_BEAN
    | SPRING_SPRING_BOOT_TEST
    | SPRING_WEB_MVC_TEST
    | SPRING_DATA_JPA_TEST
    | SPRING_MOCK_BEAN
    | SPRING_TEST_CONFIGURATION
    | SPRING_ORDER
    | SPRING_PRE_AUTHORIZE
    | SPRING_SECURED
    | SPRING_ENABLE_METHOD_SECURITY
    | SPRING_ENABLE_WEB_SECURITY
    | SPRING_ENABLE_GLOBAL_METHOD_SECURITY
    ;
elementValuePairs: elementValuePair (COMMA elementValuePair)*;
elementValuePair: identifier ASSIGN elementValue;
elementValue
    : conditionalExpression
    | annotation
    | elementValueArrayInitializer
    ;
elementValueArrayInitializer: LBRACE (elementValue (COMMA elementValue)* COMMA?)? RBRACE;

block: LBRACE blockStatement* RBRACE;
blockStatement
    : localVariableDeclaration SEMI
    | localTypeDeclaration
    | statement
    ;
localTypeDeclaration: classDeclaration | interfaceDeclaration | enumDeclaration | recordDeclaration;
localVariableDeclaration: variableModifier* localVariableType variableDeclarators;
localVariableType: typeType | VAR;

statement
    : block                                                       # blockStatementAlt
    | ASSERT expression (COLON expression)? SEMI                  # assertStatement
    | IF LPAREN expression RPAREN statement (ELSE statement)?     # ifStatement
    | FOR LPAREN forControl RPAREN statement                       # forStatement
    | WHILE LPAREN expression RPAREN statement                     # whileStatement
    | DO statement WHILE LPAREN expression RPAREN SEMI             # doWhileStatement
    | TRY resourceSpecification? block catchClause* (FINALLY block)? # tryStatement
    | SWITCH LPAREN expression RPAREN LBRACE switchBlockStatementGroup* RBRACE # switchStatement
    | SYNCHRONIZED LPAREN expression RPAREN block                  # synchronizedStatement
    | RETURN expression? SEMI                                      # returnStatement
    | THROW expression SEMI                                         # throwStatement
    | BREAK identifier? SEMI                                        # breakStatement
    | CONTINUE identifier? SEMI                                     # continueStatement
    | YIELD expression SEMI                                         # yieldStatement
    | SEMI                                                          # emptyStatement
    | statementExpression SEMI                                      # expressionStatement
    | identifier COLON statement                                    # labeledStatement
    ;

localVariableDeclarationStatement: localVariableDeclaration SEMI;
forControl
    : enhancedForControl
    | forInit? SEMI expression? SEMI expressionList?
    ;
enhancedForControl: variableModifier* localVariableType variableDeclaratorId COLON expression;
forInit: localVariableDeclaration | expressionList;
expressionList: statementExpression (COMMA statementExpression)*;

resourceSpecification: LPAREN resourceList SEMI? RPAREN;
resourceList: resource (SEMI resource)*;
resource: variableModifier* localVariableType variableDeclaratorId ASSIGN expression | qualifiedName;

catchClause: CATCH LPAREN catchFormalParameter RPAREN block;
catchFormalParameter: variableModifier* catchType identifier;
catchType: qualifiedName (BITOR qualifiedName)*;

switchBlockStatementGroup: switchLabel+ blockStatement*;
switchLabel
    : CASE (constantExpression (COMMA constantExpression)* | NULL | DEFAULT) COLON
    | DEFAULT COLON
    ;
constantExpression: expression;

statementExpression
    : expression
    ;
expression: lambdaExpression | assignmentExpression;
lambdaExpression
    : lambdaParameters ARROW (expression | block)
    ;
lambdaParameters
    : identifier
    | LPAREN formalParameterList? RPAREN
    | LPAREN inferredFormalParameterList? RPAREN
    ;
inferredFormalParameterList: identifier (COMMA identifier)*;

assignmentExpression: conditionalExpression (assignmentOperator expression)?;
assignmentOperator
    : ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN
    | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | LSHIFT_ASSIGN | GT GE | GT GT GE
    ;
conditionalExpression
    : conditionalOrExpression (QUESTION expression COLON conditionalExpression)?
    ;
conditionalOrExpression: conditionalAndExpression (OR conditionalAndExpression)*;
conditionalAndExpression: inclusiveOrExpression (AND inclusiveOrExpression)*;
inclusiveOrExpression: exclusiveOrExpression (BITOR exclusiveOrExpression)*;
exclusiveOrExpression: andExpression (CARET andExpression)*;
andExpression: equalityExpression (BITAND equalityExpression)*;
equalityExpression: relationalExpression ((EQUAL | NOTEQUAL) relationalExpression)*;
relationalExpression
    : shiftExpression ((LT | GT | LE | GE) shiftExpression | INSTANCEOF patternOrType)*
    ;
patternOrType: typeType identifier?;
shiftExpression: additiveExpression (shiftOp additiveExpression)*;
shiftOp: LSHIFT | GT GT GT | GT GT;
additiveExpression: multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*;
multiplicativeExpression: unaryExpression ((MUL | DIV | MOD) unaryExpression)*;
unaryExpression
    : (ADD | SUB | INC | DEC | NOT | TILDE) unaryExpression
    | LPAREN typeType RPAREN unaryExpression
    | postfixExpression
    ;
postfixExpression: primary (selector | INC | DEC)*;
selector
    : DOT identifier arguments?
    | DOT THIS
    | DOT SUPER
    | DOT NEW typeArguments? innerCreator
    | LBRACK expression RBRACK
    | COLONCOLON typeArguments? (identifier | NEW)
    | arguments
    ;
primary
    : literal
    | THIS
    | SUPER
    | identifier
    | LPAREN expression RPAREN
    | NEW creator
    | typeType DOT CLASS
    | VOID DOT CLASS
    | qualifiedName
    ;
creator
    : (typeArguments? createdName | primitiveType) (arguments classBody? | arrayCreatorRest)
    ;
createdName: identifier typeArgumentsOrDiamond? (DOT identifier typeArgumentsOrDiamond?)*;
innerCreator: identifier typeArgumentsOrDiamond? (arguments classBody?)?;
arrayCreatorRest
    : (LBRACK expression RBRACK)+ dims?
    | dims arrayInitializer
    ;
arguments: LPAREN expressionList? RPAREN;





springApplicationUnit
    : packageDeclaration? importDeclaration*
      (springAnnotatedTypeDeclaration | typeDeclaration | SEMI)*
      EOF
    ;

springAnnotatedTypeDeclaration
    : annotation+ (classDeclaration | interfaceDeclaration | enumDeclaration | recordDeclaration)
    ;

springControllerClass
    : annotation* classDeclaration
    ;

springControllerMethod
    : annotation+ methodDeclaration
    ;

springBeanMethod
    : annotation+ methodDeclaration
    ;

springDependencyInjectionField
    : annotation+ fieldDeclaration
    ;

springRequestMapping
    : annotation
    ;

springRequestParameter
    : annotation
    ;

springConfigurationClass
    : annotation* classDeclaration
    ;

literal
    : IntegerLiteral
    | FloatingPointLiteral
    | CharacterLiteral
    | StringLiteral
    | TextBlock
    | TRUE
    | FALSE
    | NULL
    ;
