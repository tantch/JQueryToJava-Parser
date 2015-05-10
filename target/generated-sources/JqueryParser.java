// Generated from JqueryParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JQBegin=1, PREA=2, PREF=3, PEA=4, PEF=5, PVIR=6, EQL=7, OPSJ=8, ABSTRACT=9, 
		ASSERT=10, BOOLEAN=11, BREAK=12, BYTE=13, CASE=14, CATCH=15, CHAR=16, 
		CLASS=17, CONST=18, CONTINUE=19, DEFAULT=20, DO=21, DOUBLE=22, ELSE=23, 
		ENUM=24, EXTENDS=25, FINAL=26, FINALLY=27, FLOAT=28, FOR=29, IF=30, GOTO=31, 
		IMPLEMENTS=32, IMPORT=33, INSTANCEOF=34, INT=35, INTERFACE=36, LONG=37, 
		NATIVE=38, NEW=39, PACKAGE=40, PRIVATE=41, PROTECTED=42, PUBLIC=43, RETURN=44, 
		SHORT=45, STATIC=46, STRICTFP=47, SUPER=48, SWITCH=49, SYNCHRONIZED=50, 
		THIS=51, THROW=52, THROWS=53, TRANSIENT=54, TRY=55, VOID=56, VOLATILE=57, 
		WHILE=58, IntegerLiteral=59, FloatingPointLiteral=60, BooleanLiteral=61, 
		CharacterLiteral=62, StringLiteral=63, NullLiteral=64, LPAREN=65, RPAREN=66, 
		LBRACE=67, RBRACE=68, LBRACK=69, RBRACK=70, SEMI=71, COMMA=72, DOT=73, 
		ASSIGN=74, GT=75, LT=76, BANG=77, TILDE=78, QUESTION=79, COLON=80, EQUAL=81, 
		LE=82, GE=83, NOTEQUAL=84, AND=85, OR=86, INC=87, DEC=88, ADD=89, SUB=90, 
		MUL=91, DIV=92, BITAND=93, BITOR=94, CARET=95, MOD=96, ARROW=97, COLONCOLON=98, 
		ADD_ASSIGN=99, SUB_ASSIGN=100, MUL_ASSIGN=101, DIV_ASSIGN=102, AND_ASSIGN=103, 
		OR_ASSIGN=104, XOR_ASSIGN=105, MOD_ASSIGN=106, LSHIFT_ASSIGN=107, RSHIFT_ASSIGN=108, 
		URSHIFT_ASSIGN=109, Identifier=110, AT=111, ELLIPSIS=112, WS=113, COMMENT=114, 
		LINE_COMMENT=115, NUM=116, OP=117, OPENP=118, CLOSEP=119, OPENB=120, CLOSEB=121, 
		IN=122, OUT=123, STRING=124, ENDL=125, DELIMITER=126, EQS=127, SEP=128, 
		PSS=129, PPS=130, OPENXP=131, CLOSEXP=132, BlockComment=133, JQEnd=134, 
		WSS=135;
	public static final int
		RULE_ops = 0, RULE_start = 1, RULE_jq = 2, RULE_input = 3, RULE_output = 4, 
		RULE_line = 5, RULE_exp = 6, RULE_exp1 = 7, RULE_braexp = 8, RULE_psel = 9, 
		RULE_literal = 10, RULE_type = 11, RULE_primitiveType = 12, RULE_numericType = 13, 
		RULE_integralType = 14, RULE_floatingPointType = 15, RULE_referenceType = 16, 
		RULE_classOrInterfaceType = 17, RULE_classType = 18, RULE_classType_lf_classOrInterfaceType = 19, 
		RULE_classType_lfno_classOrInterfaceType = 20, RULE_interfaceType = 21, 
		RULE_interfaceType_lf_classOrInterfaceType = 22, RULE_interfaceType_lfno_classOrInterfaceType = 23, 
		RULE_typeVariable = 24, RULE_arrayType = 25, RULE_dims = 26, RULE_typeParameter = 27, 
		RULE_typeParameterModifier = 28, RULE_typeBound = 29, RULE_additionalBound = 30, 
		RULE_typeArguments = 31, RULE_typeArgumentList = 32, RULE_typeArgument = 33, 
		RULE_wildcard = 34, RULE_wildcardBounds = 35, RULE_packageName = 36, RULE_typeName = 37, 
		RULE_packageOrTypeName = 38, RULE_expressionName = 39, RULE_methodName = 40, 
		RULE_ambiguousName = 41, RULE_compilationUnit = 42, RULE_packageDeclaration = 43, 
		RULE_packageModifier = 44, RULE_importDeclaration = 45, RULE_singleTypeImportDeclaration = 46, 
		RULE_typeImportOnDemandDeclaration = 47, RULE_singleStaticImportDeclaration = 48, 
		RULE_staticImportOnDemandDeclaration = 49, RULE_typeDeclaration = 50, 
		RULE_classDeclaration = 51, RULE_normalClassDeclaration = 52, RULE_classModifier = 53, 
		RULE_typeParameters = 54, RULE_typeParameterList = 55, RULE_superclass = 56, 
		RULE_superinterfaces = 57, RULE_interfaceTypeList = 58, RULE_classBody = 59, 
		RULE_classBodyDeclaration = 60, RULE_classMemberDeclaration = 61, RULE_fieldDeclaration = 62, 
		RULE_fieldModifier = 63, RULE_variableDeclaratorList = 64, RULE_variableDeclarator = 65, 
		RULE_variableDeclaratorId = 66, RULE_variableInitializer = 67, RULE_unannType = 68, 
		RULE_unannPrimitiveType = 69, RULE_unannReferenceType = 70, RULE_unannClassOrInterfaceType = 71, 
		RULE_unannClassType = 72, RULE_unannClassType_lf_unannClassOrInterfaceType = 73, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 74, RULE_unannInterfaceType = 75, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 76, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 77, 
		RULE_unannTypeVariable = 78, RULE_unannArrayType = 79, RULE_methodDeclaration = 80, 
		RULE_methodModifier = 81, RULE_methodHeader = 82, RULE_result = 83, RULE_methodDeclarator = 84, 
		RULE_formalParameterList = 85, RULE_formalParameters = 86, RULE_formalParameter = 87, 
		RULE_variableModifier = 88, RULE_lastFormalParameter = 89, RULE_receiverParameter = 90, 
		RULE_throws_ = 91, RULE_exceptionTypeList = 92, RULE_exceptionType = 93, 
		RULE_methodBody = 94, RULE_instanceInitializer = 95, RULE_staticInitializer = 96, 
		RULE_constructorDeclaration = 97, RULE_constructorModifier = 98, RULE_constructorDeclarator = 99, 
		RULE_simpleTypeName = 100, RULE_constructorBody = 101, RULE_explicitConstructorInvocation = 102, 
		RULE_enumDeclaration = 103, RULE_enumBody = 104, RULE_enumConstantList = 105, 
		RULE_enumConstant = 106, RULE_enumConstantModifier = 107, RULE_enumBodyDeclarations = 108, 
		RULE_interfaceDeclaration = 109, RULE_normalInterfaceDeclaration = 110, 
		RULE_interfaceModifier = 111, RULE_extendsInterfaces = 112, RULE_interfaceBody = 113, 
		RULE_interfaceMemberDeclaration = 114, RULE_constantDeclaration = 115, 
		RULE_constantModifier = 116, RULE_interfaceMethodDeclaration = 117, RULE_interfaceMethodModifier = 118, 
		RULE_annotationTypeDeclaration = 119, RULE_annotationTypeBody = 120, RULE_annotationTypeMemberDeclaration = 121, 
		RULE_annotationTypeElementDeclaration = 122, RULE_annotationTypeElementModifier = 123, 
		RULE_defaultValue = 124, RULE_annotation = 125, RULE_normalAnnotation = 126, 
		RULE_elementValuePairList = 127, RULE_elementValuePair = 128, RULE_elementValue = 129, 
		RULE_elementValueArrayInitializer = 130, RULE_elementValueList = 131, 
		RULE_markerAnnotation = 132, RULE_singleElementAnnotation = 133, RULE_arrayInitializer = 134, 
		RULE_variableInitializerList = 135, RULE_block = 136, RULE_blockStatements = 137, 
		RULE_blockStatement = 138, RULE_localVariableDeclarationStatement = 139, 
		RULE_localVariableDeclaration = 140, RULE_statement = 141, RULE_statementNoShortIf = 142, 
		RULE_statementWithoutTrailingSubstatement = 143, RULE_emptyStatement = 144, 
		RULE_labeledStatement = 145, RULE_labeledStatementNoShortIf = 146, RULE_expressionStatement = 147, 
		RULE_statementExpression = 148, RULE_ifThenStatement = 149, RULE_ifThenElseStatement = 150, 
		RULE_ifThenElseStatementNoShortIf = 151, RULE_assertStatement = 152, RULE_switchStatement = 153, 
		RULE_switchBlock = 154, RULE_switchBlockStatementGroup = 155, RULE_switchLabels = 156, 
		RULE_switchLabel = 157, RULE_enumConstantName = 158, RULE_whileStatement = 159, 
		RULE_whileStatementNoShortIf = 160, RULE_doStatement = 161, RULE_forStatement = 162, 
		RULE_forStatementNoShortIf = 163, RULE_basicForStatement = 164, RULE_basicForStatementNoShortIf = 165, 
		RULE_forInit = 166, RULE_forUpdate = 167, RULE_statementExpressionList = 168, 
		RULE_enhancedForStatement = 169, RULE_enhancedForStatementNoShortIf = 170, 
		RULE_breakStatement = 171, RULE_continueStatement = 172, RULE_returnStatement = 173, 
		RULE_throwStatement = 174, RULE_synchronizedStatement = 175, RULE_tryStatement = 176, 
		RULE_catches = 177, RULE_catchClause = 178, RULE_catchFormalParameter = 179, 
		RULE_catchType = 180, RULE_finally_ = 181, RULE_tryWithResourcesStatement = 182, 
		RULE_resourceSpecification = 183, RULE_resourceList = 184, RULE_resource = 185, 
		RULE_primary = 186, RULE_primaryNoNewArray = 187, RULE_primaryNoNewArray_lf_arrayAccess = 188, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 189, RULE_primaryNoNewArray_lf_primary = 190, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 191, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 192, 
		RULE_primaryNoNewArray_lfno_primary = 193, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 194, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 195, 
		RULE_classInstanceCreationExpression = 196, RULE_classInstanceCreationExpression_lf_primary = 197, 
		RULE_classInstanceCreationExpression_lfno_primary = 198, RULE_typeArgumentsOrDiamond = 199, 
		RULE_fieldAccess = 200, RULE_fieldAccess_lf_primary = 201, RULE_fieldAccess_lfno_primary = 202, 
		RULE_arrayAccess = 203, RULE_arrayAccess_lf_primary = 204, RULE_arrayAccess_lfno_primary = 205, 
		RULE_methodInvocation = 206, RULE_methodInvocation_lf_primary = 207, RULE_methodInvocation_lfno_primary = 208, 
		RULE_argumentList = 209, RULE_methodReference = 210, RULE_methodReference_lf_primary = 211, 
		RULE_methodReference_lfno_primary = 212, RULE_arrayCreationExpression = 213, 
		RULE_dimExprs = 214, RULE_dimExpr = 215, RULE_constantExpression = 216, 
		RULE_expression = 217, RULE_lambdaExpression = 218, RULE_lambdaParameters = 219, 
		RULE_inferredFormalParameterList = 220, RULE_lambdaBody = 221, RULE_assignmentExpression = 222, 
		RULE_assignment = 223, RULE_leftHandSide = 224, RULE_assignmentOperator = 225, 
		RULE_conditionalExpression = 226, RULE_conditionalOrExpression = 227, 
		RULE_conditionalAndExpression = 228, RULE_inclusiveOrExpression = 229, 
		RULE_exclusiveOrExpression = 230, RULE_andExpression = 231, RULE_equalityExpression = 232, 
		RULE_relationalExpression = 233, RULE_shiftExpression = 234, RULE_additiveExpression = 235, 
		RULE_multiplicativeExpression = 236, RULE_unaryExpression = 237, RULE_preIncrementExpression = 238, 
		RULE_preDecrementExpression = 239, RULE_unaryExpressionNotPlusMinus = 240, 
		RULE_postfixExpression = 241, RULE_postIncrementExpression = 242, RULE_postIncrementExpression_lf_postfixExpression = 243, 
		RULE_postDecrementExpression = 244, RULE_postDecrementExpression_lf_postfixExpression = 245, 
		RULE_castExpression = 246;
	public static final String[] ruleNames = {
		"ops", "start", "jq", "input", "output", "line", "exp", "exp1", "braexp", 
		"psel", "literal", "type", "primitiveType", "numericType", "integralType", 
		"floatingPointType", "referenceType", "classOrInterfaceType", "classType", 
		"classType_lf_classOrInterfaceType", "classType_lfno_classOrInterfaceType", 
		"interfaceType", "interfaceType_lf_classOrInterfaceType", "interfaceType_lfno_classOrInterfaceType", 
		"typeVariable", "arrayType", "dims", "typeParameter", "typeParameterModifier", 
		"typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", 
		"wildcard", "wildcardBounds", "packageName", "typeName", "packageOrTypeName", 
		"expressionName", "methodName", "ambiguousName", "compilationUnit", "packageDeclaration", 
		"packageModifier", "importDeclaration", "singleTypeImportDeclaration", 
		"typeImportOnDemandDeclaration", "singleStaticImportDeclaration", "staticImportOnDemandDeclaration", 
		"typeDeclaration", "classDeclaration", "normalClassDeclaration", "classModifier", 
		"typeParameters", "typeParameterList", "superclass", "superinterfaces", 
		"interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
		"fieldDeclaration", "fieldModifier", "variableDeclaratorList", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "unannType", "unannPrimitiveType", 
		"unannReferenceType", "unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->@jQ'", null, null, null, null, null, null, null, "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'void'", "'volatile'", "'while'", null, null, null, null, null, 
		"'null'", null, null, "'{'", "'}'", null, null, null, "','", "'.'", null, 
		"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
		"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
		"'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'", 
		null, null, null, null, null, null, null, null, null, "'in'", "'out'", 
		null, null, "'''", null, null, null, null, "'$(\"'", "'\")'", null, "'<-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "JQBegin", "PREA", "PREF", "PEA", "PEF", "PVIR", "EQL", "OPSJ", 
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "NUM", "OP", "OPENP", 
		"CLOSEP", "OPENB", "CLOSEB", "IN", "OUT", "STRING", "ENDL", "DELIMITER", 
		"EQS", "SEP", "PSS", "PPS", "OPENXP", "CLOSEXP", "BlockComment", "JQEnd", 
		"WSS"
	};
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
	public String getGrammarFileName() { return "JqueryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OpsContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(JqueryParser.OP, 0); }
		public TerminalNode EQS() { return getToken(JqueryParser.EQS, 0); }
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitOps(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==OP || _la==EQS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JqueryParser.EOF, 0); }
		public List<CompilationUnitContext> compilationUnit() {
			return getRuleContexts(CompilationUnitContext.class);
		}
		public CompilationUnitContext compilationUnit(int i) {
			return getRuleContext(CompilationUnitContext.class,i);
		}
		public List<JqContext> jq() {
			return getRuleContexts(JqContext.class);
		}
		public JqContext jq(int i) {
			return getRuleContext(JqContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(498);
					switch (_input.LA(1)) {
					case EOF:
					case PVIR:
					case ABSTRACT:
					case CLASS:
					case ENUM:
					case FINAL:
					case IMPORT:
					case INTERFACE:
					case PACKAGE:
					case PRIVATE:
					case PROTECTED:
					case PUBLIC:
					case STATIC:
					case STRICTFP:
					case AT:
						{
						setState(496);
						compilationUnit();
						}
						break;
					case JQBegin:
						{
						setState(497);
						jq();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(502);
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

	public static class JqContext extends ParserRuleContext {
		public TerminalNode JQBegin() { return getToken(JqueryParser.JQBegin, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode JQEnd() { return getToken(JqueryParser.JQEnd, 0); }
		public JqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterJq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitJq(this);
		}
	}

	public final JqContext jq() throws RecognitionException {
		JqContext _localctx = new JqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(JQBegin);
			setState(505);
			line();
			setState(506);
			match(JQEnd);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(JqueryParser.IN, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public TerminalNode ENDL() { return getToken(JqueryParser.ENDL, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(IN);
			setState(509);
			match(STRING);
			setState(510);
			match(ENDL);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(JqueryParser.OUT, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public TerminalNode ENDL() { return getToken(JqueryParser.ENDL, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(OUT);
			setState(513);
			match(STRING);
			setState(514);
			match(ENDL);
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

	public static class LineContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_line);
		int _la;
		try {
			setState(528);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				input();
				setState(518);
				_la = _input.LA(1);
				if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (IN - 122)) | (1L << (OUT - 122)) | (1L << (STRING - 122)))) != 0)) {
					{
					setState(517);
					line();
					}
				}

				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				output();
				setState(522);
				_la = _input.LA(1);
				if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (IN - 122)) | (1L << (OUT - 122)) | (1L << (STRING - 122)))) != 0)) {
					{
					setState(521);
					line();
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				exp();
				setState(526);
				_la = _input.LA(1);
				if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (IN - 122)) | (1L << (OUT - 122)) | (1L << (STRING - 122)))) != 0)) {
					{
					setState(525);
					line();
					}
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

	public static class ExpContext extends ParserRuleContext {
		public Token ter;
		public TerminalNode EQS() { return getToken(JqueryParser.EQS, 0); }
		public TerminalNode OPENXP() { return getToken(JqueryParser.OPENXP, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode CLOSEXP() { return getToken(JqueryParser.CLOSEXP, 0); }
		public TerminalNode ENDL() { return getToken(JqueryParser.ENDL, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			((ExpContext)_localctx).ter = match(STRING);
			setState(531);
			match(EQS);
			setState(532);
			match(OPENXP);
			setState(533);
			exp1();
			setState(534);
			match(CLOSEXP);
			setState(535);
			match(ENDL);
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

	public static class Exp1Context extends ParserRuleContext {
		public String v;
		public Token ter;
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public TerminalNode SEP() { return getToken(JqueryParser.SEP, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_exp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			((Exp1Context)_localctx).ter = match(STRING);
			setState(540);
			switch (_input.LA(1)) {
			case PSS:
			case PPS:
				{
				setState(538);
				psel();
				}
				break;
			case OPENB:
				{
				setState(539);
				braexp();
				}
				break;
			case STRING:
			case SEP:
			case CLOSEXP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(543);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(542);
				match(SEP);
				}
			}

			setState(546);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(545);
				exp1();
				}
			}

			((Exp1Context)_localctx).v = (((Exp1Context)_localctx).ter!=null?((Exp1Context)_localctx).ter.getText():null);
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

	public static class BraexpContext extends ParserRuleContext {
		public TerminalNode OPENB() { return getToken(JqueryParser.OPENB, 0); }
		public List<TerminalNode> STRING() { return getTokens(JqueryParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JqueryParser.STRING, i);
		}
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(JqueryParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(JqueryParser.DELIMITER, i);
		}
		public TerminalNode CLOSEB() { return getToken(JqueryParser.CLOSEB, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public BraexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterBraexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitBraexp(this);
		}
	}

	public final BraexpContext braexp() throws RecognitionException {
		BraexpContext _localctx = new BraexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_braexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(OPENB);
			setState(551);
			match(STRING);
			setState(552);
			ops();
			setState(553);
			match(DELIMITER);
			setState(554);
			match(STRING);
			setState(555);
			match(DELIMITER);
			setState(556);
			match(CLOSEB);
			setState(559);
			switch (_input.LA(1)) {
			case PSS:
			case PPS:
				{
				setState(557);
				psel();
				}
				break;
			case OPENB:
				{
				setState(558);
				braexp();
				}
				break;
			case STRING:
			case SEP:
			case CLOSEXP:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PselContext extends ParserRuleContext {
		public TerminalNode PSS() { return getToken(JqueryParser.PSS, 0); }
		public PselContext psel() {
			return getRuleContext(PselContext.class,0);
		}
		public BraexpContext braexp() {
			return getRuleContext(BraexpContext.class,0);
		}
		public TerminalNode PPS() { return getToken(JqueryParser.PPS, 0); }
		public TerminalNode OPENP() { return getToken(JqueryParser.OPENP, 0); }
		public TerminalNode STRING() { return getToken(JqueryParser.STRING, 0); }
		public TerminalNode CLOSEP() { return getToken(JqueryParser.CLOSEP, 0); }
		public PselContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_psel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPsel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPsel(this);
		}
	}

	public final PselContext psel() throws RecognitionException {
		PselContext _localctx = new PselContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_psel);
		try {
			setState(574);
			switch (_input.LA(1)) {
			case PSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(PSS);
				setState(564);
				switch (_input.LA(1)) {
				case PSS:
				case PPS:
					{
					setState(562);
					psel();
					}
					break;
				case OPENB:
					{
					setState(563);
					braexp();
					}
					break;
				case STRING:
				case SEP:
				case CLOSEXP:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(PPS);
				setState(567);
				match(OPENP);
				setState(568);
				match(STRING);
				setState(569);
				match(CLOSEP);
				setState(572);
				switch (_input.LA(1)) {
				case PSS:
				case PPS:
					{
					setState(570);
					psel();
					}
					break;
				case OPENB:
					{
					setState(571);
					braexp();
					}
					break;
				case STRING:
				case SEP:
				case CLOSEXP:
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JqueryParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JqueryParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JqueryParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JqueryParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JqueryParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(JqueryParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IntegerLiteral - 59)) | (1L << (FloatingPointLiteral - 59)) | (1L << (BooleanLiteral - 59)) | (1L << (CharacterLiteral - 59)) | (1L << (StringLiteral - 59)) | (1L << (NullLiteral - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				referenceType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitiveType);
		int _la;
		try {
			setState(596);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(582);
					annotation();
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(588);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(589);
					annotation();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(BOOLEAN);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numericType);
		try {
			setState(600);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				floatingPointType();
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_referenceType);
		try {
			setState(609);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				arrayType();
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(611);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(612);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(617);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(615);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(616);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classType);
		int _la;
		try {
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(622);
					annotation();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(628);
				match(Identifier);
				setState(630);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(629);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				classOrInterfaceType();
				setState(633);
				match(DOT);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(634);
					annotation();
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(640);
				match(Identifier);
				setState(642);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(641);
					typeArguments();
					}
				}

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

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(DOT);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(647);
				annotation();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
			match(Identifier);
			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(654);
				typeArguments();
				}
				break;
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(657);
				annotation();
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			match(Identifier);
			setState(665);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(664);
				typeArguments();
				}
				break;
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			classType();
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

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			classType_lf_classOrInterfaceType();
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

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			classType_lfno_classOrInterfaceType();
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

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(673);
				annotation();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(Identifier);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayType);
		try {
			setState(690);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				primitiveType();
				setState(682);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				classOrInterfaceType();
				setState(685);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				typeVariable();
				setState(688);
				dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(692);
				annotation();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(698);
			match(PREA);
			setState(699);
			match(PREF);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(700);
						annotation();
						}
						}
						setState(705);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(706);
					match(PREA);
					setState(707);
					match(PREF);
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(713);
				typeParameterModifier();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			match(Identifier);
			setState(721);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(720);
				typeBound();
				}
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

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			annotation();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeBound);
		int _la;
		try {
			setState(735);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(EXTENDS);
				setState(726);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				match(EXTENDS);
				setState(728);
				classOrInterfaceType();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(729);
					additionalBound();
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(BITAND);
			setState(738);
			interfaceType();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(LT);
			setState(741);
			typeArgumentList();
			setState(742);
			match(GT);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			typeArgument();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				typeArgument();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeArgument);
		try {
			setState(754);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(756);
				annotation();
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
			match(QUESTION);
			setState(764);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(763);
				wildcardBounds();
				}
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_wildcardBounds);
		try {
			setState(770);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(EXTENDS);
				setState(767);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(SUPER);
				setState(769);
				referenceType();
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(773);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(775);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(776);
					match(DOT);
					setState(777);
					match(Identifier);
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeName);
		try {
			setState(788);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				packageOrTypeName(0);
				setState(785);
				match(DOT);
				setState(786);
				match(Identifier);
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(791);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(793);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(794);
					match(DOT);
					setState(795);
					match(Identifier);
					}
					} 
				}
				setState(800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionName);
		try {
			setState(806);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				ambiguousName(0);
				setState(803);
				match(DOT);
				setState(804);
				match(Identifier);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(Identifier);
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

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(811);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(813);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(814);
					match(DOT);
					setState(815);
					match(Identifier);
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JqueryParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(821);
				packageDeclaration();
				}
				break;
			}
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(824);
				importDeclaration();
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PVIR) | (1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(830);
				typeDeclaration();
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(836);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JqueryParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JqueryParser.Identifier, i);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(838);
				packageModifier();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(PACKAGE);
			setState(845);
			match(Identifier);
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(846);
				match(DOT);
				setState(847);
				match(Identifier);
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(853);
			match(PVIR);
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

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			annotation();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_importDeclaration);
		try {
			setState(861);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				staticImportOnDemandDeclaration();
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

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(IMPORT);
			setState(864);
			typeName();
			setState(865);
			match(PVIR);
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

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(IMPORT);
			setState(868);
			packageOrTypeName(0);
			setState(869);
			match(DOT);
			setState(870);
			match(MUL);
			setState(871);
			match(PVIR);
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

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(IMPORT);
			setState(874);
			match(STATIC);
			setState(875);
			typeName();
			setState(876);
			match(DOT);
			setState(877);
			match(Identifier);
			setState(878);
			match(PVIR);
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

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(IMPORT);
			setState(881);
			match(STATIC);
			setState(882);
			typeName();
			setState(883);
			match(DOT);
			setState(884);
			match(MUL);
			setState(885);
			match(PVIR);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeDeclaration);
		try {
			setState(890);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				match(PVIR);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classDeclaration);
		try {
			setState(894);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				enumDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(896);
				classModifier();
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			match(CLASS);
			setState(903);
			match(Identifier);
			setState(905);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(904);
				typeParameters();
				}
			}

			setState(908);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(907);
				superclass();
				}
			}

			setState(911);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(910);
				superinterfaces();
				}
			}

			setState(913);
			classBody();
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

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classModifier);
		try {
			setState(923);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(918);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(919);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(920);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(921);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(922);
				match(STRICTFP);
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(LT);
			setState(926);
			typeParameterList();
			setState(927);
			match(GT);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			typeParameter();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(930);
				match(COMMA);
				setState(931);
				typeParameter();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(EXTENDS);
			setState(938);
			classType();
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

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(IMPLEMENTS);
			setState(941);
			interfaceTypeList();
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

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			interfaceType();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(944);
				match(COMMA);
				setState(945);
				interfaceType();
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(LBRACE);
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PVIR) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (Identifier - 67)) | (1L << (AT - 67)))) != 0)) {
				{
				{
				setState(952);
				classBodyDeclaration();
				}
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(958);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_classBodyDeclaration);
		try {
			setState(964);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(962);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(963);
				constructorDeclaration();
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_classMemberDeclaration);
		try {
			setState(971);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(969);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(970);
				match(PVIR);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(973);
				fieldModifier();
				}
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(979);
			unannType();
			setState(980);
			variableDeclaratorList();
			setState(981);
			match(PVIR);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_fieldModifier);
		try {
			setState(991);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(985);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(986);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(987);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(988);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(989);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(990);
				match(VOLATILE);
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			variableDeclarator();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(994);
				match(COMMA);
				setState(995);
				variableDeclarator();
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode EQL() { return getToken(JqueryParser.EQL, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			variableDeclaratorId();
			setState(1004);
			_la = _input.LA(1);
			if (_la==EQL) {
				{
				setState(1002);
				match(EQL);
				setState(1003);
				variableInitializer();
				}
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(Identifier);
			setState(1008);
			_la = _input.LA(1);
			if (_la==PREA || _la==AT) {
				{
				setState(1007);
				dims();
				}
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_variableInitializer);
		try {
			setState(1012);
			switch (_input.LA(1)) {
			case PEA:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				arrayInitializer();
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

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannType);
		try {
			setState(1016);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				unannReferenceType();
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

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannPrimitiveType);
		try {
			setState(1020);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(BOOLEAN);
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

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unannReferenceType);
		try {
			setState(1025);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				unannArrayType();
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

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1027);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(1028);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(1035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1033);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(1031);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(1032);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(1037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_unannClassType);
		int _la;
		try {
			setState(1054);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				match(Identifier);
				setState(1040);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1039);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				unannClassOrInterfaceType();
				setState(1043);
				match(DOT);
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1044);
					annotation();
					}
					}
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1050);
				match(Identifier);
				setState(1052);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1051);
					typeArguments();
					}
				}

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

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(DOT);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1057);
				annotation();
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
			match(Identifier);
			setState(1065);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1064);
				typeArguments();
				}
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

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(Identifier);
			setState(1069);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1068);
				typeArguments();
				}
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

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			unannClassType();
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

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			unannClassType_lf_unannClassOrInterfaceType();
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

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			unannClassType_lfno_unannClassOrInterfaceType();
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

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(Identifier);
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

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_unannArrayType);
		try {
			setState(1088);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				unannPrimitiveType();
				setState(1080);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				unannClassOrInterfaceType();
				setState(1083);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				unannTypeVariable();
				setState(1086);
				dims();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1090);
				methodModifier();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1096);
			methodHeader();
			setState(1097);
			methodBody();
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

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_methodModifier);
		try {
			setState(1109);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1102);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1103);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1104);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1105);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1106);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1107);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1108);
				match(STRICTFP);
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_methodHeader);
		int _la;
		try {
			setState(1128);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				result();
				setState(1112);
				methodDeclarator();
				setState(1114);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1113);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				typeParameters();
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1117);
					annotation();
					}
					}
					setState(1122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1123);
				result();
				setState(1124);
				methodDeclarator();
				setState(1126);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1125);
					throws_();
					}
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

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_result);
		try {
			setState(1132);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(VOID);
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(Identifier);
			setState(1135);
			match(PEA);
			setState(1137);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1136);
				formalParameterList();
				}
			}

			setState(1139);
			match(PEF);
			setState(1141);
			_la = _input.LA(1);
			if (_la==PREA || _la==AT) {
				{
				setState(1140);
				dims();
				}
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_formalParameterList);
		try {
			setState(1148);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				formalParameters();
				setState(1144);
				match(COMMA);
				setState(1145);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				lastFormalParameter();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_formalParameters);
		try {
			int _alt;
			setState(1166);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				formalParameter();
				setState(1155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1151);
						match(COMMA);
						setState(1152);
						formalParameter();
						}
						} 
					}
					setState(1157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				receiverParameter();
				setState(1163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1159);
						match(COMMA);
						setState(1160);
						formalParameter();
						}
						} 
					}
					setState(1165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
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

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1168);
				variableModifier();
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1174);
			unannType();
			setState(1175);
			variableDeclaratorId();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_variableModifier);
		try {
			setState(1179);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				match(FINAL);
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1198);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1181);
					variableModifier();
					}
					}
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1187);
				unannType();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1188);
					annotation();
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1194);
				match(ELLIPSIS);
				setState(1195);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1197);
				formalParameter();
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

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1200);
				annotation();
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1206);
			unannType();
			setState(1209);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1207);
				match(Identifier);
				setState(1208);
				match(DOT);
				}
			}

			setState(1211);
			match(THIS);
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

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 182, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(THROWS);
			setState(1214);
			exceptionTypeList();
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

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			exceptionType();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1217);
				match(COMMA);
				setState(1218);
				exceptionType();
				}
				}
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_exceptionType);
		try {
			setState(1226);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				typeVariable();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_methodBody);
		try {
			setState(1230);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				block();
				}
				break;
			case PVIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				match(PVIR);
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

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			block();
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

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(STATIC);
			setState(1235);
			block();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1237);
				constructorModifier();
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1243);
			constructorDeclarator();
			setState(1245);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1244);
				throws_();
				}
			}

			setState(1247);
			constructorBody();
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

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constructorModifier);
		try {
			setState(1253);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1252);
				match(PRIVATE);
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

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1255);
				typeParameters();
				}
			}

			setState(1258);
			simpleTypeName();
			setState(1259);
			match(PEA);
			setState(1261);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1260);
				formalParameterList();
				}
			}

			setState(1263);
			match(PEF);
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

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			match(Identifier);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(LBRACE);
			setState(1269);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1268);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1272);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << PVIR) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LBRACE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1271);
				blockStatements();
				}
			}

			setState(1274);
			match(RBRACE);
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

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1322);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1276);
					typeArguments();
					}
				}

				setState(1279);
				match(THIS);
				setState(1280);
				match(PEA);
				setState(1282);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1281);
					argumentList();
					}
				}

				setState(1284);
				match(PEF);
				setState(1285);
				match(PVIR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1286);
					typeArguments();
					}
				}

				setState(1289);
				match(SUPER);
				setState(1290);
				match(PEA);
				setState(1292);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1291);
					argumentList();
					}
				}

				setState(1294);
				match(PEF);
				setState(1295);
				match(PVIR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				expressionName();
				setState(1297);
				match(DOT);
				setState(1299);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1298);
					typeArguments();
					}
				}

				setState(1301);
				match(SUPER);
				setState(1302);
				match(PEA);
				setState(1304);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1303);
					argumentList();
					}
				}

				setState(1306);
				match(PEF);
				setState(1307);
				match(PVIR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1309);
				primary();
				setState(1310);
				match(DOT);
				setState(1312);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1311);
					typeArguments();
					}
				}

				setState(1314);
				match(SUPER);
				setState(1315);
				match(PEA);
				setState(1317);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1316);
					argumentList();
					}
				}

				setState(1319);
				match(PEF);
				setState(1320);
				match(PVIR);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1324);
				classModifier();
				}
				}
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1330);
			match(ENUM);
			setState(1331);
			match(Identifier);
			setState(1333);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1332);
				superinterfaces();
				}
			}

			setState(1335);
			enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(LBRACE);
			setState(1339);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1338);
				enumConstantList();
				}
			}

			setState(1342);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1341);
				match(COMMA);
				}
			}

			setState(1345);
			_la = _input.LA(1);
			if (_la==PVIR) {
				{
				setState(1344);
				enumBodyDeclarations();
				}
			}

			setState(1347);
			match(RBRACE);
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

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			enumConstant();
			setState(1354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1350);
					match(COMMA);
					setState(1351);
					enumConstant();
					}
					} 
				}
				setState(1356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1357);
				enumConstantModifier();
				}
				}
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1363);
			match(Identifier);
			setState(1369);
			_la = _input.LA(1);
			if (_la==PEA) {
				{
				setState(1364);
				match(PEA);
				setState(1366);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1365);
					argumentList();
					}
				}

				setState(1368);
				match(PEF);
				}
			}

			setState(1372);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1371);
				classBody();
				}
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

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			annotation();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(PVIR);
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PVIR) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (Identifier - 67)) | (1L << (AT - 67)))) != 0)) {
				{
				{
				setState(1377);
				classBodyDeclaration();
				}
				}
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceDeclaration);
		try {
			setState(1385);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				annotationTypeDeclaration();
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

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1387);
				interfaceModifier();
				}
				}
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1393);
			match(INTERFACE);
			setState(1394);
			match(Identifier);
			setState(1396);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1395);
				typeParameters();
				}
			}

			setState(1399);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1398);
				extendsInterfaces();
				}
			}

			setState(1401);
			interfaceBody();
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

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_interfaceModifier);
		try {
			setState(1410);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1405);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1406);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1407);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1408);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1409);
				match(STRICTFP);
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

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(EXTENDS);
			setState(1413);
			interfaceTypeList();
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			match(LBRACE);
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PVIR) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (LT - 76)) | (1L << (Identifier - 76)) | (1L << (AT - 76)))) != 0)) {
				{
				{
				setState(1416);
				interfaceMemberDeclaration();
				}
				}
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1422);
			match(RBRACE);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_interfaceMemberDeclaration);
		try {
			setState(1429);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1426);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1427);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1428);
				match(PVIR);
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1431);
				constantModifier();
				}
				}
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1437);
			unannType();
			setState(1438);
			variableDeclaratorList();
			setState(1439);
			match(PVIR);
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

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_constantModifier);
		try {
			setState(1445);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1443);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1444);
				match(FINAL);
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1447);
				interfaceMethodModifier();
				}
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1453);
			methodHeader();
			setState(1454);
			methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_interfaceMethodModifier);
		try {
			setState(1462);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1458);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1459);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1460);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1461);
				match(STRICTFP);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1464);
					interfaceModifier();
					}
					} 
				}
				setState(1469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1470);
			match(AT);
			setState(1471);
			match(INTERFACE);
			setState(1472);
			match(Identifier);
			setState(1473);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			match(LBRACE);
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PVIR) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1476);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1482);
			match(RBRACE);
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

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1489);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1486);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1487);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1488);
				match(PVIR);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1491);
				annotationTypeElementModifier();
				}
				}
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1497);
			unannType();
			setState(1498);
			match(Identifier);
			setState(1499);
			match(PEA);
			setState(1500);
			match(PEF);
			setState(1502);
			_la = _input.LA(1);
			if (_la==PREA || _la==AT) {
				{
				setState(1501);
				dims();
				}
			}

			setState(1505);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1504);
				defaultValue();
				}
			}

			setState(1507);
			match(PVIR);
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

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_annotationTypeElementModifier);
		try {
			setState(1512);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1511);
				match(ABSTRACT);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(DEFAULT);
			setState(1515);
			elementValue();
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

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_annotation);
		try {
			setState(1520);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1517);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1518);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1519);
				singleElementAnnotation();
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

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(AT);
			setState(1523);
			typeName();
			setState(1524);
			match(PEA);
			setState(1526);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1525);
				elementValuePairList();
				}
			}

			setState(1528);
			match(PEF);
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

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			elementValuePair();
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1531);
				match(COMMA);
				setState(1532);
				elementValuePair();
				}
				}
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TerminalNode EQL() { return getToken(JqueryParser.EQL, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(Identifier);
			setState(1539);
			match(EQL);
			setState(1540);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_elementValue);
		try {
			setState(1545);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1544);
				annotation();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(LBRACE);
			setState(1549);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1548);
				elementValueList();
				}
			}

			setState(1552);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1551);
				match(COMMA);
				}
			}

			setState(1554);
			match(RBRACE);
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

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			elementValue();
			setState(1561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1557);
					match(COMMA);
					setState(1558);
					elementValue();
					}
					} 
				}
				setState(1563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(AT);
			setState(1565);
			typeName();
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

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(AT);
			setState(1568);
			typeName();
			setState(1569);
			match(PEA);
			setState(1570);
			elementValue();
			setState(1571);
			match(PEF);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(LBRACE);
			setState(1575);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1574);
				variableInitializerList();
				}
			}

			setState(1578);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1577);
				match(COMMA);
				}
			}

			setState(1580);
			match(RBRACE);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			variableInitializer();
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1583);
					match(COMMA);
					setState(1584);
					variableInitializer();
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(LBRACE);
			setState(1592);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << PVIR) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LBRACE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1591);
				blockStatements();
				}
			}

			setState(1594);
			match(RBRACE);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			blockStatement();
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << PVIR) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (LBRACE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1597);
				blockStatement();
				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_blockStatement);
		try {
			setState(1606);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1605);
				statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			localVariableDeclaration();
			setState(1609);
			match(PVIR);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1611);
				variableModifier();
				}
				}
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1617);
			unannType();
			setState(1618);
			variableDeclaratorList();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_statement);
		try {
			setState(1626);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1620);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1621);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1622);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1623);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1624);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1625);
				forStatement();
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

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_statementNoShortIf);
		try {
			setState(1633);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1630);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1631);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1632);
				forStatementNoShortIf();
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1647);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				block();
				}
				break;
			case PVIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				emptyStatement();
				}
				break;
			case PEA:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1637);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1638);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1639);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1640);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1641);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1642);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1643);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1644);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1645);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1646);
				tryStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(PVIR);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(Identifier);
			setState(1652);
			match(COLON);
			setState(1653);
			statement();
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

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(Identifier);
			setState(1656);
			match(COLON);
			setState(1657);
			statementNoShortIf();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			statementExpression();
			setState(1660);
			match(PVIR);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_statementExpression);
		try {
			setState(1669);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1664);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1665);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1666);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1667);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1668);
				classInstanceCreationExpression();
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

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			match(IF);
			setState(1672);
			match(PEA);
			setState(1673);
			expression();
			setState(1674);
			match(PEF);
			setState(1675);
			statement();
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

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(IF);
			setState(1678);
			match(PEA);
			setState(1679);
			expression();
			setState(1680);
			match(PEF);
			setState(1681);
			statementNoShortIf();
			setState(1682);
			match(ELSE);
			setState(1683);
			statement();
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

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(IF);
			setState(1686);
			match(PEA);
			setState(1687);
			expression();
			setState(1688);
			match(PEF);
			setState(1689);
			statementNoShortIf();
			setState(1690);
			match(ELSE);
			setState(1691);
			statementNoShortIf();
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

	public static class AssertStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_assertStatement);
		try {
			setState(1703);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				match(ASSERT);
				setState(1694);
				expression();
				setState(1695);
				match(PVIR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1697);
				match(ASSERT);
				setState(1698);
				expression();
				setState(1699);
				match(COLON);
				setState(1700);
				expression();
				setState(1701);
				match(PVIR);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			match(SWITCH);
			setState(1706);
			match(PEA);
			setState(1707);
			expression();
			setState(1708);
			match(PEF);
			setState(1709);
			switchBlock();
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(LBRACE);
			setState(1715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1712);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1718);
				switchLabel();
				}
				}
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1724);
			match(RBRACE);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			switchLabels();
			setState(1727);
			blockStatements();
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

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			switchLabel();
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1730);
				switchLabel();
				}
				}
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_switchLabel);
		try {
			setState(1746);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1736);
				match(CASE);
				setState(1737);
				constantExpression();
				setState(1738);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				match(CASE);
				setState(1741);
				enumConstantName();
				setState(1742);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1744);
				match(DEFAULT);
				setState(1745);
				match(COLON);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(Identifier);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(WHILE);
			setState(1751);
			match(PEA);
			setState(1752);
			expression();
			setState(1753);
			match(PEF);
			setState(1754);
			statement();
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

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(WHILE);
			setState(1757);
			match(PEA);
			setState(1758);
			expression();
			setState(1759);
			match(PEF);
			setState(1760);
			statementNoShortIf();
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

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(DO);
			setState(1763);
			statement();
			setState(1764);
			match(WHILE);
			setState(1765);
			match(PEA);
			setState(1766);
			expression();
			setState(1767);
			match(PEF);
			setState(1768);
			match(PVIR);
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

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_forStatement);
		try {
			setState(1772);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
				enhancedForStatement();
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

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_forStatementNoShortIf);
		try {
			setState(1776);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				enhancedForStatementNoShortIf();
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

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public List<TerminalNode> PVIR() { return getTokens(JqueryParser.PVIR); }
		public TerminalNode PVIR(int i) {
			return getToken(JqueryParser.PVIR, i);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(FOR);
			setState(1779);
			match(PEA);
			setState(1781);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1780);
				forInit();
				}
			}

			setState(1783);
			match(PVIR);
			setState(1785);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1784);
				expression();
				}
			}

			setState(1787);
			match(PVIR);
			setState(1789);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1788);
				forUpdate();
				}
			}

			setState(1791);
			match(PEF);
			setState(1792);
			statement();
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

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public List<TerminalNode> PVIR() { return getTokens(JqueryParser.PVIR); }
		public TerminalNode PVIR(int i) {
			return getToken(JqueryParser.PVIR, i);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(FOR);
			setState(1795);
			match(PEA);
			setState(1797);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1796);
				forInit();
				}
			}

			setState(1799);
			match(PVIR);
			setState(1801);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1800);
				expression();
				}
			}

			setState(1803);
			match(PVIR);
			setState(1805);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1804);
				forUpdate();
				}
			}

			setState(1807);
			match(PEF);
			setState(1808);
			statementNoShortIf();
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

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_forInit);
		try {
			setState(1812);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1810);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1811);
				localVariableDeclaration();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			statementExpressionList();
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

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			statementExpression();
			setState(1821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1817);
				match(COMMA);
				setState(1818);
				statementExpression();
				}
				}
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			match(FOR);
			setState(1825);
			match(PEA);
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1826);
				variableModifier();
				}
				}
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1832);
			unannType();
			setState(1833);
			variableDeclaratorId();
			setState(1834);
			match(COLON);
			setState(1835);
			expression();
			setState(1836);
			match(PEF);
			setState(1837);
			statement();
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

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(FOR);
			setState(1840);
			match(PEA);
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1841);
				variableModifier();
				}
				}
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1847);
			unannType();
			setState(1848);
			variableDeclaratorId();
			setState(1849);
			match(COLON);
			setState(1850);
			expression();
			setState(1851);
			match(PEF);
			setState(1852);
			statementNoShortIf();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(BREAK);
			setState(1856);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1855);
				match(Identifier);
				}
			}

			setState(1858);
			match(PVIR);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			match(CONTINUE);
			setState(1862);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1861);
				match(Identifier);
				}
			}

			setState(1864);
			match(PVIR);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(RETURN);
			setState(1868);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1867);
				expression();
				}
			}

			setState(1870);
			match(PVIR);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			match(THROW);
			setState(1873);
			expression();
			setState(1874);
			match(PVIR);
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

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			match(SYNCHRONIZED);
			setState(1877);
			match(PEA);
			setState(1878);
			expression();
			setState(1879);
			match(PEF);
			setState(1880);
			block();
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

	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_tryStatement);
		int _la;
		try {
			setState(1894);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1882);
				match(TRY);
				setState(1883);
				block();
				setState(1884);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				match(TRY);
				setState(1887);
				block();
				setState(1889);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1888);
					catches();
					}
				}

				setState(1891);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1893);
				tryWithResourcesStatement();
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

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			catchClause();
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1897);
				catchClause();
				}
				}
				setState(1902);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(CATCH);
			setState(1904);
			match(PEA);
			setState(1905);
			catchFormalParameter();
			setState(1906);
			match(PEF);
			setState(1907);
			block();
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

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1909);
				variableModifier();
				}
				}
				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1915);
			catchType();
			setState(1916);
			variableDeclaratorId();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			unannClassType();
			setState(1923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1919);
				match(BITOR);
				setState(1920);
				classType();
				}
				}
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 362, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			match(FINALLY);
			setState(1927);
			block();
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

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(TRY);
			setState(1930);
			resourceSpecification();
			setState(1931);
			block();
			setState(1933);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1932);
				catches();
				}
			}

			setState(1936);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1935);
				finally_();
				}
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TerminalNode PVIR() { return getToken(JqueryParser.PVIR, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			match(PEA);
			setState(1939);
			resourceList();
			setState(1941);
			_la = _input.LA(1);
			if (_la==PVIR) {
				{
				setState(1940);
				match(PVIR);
				}
			}

			setState(1943);
			match(PEF);
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

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> PVIR() { return getTokens(JqueryParser.PVIR); }
		public TerminalNode PVIR(int i) {
			return getToken(JqueryParser.PVIR, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			resource();
			setState(1950);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1946);
					match(PVIR);
					setState(1947);
					resource();
					}
					} 
				}
				setState(1952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode EQL() { return getToken(JqueryParser.EQL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1953);
				variableModifier();
				}
				}
				setState(1958);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1959);
			unannType();
			setState(1960);
			variableDeclaratorId();
			setState(1961);
			match(EQL);
			setState(1962);
			expression();
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1964);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1965);
				arrayCreationExpression();
				}
				break;
			}
			setState(1971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1968);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
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

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(2003);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				typeName();
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREA) {
					{
					{
					setState(1976);
					match(PREA);
					setState(1977);
					match(PREF);
					}
					}
					setState(1982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1983);
				match(DOT);
				setState(1984);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1986);
				match(VOID);
				setState(1987);
				match(DOT);
				setState(1988);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1989);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1990);
				typeName();
				setState(1991);
				match(DOT);
				setState(1992);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1994);
				match(PEA);
				setState(1995);
				expression();
				setState(1996);
				match(PEF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1998);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1999);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2000);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2001);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2002);
				methodReference();
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

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2035);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2007);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2008);
				typeName();
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREA) {
					{
					{
					setState(2009);
					match(PREA);
					setState(2010);
					match(PREF);
					}
					}
					setState(2015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2016);
				match(DOT);
				setState(2017);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				match(VOID);
				setState(2020);
				match(DOT);
				setState(2021);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2022);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2023);
				typeName();
				setState(2024);
				match(DOT);
				setState(2025);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2027);
				match(PEA);
				setState(2028);
				expression();
				setState(2029);
				match(PEF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2031);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2032);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2033);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2034);
				methodReference();
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

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2042);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2037);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2038);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2039);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2040);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2041);
				methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2050);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2046);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2047);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2048);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2049);
				methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2092);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				typeName();
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREA) {
					{
					{
					setState(2054);
					match(PREA);
					setState(2055);
					match(PREF);
					}
					}
					setState(2060);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2061);
				match(DOT);
				setState(2062);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2064);
				unannPrimitiveType();
				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREA) {
					{
					{
					setState(2065);
					match(PREA);
					setState(2066);
					match(PREF);
					}
					}
					setState(2071);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2072);
				match(DOT);
				setState(2073);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2075);
				match(VOID);
				setState(2076);
				match(DOT);
				setState(2077);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2078);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2079);
				typeName();
				setState(2080);
				match(DOT);
				setState(2081);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2083);
				match(PEA);
				setState(2084);
				expression();
				setState(2085);
				match(PEF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2087);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2088);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2089);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2090);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2091);
				methodReference_lfno_primary();
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

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2135);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2096);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2097);
				typeName();
				setState(2102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREA) {
					{
					{
					setState(2098);
					match(PREA);
					setState(2099);
					match(PREF);
					}
					}
					setState(2104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2105);
				match(DOT);
				setState(2106);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2108);
				unannPrimitiveType();
				setState(2113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREA) {
					{
					{
					setState(2109);
					match(PREA);
					setState(2110);
					match(PREF);
					}
					}
					setState(2115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2116);
				match(DOT);
				setState(2117);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2119);
				match(VOID);
				setState(2120);
				match(DOT);
				setState(2121);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2122);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2123);
				typeName();
				setState(2124);
				match(DOT);
				setState(2125);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2127);
				match(PEA);
				setState(2128);
				expression();
				setState(2129);
				match(PEF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2131);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2132);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2133);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2134);
				methodReference_lfno_primary();
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

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JqueryParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JqueryParser.Identifier, i);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2220);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2137);
				match(NEW);
				setState(2139);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2138);
					typeArguments();
					}
				}

				setState(2144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2141);
					annotation();
					}
					}
					setState(2146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2147);
				match(Identifier);
				setState(2158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2148);
					match(DOT);
					setState(2152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2149);
						annotation();
						}
						}
						setState(2154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2155);
					match(Identifier);
					}
					}
					setState(2160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2162);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2161);
					typeArgumentsOrDiamond();
					}
				}

				setState(2164);
				match(PEA);
				setState(2166);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2165);
					argumentList();
					}
				}

				setState(2168);
				match(PEF);
				setState(2170);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2169);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				expressionName();
				setState(2173);
				match(DOT);
				setState(2174);
				match(NEW);
				setState(2176);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2175);
					typeArguments();
					}
				}

				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2178);
					annotation();
					}
					}
					setState(2183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2184);
				match(Identifier);
				setState(2186);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2185);
					typeArgumentsOrDiamond();
					}
				}

				setState(2188);
				match(PEA);
				setState(2190);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2189);
					argumentList();
					}
				}

				setState(2192);
				match(PEF);
				setState(2194);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2193);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2196);
				primary();
				setState(2197);
				match(DOT);
				setState(2198);
				match(NEW);
				setState(2200);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2199);
					typeArguments();
					}
				}

				setState(2205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2202);
					annotation();
					}
					}
					setState(2207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2208);
				match(Identifier);
				setState(2210);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2209);
					typeArgumentsOrDiamond();
					}
				}

				setState(2212);
				match(PEA);
				setState(2214);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2213);
					argumentList();
					}
				}

				setState(2216);
				match(PEF);
				setState(2218);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2217);
					classBody();
					}
				}

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

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			match(DOT);
			setState(2223);
			match(NEW);
			setState(2225);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2224);
				typeArguments();
				}
			}

			setState(2230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2227);
				annotation();
				}
				}
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2233);
			match(Identifier);
			setState(2235);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2234);
				typeArgumentsOrDiamond();
				}
			}

			setState(2237);
			match(PEA);
			setState(2239);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(2238);
				argumentList();
				}
			}

			setState(2241);
			match(PEF);
			setState(2243);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2242);
				classBody();
				}
				break;
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

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JqueryParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JqueryParser.Identifier, i);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2304);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				match(NEW);
				setState(2247);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2246);
					typeArguments();
					}
				}

				setState(2252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2249);
					annotation();
					}
					}
					setState(2254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2255);
				match(Identifier);
				setState(2266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2256);
					match(DOT);
					setState(2260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2257);
						annotation();
						}
						}
						setState(2262);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2263);
					match(Identifier);
					}
					}
					setState(2268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2270);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2269);
					typeArgumentsOrDiamond();
					}
				}

				setState(2272);
				match(PEA);
				setState(2274);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2273);
					argumentList();
					}
				}

				setState(2276);
				match(PEF);
				setState(2278);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2277);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
				expressionName();
				setState(2281);
				match(DOT);
				setState(2282);
				match(NEW);
				setState(2284);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2283);
					typeArguments();
					}
				}

				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2286);
					annotation();
					}
					}
					setState(2291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2292);
				match(Identifier);
				setState(2294);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2293);
					typeArgumentsOrDiamond();
					}
				}

				setState(2296);
				match(PEA);
				setState(2298);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2297);
					argumentList();
					}
				}

				setState(2300);
				match(PEF);
				setState(2302);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2301);
					classBody();
					}
					break;
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_typeArgumentsOrDiamond);
		try {
			setState(2309);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2306);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2307);
				match(LT);
				setState(2308);
				match(GT);
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

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_fieldAccess);
		try {
			setState(2324);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2311);
				primary();
				setState(2312);
				match(DOT);
				setState(2313);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2315);
				match(SUPER);
				setState(2316);
				match(DOT);
				setState(2317);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2318);
				typeName();
				setState(2319);
				match(DOT);
				setState(2320);
				match(SUPER);
				setState(2321);
				match(DOT);
				setState(2322);
				match(Identifier);
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

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			match(DOT);
			setState(2327);
			match(Identifier);
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

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_fieldAccess_lfno_primary);
		try {
			setState(2338);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329);
				match(SUPER);
				setState(2330);
				match(DOT);
				setState(2331);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2332);
				typeName();
				setState(2333);
				match(DOT);
				setState(2334);
				match(SUPER);
				setState(2335);
				match(DOT);
				setState(2336);
				match(Identifier);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2340);
				expressionName();
				setState(2341);
				match(PREA);
				setState(2342);
				expression();
				setState(2343);
				match(PREF);
				}
				break;
			case 2:
				{
				setState(2345);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2346);
				match(PREA);
				setState(2347);
				expression();
				setState(2348);
				match(PREF);
				}
				break;
			}
			setState(2359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREA) {
				{
				{
				setState(2352);
				primaryNoNewArray_lf_arrayAccess();
				setState(2353);
				match(PREA);
				setState(2354);
				expression();
				setState(2355);
				match(PREF);
				}
				}
				setState(2361);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2362);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2363);
			match(PREA);
			setState(2364);
			expression();
			setState(2365);
			match(PREF);
			}
			setState(2374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2367);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2368);
					match(PREA);
					setState(2369);
					expression();
					setState(2370);
					match(PREF);
					}
					} 
				}
				setState(2376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> PREA() { return getTokens(JqueryParser.PREA); }
		public TerminalNode PREA(int i) {
			return getToken(JqueryParser.PREA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PREF() { return getTokens(JqueryParser.PREF); }
		public TerminalNode PREF(int i) {
			return getToken(JqueryParser.PREF, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2377);
				expressionName();
				setState(2378);
				match(PREA);
				setState(2379);
				expression();
				setState(2380);
				match(PREF);
				}
				break;
			case 2:
				{
				setState(2382);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2383);
				match(PREA);
				setState(2384);
				expression();
				setState(2385);
				match(PREF);
				}
				break;
			}
			setState(2396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2389);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2390);
					match(PREA);
					setState(2391);
					expression();
					setState(2392);
					match(PREF);
					}
					} 
				}
				setState(2398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_methodInvocation);
		int _la;
		try {
			setState(2467);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2399);
				methodName();
				setState(2400);
				match(PEA);
				setState(2402);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2401);
					argumentList();
					}
				}

				setState(2404);
				match(PEF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				typeName();
				setState(2407);
				match(DOT);
				setState(2409);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2408);
					typeArguments();
					}
				}

				setState(2411);
				match(Identifier);
				setState(2412);
				match(PEA);
				setState(2414);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2413);
					argumentList();
					}
				}

				setState(2416);
				match(PEF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2418);
				expressionName();
				setState(2419);
				match(DOT);
				setState(2421);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2420);
					typeArguments();
					}
				}

				setState(2423);
				match(Identifier);
				setState(2424);
				match(PEA);
				setState(2426);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2425);
					argumentList();
					}
				}

				setState(2428);
				match(PEF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2430);
				primary();
				setState(2431);
				match(DOT);
				setState(2433);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2432);
					typeArguments();
					}
				}

				setState(2435);
				match(Identifier);
				setState(2436);
				match(PEA);
				setState(2438);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2437);
					argumentList();
					}
				}

				setState(2440);
				match(PEF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2442);
				match(SUPER);
				setState(2443);
				match(DOT);
				setState(2445);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2444);
					typeArguments();
					}
				}

				setState(2447);
				match(Identifier);
				setState(2448);
				match(PEA);
				setState(2450);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2449);
					argumentList();
					}
				}

				setState(2452);
				match(PEF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2453);
				typeName();
				setState(2454);
				match(DOT);
				setState(2455);
				match(SUPER);
				setState(2456);
				match(DOT);
				setState(2458);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2457);
					typeArguments();
					}
				}

				setState(2460);
				match(Identifier);
				setState(2461);
				match(PEA);
				setState(2463);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2462);
					argumentList();
					}
				}

				setState(2465);
				match(PEF);
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

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2469);
			match(DOT);
			setState(2471);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2470);
				typeArguments();
				}
			}

			setState(2473);
			match(Identifier);
			setState(2474);
			match(PEA);
			setState(2476);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(2475);
				argumentList();
				}
			}

			setState(2478);
			match(PEF);
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

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2536);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2480);
				methodName();
				setState(2481);
				match(PEA);
				setState(2483);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2482);
					argumentList();
					}
				}

				setState(2485);
				match(PEF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2487);
				typeName();
				setState(2488);
				match(DOT);
				setState(2490);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2489);
					typeArguments();
					}
				}

				setState(2492);
				match(Identifier);
				setState(2493);
				match(PEA);
				setState(2495);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2494);
					argumentList();
					}
				}

				setState(2497);
				match(PEF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2499);
				expressionName();
				setState(2500);
				match(DOT);
				setState(2502);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2501);
					typeArguments();
					}
				}

				setState(2504);
				match(Identifier);
				setState(2505);
				match(PEA);
				setState(2507);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2506);
					argumentList();
					}
				}

				setState(2509);
				match(PEF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2511);
				match(SUPER);
				setState(2512);
				match(DOT);
				setState(2514);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2513);
					typeArguments();
					}
				}

				setState(2516);
				match(Identifier);
				setState(2517);
				match(PEA);
				setState(2519);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2518);
					argumentList();
					}
				}

				setState(2521);
				match(PEF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2522);
				typeName();
				setState(2523);
				match(DOT);
				setState(2524);
				match(SUPER);
				setState(2525);
				match(DOT);
				setState(2527);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2526);
					typeArguments();
					}
				}

				setState(2529);
				match(Identifier);
				setState(2530);
				match(PEA);
				setState(2532);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEA) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NullLiteral - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(2531);
					argumentList();
					}
				}

				setState(2534);
				match(PEF);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			expression();
			setState(2543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2539);
				match(COMMA);
				setState(2540);
				expression();
				}
				}
				setState(2545);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_methodReference);
		int _la;
		try {
			setState(2593);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2546);
				expressionName();
				setState(2547);
				match(COLONCOLON);
				setState(2549);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2548);
					typeArguments();
					}
				}

				setState(2551);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2553);
				referenceType();
				setState(2554);
				match(COLONCOLON);
				setState(2556);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2555);
					typeArguments();
					}
				}

				setState(2558);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2560);
				primary();
				setState(2561);
				match(COLONCOLON);
				setState(2563);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2562);
					typeArguments();
					}
				}

				setState(2565);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2567);
				match(SUPER);
				setState(2568);
				match(COLONCOLON);
				setState(2570);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2569);
					typeArguments();
					}
				}

				setState(2572);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2573);
				typeName();
				setState(2574);
				match(DOT);
				setState(2575);
				match(SUPER);
				setState(2576);
				match(COLONCOLON);
				setState(2578);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2577);
					typeArguments();
					}
				}

				setState(2580);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2582);
				classType();
				setState(2583);
				match(COLONCOLON);
				setState(2585);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2584);
					typeArguments();
					}
				}

				setState(2587);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2589);
				arrayType();
				setState(2590);
				match(COLONCOLON);
				setState(2591);
				match(NEW);
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

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2595);
			match(COLONCOLON);
			setState(2597);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2596);
				typeArguments();
				}
			}

			setState(2599);
			match(Identifier);
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

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2641);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2601);
				expressionName();
				setState(2602);
				match(COLONCOLON);
				setState(2604);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2603);
					typeArguments();
					}
				}

				setState(2606);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2608);
				referenceType();
				setState(2609);
				match(COLONCOLON);
				setState(2611);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2610);
					typeArguments();
					}
				}

				setState(2613);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2615);
				match(SUPER);
				setState(2616);
				match(COLONCOLON);
				setState(2618);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2617);
					typeArguments();
					}
				}

				setState(2620);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2621);
				typeName();
				setState(2622);
				match(DOT);
				setState(2623);
				match(SUPER);
				setState(2624);
				match(COLONCOLON);
				setState(2626);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2625);
					typeArguments();
					}
				}

				setState(2628);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2630);
				classType();
				setState(2631);
				match(COLONCOLON);
				setState(2633);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2632);
					typeArguments();
					}
				}

				setState(2635);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2637);
				arrayType();
				setState(2638);
				match(COLONCOLON);
				setState(2639);
				match(NEW);
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_arrayCreationExpression);
		try {
			setState(2665);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2643);
				match(NEW);
				setState(2644);
				primitiveType();
				setState(2645);
				dimExprs();
				setState(2647);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2646);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2649);
				match(NEW);
				setState(2650);
				classOrInterfaceType();
				setState(2651);
				dimExprs();
				setState(2653);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2652);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2655);
				match(NEW);
				setState(2656);
				primitiveType();
				setState(2657);
				dims();
				setState(2658);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2660);
				match(NEW);
				setState(2661);
				classOrInterfaceType();
				setState(2662);
				dims();
				setState(2663);
				arrayInitializer();
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

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			dimExpr();
			setState(2671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2668);
					dimExpr();
					}
					} 
				}
				setState(2673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
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

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode PREA() { return getToken(JqueryParser.PREA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PREF() { return getToken(JqueryParser.PREF, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2674);
				annotation();
				}
				}
				setState(2679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2680);
			match(PREA);
			setState(2681);
			expression();
			setState(2682);
			match(PREF);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_expression);
		try {
			setState(2688);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2686);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2687);
				assignmentExpression();
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
			lambdaParameters();
			setState(2691);
			match(ARROW);
			setState(2692);
			lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JqueryParser.Identifier, 0); }
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_lambdaParameters);
		int _la;
		try {
			setState(2704);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2694);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2695);
				match(PEA);
				setState(2697);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2696);
					formalParameterList();
					}
				}

				setState(2699);
				match(PEF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2700);
				match(PEA);
				setState(2701);
				inferredFormalParameterList();
				setState(2702);
				match(PEF);
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

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JqueryParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JqueryParser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2706);
			match(Identifier);
			setState(2711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2707);
				match(COMMA);
				setState(2708);
				match(Identifier);
				}
				}
				setState(2713);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_lambdaBody);
		try {
			setState(2716);
			switch (_input.LA(1)) {
			case PEA:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2714);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2715);
				block();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_assignmentExpression);
		try {
			setState(2720);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2718);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2719);
				assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2722);
			leftHandSide();
			setState(2723);
			assignmentOperator();
			setState(2724);
			expression();
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_leftHandSide);
		try {
			setState(2729);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2726);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2727);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2728);
				arrayAccess();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(JqueryParser.EQL, 0); }
		public TerminalNode OPSJ() { return getToken(JqueryParser.OPSJ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2731);
			_la = _input.LA(1);
			if ( !(_la==EQL || _la==OPSJ) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_conditionalExpression);
		try {
			setState(2740);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2733);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2734);
				conditionalOrExpression(0);
				setState(2735);
				match(QUESTION);
				setState(2736);
				expression();
				setState(2737);
				match(COLON);
				setState(2738);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2743);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2745);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2746);
					match(OR);
					setState(2747);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 456;
		enterRecursionRule(_localctx, 456, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2754);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2756);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2757);
					match(AND);
					setState(2758);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2765);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2767);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2768);
					match(BITOR);
					setState(2769);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 460;
		enterRecursionRule(_localctx, 460, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2776);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2778);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2779);
					match(CARET);
					setState(2780);
					andExpression(0);
					}
					} 
				}
				setState(2785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 462;
		enterRecursionRule(_localctx, 462, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2787);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2789);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2790);
					match(BITAND);
					setState(2791);
					equalityExpression(0);
					}
					} 
				}
				setState(2796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 464;
		enterRecursionRule(_localctx, 464, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2798);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2806);
					switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2800);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2801);
						match(EQUAL);
						setState(2802);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2803);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2804);
						match(NOTEQUAL);
						setState(2805);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 466;
		enterRecursionRule(_localctx, 466, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2812);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2829);
					switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2814);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2815);
						match(LT);
						setState(2816);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2817);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2818);
						match(GT);
						setState(2819);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2820);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2821);
						match(LE);
						setState(2822);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2823);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2824);
						match(GE);
						setState(2825);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2826);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2827);
						match(INSTANCEOF);
						setState(2828);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 468;
		enterRecursionRule(_localctx, 468, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2835);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2850);
					switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2837);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2838);
						match(LT);
						setState(2839);
						match(LT);
						setState(2840);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2841);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2842);
						match(GT);
						setState(2843);
						match(GT);
						setState(2844);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2845);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2846);
						match(GT);
						setState(2847);
						match(GT);
						setState(2848);
						match(GT);
						setState(2849);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 470;
		enterRecursionRule(_localctx, 470, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2856);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2864);
					switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2858);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2859);
						match(ADD);
						setState(2860);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2861);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2862);
						match(SUB);
						setState(2863);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 472;
		enterRecursionRule(_localctx, 472, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2870);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2881);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2872);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2873);
						match(MUL);
						setState(2874);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2875);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2876);
						match(DIV);
						setState(2877);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2878);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2879);
						match(MOD);
						setState(2880);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_unaryExpression);
		try {
			setState(2893);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2886);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2887);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2888);
				match(ADD);
				setState(2889);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2890);
				match(SUB);
				setState(2891);
				unaryExpression();
				}
				break;
			case PEA:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2892);
				unaryExpressionNotPlusMinus();
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2895);
			match(INC);
			setState(2896);
			unaryExpression();
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

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
			match(DEC);
			setState(2899);
			unaryExpression();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2907);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2901);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2902);
				match(TILDE);
				setState(2903);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2904);
				match(BANG);
				setState(2905);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2906);
				castExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2911);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2909);
				primary();
				}
				break;
			case 2:
				{
				setState(2910);
				expressionName();
				}
				break;
			}
			setState(2917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2915);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2913);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2914);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2920);
			postfixExpression();
			setState(2921);
			match(INC);
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

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2923);
			match(INC);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2925);
			postfixExpression();
			setState(2926);
			match(DEC);
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

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2928);
			match(DEC);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode PEA() { return getToken(JqueryParser.PEA, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode PEF() { return getToken(JqueryParser.PEF, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JqueryParserListener ) ((JqueryParserListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_castExpression);
		int _la;
		try {
			setState(2957);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2930);
				match(PEA);
				setState(2931);
				primitiveType();
				setState(2932);
				match(PEF);
				setState(2933);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2935);
				match(PEA);
				setState(2936);
				referenceType();
				setState(2940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2937);
					additionalBound();
					}
					}
					setState(2942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2943);
				match(PEF);
				setState(2944);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2946);
				match(PEA);
				setState(2947);
				referenceType();
				setState(2951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2948);
					additionalBound();
					}
					}
					setState(2953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2954);
				match(PEF);
				setState(2955);
				lambdaExpression();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 38:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 41:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 227:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 228:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 229:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 230:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 231:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 232:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 233:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 234:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 235:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 236:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0089\u0b92\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\3\2\3\2\3\3\3\3\6\3\u01f5"+
		"\n\3\r\3\16\3\u01f6\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\5\7\u0209\n\7\3\7\3\7\5\7\u020d\n\7\3\7\3\7\5\7\u0211\n"+
		"\7\5\7\u0213\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u021f\n\t"+
		"\3\t\5\t\u0222\n\t\3\t\5\t\u0225\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0232\n\n\3\13\3\13\3\13\5\13\u0237\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u023f\n\13\5\13\u0241\n\13\3\f\3\f\3\r\3\r\5\r\u0247"+
		"\n\r\3\16\7\16\u024a\n\16\f\16\16\16\u024d\13\16\3\16\3\16\7\16\u0251"+
		"\n\16\f\16\16\16\u0254\13\16\3\16\5\16\u0257\n\16\3\17\3\17\5\17\u025b"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u0264\n\22\3\23\3\23\5\23"+
		"\u0268\n\23\3\23\3\23\7\23\u026c\n\23\f\23\16\23\u026f\13\23\3\24\7\24"+
		"\u0272\n\24\f\24\16\24\u0275\13\24\3\24\3\24\5\24\u0279\n\24\3\24\3\24"+
		"\3\24\7\24\u027e\n\24\f\24\16\24\u0281\13\24\3\24\3\24\5\24\u0285\n\24"+
		"\5\24\u0287\n\24\3\25\3\25\7\25\u028b\n\25\f\25\16\25\u028e\13\25\3\25"+
		"\3\25\5\25\u0292\n\25\3\26\7\26\u0295\n\26\f\26\16\26\u0298\13\26\3\26"+
		"\3\26\5\26\u029c\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\7\32\u02a5\n"+
		"\32\f\32\16\32\u02a8\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u02b5\n\33\3\34\7\34\u02b8\n\34\f\34\16\34\u02bb\13\34"+
		"\3\34\3\34\3\34\7\34\u02c0\n\34\f\34\16\34\u02c3\13\34\3\34\3\34\7\34"+
		"\u02c7\n\34\f\34\16\34\u02ca\13\34\3\35\7\35\u02cd\n\35\f\35\16\35\u02d0"+
		"\13\35\3\35\3\35\5\35\u02d4\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7"+
		"\37\u02dd\n\37\f\37\16\37\u02e0\13\37\5\37\u02e2\n\37\3 \3 \3 \3!\3!\3"+
		"!\3!\3\"\3\"\3\"\7\"\u02ee\n\"\f\"\16\"\u02f1\13\"\3#\3#\5#\u02f5\n#\3"+
		"$\7$\u02f8\n$\f$\16$\u02fb\13$\3$\3$\5$\u02ff\n$\3%\3%\3%\3%\5%\u0305"+
		"\n%\3&\3&\3&\3&\3&\3&\7&\u030d\n&\f&\16&\u0310\13&\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u0317\n\'\3(\3(\3(\3(\3(\3(\7(\u031f\n(\f(\16(\u0322\13(\3)\3)\3"+
		")\3)\3)\5)\u0329\n)\3*\3*\3+\3+\3+\3+\3+\3+\7+\u0333\n+\f+\16+\u0336\13"+
		"+\3,\5,\u0339\n,\3,\7,\u033c\n,\f,\16,\u033f\13,\3,\7,\u0342\n,\f,\16"+
		",\u0345\13,\3,\3,\3-\7-\u034a\n-\f-\16-\u034d\13-\3-\3-\3-\3-\7-\u0353"+
		"\n-\f-\16-\u0356\13-\3-\3-\3.\3.\3/\3/\3/\3/\5/\u0360\n/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u037d\n\64\3\65"+
		"\3\65\5\65\u0381\n\65\3\66\7\66\u0384\n\66\f\66\16\66\u0387\13\66\3\66"+
		"\3\66\3\66\5\66\u038c\n\66\3\66\5\66\u038f\n\66\3\66\5\66\u0392\n\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u039e\n\67\38\3"+
		"8\38\38\39\39\39\79\u03a7\n9\f9\169\u03aa\139\3:\3:\3:\3;\3;\3;\3<\3<"+
		"\3<\7<\u03b5\n<\f<\16<\u03b8\13<\3=\3=\7=\u03bc\n=\f=\16=\u03bf\13=\3"+
		"=\3=\3>\3>\3>\3>\5>\u03c7\n>\3?\3?\3?\3?\3?\5?\u03ce\n?\3@\7@\u03d1\n"+
		"@\f@\16@\u03d4\13@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03e2\nA\3B"+
		"\3B\3B\7B\u03e7\nB\fB\16B\u03ea\13B\3C\3C\3C\5C\u03ef\nC\3D\3D\5D\u03f3"+
		"\nD\3E\3E\5E\u03f7\nE\3F\3F\5F\u03fb\nF\3G\3G\5G\u03ff\nG\3H\3H\3H\5H"+
		"\u0404\nH\3I\3I\5I\u0408\nI\3I\3I\7I\u040c\nI\fI\16I\u040f\13I\3J\3J\5"+
		"J\u0413\nJ\3J\3J\3J\7J\u0418\nJ\fJ\16J\u041b\13J\3J\3J\5J\u041f\nJ\5J"+
		"\u0421\nJ\3K\3K\7K\u0425\nK\fK\16K\u0428\13K\3K\3K\5K\u042c\nK\3L\3L\5"+
		"L\u0430\nL\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0443"+
		"\nQ\3R\7R\u0446\nR\fR\16R\u0449\13R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\5S\u0458\nS\3T\3T\3T\5T\u045d\nT\3T\3T\7T\u0461\nT\fT\16T\u0464\13"+
		"T\3T\3T\3T\5T\u0469\nT\5T\u046b\nT\3U\3U\5U\u046f\nU\3V\3V\3V\5V\u0474"+
		"\nV\3V\3V\5V\u0478\nV\3W\3W\3W\3W\3W\5W\u047f\nW\3X\3X\3X\7X\u0484\nX"+
		"\fX\16X\u0487\13X\3X\3X\3X\7X\u048c\nX\fX\16X\u048f\13X\5X\u0491\nX\3"+
		"Y\7Y\u0494\nY\fY\16Y\u0497\13Y\3Y\3Y\3Y\3Z\3Z\5Z\u049e\nZ\3[\7[\u04a1"+
		"\n[\f[\16[\u04a4\13[\3[\3[\7[\u04a8\n[\f[\16[\u04ab\13[\3[\3[\3[\3[\5"+
		"[\u04b1\n[\3\\\7\\\u04b4\n\\\f\\\16\\\u04b7\13\\\3\\\3\\\3\\\5\\\u04bc"+
		"\n\\\3\\\3\\\3]\3]\3]\3^\3^\3^\7^\u04c6\n^\f^\16^\u04c9\13^\3_\3_\5_\u04cd"+
		"\n_\3`\3`\5`\u04d1\n`\3a\3a\3b\3b\3b\3c\7c\u04d9\nc\fc\16c\u04dc\13c\3"+
		"c\3c\5c\u04e0\nc\3c\3c\3d\3d\3d\3d\5d\u04e8\nd\3e\5e\u04eb\ne\3e\3e\3"+
		"e\5e\u04f0\ne\3e\3e\3f\3f\3g\3g\5g\u04f8\ng\3g\5g\u04fb\ng\3g\3g\3h\5"+
		"h\u0500\nh\3h\3h\3h\5h\u0505\nh\3h\3h\3h\5h\u050a\nh\3h\3h\3h\5h\u050f"+
		"\nh\3h\3h\3h\3h\3h\5h\u0516\nh\3h\3h\3h\5h\u051b\nh\3h\3h\3h\3h\3h\3h"+
		"\5h\u0523\nh\3h\3h\3h\5h\u0528\nh\3h\3h\3h\5h\u052d\nh\3i\7i\u0530\ni"+
		"\fi\16i\u0533\13i\3i\3i\3i\5i\u0538\ni\3i\3i\3j\3j\5j\u053e\nj\3j\5j\u0541"+
		"\nj\3j\5j\u0544\nj\3j\3j\3k\3k\3k\7k\u054b\nk\fk\16k\u054e\13k\3l\7l\u0551"+
		"\nl\fl\16l\u0554\13l\3l\3l\3l\5l\u0559\nl\3l\5l\u055c\nl\3l\5l\u055f\n"+
		"l\3m\3m\3n\3n\7n\u0565\nn\fn\16n\u0568\13n\3o\3o\5o\u056c\no\3p\7p\u056f"+
		"\np\fp\16p\u0572\13p\3p\3p\3p\5p\u0577\np\3p\5p\u057a\np\3p\3p\3q\3q\3"+
		"q\3q\3q\3q\3q\5q\u0585\nq\3r\3r\3r\3s\3s\7s\u058c\ns\fs\16s\u058f\13s"+
		"\3s\3s\3t\3t\3t\3t\3t\5t\u0598\nt\3u\7u\u059b\nu\fu\16u\u059e\13u\3u\3"+
		"u\3u\3u\3v\3v\3v\3v\5v\u05a8\nv\3w\7w\u05ab\nw\fw\16w\u05ae\13w\3w\3w"+
		"\3w\3x\3x\3x\3x\3x\3x\5x\u05b9\nx\3y\7y\u05bc\ny\fy\16y\u05bf\13y\3y\3"+
		"y\3y\3y\3y\3z\3z\7z\u05c8\nz\fz\16z\u05cb\13z\3z\3z\3{\3{\3{\3{\3{\5{"+
		"\u05d4\n{\3|\7|\u05d7\n|\f|\16|\u05da\13|\3|\3|\3|\3|\3|\5|\u05e1\n|\3"+
		"|\5|\u05e4\n|\3|\3|\3}\3}\3}\5}\u05eb\n}\3~\3~\3~\3\177\3\177\3\177\5"+
		"\177\u05f3\n\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05f9\n\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u0600\n\u0081\f\u0081"+
		"\16\u0081\u0603\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u060c\n\u0083\3\u0084\3\u0084\5\u0084\u0610\n\u0084\3"+
		"\u0084\5\u0084\u0613\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\7"+
		"\u0085\u061a\n\u0085\f\u0085\16\u0085\u061d\13\u0085\3\u0086\3\u0086\3"+
		"\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\5\u0088\u062a\n\u0088\3\u0088\5\u0088\u062d\n\u0088\3\u0088\3\u0088\3"+
		"\u0089\3\u0089\3\u0089\7\u0089\u0634\n\u0089\f\u0089\16\u0089\u0637\13"+
		"\u0089\3\u008a\3\u008a\5\u008a\u063b\n\u008a\3\u008a\3\u008a\3\u008b\3"+
		"\u008b\7\u008b\u0641\n\u008b\f\u008b\16\u008b\u0644\13\u008b\3\u008c\3"+
		"\u008c\3\u008c\5\u008c\u0649\n\u008c\3\u008d\3\u008d\3\u008d\3\u008e\7"+
		"\u008e\u064f\n\u008e\f\u008e\16\u008e\u0652\13\u008e\3\u008e\3\u008e\3"+
		"\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u065d\n"+
		"\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0664\n\u0090\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u0672\n\u0091\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u0688\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u06aa"+
		"\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\7\u009c\u06b4\n\u009c\f\u009c\16\u009c\u06b7\13\u009c\3\u009c\7\u009c"+
		"\u06ba\n\u009c\f\u009c\16\u009c\u06bd\13\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\7\u009e\u06c6\n\u009e\f\u009e\16\u009e"+
		"\u06c9\13\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u06d5\n\u009f\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u06ef\n\u00a4\3\u00a5\3\u00a5\5\u00a5"+
		"\u06f3\n\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u06f8\n\u00a6\3\u00a6\3"+
		"\u00a6\5\u00a6\u06fc\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u0700\n\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0708\n\u00a7\3\u00a7"+
		"\3\u00a7\5\u00a7\u070c\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u0710\n\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u0717\n\u00a8\3\u00a9\3"+
		"\u00a9\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u071e\n\u00aa\f\u00aa\16\u00aa"+
		"\u0721\13\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0726\n\u00ab\f\u00ab"+
		"\16\u00ab\u0729\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u0735\n\u00ac\f\u00ac\16\u00ac"+
		"\u0738\13\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ad\3\u00ad\5\u00ad\u0743\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae"+
		"\5\u00ae\u0749\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\5\u00af\u074f\n"+
		"\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0764\n\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u0769\n\u00b2\3\u00b3\3\u00b3\7\u00b3\u076d\n\u00b3\f\u00b3\16\u00b3"+
		"\u0770\13\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5"+
		"\7\u00b5\u0779\n\u00b5\f\u00b5\16\u00b5\u077c\13\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0784\n\u00b6\f\u00b6\16\u00b6"+
		"\u0787\13\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\5\u00b8\u0790\n\u00b8\3\u00b8\5\u00b8\u0793\n\u00b8\3\u00b9\3\u00b9\3"+
		"\u00b9\5\u00b9\u0798\n\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\7"+
		"\u00ba\u079f\n\u00ba\f\u00ba\16\u00ba\u07a2\13\u00ba\3\u00bb\7\u00bb\u07a5"+
		"\n\u00bb\f\u00bb\16\u00bb\u07a8\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bc\3\u00bc\5\u00bc\u07b1\n\u00bc\3\u00bc\7\u00bc\u07b4\n"+
		"\u00bc\f\u00bc\16\u00bc\u07b7\13\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\7\u00bd\u07bd\n\u00bd\f\u00bd\16\u00bd\u07c0\13\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u07d6\n\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\7\u00bf\u07de\n\u00bf\f\u00bf\16\u00bf\u07e1\13\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u07f6\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u07fd\n"+
		"\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0805\n"+
		"\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u080b\n\u00c3\f\u00c3\16"+
		"\u00c3\u080e\13\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\7\u00c3\u0816\n\u00c3\f\u00c3\16\u00c3\u0819\13\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u082f\n\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\7\u00c5\u0837\n\u00c5\f\u00c5\16\u00c5\u083a\13\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u0842\n\u00c5\f\u00c5\16\u00c5"+
		"\u0845\13\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u085a\n\u00c5\3\u00c6\3\u00c6\5\u00c6"+
		"\u085e\n\u00c6\3\u00c6\7\u00c6\u0861\n\u00c6\f\u00c6\16\u00c6\u0864\13"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u0869\n\u00c6\f\u00c6\16\u00c6"+
		"\u086c\13\u00c6\3\u00c6\7\u00c6\u086f\n\u00c6\f\u00c6\16\u00c6\u0872\13"+
		"\u00c6\3\u00c6\5\u00c6\u0875\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u0879\n\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u087d\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0883\n\u00c6\3\u00c6\7\u00c6\u0886\n\u00c6\f\u00c6\16\u00c6"+
		"\u0889\13\u00c6\3\u00c6\3\u00c6\5\u00c6\u088d\n\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0891\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u0895\n\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\5\u00c6\u089b\n\u00c6\3\u00c6\7\u00c6\u089e\n\u00c6"+
		"\f\u00c6\16\u00c6\u08a1\13\u00c6\3\u00c6\3\u00c6\5\u00c6\u08a5\n\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u08a9\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u08ad\n"+
		"\u00c6\5\u00c6\u08af\n\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u08b4\n\u00c7"+
		"\3\u00c7\7\u00c7\u08b7\n\u00c7\f\u00c7\16\u00c7\u08ba\13\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u08be\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u08c2\n\u00c7\3"+
		"\u00c7\3\u00c7\5\u00c7\u08c6\n\u00c7\3\u00c8\3\u00c8\5\u00c8\u08ca\n\u00c8"+
		"\3\u00c8\7\u00c8\u08cd\n\u00c8\f\u00c8\16\u00c8\u08d0\13\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\7\u00c8\u08d5\n\u00c8\f\u00c8\16\u00c8\u08d8\13\u00c8"+
		"\3\u00c8\7\u00c8\u08db\n\u00c8\f\u00c8\16\u00c8\u08de\13\u00c8\3\u00c8"+
		"\5\u00c8\u08e1\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u08e5\n\u00c8\3\u00c8\3"+
		"\u00c8\5\u00c8\u08e9\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u08ef"+
		"\n\u00c8\3\u00c8\7\u00c8\u08f2\n\u00c8\f\u00c8\16\u00c8\u08f5\13\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u08f9\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u08fd\n"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0901\n\u00c8\5\u00c8\u0903\n\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0908\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u0917\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0925\n\u00cc"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\5\u00cd\u0931\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\7\u00cd\u0938\n\u00cd\f\u00cd\16\u00cd\u093b\13\u00cd\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\7\u00ce"+
		"\u0947\n\u00ce\f\u00ce\16\u00ce\u094a\13\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0956"+
		"\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u095d\n\u00cf"+
		"\f\u00cf\16\u00cf\u0960\13\u00cf\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0965"+
		"\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u096c\n\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0971\n\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\5\u00d0\u0978\n\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0"+
		"\u097d\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0984\n"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0989\n\u00d0\3\u00d0\3\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d0\5\u00d0\u0990\n\u00d0\3\u00d0\3\u00d0\3\u00d0\5"+
		"\u00d0\u0995\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5"+
		"\u00d0\u099d\n\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u09a2\n\u00d0\3\u00d0"+
		"\3\u00d0\5\u00d0\u09a6\n\u00d0\3\u00d1\3\u00d1\5\u00d1\u09aa\n\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d1\5\u00d1\u09af\n\u00d1\3\u00d1\3\u00d1\3\u00d2\3"+
		"\u00d2\3\u00d2\5\u00d2\u09b6\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3"+
		"\u00d2\5\u00d2\u09bd\n\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09c2\n\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09c9\n\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\5\u00d2\u09ce\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\5\u00d2\u09d5\n\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09da\n"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09e2\n"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09e7\n\u00d2\3\u00d2\3\u00d2\5"+
		"\u00d2\u09eb\n\u00d2\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u09f0\n\u00d3\f\u00d3"+
		"\16\u00d3\u09f3\13\u00d3\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u09f8\n\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u09ff\n\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a06\n\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a0d\n\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a15\n\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\5\u00d4\u0a1c\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\5\u00d4\u0a24\n\u00d4\3\u00d5\3\u00d5\5\u00d5\u0a28\n"+
		"\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a2f\n\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a36\n\u00d6\3\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a3d\n\u00d6\3\u00d6\3\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a45\n\u00d6\3\u00d6\3\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a4c\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a54\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3"+
		"\u00d7\5\u00d7\u0a5a\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a60"+
		"\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\5\u00d7\u0a6c\n\u00d7\3\u00d8\3\u00d8\7\u00d8\u0a70\n"+
		"\u00d8\f\u00d8\16\u00d8\u0a73\13\u00d8\3\u00d9\7\u00d9\u0a76\n\u00d9\f"+
		"\u00d9\16\u00d9\u0a79\13\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da"+
		"\3\u00da\3\u00db\3\u00db\5\u00db\u0a83\n\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a8c\n\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a93\n\u00dd\3\u00de\3\u00de\3\u00de"+
		"\7\u00de\u0a98\n\u00de\f\u00de\16\u00de\u0a9b\13\u00de\3\u00df\3\u00df"+
		"\5\u00df\u0a9f\n\u00df\3\u00e0\3\u00e0\5\u00e0\u0aa3\n\u00e0\3\u00e1\3"+
		"\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0aac\n\u00e2\3"+
		"\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\5\u00e4\u0ab7\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\7\u00e5\u0abf\n\u00e5\f\u00e5\16\u00e5\u0ac2\13\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\7\u00e6\u0aca\n\u00e6\f\u00e6\16\u00e6"+
		"\u0acd\13\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\7\u00e7"+
		"\u0ad5\n\u00e7\f\u00e7\16\u00e7\u0ad8\13\u00e7\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\7\u00e8\u0ae0\n\u00e8\f\u00e8\16\u00e8\u0ae3"+
		"\13\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\7\u00e9\u0aeb"+
		"\n\u00e9\f\u00e9\16\u00e9\u0aee\13\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0af9\n\u00ea\f\u00ea"+
		"\16\u00ea\u0afc\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0b10\n\u00eb\f\u00eb\16\u00eb\u0b13"+
		"\13\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\7\u00ec"+
		"\u0b25\n\u00ec\f\u00ec\16\u00ec\u0b28\13\u00ec\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0b33\n\u00ed"+
		"\f\u00ed\16\u00ed\u0b36\13\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b44"+
		"\n\u00ee\f\u00ee\16\u00ee\u0b47\13\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0b50\n\u00ef\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\5\u00f2\u0b5e\n\u00f2\3\u00f3\3\u00f3\5\u00f3\u0b62\n\u00f3\3\u00f3\3"+
		"\u00f3\7\u00f3\u0b66\n\u00f3\f\u00f3\16\u00f3\u0b69\13\u00f3\3\u00f4\3"+
		"\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7"+
		"\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\7\u00f8"+
		"\u0b7d\n\u00f8\f\u00f8\16\u00f8\u0b80\13\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f8\3\u00f8\7\u00f8\u0b88\n\u00f8\f\u00f8\16\u00f8\u0b8b"+
		"\13\u00f8\3\u00f8\3\u00f8\3\u00f8\5\u00f8\u0b90\n\u00f8\3\u00f8\2\17J"+
		"NT\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u00f9\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de"+
		"\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\2\7\4\2ww\u0081\u0081"+
		"\3\2=B\7\2\17\17\22\22%%\'\'//\4\2\30\30\36\36\3\2\t\n\u0c8b\2\u01f0\3"+
		"\2\2\2\4\u01f4\3\2\2\2\6\u01fa\3\2\2\2\b\u01fe\3\2\2\2\n\u0202\3\2\2\2"+
		"\f\u0212\3\2\2\2\16\u0214\3\2\2\2\20\u021b\3\2\2\2\22\u0228\3\2\2\2\24"+
		"\u0240\3\2\2\2\26\u0242\3\2\2\2\30\u0246\3\2\2\2\32\u0256\3\2\2\2\34\u025a"+
		"\3\2\2\2\36\u025c\3\2\2\2 \u025e\3\2\2\2\"\u0263\3\2\2\2$\u0267\3\2\2"+
		"\2&\u0286\3\2\2\2(\u0288\3\2\2\2*\u0296\3\2\2\2,\u029d\3\2\2\2.\u029f"+
		"\3\2\2\2\60\u02a1\3\2\2\2\62\u02a6\3\2\2\2\64\u02b4\3\2\2\2\66\u02b9\3"+
		"\2\2\28\u02ce\3\2\2\2:\u02d5\3\2\2\2<\u02e1\3\2\2\2>\u02e3\3\2\2\2@\u02e6"+
		"\3\2\2\2B\u02ea\3\2\2\2D\u02f4\3\2\2\2F\u02f9\3\2\2\2H\u0304\3\2\2\2J"+
		"\u0306\3\2\2\2L\u0316\3\2\2\2N\u0318\3\2\2\2P\u0328\3\2\2\2R\u032a\3\2"+
		"\2\2T\u032c\3\2\2\2V\u0338\3\2\2\2X\u034b\3\2\2\2Z\u0359\3\2\2\2\\\u035f"+
		"\3\2\2\2^\u0361\3\2\2\2`\u0365\3\2\2\2b\u036b\3\2\2\2d\u0372\3\2\2\2f"+
		"\u037c\3\2\2\2h\u0380\3\2\2\2j\u0385\3\2\2\2l\u039d\3\2\2\2n\u039f\3\2"+
		"\2\2p\u03a3\3\2\2\2r\u03ab\3\2\2\2t\u03ae\3\2\2\2v\u03b1\3\2\2\2x\u03b9"+
		"\3\2\2\2z\u03c6\3\2\2\2|\u03cd\3\2\2\2~\u03d2\3\2\2\2\u0080\u03e1\3\2"+
		"\2\2\u0082\u03e3\3\2\2\2\u0084\u03eb\3\2\2\2\u0086\u03f0\3\2\2\2\u0088"+
		"\u03f6\3\2\2\2\u008a\u03fa\3\2\2\2\u008c\u03fe\3\2\2\2\u008e\u0403\3\2"+
		"\2\2\u0090\u0407\3\2\2\2\u0092\u0420\3\2\2\2\u0094\u0422\3\2\2\2\u0096"+
		"\u042d\3\2\2\2\u0098\u0431\3\2\2\2\u009a\u0433\3\2\2\2\u009c\u0435\3\2"+
		"\2\2\u009e\u0437\3\2\2\2\u00a0\u0442\3\2\2\2\u00a2\u0447\3\2\2\2\u00a4"+
		"\u0457\3\2\2\2\u00a6\u046a\3\2\2\2\u00a8\u046e\3\2\2\2\u00aa\u0470\3\2"+
		"\2\2\u00ac\u047e\3\2\2\2\u00ae\u0490\3\2\2\2\u00b0\u0495\3\2\2\2\u00b2"+
		"\u049d\3\2\2\2\u00b4\u04b0\3\2\2\2\u00b6\u04b5\3\2\2\2\u00b8\u04bf\3\2"+
		"\2\2\u00ba\u04c2\3\2\2\2\u00bc\u04cc\3\2\2\2\u00be\u04d0\3\2\2\2\u00c0"+
		"\u04d2\3\2\2\2\u00c2\u04d4\3\2\2\2\u00c4\u04da\3\2\2\2\u00c6\u04e7\3\2"+
		"\2\2\u00c8\u04ea\3\2\2\2\u00ca\u04f3\3\2\2\2\u00cc\u04f5\3\2\2\2\u00ce"+
		"\u052c\3\2\2\2\u00d0\u0531\3\2\2\2\u00d2\u053b\3\2\2\2\u00d4\u0547\3\2"+
		"\2\2\u00d6\u0552\3\2\2\2\u00d8\u0560\3\2\2\2\u00da\u0562\3\2\2\2\u00dc"+
		"\u056b\3\2\2\2\u00de\u0570\3\2\2\2\u00e0\u0584\3\2\2\2\u00e2\u0586\3\2"+
		"\2\2\u00e4\u0589\3\2\2\2\u00e6\u0597\3\2\2\2\u00e8\u059c\3\2\2\2\u00ea"+
		"\u05a7\3\2\2\2\u00ec\u05ac\3\2\2\2\u00ee\u05b8\3\2\2\2\u00f0\u05bd\3\2"+
		"\2\2\u00f2\u05c5\3\2\2\2\u00f4\u05d3\3\2\2\2\u00f6\u05d8\3\2\2\2\u00f8"+
		"\u05ea\3\2\2\2\u00fa\u05ec\3\2\2\2\u00fc\u05f2\3\2\2\2\u00fe\u05f4\3\2"+
		"\2\2\u0100\u05fc\3\2\2\2\u0102\u0604\3\2\2\2\u0104\u060b\3\2\2\2\u0106"+
		"\u060d\3\2\2\2\u0108\u0616\3\2\2\2\u010a\u061e\3\2\2\2\u010c\u0621\3\2"+
		"\2\2\u010e\u0627\3\2\2\2\u0110\u0630\3\2\2\2\u0112\u0638\3\2\2\2\u0114"+
		"\u063e\3\2\2\2\u0116\u0648\3\2\2\2\u0118\u064a\3\2\2\2\u011a\u0650\3\2"+
		"\2\2\u011c\u065c\3\2\2\2\u011e\u0663\3\2\2\2\u0120\u0671\3\2\2\2\u0122"+
		"\u0673\3\2\2\2\u0124\u0675\3\2\2\2\u0126\u0679\3\2\2\2\u0128\u067d\3\2"+
		"\2\2\u012a\u0687\3\2\2\2\u012c\u0689\3\2\2\2\u012e\u068f\3\2\2\2\u0130"+
		"\u0697\3\2\2\2\u0132\u06a9\3\2\2\2\u0134\u06ab\3\2\2\2\u0136\u06b1\3\2"+
		"\2\2\u0138\u06c0\3\2\2\2\u013a\u06c3\3\2\2\2\u013c\u06d4\3\2\2\2\u013e"+
		"\u06d6\3\2\2\2\u0140\u06d8\3\2\2\2\u0142\u06de\3\2\2\2\u0144\u06e4\3\2"+
		"\2\2\u0146\u06ee\3\2\2\2\u0148\u06f2\3\2\2\2\u014a\u06f4\3\2\2\2\u014c"+
		"\u0704\3\2\2\2\u014e\u0716\3\2\2\2\u0150\u0718\3\2\2\2\u0152\u071a\3\2"+
		"\2\2\u0154\u0722\3\2\2\2\u0156\u0731\3\2\2\2\u0158\u0740\3\2\2\2\u015a"+
		"\u0746\3\2\2\2\u015c\u074c\3\2\2\2\u015e\u0752\3\2\2\2\u0160\u0756\3\2"+
		"\2\2\u0162\u0768\3\2\2\2\u0164\u076a\3\2\2\2\u0166\u0771\3\2\2\2\u0168"+
		"\u077a\3\2\2\2\u016a\u0780\3\2\2\2\u016c\u0788\3\2\2\2\u016e\u078b\3\2"+
		"\2\2\u0170\u0794\3\2\2\2\u0172\u079b\3\2\2\2\u0174\u07a6\3\2\2\2\u0176"+
		"\u07b0\3\2\2\2\u0178\u07d5\3\2\2\2\u017a\u07d7\3\2\2\2\u017c\u07f5\3\2"+
		"\2\2\u017e\u07fc\3\2\2\2\u0180\u07fe\3\2\2\2\u0182\u0804\3\2\2\2\u0184"+
		"\u082e\3\2\2\2\u0186\u0830\3\2\2\2\u0188\u0859\3\2\2\2\u018a\u08ae\3\2"+
		"\2\2\u018c\u08b0\3\2\2\2\u018e\u0902\3\2\2\2\u0190\u0907\3\2\2\2\u0192"+
		"\u0916\3\2\2\2\u0194\u0918\3\2\2\2\u0196\u0924\3\2\2\2\u0198\u0930\3\2"+
		"\2\2\u019a\u093c\3\2\2\2\u019c\u0955\3\2\2\2\u019e\u09a5\3\2\2\2\u01a0"+
		"\u09a7\3\2\2\2\u01a2\u09ea\3\2\2\2\u01a4\u09ec\3\2\2\2\u01a6\u0a23\3\2"+
		"\2\2\u01a8\u0a25\3\2\2\2\u01aa\u0a53\3\2\2\2\u01ac\u0a6b\3\2\2\2\u01ae"+
		"\u0a6d\3\2\2\2\u01b0\u0a77\3\2\2\2\u01b2\u0a7e\3\2\2\2\u01b4\u0a82\3\2"+
		"\2\2\u01b6\u0a84\3\2\2\2\u01b8\u0a92\3\2\2\2\u01ba\u0a94\3\2\2\2\u01bc"+
		"\u0a9e\3\2\2\2\u01be\u0aa2\3\2\2\2\u01c0\u0aa4\3\2\2\2\u01c2\u0aab\3\2"+
		"\2\2\u01c4\u0aad\3\2\2\2\u01c6\u0ab6\3\2\2\2\u01c8\u0ab8\3\2\2\2\u01ca"+
		"\u0ac3\3\2\2\2\u01cc\u0ace\3\2\2\2\u01ce\u0ad9\3\2\2\2\u01d0\u0ae4\3\2"+
		"\2\2\u01d2\u0aef\3\2\2\2\u01d4\u0afd\3\2\2\2\u01d6\u0b14\3\2\2\2\u01d8"+
		"\u0b29\3\2\2\2\u01da\u0b37\3\2\2\2\u01dc\u0b4f\3\2\2\2\u01de\u0b51\3\2"+
		"\2\2\u01e0\u0b54\3\2\2\2\u01e2\u0b5d\3\2\2\2\u01e4\u0b61\3\2\2\2\u01e6"+
		"\u0b6a\3\2\2\2\u01e8\u0b6d\3\2\2\2\u01ea\u0b6f\3\2\2\2\u01ec\u0b72\3\2"+
		"\2\2\u01ee\u0b8f\3\2\2\2\u01f0\u01f1\t\2\2\2\u01f1\3\3\2\2\2\u01f2\u01f5"+
		"\5V,\2\u01f3\u01f5\5\6\4\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01f9\7\2\2\3\u01f9\5\3\2\2\2\u01fa\u01fb\7\3\2\2\u01fb\u01fc"+
		"\5\f\7\2\u01fc\u01fd\7\u0088\2\2\u01fd\7\3\2\2\2\u01fe\u01ff\7|\2\2\u01ff"+
		"\u0200\7~\2\2\u0200\u0201\7\177\2\2\u0201\t\3\2\2\2\u0202\u0203\7}\2\2"+
		"\u0203\u0204\7~\2\2\u0204\u0205\7\177\2\2\u0205\13\3\2\2\2\u0206\u0208"+
		"\5\b\5\2\u0207\u0209\5\f\7\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u0213\3\2\2\2\u020a\u020c\5\n\6\2\u020b\u020d\5\f\7\2\u020c\u020b\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0213\3\2\2\2\u020e\u0210\5\16\b\2\u020f"+
		"\u0211\5\f\7\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2"+
		"\2\2\u0212\u0206\3\2\2\2\u0212\u020a\3\2\2\2\u0212\u020e\3\2\2\2\u0213"+
		"\r\3\2\2\2\u0214\u0215\7~\2\2\u0215\u0216\7\u0081\2\2\u0216\u0217\7\u0085"+
		"\2\2\u0217\u0218\5\20\t\2\u0218\u0219\7\u0086\2\2\u0219\u021a\7\177\2"+
		"\2\u021a\17\3\2\2\2\u021b\u021e\7~\2\2\u021c\u021f\5\24\13\2\u021d\u021f"+
		"\5\22\n\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2"+
		"\u021f\u0221\3\2\2\2\u0220\u0222\7\u0082\2\2\u0221\u0220\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u0225\5\20\t\2\u0224\u0223\3"+
		"\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\b\t\1\2\u0227"+
		"\21\3\2\2\2\u0228\u0229\7z\2\2\u0229\u022a\7~\2\2\u022a\u022b\5\2\2\2"+
		"\u022b\u022c\7\u0080\2\2\u022c\u022d\7~\2\2\u022d\u022e\7\u0080\2\2\u022e"+
		"\u0231\7{\2\2\u022f\u0232\5\24\13\2\u0230\u0232\5\22\n\2\u0231\u022f\3"+
		"\2\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\23\3\2\2\2\u0233"+
		"\u0236\7\u0083\2\2\u0234\u0237\5\24\13\2\u0235\u0237\5\22\n\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0241\3\2\2\2\u0238"+
		"\u0239\7\u0084\2\2\u0239\u023a\7x\2\2\u023a\u023b\7~\2\2\u023b\u023e\7"+
		"y\2\2\u023c\u023f\5\24\13\2\u023d\u023f\5\22\n\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0233\3\2"+
		"\2\2\u0240\u0238\3\2\2\2\u0241\25\3\2\2\2\u0242\u0243\t\3\2\2\u0243\27"+
		"\3\2\2\2\u0244\u0247\5\32\16\2\u0245\u0247\5\"\22\2\u0246\u0244\3\2\2"+
		"\2\u0246\u0245\3\2\2\2\u0247\31\3\2\2\2\u0248\u024a\5\u00fc\177\2\u0249"+
		"\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0257\5\34\17\2\u024f"+
		"\u0251\5\u00fc\177\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\u0257\7\r\2\2\u0256\u024b\3\2\2\2\u0256\u0252\3\2\2\2\u0257\33\3\2\2"+
		"\2\u0258\u025b\5\36\20\2\u0259\u025b\5 \21\2\u025a\u0258\3\2\2\2\u025a"+
		"\u0259\3\2\2\2\u025b\35\3\2\2\2\u025c\u025d\t\4\2\2\u025d\37\3\2\2\2\u025e"+
		"\u025f\t\5\2\2\u025f!\3\2\2\2\u0260\u0264\5$\23\2\u0261\u0264\5\62\32"+
		"\2\u0262\u0264\5\64\33\2\u0263\u0260\3\2\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0262\3\2\2\2\u0264#\3\2\2\2\u0265\u0268\5*\26\2\u0266\u0268\5\60\31"+
		"\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u026d\3\2\2\2\u0269\u026c"+
		"\5(\25\2\u026a\u026c\5.\30\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c"+
		"\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e%\3\2\2\2"+
		"\u026f\u026d\3\2\2\2\u0270\u0272\5\u00fc\177\2\u0271\u0270\3\2\2\2\u0272"+
		"\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0276\u0278\7p\2\2\u0277\u0279\5@!\2\u0278\u0277"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u0287\3\2\2\2\u027a\u027b\5$\23\2\u027b"+
		"\u027f\7K\2\2\u027c\u027e\5\u00fc\177\2\u027d\u027c\3\2\2\2\u027e\u0281"+
		"\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0284\7p\2\2\u0283\u0285\5@!\2\u0284\u0283\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0273\3\2\2\2\u0286\u027a"+
		"\3\2\2\2\u0287\'\3\2\2\2\u0288\u028c\7K\2\2\u0289\u028b\5\u00fc\177\2"+
		"\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d"+
		"\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0291\7p\2\2\u0290"+
		"\u0292\5@!\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292)\3\2\2\2\u0293"+
		"\u0295\5\u00fc\177\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029b\7p\2\2\u029a\u029c\5@!\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2"+
		"\2\u029c+\3\2\2\2\u029d\u029e\5&\24\2\u029e-\3\2\2\2\u029f\u02a0\5(\25"+
		"\2\u02a0/\3\2\2\2\u02a1\u02a2\5*\26\2\u02a2\61\3\2\2\2\u02a3\u02a5\5\u00fc"+
		"\177\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\7p"+
		"\2\2\u02aa\63\3\2\2\2\u02ab\u02ac\5\32\16\2\u02ac\u02ad\5\66\34\2\u02ad"+
		"\u02b5\3\2\2\2\u02ae\u02af\5$\23\2\u02af\u02b0\5\66\34\2\u02b0\u02b5\3"+
		"\2\2\2\u02b1\u02b2\5\62\32\2\u02b2\u02b3\5\66\34\2\u02b3\u02b5\3\2\2\2"+
		"\u02b4\u02ab\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b5\65"+
		"\3\2\2\2\u02b6\u02b8\5\u00fc\177\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bc\u02bd\7\4\2\2\u02bd\u02c8\7\5\2\2\u02be\u02c0\5\u00fc"+
		"\177\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5\7\4"+
		"\2\2\u02c5\u02c7\7\5\2\2\u02c6\u02c1\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\67\3\2\2\2\u02ca\u02c8\3\2\2"+
		"\2\u02cb\u02cd\5:\36\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1"+
		"\u02d3\7p\2\2\u02d2\u02d4\5<\37\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d49\3\2\2\2\u02d5\u02d6\5\u00fc\177\2\u02d6;\3\2\2\2\u02d7\u02d8"+
		"\7\33\2\2\u02d8\u02e2\5\62\32\2\u02d9\u02da\7\33\2\2\u02da\u02de\5$\23"+
		"\2\u02db\u02dd\5> \2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1"+
		"\u02d7\3\2\2\2\u02e1\u02d9\3\2\2\2\u02e2=\3\2\2\2\u02e3\u02e4\7_\2\2\u02e4"+
		"\u02e5\5,\27\2\u02e5?\3\2\2\2\u02e6\u02e7\7N\2\2\u02e7\u02e8\5B\"\2\u02e8"+
		"\u02e9\7M\2\2\u02e9A\3\2\2\2\u02ea\u02ef\5D#\2\u02eb\u02ec\7J\2\2\u02ec"+
		"\u02ee\5D#\2\u02ed\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2"+
		"\2\u02ef\u02f0\3\2\2\2\u02f0C\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5"+
		"\5\"\22\2\u02f3\u02f5\5F$\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5"+
		"E\3\2\2\2\u02f6\u02f8\5\u00fc\177\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3"+
		"\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fc\u02fe\7Q\2\2\u02fd\u02ff\5H%\2\u02fe\u02fd\3\2\2"+
		"\2\u02fe\u02ff\3\2\2\2\u02ffG\3\2\2\2\u0300\u0301\7\33\2\2\u0301\u0305"+
		"\5\"\22\2\u0302\u0303\7\62\2\2\u0303\u0305\5\"\22\2\u0304\u0300\3\2\2"+
		"\2\u0304\u0302\3\2\2\2\u0305I\3\2\2\2\u0306\u0307\b&\1\2\u0307\u0308\7"+
		"p\2\2\u0308\u030e\3\2\2\2\u0309\u030a\f\3\2\2\u030a\u030b\7K\2\2\u030b"+
		"\u030d\7p\2\2\u030c\u0309\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030fK\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0317"+
		"\7p\2\2\u0312\u0313\5N(\2\u0313\u0314\7K\2\2\u0314\u0315\7p\2\2\u0315"+
		"\u0317\3\2\2\2\u0316\u0311\3\2\2\2\u0316\u0312\3\2\2\2\u0317M\3\2\2\2"+
		"\u0318\u0319\b(\1\2\u0319\u031a\7p\2\2\u031a\u0320\3\2\2\2\u031b\u031c"+
		"\f\3\2\2\u031c\u031d\7K\2\2\u031d\u031f\7p\2\2\u031e\u031b\3\2\2\2\u031f"+
		"\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321O\3\2\2\2"+
		"\u0322\u0320\3\2\2\2\u0323\u0329\7p\2\2\u0324\u0325\5T+\2\u0325\u0326"+
		"\7K\2\2\u0326\u0327\7p\2\2\u0327\u0329\3\2\2\2\u0328\u0323\3\2\2\2\u0328"+
		"\u0324\3\2\2\2\u0329Q\3\2\2\2\u032a\u032b\7p\2\2\u032bS\3\2\2\2\u032c"+
		"\u032d\b+\1\2\u032d\u032e\7p\2\2\u032e\u0334\3\2\2\2\u032f\u0330\f\3\2"+
		"\2\u0330\u0331\7K\2\2\u0331\u0333\7p\2\2\u0332\u032f\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335U\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0337\u0339\5X-\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2"+
		"\2\u0339\u033d\3\2\2\2\u033a\u033c\5\\/\2\u033b\u033a\3\2\2\2\u033c\u033f"+
		"\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0343\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u0340\u0342\5f\64\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2"+
		"\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0346\u0347\7\2\2\3\u0347W\3\2\2\2\u0348\u034a\5Z.\2\u0349"+
		"\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7*\2\2\u034f"+
		"\u0354\7p\2\2\u0350\u0351\7K\2\2\u0351\u0353\7p\2\2\u0352\u0350\3\2\2"+
		"\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357"+
		"\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0358\7\b\2\2\u0358Y\3\2\2\2\u0359"+
		"\u035a\5\u00fc\177\2\u035a[\3\2\2\2\u035b\u0360\5^\60\2\u035c\u0360\5"+
		"`\61\2\u035d\u0360\5b\62\2\u035e\u0360\5d\63\2\u035f\u035b\3\2\2\2\u035f"+
		"\u035c\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u035e\3\2\2\2\u0360]\3\2\2\2"+
		"\u0361\u0362\7#\2\2\u0362\u0363\5L\'\2\u0363\u0364\7\b\2\2\u0364_\3\2"+
		"\2\2\u0365\u0366\7#\2\2\u0366\u0367\5N(\2\u0367\u0368\7K\2\2\u0368\u0369"+
		"\7]\2\2\u0369\u036a\7\b\2\2\u036aa\3\2\2\2\u036b\u036c\7#\2\2\u036c\u036d"+
		"\7\60\2\2\u036d\u036e\5L\'\2\u036e\u036f\7K\2\2\u036f\u0370\7p\2\2\u0370"+
		"\u0371\7\b\2\2\u0371c\3\2\2\2\u0372\u0373\7#\2\2\u0373\u0374\7\60\2\2"+
		"\u0374\u0375\5L\'\2\u0375\u0376\7K\2\2\u0376\u0377\7]\2\2\u0377\u0378"+
		"\7\b\2\2\u0378e\3\2\2\2\u0379\u037d\5h\65\2\u037a\u037d\5\u00dco\2\u037b"+
		"\u037d\7\b\2\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2"+
		"\2\2\u037dg\3\2\2\2\u037e\u0381\5j\66\2\u037f\u0381\5\u00d0i\2\u0380\u037e"+
		"\3\2\2\2\u0380\u037f\3\2\2\2\u0381i\3\2\2\2\u0382\u0384\5l\67\2\u0383"+
		"\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2"+
		"\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389\7\23\2\2\u0389"+
		"\u038b\7p\2\2\u038a\u038c\5n8\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2"+
		"\2\u038c\u038e\3\2\2\2\u038d\u038f\5r:\2\u038e\u038d\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u0392\5t;\2\u0391\u0390\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\5x=\2\u0394k\3\2\2\2\u0395"+
		"\u039e\5\u00fc\177\2\u0396\u039e\7-\2\2\u0397\u039e\7,\2\2\u0398\u039e"+
		"\7+\2\2\u0399\u039e\7\13\2\2\u039a\u039e\7\60\2\2\u039b\u039e\7\34\2\2"+
		"\u039c\u039e\7\61\2\2\u039d\u0395\3\2\2\2\u039d\u0396\3\2\2\2\u039d\u0397"+
		"\3\2\2\2\u039d\u0398\3\2\2\2\u039d\u0399\3\2\2\2\u039d\u039a\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039em\3\2\2\2\u039f\u03a0\7N\2\2\u03a0"+
		"\u03a1\5p9\2\u03a1\u03a2\7M\2\2\u03a2o\3\2\2\2\u03a3\u03a8\58\35\2\u03a4"+
		"\u03a5\7J\2\2\u03a5\u03a7\58\35\2\u03a6\u03a4\3\2\2\2\u03a7\u03aa\3\2"+
		"\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9q\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03ab\u03ac\7\33\2\2\u03ac\u03ad\5&\24\2\u03ads\3\2\2\2\u03ae"+
		"\u03af\7\"\2\2\u03af\u03b0\5v<\2\u03b0u\3\2\2\2\u03b1\u03b6\5,\27\2\u03b2"+
		"\u03b3\7J\2\2\u03b3\u03b5\5,\27\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2"+
		"\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7w\3\2\2\2\u03b8\u03b6"+
		"\3\2\2\2\u03b9\u03bd\7E\2\2\u03ba\u03bc\5z>\2\u03bb\u03ba\3\2\2\2\u03bc"+
		"\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2"+
		"\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c1\7F\2\2\u03c1y\3\2\2\2\u03c2\u03c7"+
		"\5|?\2\u03c3\u03c7\5\u00c0a\2\u03c4\u03c7\5\u00c2b\2\u03c5\u03c7\5\u00c4"+
		"c\2\u03c6\u03c2\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6"+
		"\u03c5\3\2\2\2\u03c7{\3\2\2\2\u03c8\u03ce\5~@\2\u03c9\u03ce\5\u00a2R\2"+
		"\u03ca\u03ce\5h\65\2\u03cb\u03ce\5\u00dco\2\u03cc\u03ce\7\b\2\2\u03cd"+
		"\u03c8\3\2\2\2\u03cd\u03c9\3\2\2\2\u03cd\u03ca\3\2\2\2\u03cd\u03cb\3\2"+
		"\2\2\u03cd\u03cc\3\2\2\2\u03ce}\3\2\2\2\u03cf\u03d1\5\u0080A\2\u03d0\u03cf"+
		"\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03d5\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6\5\u008aF\2\u03d6\u03d7"+
		"\5\u0082B\2\u03d7\u03d8\7\b\2\2\u03d8\177\3\2\2\2\u03d9\u03e2\5\u00fc"+
		"\177\2\u03da\u03e2\7-\2\2\u03db\u03e2\7,\2\2\u03dc\u03e2\7+\2\2\u03dd"+
		"\u03e2\7\60\2\2\u03de\u03e2\7\34\2\2\u03df\u03e2\78\2\2\u03e0\u03e2\7"+
		";\2\2\u03e1\u03d9\3\2\2\2\u03e1\u03da\3\2\2\2\u03e1\u03db\3\2\2\2\u03e1"+
		"\u03dc\3\2\2\2\u03e1\u03dd\3\2\2\2\u03e1\u03de\3\2\2\2\u03e1\u03df\3\2"+
		"\2\2\u03e1\u03e0\3\2\2\2\u03e2\u0081\3\2\2\2\u03e3\u03e8\5\u0084C\2\u03e4"+
		"\u03e5\7J\2\2\u03e5\u03e7\5\u0084C\2\u03e6\u03e4\3\2\2\2\u03e7\u03ea\3"+
		"\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u0083\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03eb\u03ee\5\u0086D\2\u03ec\u03ed\7\t\2\2\u03ed\u03ef"+
		"\5\u0088E\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u0085\3\2\2"+
		"\2\u03f0\u03f2\7p\2\2\u03f1\u03f3\5\66\34\2\u03f2\u03f1\3\2\2\2\u03f2"+
		"\u03f3\3\2\2\2\u03f3\u0087\3\2\2\2\u03f4\u03f7\5\u01b4\u00db\2\u03f5\u03f7"+
		"\5\u010e\u0088\2\u03f6\u03f4\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7\u0089\3"+
		"\2\2\2\u03f8\u03fb\5\u008cG\2\u03f9\u03fb\5\u008eH\2\u03fa\u03f8\3\2\2"+
		"\2\u03fa\u03f9\3\2\2\2\u03fb\u008b\3\2\2\2\u03fc\u03ff\5\34\17\2\u03fd"+
		"\u03ff\7\r\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u008d\3\2"+
		"\2\2\u0400\u0404\5\u0090I\2\u0401\u0404\5\u009eP\2\u0402\u0404\5\u00a0"+
		"Q\2\u0403\u0400\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0402\3\2\2\2\u0404"+
		"\u008f\3\2\2\2\u0405\u0408\5\u0096L\2\u0406\u0408\5\u009cO\2\u0407\u0405"+
		"\3\2\2\2\u0407\u0406\3\2\2\2\u0408\u040d\3\2\2\2\u0409\u040c\5\u0094K"+
		"\2\u040a\u040c\5\u009aN\2\u040b\u0409\3\2\2\2\u040b\u040a\3\2\2\2\u040c"+
		"\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0091\3\2"+
		"\2\2\u040f\u040d\3\2\2\2\u0410\u0412\7p\2\2\u0411\u0413\5@!\2\u0412\u0411"+
		"\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0421\3\2\2\2\u0414\u0415\5\u0090I"+
		"\2\u0415\u0419\7K\2\2\u0416\u0418\5\u00fc\177\2\u0417\u0416\3\2\2\2\u0418"+
		"\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2"+
		"\2\2\u041b\u0419\3\2\2\2\u041c\u041e\7p\2\2\u041d\u041f\5@!\2\u041e\u041d"+
		"\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u0410\3\2\2\2\u0420"+
		"\u0414\3\2\2\2\u0421\u0093\3\2\2\2\u0422\u0426\7K\2\2\u0423\u0425\5\u00fc"+
		"\177\2\u0424\u0423\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042b\7p"+
		"\2\2\u042a\u042c\5@!\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u0095"+
		"\3\2\2\2\u042d\u042f\7p\2\2\u042e\u0430\5@!\2\u042f\u042e\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0097\3\2\2\2\u0431\u0432\5\u0092J\2\u0432\u0099"+
		"\3\2\2\2\u0433\u0434\5\u0094K\2\u0434\u009b\3\2\2\2\u0435\u0436\5\u0096"+
		"L\2\u0436\u009d\3\2\2\2\u0437\u0438\7p\2\2\u0438\u009f\3\2\2\2\u0439\u043a"+
		"\5\u008cG\2\u043a\u043b\5\66\34\2\u043b\u0443\3\2\2\2\u043c\u043d\5\u0090"+
		"I\2\u043d\u043e\5\66\34\2\u043e\u0443\3\2\2\2\u043f\u0440\5\u009eP\2\u0440"+
		"\u0441\5\66\34\2\u0441\u0443\3\2\2\2\u0442\u0439\3\2\2\2\u0442\u043c\3"+
		"\2\2\2\u0442\u043f\3\2\2\2\u0443\u00a1\3\2\2\2\u0444\u0446\5\u00a4S\2"+
		"\u0445\u0444\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448"+
		"\3\2\2\2\u0448\u044a\3\2\2\2\u0449\u0447\3\2\2\2\u044a\u044b\5\u00a6T"+
		"\2\u044b\u044c\5\u00be`\2\u044c\u00a3\3\2\2\2\u044d\u0458\5\u00fc\177"+
		"\2\u044e\u0458\7-\2\2\u044f\u0458\7,\2\2\u0450\u0458\7+\2\2\u0451\u0458"+
		"\7\13\2\2\u0452\u0458\7\60\2\2\u0453\u0458\7\34\2\2\u0454\u0458\7\64\2"+
		"\2\u0455\u0458\7(\2\2\u0456\u0458\7\61\2\2\u0457\u044d\3\2\2\2\u0457\u044e"+
		"\3\2\2\2\u0457\u044f\3\2\2\2\u0457\u0450\3\2\2\2\u0457\u0451\3\2\2\2\u0457"+
		"\u0452\3\2\2\2\u0457\u0453\3\2\2\2\u0457\u0454\3\2\2\2\u0457\u0455\3\2"+
		"\2\2\u0457\u0456\3\2\2\2\u0458\u00a5\3\2\2\2\u0459\u045a\5\u00a8U\2\u045a"+
		"\u045c\5\u00aaV\2\u045b\u045d\5\u00b8]\2\u045c\u045b\3\2\2\2\u045c\u045d"+
		"\3\2\2\2\u045d\u046b\3\2\2\2\u045e\u0462\5n8\2\u045f\u0461\5\u00fc\177"+
		"\2\u0460\u045f\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463"+
		"\3\2\2\2\u0463\u0465\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0466\5\u00a8U"+
		"\2\u0466\u0468\5\u00aaV\2\u0467\u0469\5\u00b8]\2\u0468\u0467\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u0459\3\2\2\2\u046a\u045e\3\2"+
		"\2\2\u046b\u00a7\3\2\2\2\u046c\u046f\5\u008aF\2\u046d\u046f\7:\2\2\u046e"+
		"\u046c\3\2\2\2\u046e\u046d\3\2\2\2\u046f\u00a9\3\2\2\2\u0470\u0471\7p"+
		"\2\2\u0471\u0473\7\6\2\2\u0472\u0474\5\u00acW\2\u0473\u0472\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\7\7\2\2\u0476\u0478\5\66"+
		"\34\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u00ab\3\2\2\2\u0479"+
		"\u047a\5\u00aeX\2\u047a\u047b\7J\2\2\u047b\u047c\5\u00b4[\2\u047c\u047f"+
		"\3\2\2\2\u047d\u047f\5\u00b4[\2\u047e\u0479\3\2\2\2\u047e\u047d\3\2\2"+
		"\2\u047f\u00ad\3\2\2\2\u0480\u0485\5\u00b0Y\2\u0481\u0482\7J\2\2\u0482"+
		"\u0484\5\u00b0Y\2\u0483\u0481\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0491\3\2\2\2\u0487\u0485\3\2\2\2\u0488"+
		"\u048d\5\u00b6\\\2\u0489\u048a\7J\2\2\u048a\u048c\5\u00b0Y\2\u048b\u0489"+
		"\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u0490\u0480\3\2\2\2\u0490\u0488\3\2"+
		"\2\2\u0491\u00af\3\2\2\2\u0492\u0494\5\u00b2Z\2\u0493\u0492\3\2\2\2\u0494"+
		"\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2"+
		"\2\2\u0497\u0495\3\2\2\2\u0498\u0499\5\u008aF\2\u0499\u049a\5\u0086D\2"+
		"\u049a\u00b1\3\2\2\2\u049b\u049e\5\u00fc\177\2\u049c\u049e\7\34\2\2\u049d"+
		"\u049b\3\2\2\2\u049d\u049c\3\2\2\2\u049e\u00b3\3\2\2\2\u049f\u04a1\5\u00b2"+
		"Z\2\u04a0\u049f\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a9\5\u008a"+
		"F\2\u04a6\u04a8\5\u00fc\177\2\u04a7\u04a6\3\2\2\2\u04a8\u04ab\3\2\2\2"+
		"\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04a9"+
		"\3\2\2\2\u04ac\u04ad\7r\2\2\u04ad\u04ae\5\u0086D\2\u04ae\u04b1\3\2\2\2"+
		"\u04af\u04b1\5\u00b0Y\2\u04b0\u04a2\3\2\2\2\u04b0\u04af\3\2\2\2\u04b1"+
		"\u00b5\3\2\2\2\u04b2\u04b4\5\u00fc\177\2\u04b3\u04b2\3\2\2\2\u04b4\u04b7"+
		"\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7"+
		"\u04b5\3\2\2\2\u04b8\u04bb\5\u008aF\2\u04b9\u04ba\7p\2\2\u04ba\u04bc\7"+
		"K\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04be\7\65\2\2\u04be\u00b7\3\2\2\2\u04bf\u04c0\7\67\2\2\u04c0\u04c1\5"+
		"\u00ba^\2\u04c1\u00b9\3\2\2\2\u04c2\u04c7\5\u00bc_\2\u04c3\u04c4\7J\2"+
		"\2\u04c4\u04c6\5\u00bc_\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7"+
		"\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u00bb\3\2\2\2\u04c9\u04c7\3\2"+
		"\2\2\u04ca\u04cd\5&\24\2\u04cb\u04cd\5\62\32\2\u04cc\u04ca\3\2\2\2\u04cc"+
		"\u04cb\3\2\2\2\u04cd\u00bd\3\2\2\2\u04ce\u04d1\5\u0112\u008a\2\u04cf\u04d1"+
		"\7\b\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1\u00bf\3\2\2\2\u04d2"+
		"\u04d3\5\u0112\u008a\2\u04d3\u00c1\3\2\2\2\u04d4\u04d5\7\60\2\2\u04d5"+
		"\u04d6\5\u0112\u008a\2\u04d6\u00c3\3\2\2\2\u04d7\u04d9\5\u00c6d\2\u04d8"+
		"\u04d7\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2"+
		"\2\2\u04db\u04dd\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04df\5\u00c8e\2\u04de"+
		"\u04e0\5\u00b8]\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1"+
		"\3\2\2\2\u04e1\u04e2\5\u00ccg\2\u04e2\u00c5\3\2\2\2\u04e3\u04e8\5\u00fc"+
		"\177\2\u04e4\u04e8\7-\2\2\u04e5\u04e8\7,\2\2\u04e6\u04e8\7+\2\2\u04e7"+
		"\u04e3\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e6\3\2"+
		"\2\2\u04e8\u00c7\3\2\2\2\u04e9\u04eb\5n8\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb"+
		"\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\5\u00caf\2\u04ed\u04ef\7\6\2"+
		"\2\u04ee\u04f0\5\u00acW\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f2\7\7\2\2\u04f2\u00c9\3\2\2\2\u04f3\u04f4\7p"+
		"\2\2\u04f4\u00cb\3\2\2\2\u04f5\u04f7\7E\2\2\u04f6\u04f8\5\u00ceh\2\u04f7"+
		"\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04fb\5\u0114"+
		"\u008b\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc"+
		"\u04fd\7F\2\2\u04fd\u00cd\3\2\2\2\u04fe\u0500\5@!\2\u04ff\u04fe\3\2\2"+
		"\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\7\65\2\2\u0502"+
		"\u0504\7\6\2\2\u0503\u0505\5\u01a4\u00d3\2\u0504\u0503\3\2\2\2\u0504\u0505"+
		"\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\7\7\2\2\u0507\u052d\7\b\2\2\u0508"+
		"\u050a\5@!\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2"+
		"\2\u050b\u050c\7\62\2\2\u050c\u050e\7\6\2\2\u050d\u050f\5\u01a4\u00d3"+
		"\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511"+
		"\7\7\2\2\u0511\u052d\7\b\2\2\u0512\u0513\5P)\2\u0513\u0515\7K\2\2\u0514"+
		"\u0516\5@!\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2"+
		"\2\u0517\u0518\7\62\2\2\u0518\u051a\7\6\2\2\u0519\u051b\5\u01a4\u00d3"+
		"\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d"+
		"\7\7\2\2\u051d\u051e\7\b\2\2\u051e\u052d\3\2\2\2\u051f\u0520\5\u0176\u00bc"+
		"\2\u0520\u0522\7K\2\2\u0521\u0523\5@!\2\u0522\u0521\3\2\2\2\u0522\u0523"+
		"\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\7\62\2\2\u0525\u0527\7\6\2\2"+
		"\u0526\u0528\5\u01a4\u00d3\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u0529\3\2\2\2\u0529\u052a\7\7\2\2\u052a\u052b\7\b\2\2\u052b\u052d\3\2"+
		"\2\2\u052c\u04ff\3\2\2\2\u052c\u0509\3\2\2\2\u052c\u0512\3\2\2\2\u052c"+
		"\u051f\3\2\2\2\u052d\u00cf\3\2\2\2\u052e\u0530\5l\67\2\u052f\u052e\3\2"+
		"\2\2\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0534\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u0535\7\32\2\2\u0535\u0537\7"+
		"p\2\2\u0536\u0538\5t;\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u0539\3\2\2\2\u0539\u053a\5\u00d2j\2\u053a\u00d1\3\2\2\2\u053b\u053d"+
		"\7E\2\2\u053c\u053e\5\u00d4k\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2"+
		"\u053e\u0540\3\2\2\2\u053f\u0541\7J\2\2\u0540\u053f\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0544\5\u00dan\2\u0543\u0542\3\2\2"+
		"\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\7F\2\2\u0546\u00d3"+
		"\3\2\2\2\u0547\u054c\5\u00d6l\2\u0548\u0549\7J\2\2\u0549\u054b\5\u00d6"+
		"l\2\u054a\u0548\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c"+
		"\u054d\3\2\2\2\u054d\u00d5\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0551\5\u00d8"+
		"m\2\u0550\u054f\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552"+
		"\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u055b\7p"+
		"\2\2\u0556\u0558\7\6\2\2\u0557\u0559\5\u01a4\u00d3\2\u0558\u0557\3\2\2"+
		"\2\u0558\u0559\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055c\7\7\2\2\u055b\u0556"+
		"\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055e\3\2\2\2\u055d\u055f\5x=\2\u055e"+
		"\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u00d7\3\2\2\2\u0560\u0561\5\u00fc"+
		"\177\2\u0561\u00d9\3\2\2\2\u0562\u0566\7\b\2\2\u0563\u0565\5z>\2\u0564"+
		"\u0563\3\2\2\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2"+
		"\2\2\u0567\u00db\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056c\5\u00dep\2\u056a"+
		"\u056c\5\u00f0y\2\u056b\u0569\3\2\2\2\u056b\u056a\3\2\2\2\u056c\u00dd"+
		"\3\2\2\2\u056d\u056f\5\u00e0q\2\u056e\u056d\3\2\2\2\u056f\u0572\3\2\2"+
		"\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\3\2\2\2\u0572\u0570"+
		"\3\2\2\2\u0573\u0574\7&\2\2\u0574\u0576\7p\2\2\u0575\u0577\5n8\2\u0576"+
		"\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u057a\5\u00e2"+
		"r\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\3\2\2\2\u057b"+
		"\u057c\5\u00e4s\2\u057c\u00df\3\2\2\2\u057d\u0585\5\u00fc\177\2\u057e"+
		"\u0585\7-\2\2\u057f\u0585\7,\2\2\u0580\u0585\7+\2\2\u0581\u0585\7\13\2"+
		"\2\u0582\u0585\7\60\2\2\u0583\u0585\7\61\2\2\u0584\u057d\3\2\2\2\u0584"+
		"\u057e\3\2\2\2\u0584\u057f\3\2\2\2\u0584\u0580\3\2\2\2\u0584\u0581\3\2"+
		"\2\2\u0584\u0582\3\2\2\2\u0584\u0583\3\2\2\2\u0585\u00e1\3\2\2\2\u0586"+
		"\u0587\7\33\2\2\u0587\u0588\5v<\2\u0588\u00e3\3\2\2\2\u0589\u058d\7E\2"+
		"\2\u058a\u058c\5\u00e6t\2\u058b\u058a\3\2\2\2\u058c\u058f\3\2\2\2\u058d"+
		"\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u058d\3\2"+
		"\2\2\u0590\u0591\7F\2\2\u0591\u00e5\3\2\2\2\u0592\u0598\5\u00e8u\2\u0593"+
		"\u0598\5\u00ecw\2\u0594\u0598\5h\65\2\u0595\u0598\5\u00dco\2\u0596\u0598"+
		"\7\b\2\2\u0597\u0592\3\2\2\2\u0597\u0593\3\2\2\2\u0597\u0594\3\2\2\2\u0597"+
		"\u0595\3\2\2\2\u0597\u0596\3\2\2\2\u0598\u00e7\3\2\2\2\u0599\u059b\5\u00ea"+
		"v\2\u059a\u0599\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u05a0\5\u008a"+
		"F\2\u05a0\u05a1\5\u0082B\2\u05a1\u05a2\7\b\2\2\u05a2\u00e9\3\2\2\2\u05a3"+
		"\u05a8\5\u00fc\177\2\u05a4\u05a8\7-\2\2\u05a5\u05a8\7\60\2\2\u05a6\u05a8"+
		"\7\34\2\2\u05a7\u05a3\3\2\2\2\u05a7\u05a4\3\2\2\2\u05a7\u05a5\3\2\2\2"+
		"\u05a7\u05a6\3\2\2\2\u05a8\u00eb\3\2\2\2\u05a9\u05ab\5\u00eex\2\u05aa"+
		"\u05a9\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2"+
		"\2\2\u05ad\u05af\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b0\5\u00a6T\2\u05b0"+
		"\u05b1\5\u00be`\2\u05b1\u00ed\3\2\2\2\u05b2\u05b9\5\u00fc\177\2\u05b3"+
		"\u05b9\7-\2\2\u05b4\u05b9\7\13\2\2\u05b5\u05b9\7\26\2\2\u05b6\u05b9\7"+
		"\60\2\2\u05b7\u05b9\7\61\2\2\u05b8\u05b2\3\2\2\2\u05b8\u05b3\3\2\2\2\u05b8"+
		"\u05b4\3\2\2\2\u05b8\u05b5\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b7\3\2"+
		"\2\2\u05b9\u00ef\3\2\2\2\u05ba\u05bc\5\u00e0q\2\u05bb\u05ba\3\2\2\2\u05bc"+
		"\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05c0\3\2"+
		"\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05c1\7q\2\2\u05c1\u05c2\7&\2\2\u05c2\u05c3"+
		"\7p\2\2\u05c3\u05c4\5\u00f2z\2\u05c4\u00f1\3\2\2\2\u05c5\u05c9\7E\2\2"+
		"\u05c6\u05c8\5\u00f4{\2\u05c7\u05c6\3\2\2\2\u05c8\u05cb\3\2\2\2\u05c9"+
		"\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05c9\3\2"+
		"\2\2\u05cc\u05cd\7F\2\2\u05cd\u00f3\3\2\2\2\u05ce\u05d4\5\u00f6|\2\u05cf"+
		"\u05d4\5\u00e8u\2\u05d0\u05d4\5h\65\2\u05d1\u05d4\5\u00dco\2\u05d2\u05d4"+
		"\7\b\2\2\u05d3\u05ce\3\2\2\2\u05d3\u05cf\3\2\2\2\u05d3\u05d0\3\2\2\2\u05d3"+
		"\u05d1\3\2\2\2\u05d3\u05d2\3\2\2\2\u05d4\u00f5\3\2\2\2\u05d5\u05d7\5\u00f8"+
		"}\2\u05d6\u05d5\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8"+
		"\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05dc\5\u008a"+
		"F\2\u05dc\u05dd\7p\2\2\u05dd\u05de\7\6\2\2\u05de\u05e0\7\7\2\2\u05df\u05e1"+
		"\5\66\34\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e3\3\2\2\2"+
		"\u05e2\u05e4\5\u00fa~\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4"+
		"\u05e5\3\2\2\2\u05e5\u05e6\7\b\2\2\u05e6\u00f7\3\2\2\2\u05e7\u05eb\5\u00fc"+
		"\177\2\u05e8\u05eb\7-\2\2\u05e9\u05eb\7\13\2\2\u05ea\u05e7\3\2\2\2\u05ea"+
		"\u05e8\3\2\2\2\u05ea\u05e9\3\2\2\2\u05eb\u00f9\3\2\2\2\u05ec\u05ed\7\26"+
		"\2\2\u05ed\u05ee\5\u0104\u0083\2\u05ee\u00fb\3\2\2\2\u05ef\u05f3\5\u00fe"+
		"\u0080\2\u05f0\u05f3\5\u010a\u0086\2\u05f1\u05f3\5\u010c\u0087\2\u05f2"+
		"\u05ef\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f1\3\2\2\2\u05f3\u00fd\3\2"+
		"\2\2\u05f4\u05f5\7q\2\2\u05f5\u05f6\5L\'\2\u05f6\u05f8\7\6\2\2\u05f7\u05f9"+
		"\5\u0100\u0081\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\3"+
		"\2\2\2\u05fa\u05fb\7\7\2\2\u05fb\u00ff\3\2\2\2\u05fc\u0601\5\u0102\u0082"+
		"\2\u05fd\u05fe\7J\2\2\u05fe\u0600\5\u0102\u0082\2\u05ff\u05fd\3\2\2\2"+
		"\u0600\u0603\3\2\2\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0101"+
		"\3\2\2\2\u0603\u0601\3\2\2\2\u0604\u0605\7p\2\2\u0605\u0606\7\t\2\2\u0606"+
		"\u0607\5\u0104\u0083\2\u0607\u0103\3\2\2\2\u0608\u060c\5\u01c6\u00e4\2"+
		"\u0609\u060c\5\u0106\u0084\2\u060a\u060c\5\u00fc\177\2\u060b\u0608\3\2"+
		"\2\2\u060b\u0609\3\2\2\2\u060b\u060a\3\2\2\2\u060c\u0105\3\2\2\2\u060d"+
		"\u060f\7E\2\2\u060e\u0610\5\u0108\u0085\2\u060f\u060e\3\2\2\2\u060f\u0610"+
		"\3\2\2\2\u0610\u0612\3\2\2\2\u0611\u0613\7J\2\2\u0612\u0611\3\2\2\2\u0612"+
		"\u0613\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\7F\2\2\u0615\u0107\3\2"+
		"\2\2\u0616\u061b\5\u0104\u0083\2\u0617\u0618\7J\2\2\u0618\u061a\5\u0104"+
		"\u0083\2\u0619\u0617\3\2\2\2\u061a\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u0109\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u061f\7q"+
		"\2\2\u061f\u0620\5L\'\2\u0620\u010b\3\2\2\2\u0621\u0622\7q\2\2\u0622\u0623"+
		"\5L\'\2\u0623\u0624\7\6\2\2\u0624\u0625\5\u0104\u0083\2\u0625\u0626\7"+
		"\7\2\2\u0626\u010d\3\2\2\2\u0627\u0629\7E\2\2\u0628\u062a\5\u0110\u0089"+
		"\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062c\3\2\2\2\u062b\u062d"+
		"\7J\2\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\3\2\2\2\u062e"+
		"\u062f\7F\2\2\u062f\u010f\3\2\2\2\u0630\u0635\5\u0088E\2\u0631\u0632\7"+
		"J\2\2\u0632\u0634\5\u0088E\2\u0633\u0631\3\2\2\2\u0634\u0637\3\2\2\2\u0635"+
		"\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0111\3\2\2\2\u0637\u0635\3\2"+
		"\2\2\u0638\u063a\7E\2\2\u0639\u063b\5\u0114\u008b\2\u063a\u0639\3\2\2"+
		"\2\u063a\u063b\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\7F\2\2\u063d\u0113"+
		"\3\2\2\2\u063e\u0642\5\u0116\u008c\2\u063f\u0641\5\u0116\u008c\2\u0640"+
		"\u063f\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2"+
		"\2\2\u0643\u0115\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0649\5\u0118\u008d"+
		"\2\u0646\u0649\5h\65\2\u0647\u0649\5\u011c\u008f\2\u0648\u0645\3\2\2\2"+
		"\u0648\u0646\3\2\2\2\u0648\u0647\3\2\2\2\u0649\u0117\3\2\2\2\u064a\u064b"+
		"\5\u011a\u008e\2\u064b\u064c\7\b\2\2\u064c\u0119\3\2\2\2\u064d\u064f\5"+
		"\u00b2Z\2\u064e\u064d\3\2\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2\2\2"+
		"\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0654"+
		"\5\u008aF\2\u0654\u0655\5\u0082B\2\u0655\u011b\3\2\2\2\u0656\u065d\5\u0120"+
		"\u0091\2\u0657\u065d\5\u0124\u0093\2\u0658\u065d\5\u012c\u0097\2\u0659"+
		"\u065d\5\u012e\u0098\2\u065a\u065d\5\u0140\u00a1\2\u065b\u065d\5\u0146"+
		"\u00a4\2\u065c\u0656\3\2\2\2\u065c\u0657\3\2\2\2\u065c\u0658\3\2\2\2\u065c"+
		"\u0659\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065b\3\2\2\2\u065d\u011d\3\2"+
		"\2\2\u065e\u0664\5\u0120\u0091\2\u065f\u0664\5\u0126\u0094\2\u0660\u0664"+
		"\5\u0130\u0099\2\u0661\u0664\5\u0142\u00a2\2\u0662\u0664\5\u0148\u00a5"+
		"\2\u0663\u065e\3\2\2\2\u0663\u065f\3\2\2\2\u0663\u0660\3\2\2\2\u0663\u0661"+
		"\3\2\2\2\u0663\u0662\3\2\2\2\u0664\u011f\3\2\2\2\u0665\u0672\5\u0112\u008a"+
		"\2\u0666\u0672\5\u0122\u0092\2\u0667\u0672\5\u0128\u0095\2\u0668\u0672"+
		"\5\u0132\u009a\2\u0669\u0672\5\u0134\u009b\2\u066a\u0672\5\u0144\u00a3"+
		"\2\u066b\u0672\5\u0158\u00ad\2\u066c\u0672\5\u015a\u00ae\2\u066d\u0672"+
		"\5\u015c\u00af\2\u066e\u0672\5\u0160\u00b1\2\u066f\u0672\5\u015e\u00b0"+
		"\2\u0670\u0672\5\u0162\u00b2\2\u0671\u0665\3\2\2\2\u0671\u0666\3\2\2\2"+
		"\u0671\u0667\3\2\2\2\u0671\u0668\3\2\2\2\u0671\u0669\3\2\2\2\u0671\u066a"+
		"\3\2\2\2\u0671\u066b\3\2\2\2\u0671\u066c\3\2\2\2\u0671\u066d\3\2\2\2\u0671"+
		"\u066e\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0670\3\2\2\2\u0672\u0121\3\2"+
		"\2\2\u0673\u0674\7\b\2\2\u0674\u0123\3\2\2\2\u0675\u0676\7p\2\2\u0676"+
		"\u0677\7R\2\2\u0677\u0678\5\u011c\u008f\2\u0678\u0125\3\2\2\2\u0679\u067a"+
		"\7p\2\2\u067a\u067b\7R\2\2\u067b\u067c\5\u011e\u0090\2\u067c\u0127\3\2"+
		"\2\2\u067d\u067e\5\u012a\u0096\2\u067e\u067f\7\b\2\2\u067f\u0129\3\2\2"+
		"\2\u0680\u0688\5\u01c0\u00e1\2\u0681\u0688\5\u01de\u00f0\2\u0682\u0688"+
		"\5\u01e0\u00f1\2\u0683\u0688\5\u01e6\u00f4\2\u0684\u0688\5\u01ea\u00f6"+
		"\2\u0685\u0688\5\u019e\u00d0\2\u0686\u0688\5\u018a\u00c6\2\u0687\u0680"+
		"\3\2\2\2\u0687\u0681\3\2\2\2\u0687\u0682\3\2\2\2\u0687\u0683\3\2\2\2\u0687"+
		"\u0684\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0686\3\2\2\2\u0688\u012b\3\2"+
		"\2\2\u0689\u068a\7 \2\2\u068a\u068b\7\6\2\2\u068b\u068c\5\u01b4\u00db"+
		"\2\u068c\u068d\7\7\2\2\u068d\u068e\5\u011c\u008f\2\u068e\u012d\3\2\2\2"+
		"\u068f\u0690\7 \2\2\u0690\u0691\7\6\2\2\u0691\u0692\5\u01b4\u00db\2\u0692"+
		"\u0693\7\7\2\2\u0693\u0694\5\u011e\u0090\2\u0694\u0695\7\31\2\2\u0695"+
		"\u0696\5\u011c\u008f\2\u0696\u012f\3\2\2\2\u0697\u0698\7 \2\2\u0698\u0699"+
		"\7\6\2\2\u0699\u069a\5\u01b4\u00db\2\u069a\u069b\7\7\2\2\u069b\u069c\5"+
		"\u011e\u0090\2\u069c\u069d\7\31\2\2\u069d\u069e\5\u011e\u0090\2\u069e"+
		"\u0131\3\2\2\2\u069f\u06a0\7\f\2\2\u06a0\u06a1\5\u01b4\u00db\2\u06a1\u06a2"+
		"\7\b\2\2\u06a2\u06aa\3\2\2\2\u06a3\u06a4\7\f\2\2\u06a4\u06a5\5\u01b4\u00db"+
		"\2\u06a5\u06a6\7R\2\2\u06a6\u06a7\5\u01b4\u00db\2\u06a7\u06a8\7\b\2\2"+
		"\u06a8\u06aa\3\2\2\2\u06a9\u069f\3\2\2\2\u06a9\u06a3\3\2\2\2\u06aa\u0133"+
		"\3\2\2\2\u06ab\u06ac\7\63\2\2\u06ac\u06ad\7\6\2\2\u06ad\u06ae\5\u01b4"+
		"\u00db\2\u06ae\u06af\7\7\2\2\u06af\u06b0\5\u0136\u009c\2\u06b0\u0135\3"+
		"\2\2\2\u06b1\u06b5\7E\2\2\u06b2\u06b4\5\u0138\u009d\2\u06b3\u06b2\3\2"+
		"\2\2\u06b4\u06b7\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6"+
		"\u06bb\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b8\u06ba\5\u013c\u009f\2\u06b9\u06b8"+
		"\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc"+
		"\u06be\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06bf\7F\2\2\u06bf\u0137\3\2"+
		"\2\2\u06c0\u06c1\5\u013a\u009e\2\u06c1\u06c2\5\u0114\u008b\2\u06c2\u0139"+
		"\3\2\2\2\u06c3\u06c7\5\u013c\u009f\2\u06c4\u06c6\5\u013c\u009f\2\u06c5"+
		"\u06c4\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2"+
		"\2\2\u06c8\u013b\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06cb\7\20\2\2\u06cb"+
		"\u06cc\5\u01b2\u00da\2\u06cc\u06cd\7R\2\2\u06cd\u06d5\3\2\2\2\u06ce\u06cf"+
		"\7\20\2\2\u06cf\u06d0\5\u013e\u00a0\2\u06d0\u06d1\7R\2\2\u06d1\u06d5\3"+
		"\2\2\2\u06d2\u06d3\7\26\2\2\u06d3\u06d5\7R\2\2\u06d4\u06ca\3\2\2\2\u06d4"+
		"\u06ce\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5\u013d\3\2\2\2\u06d6\u06d7\7p"+
		"\2\2\u06d7\u013f\3\2\2\2\u06d8\u06d9\7<\2\2\u06d9\u06da\7\6\2\2\u06da"+
		"\u06db\5\u01b4\u00db\2\u06db\u06dc\7\7\2\2\u06dc\u06dd\5\u011c\u008f\2"+
		"\u06dd\u0141\3\2\2\2\u06de\u06df\7<\2\2\u06df\u06e0\7\6\2\2\u06e0\u06e1"+
		"\5\u01b4\u00db\2\u06e1\u06e2\7\7\2\2\u06e2\u06e3\5\u011e\u0090\2\u06e3"+
		"\u0143\3\2\2\2\u06e4\u06e5\7\27\2\2\u06e5\u06e6\5\u011c\u008f\2\u06e6"+
		"\u06e7\7<\2\2\u06e7\u06e8\7\6\2\2\u06e8\u06e9\5\u01b4\u00db\2\u06e9\u06ea"+
		"\7\7\2\2\u06ea\u06eb\7\b\2\2\u06eb\u0145\3\2\2\2\u06ec\u06ef\5\u014a\u00a6"+
		"\2\u06ed\u06ef\5\u0154\u00ab\2\u06ee\u06ec\3\2\2\2\u06ee\u06ed\3\2\2\2"+
		"\u06ef\u0147\3\2\2\2\u06f0\u06f3\5\u014c\u00a7\2\u06f1\u06f3\5\u0156\u00ac"+
		"\2\u06f2\u06f0\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u0149\3\2\2\2\u06f4\u06f5"+
		"\7\37\2\2\u06f5\u06f7\7\6\2\2\u06f6\u06f8\5\u014e\u00a8\2\u06f7\u06f6"+
		"\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\7\b\2\2\u06fa"+
		"\u06fc\5\u01b4\u00db\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd"+
		"\3\2\2\2\u06fd\u06ff\7\b\2\2\u06fe\u0700\5\u0150\u00a9\2\u06ff\u06fe\3"+
		"\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\7\7\2\2\u0702"+
		"\u0703\5\u011c\u008f\2\u0703\u014b\3\2\2\2\u0704\u0705\7\37\2\2\u0705"+
		"\u0707\7\6\2\2\u0706\u0708\5\u014e\u00a8\2\u0707\u0706\3\2\2\2\u0707\u0708"+
		"\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b\7\b\2\2\u070a\u070c\5\u01b4\u00db"+
		"\2\u070b\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070f"+
		"\7\b\2\2\u070e\u0710\5\u0150\u00a9\2\u070f\u070e\3\2\2\2\u070f\u0710\3"+
		"\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\7\7\2\2\u0712\u0713\5\u011e\u0090"+
		"\2\u0713\u014d\3\2\2\2\u0714\u0717\5\u0152\u00aa\2\u0715\u0717\5\u011a"+
		"\u008e\2\u0716\u0714\3\2\2\2\u0716\u0715\3\2\2\2\u0717\u014f\3\2\2\2\u0718"+
		"\u0719\5\u0152\u00aa\2\u0719\u0151\3\2\2\2\u071a\u071f\5\u012a\u0096\2"+
		"\u071b\u071c\7J\2\2\u071c\u071e\5\u012a\u0096\2\u071d\u071b\3\2\2\2\u071e"+
		"\u0721\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0153\3\2"+
		"\2\2\u0721\u071f\3\2\2\2\u0722\u0723\7\37\2\2\u0723\u0727\7\6\2\2\u0724"+
		"\u0726\5\u00b2Z\2\u0725\u0724\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729\u0727\3\2\2\2\u072a"+
		"\u072b\5\u008aF\2\u072b\u072c\5\u0086D\2\u072c\u072d\7R\2\2\u072d\u072e"+
		"\5\u01b4\u00db\2\u072e\u072f\7\7\2\2\u072f\u0730\5\u011c\u008f\2\u0730"+
		"\u0155\3\2\2\2\u0731\u0732\7\37\2\2\u0732\u0736\7\6\2\2\u0733\u0735\5"+
		"\u00b2Z\2\u0734\u0733\3\2\2\2\u0735\u0738\3\2\2\2\u0736\u0734\3\2\2\2"+
		"\u0736\u0737\3\2\2\2\u0737\u0739\3\2\2\2\u0738\u0736\3\2\2\2\u0739\u073a"+
		"\5\u008aF\2\u073a\u073b\5\u0086D\2\u073b\u073c\7R\2\2\u073c\u073d\5\u01b4"+
		"\u00db\2\u073d\u073e\7\7\2\2\u073e\u073f\5\u011e\u0090\2\u073f\u0157\3"+
		"\2\2\2\u0740\u0742\7\16\2\2\u0741\u0743\7p\2\2\u0742\u0741\3\2\2\2\u0742"+
		"\u0743\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\7\b\2\2\u0745\u0159\3\2"+
		"\2\2\u0746\u0748\7\25\2\2\u0747\u0749\7p\2\2\u0748\u0747\3\2\2\2\u0748"+
		"\u0749\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074b\7\b\2\2\u074b\u015b\3\2"+
		"\2\2\u074c\u074e\7.\2\2\u074d\u074f\5\u01b4\u00db\2\u074e\u074d\3\2\2"+
		"\2\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\7\b\2\2\u0751\u015d"+
		"\3\2\2\2\u0752\u0753\7\66\2\2\u0753\u0754\5\u01b4\u00db\2\u0754\u0755"+
		"\7\b\2\2\u0755\u015f\3\2\2\2\u0756\u0757\7\64\2\2\u0757\u0758\7\6\2\2"+
		"\u0758\u0759\5\u01b4\u00db\2\u0759\u075a\7\7\2\2\u075a\u075b\5\u0112\u008a"+
		"\2\u075b\u0161\3\2\2\2\u075c\u075d\79\2\2\u075d\u075e\5\u0112\u008a\2"+
		"\u075e\u075f\5\u0164\u00b3\2\u075f\u0769\3\2\2\2\u0760\u0761\79\2\2\u0761"+
		"\u0763\5\u0112\u008a\2\u0762\u0764\5\u0164\u00b3\2\u0763\u0762\3\2\2\2"+
		"\u0763\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0766\5\u016c\u00b7\2\u0766"+
		"\u0769\3\2\2\2\u0767\u0769\5\u016e\u00b8\2\u0768\u075c\3\2\2\2\u0768\u0760"+
		"\3\2\2\2\u0768\u0767\3\2\2\2\u0769\u0163\3\2\2\2\u076a\u076e\5\u0166\u00b4"+
		"\2\u076b\u076d\5\u0166\u00b4\2\u076c\u076b\3\2\2\2\u076d\u0770\3\2\2\2"+
		"\u076e\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0165\3\2\2\2\u0770\u076e"+
		"\3\2\2\2\u0771\u0772\7\21\2\2\u0772\u0773\7\6\2\2\u0773\u0774\5\u0168"+
		"\u00b5\2\u0774\u0775\7\7\2\2\u0775\u0776\5\u0112\u008a\2\u0776\u0167\3"+
		"\2\2\2\u0777\u0779\5\u00b2Z\2\u0778\u0777\3\2\2\2\u0779\u077c\3\2\2\2"+
		"\u077a\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077d\3\2\2\2\u077c\u077a"+
		"\3\2\2\2\u077d\u077e\5\u016a\u00b6\2\u077e\u077f\5\u0086D\2\u077f\u0169"+
		"\3\2\2\2\u0780\u0785\5\u0092J\2\u0781\u0782\7`\2\2\u0782\u0784\5&\24\2"+
		"\u0783\u0781\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0786"+
		"\3\2\2\2\u0786\u016b\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u0789\7\35\2\2"+
		"\u0789\u078a\5\u0112\u008a\2\u078a\u016d\3\2\2\2\u078b\u078c\79\2\2\u078c"+
		"\u078d\5\u0170\u00b9\2\u078d\u078f\5\u0112\u008a\2\u078e\u0790\5\u0164"+
		"\u00b3\2\u078f\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2\2\2\u0791"+
		"\u0793\5\u016c\u00b7\2\u0792\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u016f"+
		"\3\2\2\2\u0794\u0795\7\6\2\2\u0795\u0797\5\u0172\u00ba\2\u0796\u0798\7"+
		"\b\2\2\u0797\u0796\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u0799\3\2\2\2\u0799"+
		"\u079a\7\7\2\2\u079a\u0171\3\2\2\2\u079b\u07a0\5\u0174\u00bb\2\u079c\u079d"+
		"\7\b\2\2\u079d\u079f\5\u0174\u00bb\2\u079e\u079c\3\2\2\2\u079f\u07a2\3"+
		"\2\2\2\u07a0\u079e\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u0173\3\2\2\2\u07a2"+
		"\u07a0\3\2\2\2\u07a3\u07a5\5\u00b2Z\2\u07a4\u07a3\3\2\2\2\u07a5\u07a8"+
		"\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a9\3\2\2\2\u07a8"+
		"\u07a6\3\2\2\2\u07a9\u07aa\5\u008aF\2\u07aa\u07ab\5\u0086D\2\u07ab\u07ac"+
		"\7\t\2\2\u07ac\u07ad\5\u01b4\u00db\2\u07ad\u0175\3\2\2\2\u07ae\u07b1\5"+
		"\u0184\u00c3\2\u07af\u07b1\5\u01ac\u00d7\2\u07b0\u07ae\3\2\2\2\u07b0\u07af"+
		"\3\2\2\2\u07b1\u07b5\3\2\2\2\u07b2\u07b4\5\u017e\u00c0\2\u07b3\u07b2\3"+
		"\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6"+
		"\u0177\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07d6\5\26\f\2\u07b9\u07be\5"+
		"L\'\2\u07ba\u07bb\7\4\2\2\u07bb\u07bd\7\5\2\2\u07bc\u07ba\3\2\2\2\u07bd"+
		"\u07c0\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\3\2"+
		"\2\2\u07c0\u07be\3\2\2\2\u07c1\u07c2\7K\2\2\u07c2\u07c3\7\23\2\2\u07c3"+
		"\u07d6\3\2\2\2\u07c4\u07c5\7:\2\2\u07c5\u07c6\7K\2\2\u07c6\u07d6\7\23"+
		"\2\2\u07c7\u07d6\7\65\2\2\u07c8\u07c9\5L\'\2\u07c9\u07ca\7K\2\2\u07ca"+
		"\u07cb\7\65\2\2\u07cb\u07d6\3\2\2\2\u07cc\u07cd\7\6\2\2\u07cd\u07ce\5"+
		"\u01b4\u00db\2\u07ce\u07cf\7\7\2\2\u07cf\u07d6\3\2\2\2\u07d0\u07d6\5\u018a"+
		"\u00c6\2\u07d1\u07d6\5\u0192\u00ca\2\u07d2\u07d6\5\u0198\u00cd\2\u07d3"+
		"\u07d6\5\u019e\u00d0\2\u07d4\u07d6\5\u01a6\u00d4\2\u07d5\u07b8\3\2\2\2"+
		"\u07d5\u07b9\3\2\2\2\u07d5\u07c4\3\2\2\2\u07d5\u07c7\3\2\2\2\u07d5\u07c8"+
		"\3\2\2\2\u07d5\u07cc\3\2\2\2\u07d5\u07d0\3\2\2\2\u07d5\u07d1\3\2\2\2\u07d5"+
		"\u07d2\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u0179\3\2"+
		"\2\2\u07d7\u07d8\3\2\2\2\u07d8\u017b\3\2\2\2\u07d9\u07f6\5\26\f\2\u07da"+
		"\u07df\5L\'\2\u07db\u07dc\7\4\2\2\u07dc\u07de\7\5\2\2\u07dd\u07db\3\2"+
		"\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0"+
		"\u07e2\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e3\7K\2\2\u07e3\u07e4\7\23"+
		"\2\2\u07e4\u07f6\3\2\2\2\u07e5\u07e6\7:\2\2\u07e6\u07e7\7K\2\2\u07e7\u07f6"+
		"\7\23\2\2\u07e8\u07f6\7\65\2\2\u07e9\u07ea\5L\'\2\u07ea\u07eb\7K\2\2\u07eb"+
		"\u07ec\7\65\2\2\u07ec\u07f6\3\2\2\2\u07ed\u07ee\7\6\2\2\u07ee\u07ef\5"+
		"\u01b4\u00db\2\u07ef\u07f0\7\7\2\2\u07f0\u07f6\3\2\2\2\u07f1\u07f6\5\u018a"+
		"\u00c6\2\u07f2\u07f6\5\u0192\u00ca\2\u07f3\u07f6\5\u019e\u00d0\2\u07f4"+
		"\u07f6\5\u01a6\u00d4\2\u07f5\u07d9\3\2\2\2\u07f5\u07da\3\2\2\2\u07f5\u07e5"+
		"\3\2\2\2\u07f5\u07e8\3\2\2\2\u07f5\u07e9\3\2\2\2\u07f5\u07ed\3\2\2\2\u07f5"+
		"\u07f1\3\2\2\2\u07f5\u07f2\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f5\u07f4\3\2"+
		"\2\2\u07f6\u017d\3\2\2\2\u07f7\u07fd\5\u018c\u00c7\2\u07f8\u07fd\5\u0194"+
		"\u00cb\2\u07f9\u07fd\5\u019a\u00ce\2\u07fa\u07fd\5\u01a0\u00d1\2\u07fb"+
		"\u07fd\5\u01a8\u00d5\2\u07fc\u07f7\3\2\2\2\u07fc\u07f8\3\2\2\2\u07fc\u07f9"+
		"\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc\u07fb\3\2\2\2\u07fd\u017f\3\2\2\2\u07fe"+
		"\u07ff\3\2\2\2\u07ff\u0181\3\2\2\2\u0800\u0805\5\u018c\u00c7\2\u0801\u0805"+
		"\5\u0194\u00cb\2\u0802\u0805\5\u01a0\u00d1\2\u0803\u0805\5\u01a8\u00d5"+
		"\2\u0804\u0800\3\2\2\2\u0804\u0801\3\2\2\2\u0804\u0802\3\2\2\2\u0804\u0803"+
		"\3\2\2\2\u0805\u0183\3\2\2\2\u0806\u082f\5\26\f\2\u0807\u080c\5L\'\2\u0808"+
		"\u0809\7\4\2\2\u0809\u080b\7\5\2\2\u080a\u0808\3\2\2\2\u080b\u080e\3\2"+
		"\2\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080f\3\2\2\2\u080e"+
		"\u080c\3\2\2\2\u080f\u0810\7K\2\2\u0810\u0811\7\23\2\2\u0811\u082f\3\2"+
		"\2\2\u0812\u0817\5\u008cG\2\u0813\u0814\7\4\2\2\u0814\u0816\7\5\2\2\u0815"+
		"\u0813\3\2\2\2\u0816\u0819\3\2\2\2\u0817\u0815\3\2\2\2\u0817\u0818\3\2"+
		"\2\2\u0818\u081a\3\2\2\2\u0819\u0817\3\2\2\2\u081a\u081b\7K\2\2\u081b"+
		"\u081c\7\23\2\2\u081c\u082f\3\2\2\2\u081d\u081e\7:\2\2\u081e\u081f\7K"+
		"\2\2\u081f\u082f\7\23\2\2\u0820\u082f\7\65\2\2\u0821\u0822\5L\'\2\u0822"+
		"\u0823\7K\2\2\u0823\u0824\7\65\2\2\u0824\u082f\3\2\2\2\u0825\u0826\7\6"+
		"\2\2\u0826\u0827\5\u01b4\u00db\2\u0827\u0828\7\7\2\2\u0828\u082f\3\2\2"+
		"\2\u0829\u082f\5\u018e\u00c8\2\u082a\u082f\5\u0196\u00cc\2\u082b\u082f"+
		"\5\u019c\u00cf\2\u082c\u082f\5\u01a2\u00d2\2\u082d\u082f\5\u01aa\u00d6"+
		"\2\u082e\u0806\3\2\2\2\u082e\u0807\3\2\2\2\u082e\u0812\3\2\2\2\u082e\u081d"+
		"\3\2\2\2\u082e\u0820\3\2\2\2\u082e\u0821\3\2\2\2\u082e\u0825\3\2\2\2\u082e"+
		"\u0829\3\2\2\2\u082e\u082a\3\2\2\2\u082e\u082b\3\2\2\2\u082e\u082c\3\2"+
		"\2\2\u082e\u082d\3\2\2\2\u082f\u0185\3\2\2\2\u0830\u0831\3\2\2\2\u0831"+
		"\u0187\3\2\2\2\u0832\u085a\5\26\f\2\u0833\u0838\5L\'\2\u0834\u0835\7\4"+
		"\2\2\u0835\u0837\7\5\2\2\u0836\u0834\3\2\2\2\u0837\u083a\3\2\2\2\u0838"+
		"\u0836\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083b\3\2\2\2\u083a\u0838\3\2"+
		"\2\2\u083b\u083c\7K\2\2\u083c\u083d\7\23\2\2\u083d\u085a\3\2\2\2\u083e"+
		"\u0843\5\u008cG\2\u083f\u0840\7\4\2\2\u0840\u0842\7\5\2\2\u0841\u083f"+
		"\3\2\2\2\u0842\u0845\3\2\2\2\u0843\u0841\3\2\2\2\u0843\u0844\3\2\2\2\u0844"+
		"\u0846\3\2\2\2\u0845\u0843\3\2\2\2\u0846\u0847\7K\2\2\u0847\u0848\7\23"+
		"\2\2\u0848\u085a\3\2\2\2\u0849\u084a\7:\2\2\u084a\u084b\7K\2\2\u084b\u085a"+
		"\7\23\2\2\u084c\u085a\7\65\2\2\u084d\u084e\5L\'\2\u084e\u084f\7K\2\2\u084f"+
		"\u0850\7\65\2\2\u0850\u085a\3\2\2\2\u0851\u0852\7\6\2\2\u0852\u0853\5"+
		"\u01b4\u00db\2\u0853\u0854\7\7\2\2\u0854\u085a\3\2\2\2\u0855\u085a\5\u018e"+
		"\u00c8\2\u0856\u085a\5\u0196\u00cc\2\u0857\u085a\5\u01a2\u00d2\2\u0858"+
		"\u085a\5\u01aa\u00d6\2\u0859\u0832\3\2\2\2\u0859\u0833\3\2\2\2\u0859\u083e"+
		"\3\2\2\2\u0859\u0849\3\2\2\2\u0859\u084c\3\2\2\2\u0859\u084d\3\2\2\2\u0859"+
		"\u0851\3\2\2\2\u0859\u0855\3\2\2\2\u0859\u0856\3\2\2\2\u0859\u0857\3\2"+
		"\2\2\u0859\u0858\3\2\2\2\u085a\u0189\3\2\2\2\u085b\u085d\7)\2\2\u085c"+
		"\u085e\5@!\2\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0862\3\2\2"+
		"\2\u085f\u0861\5\u00fc\177\2\u0860\u085f\3\2\2\2\u0861\u0864\3\2\2\2\u0862"+
		"\u0860\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0865\3\2\2\2\u0864\u0862\3\2"+
		"\2\2\u0865\u0870\7p\2\2\u0866\u086a\7K\2\2\u0867\u0869\5\u00fc\177\2\u0868"+
		"\u0867\3\2\2\2\u0869\u086c\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2"+
		"\2\2\u086b\u086d\3\2\2\2\u086c\u086a\3\2\2\2\u086d\u086f\7p\2\2\u086e"+
		"\u0866\3\2\2\2\u086f\u0872\3\2\2\2\u0870\u086e\3\2\2\2\u0870\u0871\3\2"+
		"\2\2\u0871\u0874\3\2\2\2\u0872\u0870\3\2\2\2\u0873\u0875\5\u0190\u00c9"+
		"\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0878"+
		"\7\6\2\2\u0877\u0879\5\u01a4\u00d3\2\u0878\u0877\3\2\2\2\u0878\u0879\3"+
		"\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c\7\7\2\2\u087b\u087d\5x=\2\u087c"+
		"\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u08af\3\2\2\2\u087e\u087f\5P"+
		")\2\u087f\u0880\7K\2\2\u0880\u0882\7)\2\2\u0881\u0883\5@!\2\u0882\u0881"+
		"\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0887\3\2\2\2\u0884\u0886\5\u00fc\177"+
		"\2\u0885\u0884\3\2\2\2\u0886\u0889\3\2\2\2\u0887\u0885\3\2\2\2\u0887\u0888"+
		"\3\2\2\2\u0888\u088a\3\2\2\2\u0889\u0887\3\2\2\2\u088a\u088c\7p\2\2\u088b"+
		"\u088d\5\u0190\u00c9\2\u088c\u088b\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e"+
		"\3\2\2\2\u088e\u0890\7\6\2\2\u088f\u0891\5\u01a4\u00d3\2\u0890\u088f\3"+
		"\2\2\2\u0890\u0891\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0894\7\7\2\2\u0893"+
		"\u0895\5x=\2\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u08af\3\2\2"+
		"\2\u0896\u0897\5\u0176\u00bc\2\u0897\u0898\7K\2\2\u0898\u089a\7)\2\2\u0899"+
		"\u089b\5@!\2\u089a\u0899\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089f\3\2\2"+
		"\2\u089c\u089e\5\u00fc\177\2\u089d\u089c\3\2\2\2\u089e\u08a1\3\2\2\2\u089f"+
		"\u089d\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a2\3\2\2\2\u08a1\u089f\3\2"+
		"\2\2\u08a2\u08a4\7p\2\2\u08a3\u08a5\5\u0190\u00c9\2\u08a4\u08a3\3\2\2"+
		"\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a8\7\6\2\2\u08a7\u08a9"+
		"\5\u01a4\u00d3\2\u08a8\u08a7\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08aa\3"+
		"\2\2\2\u08aa\u08ac\7\7\2\2\u08ab\u08ad\5x=\2\u08ac\u08ab\3\2\2\2\u08ac"+
		"\u08ad\3\2\2\2\u08ad\u08af\3\2\2\2\u08ae\u085b\3\2\2\2\u08ae\u087e\3\2"+
		"\2\2\u08ae\u0896\3\2\2\2\u08af\u018b\3\2\2\2\u08b0\u08b1\7K\2\2\u08b1"+
		"\u08b3\7)\2\2\u08b2\u08b4\5@!\2\u08b3\u08b2\3\2\2\2\u08b3\u08b4\3\2\2"+
		"\2\u08b4\u08b8\3\2\2\2\u08b5\u08b7\5\u00fc\177\2\u08b6\u08b5\3\2\2\2\u08b7"+
		"\u08ba\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bb\3\2"+
		"\2\2\u08ba\u08b8\3\2\2\2\u08bb\u08bd\7p\2\2\u08bc\u08be\5\u0190\u00c9"+
		"\2\u08bd\u08bc\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c1"+
		"\7\6\2\2\u08c0\u08c2\5\u01a4\u00d3\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3"+
		"\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c5\7\7\2\2\u08c4\u08c6\5x=\2\u08c5"+
		"\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u018d\3\2\2\2\u08c7\u08c9\7)"+
		"\2\2\u08c8\u08ca\5@!\2\u08c9\u08c8\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08ce"+
		"\3\2\2\2\u08cb\u08cd\5\u00fc\177\2\u08cc\u08cb\3\2\2\2\u08cd\u08d0\3\2"+
		"\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d1\3\2\2\2\u08d0"+
		"\u08ce\3\2\2\2\u08d1\u08dc\7p\2\2\u08d2\u08d6\7K\2\2\u08d3\u08d5\5\u00fc"+
		"\177\2\u08d4\u08d3\3\2\2\2\u08d5\u08d8\3\2\2\2\u08d6\u08d4\3\2\2\2\u08d6"+
		"\u08d7\3\2\2\2\u08d7\u08d9\3\2\2\2\u08d8\u08d6\3\2\2\2\u08d9\u08db\7p"+
		"\2\2\u08da\u08d2\3\2\2\2\u08db\u08de\3\2\2\2\u08dc\u08da\3\2\2\2\u08dc"+
		"\u08dd\3\2\2\2\u08dd\u08e0\3\2\2\2\u08de\u08dc\3\2\2\2\u08df\u08e1\5\u0190"+
		"\u00c9\2\u08e0\u08df\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2"+
		"\u08e4\7\6\2\2\u08e3\u08e5\5\u01a4\u00d3\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5"+
		"\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\7\7\2\2\u08e7\u08e9\5x=\2\u08e8"+
		"\u08e7\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u0903\3\2\2\2\u08ea\u08eb\5P"+
		")\2\u08eb\u08ec\7K\2\2\u08ec\u08ee\7)\2\2\u08ed\u08ef\5@!\2\u08ee\u08ed"+
		"\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f3\3\2\2\2\u08f0\u08f2\5\u00fc\177"+
		"\2\u08f1\u08f0\3\2\2\2\u08f2\u08f5\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f3\u08f4"+
		"\3\2\2\2\u08f4\u08f6\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f6\u08f8\7p\2\2\u08f7"+
		"\u08f9\5\u0190\u00c9\2\u08f8\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa"+
		"\3\2\2\2\u08fa\u08fc\7\6\2\2\u08fb\u08fd\5\u01a4\u00d3\2\u08fc\u08fb\3"+
		"\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0900\7\7\2\2\u08ff"+
		"\u0901\5x=\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0903\3\2\2"+
		"\2\u0902\u08c7\3\2\2\2\u0902\u08ea\3\2\2\2\u0903\u018f\3\2\2\2\u0904\u0908"+
		"\5@!\2\u0905\u0906\7N\2\2\u0906\u0908\7M\2\2\u0907\u0904\3\2\2\2\u0907"+
		"\u0905\3\2\2\2\u0908\u0191\3\2\2\2\u0909\u090a\5\u0176\u00bc\2\u090a\u090b"+
		"\7K\2\2\u090b\u090c\7p\2\2\u090c\u0917\3\2\2\2\u090d\u090e\7\62\2\2\u090e"+
		"\u090f\7K\2\2\u090f\u0917\7p\2\2\u0910\u0911\5L\'\2\u0911\u0912\7K\2\2"+
		"\u0912\u0913\7\62\2\2\u0913\u0914\7K\2\2\u0914\u0915\7p\2\2\u0915\u0917"+
		"\3\2\2\2\u0916\u0909\3\2\2\2\u0916\u090d\3\2\2\2\u0916\u0910\3\2\2\2\u0917"+
		"\u0193\3\2\2\2\u0918\u0919\7K\2\2\u0919\u091a\7p\2\2\u091a\u0195\3\2\2"+
		"\2\u091b\u091c\7\62\2\2\u091c\u091d\7K\2\2\u091d\u0925\7p\2\2\u091e\u091f"+
		"\5L\'\2\u091f\u0920\7K\2\2\u0920\u0921\7\62\2\2\u0921\u0922\7K\2\2\u0922"+
		"\u0923\7p\2\2\u0923\u0925\3\2\2\2\u0924\u091b\3\2\2\2\u0924\u091e\3\2"+
		"\2\2\u0925\u0197\3\2\2\2\u0926\u0927\5P)\2\u0927\u0928\7\4\2\2\u0928\u0929"+
		"\5\u01b4\u00db\2\u0929\u092a\7\5\2\2\u092a\u0931\3\2\2\2\u092b\u092c\5"+
		"\u017c\u00bf\2\u092c\u092d\7\4\2\2\u092d\u092e\5\u01b4\u00db\2\u092e\u092f"+
		"\7\5\2\2\u092f\u0931\3\2\2\2\u0930\u0926\3\2\2\2\u0930\u092b\3\2\2\2\u0931"+
		"\u0939\3\2\2\2\u0932\u0933\5\u017a\u00be\2\u0933\u0934\7\4\2\2\u0934\u0935"+
		"\5\u01b4\u00db\2\u0935\u0936\7\5\2\2\u0936\u0938\3\2\2\2\u0937\u0932\3"+
		"\2\2\2\u0938\u093b\3\2\2\2\u0939\u0937\3\2\2\2\u0939\u093a\3\2\2\2\u093a"+
		"\u0199\3\2\2\2\u093b\u0939\3\2\2\2\u093c\u093d\5\u0182\u00c2\2\u093d\u093e"+
		"\7\4\2\2\u093e\u093f\5\u01b4\u00db\2\u093f\u0940\7\5\2\2\u0940\u0948\3"+
		"\2\2\2\u0941\u0942\5\u0180\u00c1\2\u0942\u0943\7\4\2\2\u0943\u0944\5\u01b4"+
		"\u00db\2\u0944\u0945\7\5\2\2\u0945\u0947\3\2\2\2\u0946\u0941\3\2\2\2\u0947"+
		"\u094a\3\2\2\2\u0948\u0946\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u019b\3\2"+
		"\2\2\u094a\u0948\3\2\2\2\u094b\u094c\5P)\2\u094c\u094d\7\4\2\2\u094d\u094e"+
		"\5\u01b4\u00db\2\u094e\u094f\7\5\2\2\u094f\u0956\3\2\2\2\u0950\u0951\5"+
		"\u0188\u00c5\2\u0951\u0952\7\4\2\2\u0952\u0953\5\u01b4\u00db\2\u0953\u0954"+
		"\7\5\2\2\u0954\u0956\3\2\2\2\u0955\u094b\3\2\2\2\u0955";
	private static final String _serializedATNSegment1 =
		"\u0950\3\2\2\2\u0956\u095e\3\2\2\2\u0957\u0958\5\u0186\u00c4\2\u0958\u0959"+
		"\7\4\2\2\u0959\u095a\5\u01b4\u00db\2\u095a\u095b\7\5\2\2\u095b\u095d\3"+
		"\2\2\2\u095c\u0957\3\2\2\2\u095d\u0960\3\2\2\2\u095e\u095c\3\2\2\2\u095e"+
		"\u095f\3\2\2\2\u095f\u019d\3\2\2\2\u0960\u095e\3\2\2\2\u0961\u0962\5R"+
		"*\2\u0962\u0964\7\6\2\2\u0963\u0965\5\u01a4\u00d3\2\u0964\u0963\3\2\2"+
		"\2\u0964\u0965\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\7\7\2\2\u0967\u09a6"+
		"\3\2\2\2\u0968\u0969\5L\'\2\u0969\u096b\7K\2\2\u096a\u096c\5@!\2\u096b"+
		"\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\7p"+
		"\2\2\u096e\u0970\7\6\2\2\u096f\u0971\5\u01a4\u00d3\2\u0970\u096f\3\2\2"+
		"\2\u0970\u0971\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0973\7\7\2\2\u0973\u09a6"+
		"\3\2\2\2\u0974\u0975\5P)\2\u0975\u0977\7K\2\2\u0976\u0978\5@!\2\u0977"+
		"\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097a\7p"+
		"\2\2\u097a\u097c\7\6\2\2\u097b\u097d\5\u01a4\u00d3\2\u097c\u097b\3\2\2"+
		"\2\u097c\u097d\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u097f\7\7\2\2\u097f\u09a6"+
		"\3\2\2\2\u0980\u0981\5\u0176\u00bc\2\u0981\u0983\7K\2\2\u0982\u0984\5"+
		"@!\2\u0983\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\3\2\2\2\u0985"+
		"\u0986\7p\2\2\u0986\u0988\7\6\2\2\u0987\u0989\5\u01a4\u00d3\2\u0988\u0987"+
		"\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098b\7\7\2\2\u098b"+
		"\u09a6\3\2\2\2\u098c\u098d\7\62\2\2\u098d\u098f\7K\2\2\u098e\u0990\5@"+
		"!\2\u098f\u098e\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\3\2\2\2\u0991"+
		"\u0992\7p\2\2\u0992\u0994\7\6\2\2\u0993\u0995\5\u01a4\u00d3\2\u0994\u0993"+
		"\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u09a6\7\7\2\2\u0997"+
		"\u0998\5L\'\2\u0998\u0999\7K\2\2\u0999\u099a\7\62\2\2\u099a\u099c\7K\2"+
		"\2\u099b\u099d\5@!\2\u099c\u099b\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099e"+
		"\3\2\2\2\u099e\u099f\7p\2\2\u099f\u09a1\7\6\2\2\u09a0\u09a2\5\u01a4\u00d3"+
		"\2\u09a1\u09a0\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4"+
		"\7\7\2\2\u09a4\u09a6\3\2\2\2\u09a5\u0961\3\2\2\2\u09a5\u0968\3\2\2\2\u09a5"+
		"\u0974\3\2\2\2\u09a5\u0980\3\2\2\2\u09a5\u098c\3\2\2\2\u09a5\u0997\3\2"+
		"\2\2\u09a6\u019f\3\2\2\2\u09a7\u09a9\7K\2\2\u09a8\u09aa\5@!\2\u09a9\u09a8"+
		"\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\7p\2\2\u09ac"+
		"\u09ae\7\6\2\2\u09ad\u09af\5\u01a4\u00d3\2\u09ae\u09ad\3\2\2\2\u09ae\u09af"+
		"\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\7\7\2\2\u09b1\u01a1\3\2\2\2\u09b2"+
		"\u09b3\5R*\2\u09b3\u09b5\7\6\2\2\u09b4\u09b6\5\u01a4\u00d3\2\u09b5\u09b4"+
		"\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b8\7\7\2\2\u09b8"+
		"\u09eb\3\2\2\2\u09b9\u09ba\5L\'\2\u09ba\u09bc\7K\2\2\u09bb\u09bd\5@!\2"+
		"\u09bc\u09bb\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\3\2\2\2\u09be\u09bf"+
		"\7p\2\2\u09bf\u09c1\7\6\2\2\u09c0\u09c2\5\u01a4\u00d3\2\u09c1\u09c0\3"+
		"\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4\7\7\2\2\u09c4"+
		"\u09eb\3\2\2\2\u09c5\u09c6\5P)\2\u09c6\u09c8\7K\2\2\u09c7\u09c9\5@!\2"+
		"\u09c8\u09c7\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb"+
		"\7p\2\2\u09cb\u09cd\7\6\2\2\u09cc\u09ce\5\u01a4\u00d3\2\u09cd\u09cc\3"+
		"\2\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d0\7\7\2\2\u09d0"+
		"\u09eb\3\2\2\2\u09d1\u09d2\7\62\2\2\u09d2\u09d4\7K\2\2\u09d3\u09d5\5@"+
		"!\2\u09d4\u09d3\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6"+
		"\u09d7\7p\2\2\u09d7\u09d9\7\6\2\2\u09d8\u09da\5\u01a4\u00d3\2\u09d9\u09d8"+
		"\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09eb\7\7\2\2\u09dc"+
		"\u09dd\5L\'\2\u09dd\u09de\7K\2\2\u09de\u09df\7\62\2\2\u09df\u09e1\7K\2"+
		"\2\u09e0\u09e2\5@!\2\u09e1\u09e0\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3"+
		"\3\2\2\2\u09e3\u09e4\7p\2\2\u09e4\u09e6\7\6\2\2\u09e5\u09e7\5\u01a4\u00d3"+
		"\2\u09e6\u09e5\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9"+
		"\7\7\2\2\u09e9\u09eb\3\2\2\2\u09ea\u09b2\3\2\2\2\u09ea\u09b9\3\2\2\2\u09ea"+
		"\u09c5\3\2\2\2\u09ea\u09d1\3\2\2\2\u09ea\u09dc\3\2\2\2\u09eb\u01a3\3\2"+
		"\2\2\u09ec\u09f1\5\u01b4\u00db\2\u09ed\u09ee\7J\2\2\u09ee\u09f0\5\u01b4"+
		"\u00db\2\u09ef\u09ed\3\2\2\2\u09f0\u09f3\3\2\2\2\u09f1\u09ef\3\2\2\2\u09f1"+
		"\u09f2\3\2\2\2\u09f2\u01a5\3\2\2\2\u09f3\u09f1\3\2\2\2\u09f4\u09f5\5P"+
		")\2\u09f5\u09f7\7d\2\2\u09f6\u09f8\5@!\2\u09f7\u09f6\3\2\2\2\u09f7\u09f8"+
		"\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09fa\7p\2\2\u09fa\u0a24\3\2\2\2\u09fb"+
		"\u09fc\5\"\22\2\u09fc\u09fe\7d\2\2\u09fd\u09ff\5@!\2\u09fe\u09fd\3\2\2"+
		"\2\u09fe\u09ff\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a01\7p\2\2\u0a01\u0a24"+
		"\3\2\2\2\u0a02\u0a03\5\u0176\u00bc\2\u0a03\u0a05\7d\2\2\u0a04\u0a06\5"+
		"@!\2\u0a05\u0a04\3\2\2\2\u0a05\u0a06\3\2\2\2\u0a06\u0a07\3\2\2\2\u0a07"+
		"\u0a08\7p\2\2\u0a08\u0a24\3\2\2\2\u0a09\u0a0a\7\62\2\2\u0a0a\u0a0c\7d"+
		"\2\2\u0a0b\u0a0d\5@!\2\u0a0c\u0a0b\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0e"+
		"\3\2\2\2\u0a0e\u0a24\7p\2\2\u0a0f\u0a10\5L\'\2\u0a10\u0a11\7K\2\2\u0a11"+
		"\u0a12\7\62\2\2\u0a12\u0a14\7d\2\2\u0a13\u0a15\5@!\2\u0a14\u0a13\3\2\2"+
		"\2\u0a14\u0a15\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a17\7p\2\2\u0a17\u0a24"+
		"\3\2\2\2\u0a18\u0a19\5&\24\2\u0a19\u0a1b\7d\2\2\u0a1a\u0a1c\5@!\2\u0a1b"+
		"\u0a1a\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1e\7)"+
		"\2\2\u0a1e\u0a24\3\2\2\2\u0a1f\u0a20\5\64\33\2\u0a20\u0a21\7d\2\2\u0a21"+
		"\u0a22\7)\2\2\u0a22\u0a24\3\2\2\2\u0a23\u09f4\3\2\2\2\u0a23\u09fb\3\2"+
		"\2\2\u0a23\u0a02\3\2\2\2\u0a23\u0a09\3\2\2\2\u0a23\u0a0f\3\2\2\2\u0a23"+
		"\u0a18\3\2\2\2\u0a23\u0a1f\3\2\2\2\u0a24\u01a7\3\2\2\2\u0a25\u0a27\7d"+
		"\2\2\u0a26\u0a28\5@!\2\u0a27\u0a26\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29"+
		"\3\2\2\2\u0a29\u0a2a\7p\2\2\u0a2a\u01a9\3\2\2\2\u0a2b\u0a2c\5P)\2\u0a2c"+
		"\u0a2e\7d\2\2\u0a2d\u0a2f\5@!\2\u0a2e\u0a2d\3\2\2\2\u0a2e\u0a2f\3\2\2"+
		"\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a31\7p\2\2\u0a31\u0a54\3\2\2\2\u0a32\u0a33"+
		"\5\"\22\2\u0a33\u0a35\7d\2\2\u0a34\u0a36\5@!\2\u0a35\u0a34\3\2\2\2\u0a35"+
		"\u0a36\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a38\7p\2\2\u0a38\u0a54\3\2"+
		"\2\2\u0a39\u0a3a\7\62\2\2\u0a3a\u0a3c\7d\2\2\u0a3b\u0a3d\5@!\2\u0a3c\u0a3b"+
		"\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a54\7p\2\2\u0a3f"+
		"\u0a40\5L\'\2\u0a40\u0a41\7K\2\2\u0a41\u0a42\7\62\2\2\u0a42\u0a44\7d\2"+
		"\2\u0a43\u0a45\5@!\2\u0a44\u0a43\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46"+
		"\3\2\2\2\u0a46\u0a47\7p\2\2\u0a47\u0a54\3\2\2\2\u0a48\u0a49\5&\24\2\u0a49"+
		"\u0a4b\7d\2\2\u0a4a\u0a4c\5@!\2\u0a4b\u0a4a\3\2\2\2\u0a4b\u0a4c\3\2\2"+
		"\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\7)\2\2\u0a4e\u0a54\3\2\2\2\u0a4f\u0a50"+
		"\5\64\33\2\u0a50\u0a51\7d\2\2\u0a51\u0a52\7)\2\2\u0a52\u0a54\3\2\2\2\u0a53"+
		"\u0a2b\3\2\2\2\u0a53\u0a32\3\2\2\2\u0a53\u0a39\3\2\2\2\u0a53\u0a3f\3\2"+
		"\2\2\u0a53\u0a48\3\2\2\2\u0a53\u0a4f\3\2\2\2\u0a54\u01ab\3\2\2\2\u0a55"+
		"\u0a56\7)\2\2\u0a56\u0a57\5\32\16\2\u0a57\u0a59\5\u01ae\u00d8\2\u0a58"+
		"\u0a5a\5\66\34\2\u0a59\u0a58\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a6c\3"+
		"\2\2\2\u0a5b\u0a5c\7)\2\2\u0a5c\u0a5d\5$\23\2\u0a5d\u0a5f\5\u01ae\u00d8"+
		"\2\u0a5e\u0a60\5\66\34\2\u0a5f\u0a5e\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60"+
		"\u0a6c\3\2\2\2\u0a61\u0a62\7)\2\2\u0a62\u0a63\5\32\16\2\u0a63\u0a64\5"+
		"\66\34\2\u0a64\u0a65\5\u010e\u0088\2\u0a65\u0a6c\3\2\2\2\u0a66\u0a67\7"+
		")\2\2\u0a67\u0a68\5$\23\2\u0a68\u0a69\5\66\34\2\u0a69\u0a6a\5\u010e\u0088"+
		"\2\u0a6a\u0a6c\3\2\2\2\u0a6b\u0a55\3\2\2\2\u0a6b\u0a5b\3\2\2\2\u0a6b\u0a61"+
		"\3\2\2\2\u0a6b\u0a66\3\2\2\2\u0a6c\u01ad\3\2\2\2\u0a6d\u0a71\5\u01b0\u00d9"+
		"\2\u0a6e\u0a70\5\u01b0\u00d9\2\u0a6f\u0a6e\3\2\2\2\u0a70\u0a73\3\2\2\2"+
		"\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u01af\3\2\2\2\u0a73\u0a71"+
		"\3\2\2\2\u0a74\u0a76\5\u00fc\177\2\u0a75\u0a74\3\2\2\2\u0a76\u0a79\3\2"+
		"\2\2\u0a77\u0a75\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u0a7a\3\2\2\2\u0a79"+
		"\u0a77\3\2\2\2\u0a7a\u0a7b\7\4\2\2\u0a7b\u0a7c\5\u01b4\u00db\2\u0a7c\u0a7d"+
		"\7\5\2\2\u0a7d\u01b1\3\2\2\2\u0a7e\u0a7f\5\u01b4\u00db\2\u0a7f\u01b3\3"+
		"\2\2\2\u0a80\u0a83\5\u01b6\u00dc\2\u0a81\u0a83\5\u01be\u00e0\2\u0a82\u0a80"+
		"\3\2\2\2\u0a82\u0a81\3\2\2\2\u0a83\u01b5\3\2\2\2\u0a84\u0a85\5\u01b8\u00dd"+
		"\2\u0a85\u0a86\7c\2\2\u0a86\u0a87\5\u01bc\u00df\2\u0a87\u01b7\3\2\2\2"+
		"\u0a88\u0a93\7p\2\2\u0a89\u0a8b\7\6\2\2\u0a8a\u0a8c\5\u00acW\2\u0a8b\u0a8a"+
		"\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a93\7\7\2\2\u0a8e"+
		"\u0a8f\7\6\2\2\u0a8f\u0a90\5\u01ba\u00de\2\u0a90\u0a91\7\7\2\2\u0a91\u0a93"+
		"\3\2\2\2\u0a92\u0a88\3\2\2\2\u0a92\u0a89\3\2\2\2\u0a92\u0a8e\3\2\2\2\u0a93"+
		"\u01b9\3\2\2\2\u0a94\u0a99\7p\2\2\u0a95\u0a96\7J\2\2\u0a96\u0a98\7p\2"+
		"\2\u0a97\u0a95\3\2\2\2\u0a98\u0a9b\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a99\u0a9a"+
		"\3\2\2\2\u0a9a\u01bb\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9c\u0a9f\5\u01b4\u00db"+
		"\2\u0a9d\u0a9f\5\u0112\u008a\2\u0a9e\u0a9c\3\2\2\2\u0a9e\u0a9d\3\2\2\2"+
		"\u0a9f\u01bd\3\2\2\2\u0aa0\u0aa3\5\u01c6\u00e4\2\u0aa1\u0aa3\5\u01c0\u00e1"+
		"\2\u0aa2\u0aa0\3\2\2\2\u0aa2\u0aa1\3\2\2\2\u0aa3\u01bf\3\2\2\2\u0aa4\u0aa5"+
		"\5\u01c2\u00e2\2\u0aa5\u0aa6\5\u01c4\u00e3\2\u0aa6\u0aa7\5\u01b4\u00db"+
		"\2\u0aa7\u01c1\3\2\2\2\u0aa8\u0aac\5P)\2\u0aa9\u0aac\5\u0192\u00ca\2\u0aaa"+
		"\u0aac\5\u0198\u00cd\2\u0aab\u0aa8\3\2\2\2\u0aab\u0aa9\3\2\2\2\u0aab\u0aaa"+
		"\3\2\2\2\u0aac\u01c3\3\2\2\2\u0aad\u0aae\t\6\2\2\u0aae\u01c5\3\2\2\2\u0aaf"+
		"\u0ab7\5\u01c8\u00e5\2\u0ab0\u0ab1\5\u01c8\u00e5\2\u0ab1\u0ab2\7Q\2\2"+
		"\u0ab2\u0ab3\5\u01b4\u00db\2\u0ab3\u0ab4\7R\2\2\u0ab4\u0ab5\5\u01c6\u00e4"+
		"\2\u0ab5\u0ab7\3\2\2\2\u0ab6\u0aaf\3\2\2\2\u0ab6\u0ab0\3\2\2\2\u0ab7\u01c7"+
		"\3\2\2\2\u0ab8\u0ab9\b\u00e5\1\2\u0ab9\u0aba\5\u01ca\u00e6\2\u0aba\u0ac0"+
		"\3\2\2\2\u0abb\u0abc\f\3\2\2\u0abc\u0abd\7X\2\2\u0abd\u0abf\5\u01ca\u00e6"+
		"\2\u0abe\u0abb\3\2\2\2\u0abf\u0ac2\3\2\2\2\u0ac0\u0abe\3\2\2\2\u0ac0\u0ac1"+
		"\3\2\2\2\u0ac1\u01c9\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac3\u0ac4\b\u00e6\1"+
		"\2\u0ac4\u0ac5\5\u01cc\u00e7\2\u0ac5\u0acb\3\2\2\2\u0ac6\u0ac7\f\3\2\2"+
		"\u0ac7\u0ac8\7W\2\2\u0ac8\u0aca\5\u01cc\u00e7\2\u0ac9\u0ac6\3\2\2\2\u0aca"+
		"\u0acd\3\2\2\2\u0acb\u0ac9\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u01cb\3\2"+
		"\2\2\u0acd\u0acb\3\2\2\2\u0ace\u0acf\b\u00e7\1\2\u0acf\u0ad0\5\u01ce\u00e8"+
		"\2\u0ad0\u0ad6\3\2\2\2\u0ad1\u0ad2\f\3\2\2\u0ad2\u0ad3\7`\2\2\u0ad3\u0ad5"+
		"\5\u01ce\u00e8\2\u0ad4\u0ad1\3\2\2\2\u0ad5\u0ad8\3\2\2\2\u0ad6\u0ad4\3"+
		"\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u01cd\3\2\2\2\u0ad8\u0ad6\3\2\2\2\u0ad9"+
		"\u0ada\b\u00e8\1\2\u0ada\u0adb\5\u01d0\u00e9\2\u0adb\u0ae1\3\2\2\2\u0adc"+
		"\u0add\f\3\2\2\u0add\u0ade\7a\2\2\u0ade\u0ae0\5\u01d0\u00e9\2\u0adf\u0adc"+
		"\3\2\2\2\u0ae0\u0ae3\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2"+
		"\u01cf\3\2\2\2\u0ae3\u0ae1\3\2\2\2\u0ae4\u0ae5\b\u00e9\1\2\u0ae5\u0ae6"+
		"\5\u01d2\u00ea\2\u0ae6\u0aec\3\2\2\2\u0ae7\u0ae8\f\3\2\2\u0ae8\u0ae9\7"+
		"_\2\2\u0ae9\u0aeb\5\u01d2\u00ea\2\u0aea\u0ae7\3\2\2\2\u0aeb\u0aee\3\2"+
		"\2\2\u0aec\u0aea\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u01d1\3\2\2\2\u0aee"+
		"\u0aec\3\2\2\2\u0aef\u0af0\b\u00ea\1\2\u0af0\u0af1\5\u01d4\u00eb\2\u0af1"+
		"\u0afa\3\2\2\2\u0af2\u0af3\f\4\2\2\u0af3\u0af4\7S\2\2\u0af4\u0af9\5\u01d4"+
		"\u00eb\2\u0af5\u0af6\f\3\2\2\u0af6\u0af7\7V\2\2\u0af7\u0af9\5\u01d4\u00eb"+
		"\2\u0af8\u0af2\3\2\2\2\u0af8\u0af5\3\2\2\2\u0af9\u0afc\3\2\2\2\u0afa\u0af8"+
		"\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb\u01d3\3\2\2\2\u0afc\u0afa\3\2\2\2\u0afd"+
		"\u0afe\b\u00eb\1\2\u0afe\u0aff\5\u01d6\u00ec\2\u0aff\u0b11\3\2\2\2\u0b00"+
		"\u0b01\f\7\2\2\u0b01\u0b02\7N\2\2\u0b02\u0b10\5\u01d6\u00ec\2\u0b03\u0b04"+
		"\f\6\2\2\u0b04\u0b05\7M\2\2\u0b05\u0b10\5\u01d6\u00ec\2\u0b06\u0b07\f"+
		"\5\2\2\u0b07\u0b08\7T\2\2\u0b08\u0b10\5\u01d6\u00ec\2\u0b09\u0b0a\f\4"+
		"\2\2\u0b0a\u0b0b\7U\2\2\u0b0b\u0b10\5\u01d6\u00ec\2\u0b0c\u0b0d\f\3\2"+
		"\2\u0b0d\u0b0e\7$\2\2\u0b0e\u0b10\5\"\22\2\u0b0f\u0b00\3\2\2\2\u0b0f\u0b03"+
		"\3\2\2\2\u0b0f\u0b06\3\2\2\2\u0b0f\u0b09\3\2\2\2\u0b0f\u0b0c\3\2\2\2\u0b10"+
		"\u0b13\3\2\2\2\u0b11\u0b0f\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u01d5\3\2"+
		"\2\2\u0b13\u0b11\3\2\2\2\u0b14\u0b15\b\u00ec\1\2\u0b15\u0b16\5\u01d8\u00ed"+
		"\2\u0b16\u0b26\3\2\2\2\u0b17\u0b18\f\5\2\2\u0b18\u0b19\7N\2\2\u0b19\u0b1a"+
		"\7N\2\2\u0b1a\u0b25\5\u01d8\u00ed\2\u0b1b\u0b1c\f\4\2\2\u0b1c\u0b1d\7"+
		"M\2\2\u0b1d\u0b1e\7M\2\2\u0b1e\u0b25\5\u01d8\u00ed\2\u0b1f\u0b20\f\3\2"+
		"\2\u0b20\u0b21\7M\2\2\u0b21\u0b22\7M\2\2\u0b22\u0b23\7M\2\2\u0b23\u0b25"+
		"\5\u01d8\u00ed\2\u0b24\u0b17\3\2\2\2\u0b24\u0b1b\3\2\2\2\u0b24\u0b1f\3"+
		"\2\2\2\u0b25\u0b28\3\2\2\2\u0b26\u0b24\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27"+
		"\u01d7\3\2\2\2\u0b28\u0b26\3\2\2\2\u0b29\u0b2a\b\u00ed\1\2\u0b2a\u0b2b"+
		"\5\u01da\u00ee\2\u0b2b\u0b34\3\2\2\2\u0b2c\u0b2d\f\4\2\2\u0b2d\u0b2e\7"+
		"[\2\2\u0b2e\u0b33\5\u01da\u00ee\2\u0b2f\u0b30\f\3\2\2\u0b30\u0b31\7\\"+
		"\2\2\u0b31\u0b33\5\u01da\u00ee\2\u0b32\u0b2c\3\2\2\2\u0b32\u0b2f\3\2\2"+
		"\2\u0b33\u0b36\3\2\2\2\u0b34\u0b32\3\2\2\2\u0b34\u0b35\3\2\2\2\u0b35\u01d9"+
		"\3\2\2\2\u0b36\u0b34\3\2\2\2\u0b37\u0b38\b\u00ee\1\2\u0b38\u0b39\5\u01dc"+
		"\u00ef\2\u0b39\u0b45\3\2\2\2\u0b3a\u0b3b\f\5\2\2\u0b3b\u0b3c\7]\2\2\u0b3c"+
		"\u0b44\5\u01dc\u00ef\2\u0b3d\u0b3e\f\4\2\2\u0b3e\u0b3f\7^\2\2\u0b3f\u0b44"+
		"\5\u01dc\u00ef\2\u0b40\u0b41\f\3\2\2\u0b41\u0b42\7b\2\2\u0b42\u0b44\5"+
		"\u01dc\u00ef\2\u0b43\u0b3a\3\2\2\2\u0b43\u0b3d\3\2\2\2\u0b43\u0b40\3\2"+
		"\2\2\u0b44\u0b47\3\2\2\2\u0b45\u0b43\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46"+
		"\u01db\3\2\2\2\u0b47\u0b45\3\2\2\2\u0b48\u0b50\5\u01de\u00f0\2\u0b49\u0b50"+
		"\5\u01e0\u00f1\2\u0b4a\u0b4b\7[\2\2\u0b4b\u0b50\5\u01dc\u00ef\2\u0b4c"+
		"\u0b4d\7\\\2\2\u0b4d\u0b50\5\u01dc\u00ef\2\u0b4e\u0b50\5\u01e2\u00f2\2"+
		"\u0b4f\u0b48\3\2\2\2\u0b4f\u0b49\3\2\2\2\u0b4f\u0b4a\3\2\2\2\u0b4f\u0b4c"+
		"\3\2\2\2\u0b4f\u0b4e\3\2\2\2\u0b50\u01dd\3\2\2\2\u0b51\u0b52\7Y\2\2\u0b52"+
		"\u0b53\5\u01dc\u00ef\2\u0b53\u01df\3\2\2\2\u0b54\u0b55\7Z\2\2\u0b55\u0b56"+
		"\5\u01dc\u00ef\2\u0b56\u01e1\3\2\2\2\u0b57\u0b5e\5\u01e4\u00f3\2\u0b58"+
		"\u0b59\7P\2\2\u0b59\u0b5e\5\u01dc\u00ef\2\u0b5a\u0b5b\7O\2\2\u0b5b\u0b5e"+
		"\5\u01dc\u00ef\2\u0b5c\u0b5e\5\u01ee\u00f8\2\u0b5d\u0b57\3\2\2\2\u0b5d"+
		"\u0b58\3\2\2\2\u0b5d\u0b5a\3\2\2\2\u0b5d\u0b5c\3\2\2\2\u0b5e\u01e3\3\2"+
		"\2\2\u0b5f\u0b62\5\u0176\u00bc\2\u0b60\u0b62\5P)\2\u0b61\u0b5f\3\2\2\2"+
		"\u0b61\u0b60\3\2\2\2\u0b62\u0b67\3\2\2\2\u0b63\u0b66\5\u01e8\u00f5\2\u0b64"+
		"\u0b66\5\u01ec\u00f7\2\u0b65\u0b63\3\2\2\2\u0b65\u0b64\3\2\2\2\u0b66\u0b69"+
		"\3\2\2\2\u0b67\u0b65\3\2\2\2\u0b67\u0b68\3\2\2\2\u0b68\u01e5\3\2\2\2\u0b69"+
		"\u0b67\3\2\2\2\u0b6a\u0b6b\5\u01e4\u00f3\2\u0b6b\u0b6c\7Y\2\2\u0b6c\u01e7"+
		"\3\2\2\2\u0b6d\u0b6e\7Y\2\2\u0b6e\u01e9\3\2\2\2\u0b6f\u0b70\5\u01e4\u00f3"+
		"\2\u0b70\u0b71\7Z\2\2\u0b71\u01eb\3\2\2\2\u0b72\u0b73\7Z\2\2\u0b73\u01ed"+
		"\3\2\2\2\u0b74\u0b75\7\6\2\2\u0b75\u0b76\5\32\16\2\u0b76\u0b77\7\7\2\2"+
		"\u0b77\u0b78\5\u01dc\u00ef\2\u0b78\u0b90\3\2\2\2\u0b79\u0b7a\7\6\2\2\u0b7a"+
		"\u0b7e\5\"\22\2\u0b7b\u0b7d\5> \2\u0b7c\u0b7b\3\2\2\2\u0b7d\u0b80\3\2"+
		"\2\2\u0b7e\u0b7c\3\2\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u0b81\3\2\2\2\u0b80"+
		"\u0b7e\3\2\2\2\u0b81\u0b82\7\7\2\2\u0b82\u0b83\5\u01e2\u00f2\2\u0b83\u0b90"+
		"\3\2\2\2\u0b84\u0b85\7\6\2\2\u0b85\u0b89\5\"\22\2\u0b86\u0b88\5> \2\u0b87"+
		"\u0b86\3\2\2\2\u0b88\u0b8b\3\2\2\2\u0b89\u0b87\3\2\2\2\u0b89\u0b8a\3\2"+
		"\2\2\u0b8a\u0b8c\3\2\2\2\u0b8b\u0b89\3\2\2\2\u0b8c\u0b8d\7\7\2\2\u0b8d"+
		"\u0b8e\5\u01b6\u00dc\2\u0b8e\u0b90\3\2\2\2\u0b8f\u0b74\3\2\2\2\u0b8f\u0b79"+
		"\3\2\2\2\u0b8f\u0b84\3\2\2\2\u0b90\u01ef\3\2\2\2\u0153\u01f4\u01f6\u0208"+
		"\u020c\u0210\u0212\u021e\u0221\u0224\u0231\u0236\u023e\u0240\u0246\u024b"+
		"\u0252\u0256\u025a\u0263\u0267\u026b\u026d\u0273\u0278\u027f\u0284\u0286"+
		"\u028c\u0291\u0296\u029b\u02a6\u02b4\u02b9\u02c1\u02c8\u02ce\u02d3\u02de"+
		"\u02e1\u02ef\u02f4\u02f9\u02fe\u0304\u030e\u0316\u0320\u0328\u0334\u0338"+
		"\u033d\u0343\u034b\u0354\u035f\u037c\u0380\u0385\u038b\u038e\u0391\u039d"+
		"\u03a8\u03b6\u03bd\u03c6\u03cd\u03d2\u03e1\u03e8\u03ee\u03f2\u03f6\u03fa"+
		"\u03fe\u0403\u0407\u040b\u040d\u0412\u0419\u041e\u0420\u0426\u042b\u042f"+
		"\u0442\u0447\u0457\u045c\u0462\u0468\u046a\u046e\u0473\u0477\u047e\u0485"+
		"\u048d\u0490\u0495\u049d\u04a2\u04a9\u04b0\u04b5\u04bb\u04c7\u04cc\u04d0"+
		"\u04da\u04df\u04e7\u04ea\u04ef\u04f7\u04fa\u04ff\u0504\u0509\u050e\u0515"+
		"\u051a\u0522\u0527\u052c\u0531\u0537\u053d\u0540\u0543\u054c\u0552\u0558"+
		"\u055b\u055e\u0566\u056b\u0570\u0576\u0579\u0584\u058d\u0597\u059c\u05a7"+
		"\u05ac\u05b8\u05bd\u05c9\u05d3\u05d8\u05e0\u05e3\u05ea\u05f2\u05f8\u0601"+
		"\u060b\u060f\u0612\u061b\u0629\u062c\u0635\u063a\u0642\u0648\u0650\u065c"+
		"\u0663\u0671\u0687\u06a9\u06b5\u06bb\u06c7\u06d4\u06ee\u06f2\u06f7\u06fb"+
		"\u06ff\u0707\u070b\u070f\u0716\u071f\u0727\u0736\u0742\u0748\u074e\u0763"+
		"\u0768\u076e\u077a\u0785\u078f\u0792\u0797\u07a0\u07a6\u07b0\u07b5\u07be"+
		"\u07d5\u07df\u07f5\u07fc\u0804\u080c\u0817\u082e\u0838\u0843\u0859\u085d"+
		"\u0862\u086a\u0870\u0874\u0878\u087c\u0882\u0887\u088c\u0890\u0894\u089a"+
		"\u089f\u08a4\u08a8\u08ac\u08ae\u08b3\u08b8\u08bd\u08c1\u08c5\u08c9\u08ce"+
		"\u08d6\u08dc\u08e0\u08e4\u08e8\u08ee\u08f3\u08f8\u08fc\u0900\u0902\u0907"+
		"\u0916\u0924\u0930\u0939\u0948\u0955\u095e\u0964\u096b\u0970\u0977\u097c"+
		"\u0983\u0988\u098f\u0994\u099c\u09a1\u09a5\u09a9\u09ae\u09b5\u09bc\u09c1"+
		"\u09c8\u09cd\u09d4\u09d9\u09e1\u09e6\u09ea\u09f1\u09f7\u09fe\u0a05\u0a0c"+
		"\u0a14\u0a1b\u0a23\u0a27\u0a2e\u0a35\u0a3c\u0a44\u0a4b\u0a53\u0a59\u0a5f"+
		"\u0a6b\u0a71\u0a77\u0a82\u0a8b\u0a92\u0a99\u0a9e\u0aa2\u0aab\u0ab6\u0ac0"+
		"\u0acb\u0ad6\u0ae1\u0aec\u0af8\u0afa\u0b0f\u0b11\u0b24\u0b26\u0b32\u0b34"+
		"\u0b43\u0b45\u0b4f\u0b5d\u0b61\u0b65\u0b67\u0b7e\u0b89\u0b8f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}