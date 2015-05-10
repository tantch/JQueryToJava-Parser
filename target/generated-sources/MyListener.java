import java.util.ArrayList;
import java.util.HashMap;

public class MyListener extends JqueryParserBaseListener {

	private HashMap<String, InOutVar> vars;
	private int curLine;

	public MyListener() {
		vars = new HashMap<String, InOutVar>();
		curLine = 0;
	}

	@Override
	public void enterStart(JqueryParser.StartContext ctx) {

	}

	@Override
	public void exitStart(JqueryParser.StartContext ctx) {

	}

	@Override
	public void enterLine(JqueryParser.LineContext ctx) {
		curLine++;
	};

	@Override
	public void enterInput(JqueryParser.InputContext ctx) {
		String nm = ctx.STRING().getText();
		if (vars.containsKey(nm)) {
			InOutVar temp = vars.get(nm);
			if (temp.isInput()) {
				System.out.println("Warning in line " + curLine + "; Var " + nm
						+ "was already declared as an in variable ");
			} else {
				if (!temp.isUsed()) {
					System.out.println("Warning in line " + curLine + "; Var "
							+ nm
							+ "was never used since the previous declaration");
				} else {
					if(temp.isFull()){
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
	public void exitInput(JqueryParser.InputContext ctx) {
	}

	@Override
	public void enterOutput(JqueryParser.OutputContext ctx) {
		String nm = ctx.STRING().getText();
		if (vars.containsKey(nm)) {
			InOutVar temp = vars.get(nm);
			if (temp.isOutput()) {
				System.out.println("Warning in line " + curLine + "; Var " + nm
						+ "was already declared as an out variable ");
			} else {
				if (!temp.isUsed()) {
					System.out.println("Warning in line " + curLine + "; Var "
							+ nm
							+ "was never used since the previous declaration");
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
	public void exitOutput(JqueryParser.OutputContext ctx) {

	}

	@Override
	public void enterExp(JqueryParser.ExpContext ctx) {
		if (!vars.containsKey(ctx.exp1().ter.getText())) {
			System.out.println("Input variable " + ctx.exp1().ter.getText()
					+ " was not declared.Error in Line " + curLine);
		} else if (!vars.get(ctx.exp1().ter.getText()).isInput()) {
			System.out
					.println("Input variable " + ctx.exp1().ter.getText()
							+ " was declared as an output var.Error in Line "
							+ curLine);
		} else {
			
			vars.get(ctx.exp1().ter.getText()).setAsUsed();
		}
		if (!vars.containsKey(ctx.ter.getText())) {
			System.out.println("Output variable " + ctx.ter.getText()
					+ " was not declared.Error in Line " + curLine);
		} else if (!vars.get(ctx.ter.getText()).isOutput()) {
			System.out.println("Output variable " + ctx.ter.getText()
					+ " was declared as an input var.Error in Line " + curLine);
		} else {
			if(vars.get(ctx.ter.getText()).isFull()){
				System.out.println("Warning in Line " + curLine + " . Previous value of var " + ctx.ter.getText() + " was never used");
			}
			vars.get(ctx.ter.getText()).setAsUsed();
			vars.get(ctx.ter.getText()).setAsFull();
		}

	}

	@Override
	public void exitExp(JqueryParser.ExpContext ctx) {

	}

	@Override
	public void enterExp1(JqueryParser.Exp1Context ctx) {

	}

	@Override
	public void exitExp1(JqueryParser.Exp1Context ctx) {

	}

	@Override
	public void enterBraexp(JqueryParser.BraexpContext ctx) {

	}

	@Override
	public void exitBraexp(JqueryParser.BraexpContext ctx) {

	}
}
