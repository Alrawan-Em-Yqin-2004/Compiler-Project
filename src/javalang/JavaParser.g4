parser grammar JavaParser;

options { tokenVocab=JavaLexer; }

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
    : modifier* CLASS Identifier typeParameters?
      (EXTENDS typeType)?
      (IMPLEMENTS typeList)?
      (PERMITS typeList)?
      classBody
    ;

interfaceDeclaration
    : modifier* INTERFACE Identifier typeParameters?
      (EXTENDS typeList)?
      (PERMITS typeList)?
      interfaceBody
    ;

enumDeclaration
    : modifier* ENUM Identifier (IMPLEMENTS typeList)? LBRACE
      enumConstants? COMMA? classBodyDeclaration* RBRACE
    ;

enumConstants: enumConstant (COMMA enumConstant)*;
enumConstant: annotation* Identifier arguments? classBody?;

annotationTypeDeclaration
    : modifier* AT INTERFACE Identifier annotationTypeBody
    ;
annotationTypeBody: LBRACE annotationTypeMemberDeclaration* RBRACE;
annotationTypeMemberDeclaration
    : modifier* (typeType Identifier LPAREN RPAREN (DEFAULT elementValue)? SEMI
      | constantDeclaration
      | classDeclaration
      | interfaceDeclaration
      | SEMI)
    ;

recordDeclaration
    : modifier* RECORD Identifier typeParameters? recordHeader
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
constantDeclarator: Identifier ASSIGN variableInitializer;

methodDeclaration
    : typeTypeOrVoid Identifier typeParameters? formalParameters dims?
      (THROWS qualifiedNameList)?
      (methodBody | SEMI)
    ;
interfaceMethodDeclaration
    : typeTypeOrVoid Identifier typeParameters? formalParameters dims?
      (THROWS qualifiedNameList)?
      (methodBody | SEMI)
    ;
genericMethodDeclaration: typeParameters methodDeclaration;
constructorDeclaration
    : Identifier typeParameters? formalParameters
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
receiverParameter: annotation* typeType (Identifier DOT)? THIS;
formalParameter: variableModifier* typeType variableDeclaratorId;
lastFormalParameter: variableModifier* typeType ELLIPSIS variableDeclaratorId;
variableModifier: FINAL | annotation;

variableDeclarators: variableDeclarator (COMMA variableDeclarator)*;
variableDeclarator: variableDeclaratorId (ASSIGN variableInitializer)?;
variableDeclaratorId: Identifier dims?;
variableInitializer: expression | arrayInitializer;
arrayInitializer: LBRACE (variableInitializer (COMMA variableInitializer)* COMMA?)? RBRACE;

typeTypeOrVoid: typeType | VOID;
typeType: annotation* (primitiveType | classOrInterfaceType) dims?;
classOrInterfaceType: Identifier typeArguments? (DOT annotation* Identifier typeArguments?)*;
primitiveType: BOOLEAN | BYTE | SHORT | INT | LONG | CHAR | FLOAT | DOUBLE;
typeArguments: LT typeArgumentList GT;
typeArgumentList: typeArgument (COMMA typeArgument)*;
typeArgument: typeType | QUESTION ((EXTENDS | SUPER) typeType)?;
typeParameters: LT typeParameter (COMMA typeParameter)* GT;
typeParameter: annotation* Identifier (EXTENDS typeType (BITAND typeType)*)?;
typeList: typeType (COMMA typeType)*;
qualifiedNameList: qualifiedName (COMMA qualifiedName)*;
qualifiedName: Identifier (DOT Identifier)*;
dims: (annotation* LBRACK RBRACK)+;

modifier
    : annotation
    | PUBLIC | PROTECTED | PRIVATE | ABSTRACT | STATIC | FINAL
    | STRICTFP | DEFAULT | SYNCHRONIZED | NATIVE | TRANSIENT | VOLATILE
    | SEALED | NON_SEALED
    ;
annotation: AT qualifiedName (LPAREN (elementValuePairs | elementValue)? RPAREN)?;
elementValuePairs: elementValuePair (COMMA elementValuePair)*;
elementValuePair: Identifier ASSIGN elementValue;
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
    | BREAK Identifier? SEMI                                        # breakStatement
    | CONTINUE Identifier? SEMI                                     # continueStatement
    | YIELD expression SEMI                                         # yieldStatement
    | SEMI                                                          # emptyStatement
    | statementExpression SEMI                                      # expressionStatement
    | Identifier COLON statement                                    # labeledStatement
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
catchFormalParameter: variableModifier* catchType Identifier;
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
    : Identifier
    | LPAREN formalParameterList? RPAREN
    | LPAREN inferredFormalParameterList? RPAREN
    ;
inferredFormalParameterList: Identifier (COMMA Identifier)*;

assignmentExpression: conditionalExpression (assignmentOperator expression)?;
assignmentOperator
    : ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN
    | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | LSHIFT_ASSIGN | RSHIFT_ASSIGN | URSHIFT_ASSIGN
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
patternOrType: typeType Identifier?;
shiftExpression: additiveExpression ((LSHIFT | RSHIFT | URSHIFT) additiveExpression)*;
additiveExpression: multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*;
multiplicativeExpression: unaryExpression ((MUL | DIV | MOD) unaryExpression)*;
unaryExpression
    : (ADD | SUB | INC | DEC | NOT | TILDE) unaryExpression
    | LPAREN typeType RPAREN unaryExpression
    | postfixExpression
    ;
postfixExpression: primary (selector | INC | DEC)*;
selector
    : DOT Identifier arguments?
    | DOT THIS
    | DOT SUPER
    | DOT NEW typeArguments? innerCreator
    | LBRACK expression RBRACK
    | arguments
    ;
primary
    : literal
    | THIS
    | SUPER
    | Identifier
    | LPAREN expression RPAREN
    | NEW creator
    | typeType DOT CLASS
    | VOID DOT CLASS
    | qualifiedName
    ;
creator
    : (typeArguments? createdName | primitiveType) (arguments classBody? | arrayCreatorRest)
    ;
createdName: Identifier typeArgumentsOrDiamond? (DOT Identifier typeArgumentsOrDiamond?)*;
typeArgumentsOrDiamond: LT GT | typeArguments;   // new ArrayList<>()  or  new ArrayList<String>()
innerCreator: Identifier typeArgumentsOrDiamond? (arguments classBody?)?;
arrayCreatorRest
    : (LBRACK expression RBRACK)+ dims?
    | dims arrayInitializer
    ;
arguments: LPAREN expressionList? RPAREN;


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

