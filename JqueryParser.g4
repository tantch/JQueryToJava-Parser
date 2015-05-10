parser grammar JqueryParser;

//PARSER

options {
	tokenVocab = JqueryLexer;
}

ops
:
	OP
	| EQS
;

start
:
	(
		compilationUnit
		| jq
	)+ EOF
;

jq
:
	JQBegin line JQEnd
;

input
:
	IN STRING ENDL
;

output
:
	OUT STRING ENDL
;

line
:
	input line?
	| output line?
	| exp line?
;

exp
:
	ter = STRING EQS OPENXP exp1 CLOSEXP ENDL
;

exp1 returns [String v]
:
	ter = STRING
	(
		psel
		| braexp
	)? SEP? exp1?
	{$v=$ter.text;}

;

braexp
:
	OPENB STRING ops DELIMITER STRING DELIMITER CLOSEB
	(
		psel
		| braexp
	)?
;

psel
:
	PSS
	(
		psel
		| braexp
	)?
	| PPS OPENP STRING CLOSEP
	(
		psel
		| braexp
	)?
;


//JAVA parser retirado de java8.g4 do git do antlr4

literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

type
	:	primitiveType
	|	referenceType
	;

primitiveType
	:	annotation* numericType
	|	annotation* 'boolean'
	;

numericType
	:	integralType
	|	floatingPointType
	;

integralType
	:	'byte'
	|	'short'
	|	'int'
	|	'long'
	|	'char'
	;

floatingPointType
	:	'float'
	|	'double'
	;

referenceType
	:	classOrInterfaceType
	|	typeVariable
	|	arrayType
	;

classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		|	interfaceType_lf_classOrInterfaceType
		)*
	;

classType
	:	annotation* Identifier typeArguments?
	|	classOrInterfaceType '.' annotation* Identifier typeArguments?
	;

classType_lf_classOrInterfaceType
	:	'.' annotation* Identifier typeArguments?
	;

classType_lfno_classOrInterfaceType
	:	annotation* Identifier typeArguments?
	;

interfaceType
	:	classType
	;

interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType
	;

typeVariable
	:	annotation* Identifier
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	|	typeVariable dims
	;

dims
	:	annotation* PREA PREF (annotation* PREA PREF)*
	;

typeParameter
	:	typeParameterModifier* Identifier typeBound?
	;

typeParameterModifier
	:	annotation
	;

typeBound
	:	'extends' typeVariable
	|	'extends' classOrInterfaceType additionalBound*
	;

additionalBound
	:	'&' interfaceType
	;

typeArguments
	:	'<' typeArgumentList '>'
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*
	;

typeArgument
	:	referenceType
	|	wildcard
	;

wildcard
	:	annotation* '?' wildcardBounds?
	;

wildcardBounds
	:	'extends' referenceType
	|	'super' referenceType
	;

/*
 * Productions from §6 (Names)
 */

packageName
	:	Identifier
	|	packageName '.' Identifier
	;

typeName
	:	Identifier
	|	packageOrTypeName '.' Identifier
	;

packageOrTypeName
	:	Identifier
	|	packageOrTypeName '.' Identifier
	;

expressionName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

methodName
	:	Identifier
	;

ambiguousName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

/*
 * Productions from §7 (Packages)
 */

compilationUnit
	:	packageDeclaration? importDeclaration* typeDeclaration* EOF
	;

packageDeclaration
	:	packageModifier* 'package' Identifier ('.' Identifier)* PVIR
	;

packageModifier
	:	annotation
	;

importDeclaration
	:	singleTypeImportDeclaration
	|	typeImportOnDemandDeclaration
	|	singleStaticImportDeclaration
	|	staticImportOnDemandDeclaration
	;

singleTypeImportDeclaration
	:	'import' typeName PVIR
	;

typeImportOnDemandDeclaration
	:	'import' packageOrTypeName '.' '*' PVIR
	;

singleStaticImportDeclaration
	:	'import' 'static' typeName '.' Identifier PVIR
	;

staticImportOnDemandDeclaration
	:	'import' 'static' typeName '.' '*' PVIR
	;

typeDeclaration
	:	classDeclaration
	|	interfaceDeclaration
	|	PVIR
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration
	:	normalClassDeclaration
	|	enumDeclaration
	;

normalClassDeclaration
	:	classModifier* 'class' Identifier typeParameters? superclass? superinterfaces? classBody
	;

classModifier
	:	annotation
	|	'public'
	|	'protected'
	|	'private'
	|	'abstract'
	|	'static'
	|	'final'
	|	'strictfp'
	;

typeParameters
	:	'<' typeParameterList '>'
	;

typeParameterList
	:	typeParameter (',' typeParameter)*
	;

superclass
	:	'extends' classType
	;

superinterfaces
	:	'implements' interfaceTypeList
	;

interfaceTypeList
	:	interfaceType (',' interfaceType)*
	;

classBody
	:	'{' classBodyDeclaration* '}'
	;

classBodyDeclaration
	:	classMemberDeclaration
	|	instanceInitializer
	|	staticInitializer
	|	constructorDeclaration
	;

classMemberDeclaration
	:	fieldDeclaration
	|	methodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	PVIR
	;

fieldDeclaration
	:	fieldModifier* unannType variableDeclaratorList PVIR
	;

fieldModifier
	:	annotation
	|	'public'
	|	'protected'
	|	'private'
	|	'static'
	|	'final'
	|	'transient'
	|	'volatile'
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableDeclaratorId (EQL variableInitializer)?
	;

variableDeclaratorId
	:	Identifier dims?
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

unannType
	:	unannPrimitiveType
	|	unannReferenceType
	;

unannPrimitiveType
	:	numericType
	|	'boolean'
	;

unannReferenceType
	:	unannClassOrInterfaceType
	|	unannTypeVariable
	|	unannArrayType
	;

unannClassOrInterfaceType
	:	(	unannClassType_lfno_unannClassOrInterfaceType
		|	unannInterfaceType_lfno_unannClassOrInterfaceType
		)
		(	unannClassType_lf_unannClassOrInterfaceType
		|	unannInterfaceType_lf_unannClassOrInterfaceType
		)*
	;

unannClassType
	:	Identifier typeArguments?
	|	unannClassOrInterfaceType '.' annotation* Identifier typeArguments?
	;

unannClassType_lf_unannClassOrInterfaceType
	:	'.' annotation* Identifier typeArguments?
	;

unannClassType_lfno_unannClassOrInterfaceType
	:	Identifier typeArguments?
	;

unannInterfaceType
	:	unannClassType
	;

unannInterfaceType_lf_unannClassOrInterfaceType
	:	unannClassType_lf_unannClassOrInterfaceType
	;

unannInterfaceType_lfno_unannClassOrInterfaceType
	:	unannClassType_lfno_unannClassOrInterfaceType
	;

unannTypeVariable
	:	Identifier
	;

unannArrayType
	:	unannPrimitiveType dims
	|	unannClassOrInterfaceType dims
	|	unannTypeVariable dims
	;

methodDeclaration
	:	methodModifier* methodHeader methodBody
	;

methodModifier
	:	annotation
	|	'public'
	|	'protected'
	|	'private'
	|	'abstract'
	|	'static'
	|	'final'
	|	'synchronized'
	|	'native'
	|	'strictfp'
	;

methodHeader
	:	result methodDeclarator throws_?
	|	typeParameters annotation* result methodDeclarator throws_?
	;

result
	:	unannType
	|	'void'
	;

methodDeclarator
	:	Identifier PEA formalParameterList? PEF dims?
	;

formalParameterList
	:	formalParameters ',' lastFormalParameter
	|	lastFormalParameter
	;

formalParameters
	:	formalParameter (',' formalParameter)*
	|	receiverParameter (',' formalParameter)*
	;

formalParameter
	:	variableModifier* unannType variableDeclaratorId
	;

variableModifier
	:	annotation
	|	'final'
	;

lastFormalParameter
	:	variableModifier* unannType annotation* '...' variableDeclaratorId
	|	formalParameter
	;

receiverParameter
	:	annotation* unannType (Identifier '.')? 'this'
	;

throws_
	:	'throws' exceptionTypeList
	;

exceptionTypeList
	:	exceptionType (',' exceptionType)*
	;

exceptionType
	:	classType
	|	typeVariable
	;

methodBody
	:	block
	|	PVIR
	;

instanceInitializer
	:	block
	;

staticInitializer
	:	'static' block
	;

constructorDeclaration
	:	constructorModifier* constructorDeclarator throws_? constructorBody
	;

constructorModifier
	:	annotation
	|	'public'
	|	'protected'
	|	'private'
	;

constructorDeclarator
	:	typeParameters? simpleTypeName PEA formalParameterList? PEF
	;

simpleTypeName
	:	Identifier
	;

constructorBody
	:	'{' explicitConstructorInvocation? blockStatements? '}'
	;

explicitConstructorInvocation
	:	typeArguments? 'this' PEA argumentList? PEF PVIR
	|	typeArguments? 'super' PEA argumentList? PEF PVIR
	|	expressionName '.' typeArguments? 'super' PEA argumentList? PEF PVIR
	|	primary '.' typeArguments? 'super' PEA argumentList? PEF PVIR
	;

enumDeclaration
	:	classModifier* 'enum' Identifier superinterfaces? enumBody
	;

enumBody
	:	'{' enumConstantList? ','? enumBodyDeclarations? '}'
	;

enumConstantList
	:	enumConstant (',' enumConstant)*
	;

enumConstant
	:	enumConstantModifier* Identifier (PEA argumentList? PEF)? classBody?
	;

enumConstantModifier
	:	annotation
	;

enumBodyDeclarations
	:	PVIR classBodyDeclaration*
	;

/*
 * Productions from §9 (Interfaces)
 */

interfaceDeclaration
	:	normalInterfaceDeclaration
	|	annotationTypeDeclaration
	;

normalInterfaceDeclaration
	:	interfaceModifier* 'interface' Identifier typeParameters? extendsInterfaces? interfaceBody
	;

interfaceModifier
	:	annotation
	|	'public'
	|	'protected'
	|	'private'
	|	'abstract'
	|	'static'
	|	'strictfp'
	;

extendsInterfaces
	:	'extends' interfaceTypeList
	;

interfaceBody
	:	'{' interfaceMemberDeclaration* '}'
	;

interfaceMemberDeclaration
	:	constantDeclaration
	|	interfaceMethodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	PVIR
	;

constantDeclaration
	:	constantModifier* unannType variableDeclaratorList PVIR
	;

constantModifier
	:	annotation
	|	'public'
	|	'static'
	|	'final'
	;

interfaceMethodDeclaration
	:	interfaceMethodModifier* methodHeader methodBody
	;

interfaceMethodModifier
	:	annotation
	|	'public'
	|	'abstract'
	|	'default'
	|	'static'
	|	'strictfp'
	;

annotationTypeDeclaration
	:	interfaceModifier* '@' 'interface' Identifier annotationTypeBody
	;

annotationTypeBody
	:	'{' annotationTypeMemberDeclaration* '}'
	;

annotationTypeMemberDeclaration
	:	annotationTypeElementDeclaration
	|	constantDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	PVIR
	;

annotationTypeElementDeclaration
	:	annotationTypeElementModifier* unannType Identifier PEA PEF dims? defaultValue? PVIR
	;

annotationTypeElementModifier
	:	annotation
	|	'public'
	|	'abstract'
	;

defaultValue
	:	'default' elementValue
	;

annotation
	:	normalAnnotation
	|	markerAnnotation
	|	singleElementAnnotation
	;

normalAnnotation
	:	'@' typeName PEA elementValuePairList? PEF
	;

elementValuePairList
	:	elementValuePair (',' elementValuePair)*
	;

elementValuePair
	:	Identifier EQL elementValue
	;

elementValue
	:	conditionalExpression
	|	elementValueArrayInitializer
	|	annotation
	;

elementValueArrayInitializer
	:	'{' elementValueList? ','? '}'
	;

elementValueList
	:	elementValue (',' elementValue)*
	;

markerAnnotation
	:	'@' typeName
	;

singleElementAnnotation
	:	'@' typeName PEA elementValue PEF
	;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer
	:	'{' variableInitializerList? ','? '}'
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer)*
	;

/*
 * Productions from §14 (Blocks and Statements)
 */

block
	:	'{' blockStatements? '}'
	;

blockStatements
	:	blockStatement blockStatement*
	;

blockStatement
	:	localVariableDeclarationStatement
	|	classDeclaration
	|	statement
	;

localVariableDeclarationStatement
	:	localVariableDeclaration PVIR
	;

localVariableDeclaration
	:	variableModifier* unannType variableDeclaratorList
	;

statement
	:	statementWithoutTrailingSubstatement
	|	labeledStatement
	|	ifThenStatement
	|	ifThenElseStatement
	|	whileStatement
	|	forStatement
	;

statementNoShortIf
	:	statementWithoutTrailingSubstatement
	|	labeledStatementNoShortIf
	|	ifThenElseStatementNoShortIf
	|	whileStatementNoShortIf
	|	forStatementNoShortIf
	;

statementWithoutTrailingSubstatement
	:	block
	|	emptyStatement
	|	expressionStatement
	|	assertStatement
	|	switchStatement
	|	doStatement
	|	breakStatement
	|	continueStatement
	|	returnStatement
	|	synchronizedStatement
	|	throwStatement
	|	tryStatement
	;

emptyStatement
	:	PVIR
	;

labeledStatement
	:	Identifier ':' statement
	;

labeledStatementNoShortIf
	:	Identifier ':' statementNoShortIf
	;

expressionStatement
	:	statementExpression PVIR
	;

statementExpression
	:	assignment
	|	preIncrementExpression
	|	preDecrementExpression
	|	postIncrementExpression
	|	postDecrementExpression
	|	methodInvocation
	|	classInstanceCreationExpression
	;

ifThenStatement
	:	'if' PEA expression PEF statement
	;

ifThenElseStatement
	:	'if' PEA expression PEF statementNoShortIf 'else' statement
	;

ifThenElseStatementNoShortIf
	:	'if' PEA expression PEF statementNoShortIf 'else' statementNoShortIf
	;

assertStatement
	:	'assert' expression PVIR
	|	'assert' expression ':' expression PVIR
	;

switchStatement
	:	'switch' PEA expression PEF switchBlock
	;

switchBlock
	:	'{' switchBlockStatementGroup* switchLabel* '}'
	;

switchBlockStatementGroup
	:	switchLabels blockStatements
	;

switchLabels
	:	switchLabel switchLabel*
	;

switchLabel
	:	'case' constantExpression ':'
	|	'case' enumConstantName ':'
	|	'default' ':'
	;

enumConstantName
	:	Identifier
	;

whileStatement
	:	'while' PEA expression PEF statement
	;

whileStatementNoShortIf
	:	'while' PEA expression PEF statementNoShortIf
	;

doStatement
	:	'do' statement 'while' PEA expression PEF PVIR
	;

forStatement
	:	basicForStatement
	|	enhancedForStatement
	;

forStatementNoShortIf
	:	basicForStatementNoShortIf
	|	enhancedForStatementNoShortIf
	;

basicForStatement
	:	'for' PEA forInit? PVIR expression? PVIR forUpdate? PEF statement
	;

basicForStatementNoShortIf
	:	'for' PEA forInit? PVIR expression? PVIR forUpdate? PEF statementNoShortIf
	;

forInit
	:	statementExpressionList
	|	localVariableDeclaration
	;

forUpdate
	:	statementExpressionList
	;

statementExpressionList
	:	statementExpression (',' statementExpression)*
	;

enhancedForStatement
	:	'for' PEA variableModifier* unannType variableDeclaratorId ':' expression PEF statement
	;

enhancedForStatementNoShortIf
	:	'for' PEA variableModifier* unannType variableDeclaratorId ':' expression PEF statementNoShortIf
	;

breakStatement
	:	'break' Identifier? PVIR
	;

continueStatement
	:	'continue' Identifier? PVIR
	;

returnStatement
	:	'return' expression? PVIR
	;

throwStatement
	:	'throw' expression PVIR
	;

synchronizedStatement
	:	'synchronized' PEA expression PEF block
	;

tryStatement
	:	'try' block catches
	|	'try' block catches? finally_
	|	tryWithResourcesStatement
	;

catches
	:	catchClause catchClause*
	;

catchClause
	:	'catch' PEA catchFormalParameter PEF block
	;

catchFormalParameter
	:	variableModifier* catchType variableDeclaratorId
	;

catchType
	:	unannClassType ('|' classType)*
	;

finally_
	:	'finally' block
	;

tryWithResourcesStatement
	:	'try' resourceSpecification block catches? finally_?
	;

resourceSpecification
	:	PEA resourceList PVIR? PEF
	;

resourceList
	:	resource (PVIR resource)*
	;

resource
	:	variableModifier* unannType variableDeclaratorId EQL expression
	;

/*
 * Productions from §15 (Expressions)
 */

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray
	:	literal
	|	typeName (PREA PREF)* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	PEA expression PEF
	|	classInstanceCreationExpression
	|	fieldAccess
	|	arrayAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal
	|	typeName (PREA PREF)* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	PEA expression PEF
	|	classInstanceCreationExpression
	|	fieldAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	arrayAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lfno_primary
	:	literal
	|	typeName (PREA PREF)* '.' 'class'
	|	unannPrimitiveType (PREA PREF)* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	PEA expression PEF
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	arrayAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal
	|	typeName (PREA PREF)* '.' 'class'
	|	unannPrimitiveType (PREA PREF)* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	PEA expression PEF
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

classInstanceCreationExpression
	:	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? PEA argumentList? PEF classBody?
	|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? PEA argumentList? PEF classBody?
	|	primary '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? PEA argumentList? PEF classBody?
	;

classInstanceCreationExpression_lf_primary
	:	'.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? PEA argumentList? PEF classBody?
	;

classInstanceCreationExpression_lfno_primary
	:	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? PEA argumentList? PEF classBody?
	|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? PEA argumentList? PEF classBody?
	;

typeArgumentsOrDiamond
	:	typeArguments
	|	'<' '>'
	;

fieldAccess
	:	primary '.' Identifier
	|	'super' '.' Identifier
	|	typeName '.' 'super' '.' Identifier
	;

fieldAccess_lf_primary
	:	'.' Identifier
	;

fieldAccess_lfno_primary
	:	'super' '.' Identifier
	|	typeName '.' 'super' '.' Identifier
	;

arrayAccess
	:	(	expressionName PREA expression PREF
		|	primaryNoNewArray_lfno_arrayAccess PREA expression PREF
		)
		(	primaryNoNewArray_lf_arrayAccess PREA expression PREF
		)*
	;

arrayAccess_lf_primary
	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary PREA expression PREF
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary PREA expression PREF
		)*
	;

arrayAccess_lfno_primary
	:	(	expressionName PREA expression PREF
		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary PREA expression PREF
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary PREA expression PREF
		)*
	;

methodInvocation
	:	methodName PEA argumentList? PEF
	|	typeName '.' typeArguments? Identifier PEA argumentList? PEF
	|	expressionName '.' typeArguments? Identifier PEA argumentList? PEF
	|	primary '.' typeArguments? Identifier PEA argumentList? PEF
	|	'super' '.' typeArguments? Identifier PEA argumentList? PEF
	|	typeName '.' 'super' '.' typeArguments? Identifier PEA argumentList? PEF
	;

methodInvocation_lf_primary
	:	'.' typeArguments? Identifier PEA argumentList? PEF
	;

methodInvocation_lfno_primary
	:	methodName PEA argumentList? PEF
	|	typeName '.' typeArguments? Identifier PEA argumentList? PEF
	|	expressionName '.' typeArguments? Identifier PEA argumentList? PEF
	|	'super' '.' typeArguments? Identifier PEA argumentList? PEF
	|	typeName '.' 'super' '.' typeArguments? Identifier PEA argumentList? PEF
	;

argumentList
	:	expression (',' expression)*
	;

methodReference
	:	expressionName '::' typeArguments? Identifier
	|	referenceType '::' typeArguments? Identifier
	|	primary '::' typeArguments? Identifier
	|	'super' '::' typeArguments? Identifier
	|	typeName '.' 'super' '::' typeArguments? Identifier
	|	classType '::' typeArguments? 'new'
	|	arrayType '::' 'new'
	;

methodReference_lf_primary
	:	'::' typeArguments? Identifier
	;

methodReference_lfno_primary
	:	expressionName '::' typeArguments? Identifier
	|	referenceType '::' typeArguments? Identifier
	|	'super' '::' typeArguments? Identifier
	|	typeName '.' 'super' '::' typeArguments? Identifier
	|	classType '::' typeArguments? 'new'
	|	arrayType '::' 'new'
	;

arrayCreationExpression
	:	'new' primitiveType dimExprs dims?
	|	'new' classOrInterfaceType dimExprs dims?
	|	'new' primitiveType dims arrayInitializer
	|	'new' classOrInterfaceType dims arrayInitializer
	;

dimExprs
	:	dimExpr dimExpr*
	;

dimExpr
	:	annotation* PREA expression PREF
	;

constantExpression
	:	expression
	;

expression
	:	lambdaExpression
	|	assignmentExpression
	;

lambdaExpression
	:	lambdaParameters '->' lambdaBody
	;

lambdaParameters
	:	Identifier
	|	PEA formalParameterList? PEF
	|	PEA inferredFormalParameterList PEF
	;

inferredFormalParameterList
	:	Identifier (',' Identifier)*
	;

lambdaBody
	:	expression
	|	block
	;

assignmentExpression
	:	conditionalExpression
	|	assignment
	;

assignment
	:	leftHandSide assignmentOperator expression
	;

leftHandSide
	:	expressionName
	|	fieldAccess
	|	arrayAccess
	;

assignmentOperator
	:	EQL
	|	OPSJ
	;

conditionalExpression
	:	conditionalOrExpression
	|	conditionalOrExpression '?' expression ':' conditionalExpression
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression '||' conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression '&&' inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	|	relationalExpression 'instanceof' referenceType
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpression
	|	'-' unaryExpression
	|	unaryExpressionNotPlusMinus
	;

preIncrementExpression
	:	'++' unaryExpression
	;

preDecrementExpression
	:	'--' unaryExpression
	;

unaryExpressionNotPlusMinus
	:	postfixExpression
	|	'~' unaryExpression
	|	'!' unaryExpression
	|	castExpression
	;

postfixExpression
	:	(	primary
		|	expressionName
		)
		(	postIncrementExpression_lf_postfixExpression
		|	postDecrementExpression_lf_postfixExpression
		)*
	;

postIncrementExpression
	:	postfixExpression '++'
	;

postIncrementExpression_lf_postfixExpression
	:	'++'
	;

postDecrementExpression
	:	postfixExpression '--'
	;

postDecrementExpression_lf_postfixExpression
	:	'--'
	;

castExpression
	:	PEA primitiveType PEF unaryExpression
	|	PEA referenceType additionalBound* PEF unaryExpressionNotPlusMinus
	|	PEA referenceType additionalBound* PEF lambdaExpression
	;


//fim do aprser do java
