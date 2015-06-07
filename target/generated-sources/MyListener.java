import java.util.HashMap;

public class MyListener extends JavaParserBaseListener {
	private HashMap<String, InOutVar> vars;
	private HashMap<String, Variable> currentLocalVars;
	private HashMap<String, Variable> classVars;
	private HashMap<String, Variable> argumentVars;
	private int errors;
	private int warnings;

	public MyListener() {
		vars = new HashMap<String, InOutVar>();
		currentLocalVars = new HashMap<String, Variable>();
		classVars = new HashMap<String, Variable>();
		argumentVars = new HashMap<String, Variable>();
		errors = 0;
		warnings = 0;
	}

	// JAVA PART
	@Override
	public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
		System.out.println("entering");
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

			String mainClass = ctx.lastFormalParameter().formalParameter().unannType()
					.unannReferenceType().unannClassOrInterfaceType()
					.unannClassType_lfno_unannClassOrInterfaceType().getText();

			String varName = ctx.lastFormalParameter().formalParameter().variableDeclaratorId()
					.getText();
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
	};

	@Override
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		classVars = new HashMap<String, Variable>();
		argumentVars = new HashMap<String, Variable>();
	};

	@Override
	public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
		System.out.println("exiting");
	}

	// JQUERY PART
	@Override
	public void enterStart(JavaParser.StartContext ctx) {

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
		String nm = ctx.STRING().getText();
		if (vars.containsKey(nm)) {
			InOutVar temp = vars.get(nm);
			if (temp.isInput()) {
				System.out.println("Warning in line "
						+ ctx.STRING().getSymbol().getLine() + "; Var " + nm
						+ "was already declared as an in variable ");
				warnings++;

			} else {
				if (!temp.isUsed()) {
					System.out.println("Warning in line "
							+ ctx.STRING().getSymbol().getLine() + "; Var "
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

			InOutVar temp = new InOutVar(nm);
			temp.setAsInput();
			vars.put(temp.getName(), temp);
		}
	}

	@Override
	public void exitInput(JavaParser.InputContext ctx) {
	}

	@Override
	public void enterOutput(JavaParser.OutputContext ctx) {
		String nm = ctx.STRING().getText();
		if (vars.containsKey(nm)) {
			InOutVar temp = vars.get(nm);
			if (temp.isOutput()) {
				System.out.println("Warning in line "
						+ ctx.STRING().getSymbol().getLine() + "; Var " + nm
						+ "was already declared as an out variable ");
				warnings++;

			} else {
				if (!temp.isUsed()) {
					System.out.println("Warning in line "
							+ ctx.STRING().getSymbol().getLine() + "; Var "
							+ nm
							+ "was never used since the previous declaration");
					warnings++;

				} else {
					temp.setAsOutput();
				}
			}
		} else {

			InOutVar temp = new InOutVar(nm);
			temp.setAsOutput();
			vars.put(temp.getName(), temp);
		}
	}

	@Override
	public void exitOutput(JavaParser.OutputContext ctx) {

	}

	@Override
	public void enterExp(JavaParser.ExpContext ctx) {
		if (!vars.containsKey(ctx.exp1().ter.getText())) {
			System.out.println("Input variable " + ctx.exp1().ter.getText()
					+ " was not declared.Error in Line "
					+ ctx.exp1().ter.getLine());
			errors++;
		} else if (!vars.get(ctx.exp1().ter.getText()).isInput()) {
			System.out.println("Input variable " + ctx.exp1().ter.getText()
					+ " was declared as an output var.Error in Line "
					+ ctx.exp1().ter.getLine());
			errors++;
		} else {

			vars.get(ctx.exp1().ter.getText()).setAsUsed();
		}
		if (!vars.containsKey(ctx.ter.getText())) {
			System.out.println("Output variable " + ctx.ter.getText()
					+ " was not declared.Error in Line " + ctx.ter.getLine());
			errors++;
		} else if (!vars.get(ctx.ter.getText()).isOutput()) {
			System.out.println("Output variable " + ctx.ter.getText()
					+ " was declared as an input var.Error in Line "
					+ ctx.ter.getLine());
			errors++;

		} else {
			if (vars.get(ctx.ter.getText()).isFull()) {
				System.out.println("Warning in Line " + ctx.ter.getLine()
						+ " . Previous value of var " + ctx.ter.getText()
						+ " was never used");
				warnings++;
			}
			vars.get(ctx.ter.getText()).setAsUsed();
			vars.get(ctx.ter.getText()).setAsFull();
		}

	}

	@Override
	public void exitExp(JavaParser.ExpContext ctx) {

	}

	@Override
	public void enterExp1(JavaParser.Exp1Context ctx) {

	}

	@Override
	public void exitExp1(JavaParser.Exp1Context ctx) {

	}

	@Override
	public void enterBraexp(JavaParser.BraexpContext ctx) {

	}

	@Override
	public void exitBraexp(JavaParser.BraexpContext ctx) {

	}
}
