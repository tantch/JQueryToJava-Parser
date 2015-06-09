import java.util.HashMap;

public class MyListener extends JavaParserBaseListener {
	private HashMap<String, InOutVar> vars;
	private HashMap<String, Variable> currentLocalVars;
	private HashMap<String, Variable> classVars;
	private HashMap<String, Variable> argumentVars;
	private String curClass;
	private int errors;
	private int warnings;

	public MyListener() {
		vars = new HashMap<String, InOutVar>();
		currentLocalVars = new HashMap<String, Variable>();
		classVars = new HashMap<String, Variable>();
		argumentVars = new HashMap<String, Variable>();
		Starter.classes = new HashMap<String, ClassDeclaration>();
		errors = 0;
		warnings = 0;
		Starter.classes.put("String",new ClassDeclaration("String"));
		Starter.classes.put("Object",new ClassDeclaration("Object"));
		Starter.classes.put("Integer",new ClassDeclaration("Integer"));
		Starter.classes.put("Double",new ClassDeclaration("Double"));
		Starter.classes.put("Float",new ClassDeclaration("Float"));
		Starter.classes.put("Boolean",new ClassDeclaration("Boolean"));
	}

	private Block currentBlock() {
		return Starter.representation.get(Starter.representation.size() - 1);
	}

	private StoreDeclaration currentStoreDeclaration() {
		return (StoreDeclaration) currentBlock().getDeclarations().get(
				currentBlock().getDeclarations().size() - 1);
	}

	private Selector currentSelector() {
		return currentStoreDeclaration().getSelectors().get(
				currentStoreDeclaration().getSelectors().size() - 1);
	}

	private Variable getVar(String nm) {
		if (currentLocalVars.containsKey(nm)) {
			return currentLocalVars.get(nm);
		}
		if (classVars.containsKey(nm)) {
			return classVars.get(nm);

		}
		if (argumentVars.containsKey(nm)) {
			return argumentVars.get(nm);
		}
		return new Variable(nm, "teste", false);
	}

	// JAVA PART
	@Override
	public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
	}

	@Override
	// only for arraylist and string
	public void exitLocalVariableDeclaration(
			JavaParser.LocalVariableDeclarationContext ctx) {
		try {
			String mainClass = ctx.unannType().unannReferenceType()
					.unannClassOrInterfaceType()
					.unannClassType_lfno_unannClassOrInterfaceType().getText();

			String varName = ctx.variableDeclaratorList().variableDeclarator(0)
					.variableDeclaratorId().getText();
			boolean initialized = ctx.variableDeclaratorList()
					.variableDeclarator(0).ASSIGN() != null;

			String classType = mainClass.split("<|>")[0];
			if (classType.equals("ArrayList") | classType.equals("String")) {
				currentLocalVars.put(varName, new Variable(varName, mainClass,
						initialized));
			}

		} catch (NullPointerException e) {
			return;
		}

	};

	@Override
	public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
		try {
			String mainClass = ctx.unannType().unannReferenceType()
					.unannClassOrInterfaceType()
					.unannClassType_lfno_unannClassOrInterfaceType().getText();

			String varName = ctx.variableDeclaratorList().variableDeclarator(0)
					.variableDeclaratorId().getText();
			boolean initialized = ctx.variableDeclaratorList()
					.variableDeclarator(0).ASSIGN() != null;

			String classType = mainClass.split("<|>")[0];
			if (classType.equals("ArrayList") | classType.equals("String")) {
				classVars.put(varName, new Variable(varName, mainClass,
						initialized));
			}

		} catch (NullPointerException e) {
			return;
		}
	};

	@Override
	public void exitFormalParameterList(
			JavaParser.FormalParameterListContext ctx) {
		try {
			for (int i = 0; i < ctx.formalParameters().formalParameter().size(); i++) {

				try {
					String mainClass = ctx.formalParameters()
							.formalParameter(i).unannType()
							.unannReferenceType().unannClassOrInterfaceType()
							.unannClassType_lfno_unannClassOrInterfaceType()
							.getText();

					String varName = ctx.formalParameters().formalParameter(i)
							.variableDeclaratorId().getText();
					boolean initialized = true;

					String classType = mainClass.split("<|>")[0];
					if (classType.equals("ArrayList")
							| classType.equals("String")) {
						classVars.put(varName, new Variable(varName, mainClass,
								initialized));
					}
				} catch (NullPointerException e) {
					continue;
				}
			}

			String mainClass = ctx.lastFormalParameter().formalParameter()
					.unannType().unannReferenceType()
					.unannClassOrInterfaceType()
					.unannClassType_lfno_unannClassOrInterfaceType().getText();

			String varName = ctx.lastFormalParameter().formalParameter()
					.variableDeclaratorId().getText();
			boolean initialized = true;

			String classType = mainClass.split("<|>")[0];
			if (classType.equals("ArrayList") | classType.equals("String")) {
				classVars.put(varName, new Variable(varName, mainClass,
						initialized));
			}
		} catch (NullPointerException e) {
			System.out.println("error");
			return;
		}
	};

	@Override
	public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		classVars = new HashMap<String, Variable>();
		curClass = ctx.normalClassDeclaration().Identifier().getText();
		Starter.classes.put(curClass, new ClassDeclaration(curClass));
	};

	@Override
	public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
		try {	

			Starter.classes.get(curClass).addAtrib(
					ctx.variableDeclaratorList().variableDeclarator(0)
							.variableDeclaratorId().getText(),
					ctx.unannType().getText(), ctx.fieldModifier(0).getText());

		} catch (NullPointerException e) {
			System.out
					.println("Semantic step of field declaration skipped because of sintax error");
			return;
		}

	};

	@Override
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		argumentVars = new HashMap<String, Variable>();
		vars = new HashMap<String, InOutVar>();

		try {

			Starter.classes.get(curClass).addMethod(
					ctx.methodHeader().methodDeclarator().Identifier()
							.getText(), ctx.methodHeader().result().getText(),
					ctx.methodModifier(0).getText());

		} catch (NullPointerException e) {
			System.out
					.println("Semantic step of method declaration skipped because of sintax error");
			return;
		}

	};

	@Override
	public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
	}

	// JQUERY PART
	@Override
	public void enterStart(JavaParser.StartContext ctx) {
		Starter.representation.add(new Block(ctx.JQUERYBEGIN().getSymbol()
				.getLine(), ctx.JQUERYEND().getSymbol().getLine()));
	}

	@Override
	public void exitStart(JavaParser.StartContext ctx) {
		vars.forEach((k, v) -> printIfNotUsed(k, v));
		System.out.println("Build finished with:");
		System.out.println("\t " + errors + " errors;");
		System.out.println("\t " + warnings + " warnings;");
	}

	private void printIfNotUsed(String k, InOutVar v) {

		if (!v.isUsed()) {
			System.out.println("Var " + k
					+ " is never used after last declaration");
			warnings++;
		}
	}

	@Override
	public void enterLine(JavaParser.LineContext ctx) {
	};

	@Override
	public void enterInput(JavaParser.InputContext ctx) {
		try {

			String nm = ctx.STRING().getText();
			Variable var = null;
			if (currentLocalVars.containsKey(nm)) {
				if (currentLocalVars.get(nm).isArrayList()) {
					var = currentLocalVars.get(nm);
				} else {
					System.out
							.println("Error.Variable being casted as input was not declared as an ArrayList on line: "
									+ ctx.STRING().getSymbol().getLine());
					errors++;
				}

			} else if (classVars.containsKey(nm)) {
				if (classVars.get(nm).isArrayList()) {
					var = classVars.get(nm);
				} else {
					System.out
							.println("Error.Variable being casted as input was not declared as an ArrayList on line: "
									+ ctx.STRING().getSymbol().getLine());
					errors++;
				}

			} else if (argumentVars.containsKey(nm)) {
				if (argumentVars.get(nm).isArrayList()) {
					var = argumentVars.get(nm);
				} else {
					System.out
							.println("Error.Variable being casted as input was not declared as an ArrayList on line: "
									+ ctx.STRING().getSymbol().getLine());
					errors++;
				}

			} else {
				System.out.println("Error. Variable was not declared on line: "
						+ ctx.STRING().getSymbol().getLine());
				errors++;
			}
			LoadVariableDeclaration inpDec;
			if (vars.containsKey(nm)) {
				InOutVar temp = vars.get(nm);
				if (temp.isInput()) {
					inpDec = new LoadVariableDeclaration(
							DeclarationType.REDECLARATION, nm);
					System.out.println("Warning in line "
							+ ctx.STRING().getSymbol().getLine() + "; Var "
							+ nm + "was already declared as an in variable ");
					warnings++;

				} else {
					inpDec = new LoadVariableDeclaration(DeclarationType.REUSE,
							nm);
					if (!temp.isUsed()) {
						System.out
								.println("Warning in line "
										+ ctx.STRING().getSymbol().getLine()
										+ "; Var "
										+ nm
										+ "was never used since the previous declaration");
						warnings++;

					} else {
						if (temp.isFull()) {
							temp.setAsEmpty();
						}
						temp.setAsInput();
					}
				}
			} else {
				inpDec = new LoadVariableDeclaration(DeclarationType.NEW, nm);
				InOutVar temp = new InOutVar(nm);
				temp.setAsInput();
				vars.put(temp.getName(), temp);
			}

			inpDec.setVar(var);
			currentBlock().addDeclaration(inpDec);

		} catch (NullPointerException e) {
			System.out.println("semantic step aborted because of sintax error");
			return;
		}
	}

	@Override
	public void exitInput(JavaParser.InputContext ctx) {
	}

	@Override
	public void enterOutput(JavaParser.OutputContext ctx) {
		try {

			String nm = ctx.STRING().getText();
			Variable var = null;
			if (currentLocalVars.containsKey(nm)) {
				if (currentLocalVars.get(nm).isArrayList()) {
					var = currentLocalVars.get(nm);
				} else {
					System.out
							.println("Error.Variable being casted as output was not declared as an ArrayList on line: "
									+ ctx.STRING().getSymbol().getLine());
					errors++;
				}

			} else if (classVars.containsKey(nm)) {
				if (classVars.get(nm).isArrayList()) {
					var = classVars.get(nm);
				} else {
					System.out
							.println("Error.Variable being casted as output was not declared as an ArrayList on line: "
									+ ctx.STRING().getSymbol().getLine());
					errors++;
				}

			} else if (argumentVars.containsKey(nm)) {
				if (argumentVars.get(nm).isArrayList()) {
					var = argumentVars.get(nm);
				} else {
					System.out
							.println("Error.Variable being casted as output was not declared as an ArrayList on line: "
									+ ctx.STRING().getSymbol().getLine());
					errors++;
				}

			} else {
				System.out
						.println("Warning. Variable was not declared on line: "
								+ ctx.STRING().getSymbol().getLine());
				warnings++;
			}
			StoreVariableDeclaration outDec;

			if (vars.containsKey(nm)) {
				InOutVar temp = vars.get(nm);
				if (temp.isOutput()) {
					outDec = new StoreVariableDeclaration(
							DeclarationType.REDECLARATION, nm);
					System.out.println("Warning in line "
							+ ctx.STRING().getSymbol().getLine() + "; Var "
							+ nm + "was already declared as an out variable ");
					warnings++;

				} else {
					outDec = new StoreVariableDeclaration(
							DeclarationType.REUSE, nm);

					if (!temp.isUsed()) {
						System.out
								.println("Warning in line "
										+ ctx.STRING().getSymbol().getLine()
										+ "; Var "
										+ nm
										+ "was never used since the previous declaration");
						warnings++;

					} else {
						temp.setAsOutput();
					}
				}
			} else {
				outDec = new StoreVariableDeclaration(DeclarationType.NEW, nm);

				InOutVar temp = new InOutVar(nm);
				temp.setAsOutput();
				vars.put(temp.getName(), temp);
			}

			outDec.setVar(var);
			currentBlock().addDeclaration(outDec);
		} catch (NullPointerException e) {
			System.out.println("semantic step aborted because of sintax error");
			return;
		}
	}

	@Override
	public void exitOutput(JavaParser.OutputContext ctx) {

	}

	@Override
	public void enterExp(JavaParser.ExpContext ctx) {
		try {

			Variable var = null;
			Variable inVar = null;
			Variable outVar = null;
			StoreDeclaration dec = null;
			if (!vars.containsKey(ctx.fexp1().ter.getText())) {
				System.out.println("Input variable "
						+ ctx.fexp1().ter.getText()
						+ " was not declared.Error in Line "
						+ ctx.fexp1().ter.getLine());
				errors++;
			} else if (!vars.get(ctx.fexp1().ter.getText()).isInput()) {
				System.out.println("Input variable "
						+ ctx.fexp1().ter.getText()
						+ " was declared as an output var.Error in Line "
						+ ctx.fexp1().ter.getLine());
				errors++;
			} else {
				inVar = getVar(ctx.fexp1().ter.getText());
				vars.get(ctx.fexp1().ter.getText()).setAsUsed();
			}
			if (!vars.containsKey(ctx.ter.getText())) {

				System.out.println("Output variable " + ctx.ter.getText()
						+ " was not declared.Error in Line "
						+ ctx.ter.getLine());
				errors++;
			} else if (!vars.get(ctx.ter.getText()).isOutput()) {

				System.out.println("Output variable " + ctx.ter.getText()
						+ " was declared as an input var.Error in Line "
						+ ctx.ter.getLine());
				errors++;

			} else {
				outVar = getVar(ctx.ter.getText());
				if (vars.get(ctx.ter.getText()).isFull()) {
					System.out.println("Warning in Line " + ctx.ter.getLine()
							+ " . Previous value of var " + ctx.ter.getText()
							+ " was never used");
					warnings++;
				}
				vars.get(ctx.ter.getText()).setAsUsed();
				vars.get(ctx.ter.getText()).setAsFull();
			}
			dec = new StoreDeclaration(outVar, inVar);
			currentBlock().addDeclaration(dec);

		} catch (NullPointerException e) {
			System.out.println("semantic step aborted because of sintax error");
			return;
		}
	}

	@Override
	public void exitExp(JavaParser.ExpContext ctx) {
	}

	@Override
	public void enterExp1(JavaParser.Exp1Context ctx) {
		try {
			String name = ctx.STRING().getText();
			Selector sel = new Selector(name);
			if (ctx.SEP() != null) {
				sel.setPrevSeparator(ctx.SEP().getText());
			}
			currentStoreDeclaration().addSelector(sel);
		} catch (NullPointerException e) {
			System.out.println("semantic step aborted because of sintax error");
			return;
		}

	}

	@Override
	public void enterPsel(JavaParser.PselContext ctx) {
		try {
			FunctionCondition cnd = null;
			if (ctx.PSS() != null) {
			} else {
				cnd = new FunctionCondition(ctx.PPS().getText(), ctx.STRING()
						.getText());
			}
			currentSelector().addCondition(cnd);
		} catch (NullPointerException e) {
			System.out.println("semantic step aborted because of sintax error");
			return;
		}
	};

	@Override
	public void enterBraexp(JavaParser.BraexpContext ctx) {
		try {
			BrackCondition cnd = null;

			cnd = new BrackCondition(ctx.STRING(0).getText(), ctx.STRING(1)
					.getText(), ctx.ops().getText());

			currentSelector().addCondition(cnd);
		} catch (NullPointerException e) {
			System.out.println("semantic step aborted because of sintax error");
			return;
		}
	}

}
