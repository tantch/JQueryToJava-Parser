// Generated from JqueryParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JqueryParser}.
 */
public interface JqueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JqueryParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(JqueryParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(JqueryParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JqueryParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JqueryParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#jq}.
	 * @param ctx the parse tree
	 */
	void enterJq(JqueryParser.JqContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#jq}.
	 * @param ctx the parse tree
	 */
	void exitJq(JqueryParser.JqContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(JqueryParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(JqueryParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(JqueryParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(JqueryParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(JqueryParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(JqueryParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(JqueryParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(JqueryParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(JqueryParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(JqueryParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#braexp}.
	 * @param ctx the parse tree
	 */
	void enterBraexp(JqueryParser.BraexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#braexp}.
	 * @param ctx the parse tree
	 */
	void exitBraexp(JqueryParser.BraexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#psel}.
	 * @param ctx the parse tree
	 */
	void enterPsel(JqueryParser.PselContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#psel}.
	 * @param ctx the parse tree
	 */
	void exitPsel(JqueryParser.PselContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JqueryParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JqueryParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JqueryParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JqueryParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JqueryParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JqueryParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JqueryParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JqueryParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JqueryParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JqueryParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JqueryParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JqueryParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JqueryParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JqueryParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JqueryParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JqueryParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JqueryParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JqueryParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(JqueryParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(JqueryParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(JqueryParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(JqueryParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JqueryParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JqueryParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(JqueryParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(JqueryParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(JqueryParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(JqueryParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JqueryParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JqueryParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JqueryParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JqueryParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JqueryParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JqueryParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JqueryParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JqueryParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(JqueryParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(JqueryParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JqueryParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JqueryParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JqueryParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JqueryParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JqueryParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JqueryParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JqueryParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JqueryParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JqueryParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JqueryParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JqueryParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JqueryParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JqueryParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JqueryParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JqueryParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JqueryParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JqueryParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JqueryParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JqueryParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JqueryParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JqueryParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JqueryParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JqueryParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JqueryParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JqueryParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JqueryParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JqueryParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JqueryParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JqueryParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JqueryParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JqueryParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JqueryParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JqueryParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JqueryParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JqueryParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JqueryParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JqueryParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JqueryParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JqueryParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JqueryParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JqueryParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JqueryParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JqueryParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JqueryParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JqueryParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JqueryParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JqueryParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JqueryParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JqueryParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JqueryParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JqueryParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JqueryParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JqueryParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JqueryParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(JqueryParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(JqueryParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(JqueryParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(JqueryParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JqueryParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JqueryParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JqueryParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JqueryParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JqueryParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JqueryParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JqueryParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JqueryParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JqueryParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JqueryParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JqueryParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JqueryParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JqueryParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JqueryParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JqueryParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JqueryParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JqueryParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JqueryParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JqueryParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JqueryParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JqueryParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JqueryParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JqueryParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JqueryParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JqueryParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JqueryParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JqueryParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JqueryParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(JqueryParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(JqueryParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(JqueryParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(JqueryParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(JqueryParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(JqueryParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(JqueryParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(JqueryParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(JqueryParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(JqueryParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(JqueryParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(JqueryParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(JqueryParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(JqueryParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JqueryParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JqueryParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JqueryParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JqueryParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JqueryParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JqueryParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JqueryParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JqueryParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JqueryParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JqueryParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JqueryParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JqueryParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JqueryParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JqueryParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JqueryParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JqueryParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JqueryParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JqueryParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JqueryParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JqueryParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JqueryParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JqueryParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JqueryParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JqueryParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JqueryParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JqueryParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JqueryParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JqueryParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JqueryParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JqueryParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JqueryParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JqueryParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JqueryParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JqueryParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(JqueryParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(JqueryParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JqueryParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JqueryParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JqueryParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JqueryParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JqueryParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JqueryParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JqueryParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JqueryParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JqueryParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JqueryParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JqueryParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JqueryParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JqueryParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JqueryParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JqueryParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JqueryParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JqueryParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JqueryParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JqueryParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JqueryParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JqueryParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JqueryParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JqueryParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JqueryParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JqueryParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JqueryParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JqueryParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JqueryParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JqueryParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JqueryParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JqueryParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JqueryParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JqueryParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JqueryParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JqueryParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JqueryParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JqueryParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JqueryParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JqueryParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JqueryParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JqueryParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JqueryParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JqueryParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JqueryParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JqueryParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JqueryParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JqueryParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JqueryParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JqueryParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JqueryParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JqueryParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JqueryParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(JqueryParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(JqueryParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JqueryParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JqueryParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JqueryParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JqueryParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JqueryParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JqueryParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JqueryParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JqueryParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JqueryParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JqueryParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JqueryParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JqueryParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JqueryParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JqueryParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JqueryParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JqueryParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JqueryParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JqueryParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JqueryParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JqueryParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JqueryParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JqueryParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JqueryParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JqueryParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JqueryParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JqueryParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JqueryParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JqueryParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JqueryParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JqueryParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JqueryParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JqueryParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JqueryParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JqueryParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JqueryParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JqueryParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JqueryParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JqueryParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JqueryParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JqueryParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JqueryParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JqueryParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JqueryParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JqueryParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(JqueryParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(JqueryParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JqueryParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JqueryParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JqueryParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JqueryParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JqueryParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JqueryParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(JqueryParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(JqueryParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(JqueryParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(JqueryParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(JqueryParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(JqueryParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JqueryParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JqueryParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JqueryParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JqueryParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JqueryParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JqueryParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JqueryParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JqueryParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JqueryParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JqueryParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JqueryParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JqueryParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JqueryParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JqueryParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(JqueryParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(JqueryParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JqueryParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JqueryParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JqueryParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JqueryParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JqueryParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JqueryParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JqueryParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JqueryParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(JqueryParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(JqueryParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JqueryParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JqueryParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JqueryParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JqueryParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JqueryParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JqueryParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JqueryParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JqueryParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(JqueryParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(JqueryParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JqueryParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JqueryParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JqueryParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JqueryParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JqueryParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JqueryParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JqueryParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JqueryParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JqueryParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JqueryParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JqueryParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JqueryParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JqueryParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JqueryParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JqueryParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JqueryParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(JqueryParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(JqueryParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JqueryParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JqueryParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(JqueryParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(JqueryParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(JqueryParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(JqueryParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JqueryParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JqueryParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JqueryParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JqueryParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JqueryParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JqueryParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JqueryParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JqueryParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JqueryParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JqueryParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(JqueryParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(JqueryParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(JqueryParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(JqueryParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(JqueryParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(JqueryParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JqueryParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JqueryParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JqueryParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JqueryParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(JqueryParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(JqueryParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JqueryParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JqueryParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JqueryParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JqueryParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JqueryParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JqueryParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(JqueryParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(JqueryParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(JqueryParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(JqueryParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JqueryParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JqueryParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JqueryParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JqueryParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(JqueryParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(JqueryParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(JqueryParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(JqueryParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JqueryParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JqueryParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(JqueryParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(JqueryParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(JqueryParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(JqueryParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JqueryParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JqueryParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(JqueryParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(JqueryParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(JqueryParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(JqueryParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JqueryParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JqueryParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JqueryParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JqueryParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(JqueryParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(JqueryParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(JqueryParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(JqueryParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JqueryParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JqueryParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JqueryParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JqueryParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JqueryParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JqueryParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JqueryParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JqueryParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JqueryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JqueryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JqueryParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JqueryParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JqueryParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JqueryParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(JqueryParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(JqueryParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JqueryParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JqueryParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JqueryParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JqueryParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JqueryParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JqueryParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JqueryParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JqueryParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JqueryParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JqueryParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JqueryParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JqueryParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JqueryParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JqueryParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JqueryParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JqueryParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JqueryParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JqueryParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JqueryParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JqueryParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JqueryParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JqueryParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JqueryParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JqueryParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JqueryParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JqueryParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JqueryParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JqueryParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JqueryParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JqueryParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JqueryParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JqueryParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JqueryParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JqueryParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JqueryParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JqueryParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JqueryParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JqueryParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JqueryParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JqueryParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JqueryParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JqueryParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JqueryParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JqueryParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(JqueryParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(JqueryParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JqueryParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JqueryParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(JqueryParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(JqueryParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JqueryParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JqueryParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JqueryParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JqueryParser.CastExpressionContext ctx);
}