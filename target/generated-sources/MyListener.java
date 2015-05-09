import java.util.ArrayList;


public class MyListener extends JqueryBaseListener {

	
	private ArrayList<String> in, out;
	
	public MyListener(){
		in = new ArrayList<String>();
		out = new ArrayList<String>();
		
	}
	
	@Override public void enterStart(JqueryParser.StartContext ctx) {
		
	}
	
	@Override public void exitStart(JqueryParser.StartContext ctx) {
		
	}

	@Override public void enterInput(JqueryParser.InputContext ctx) { 
		in.add(ctx.STRING().getText());
		
	}
	
	@Override public void exitInput(JqueryParser.InputContext ctx) { 
	}
	
	@Override public void enterOutput(JqueryParser.OutputContext ctx) { 
		out.add(ctx.STRING().getText());
	}
	
	@Override public void exitOutput(JqueryParser.OutputContext ctx) { 
		
	}
	
	@Override public void enterExp(JqueryParser.ExpContext ctx) {
		if(!in.contains(ctx.exp1().ter.getText()) ){
			System.out.println("Input variable " + ctx.exp1().ter.getText() + " was not declared" );			
		}
		if(!out.contains(ctx.ter.getText()))
			System.out.println("Output variable " + ctx.ter.getText() + " was not declared" );			
	}
	
	@Override public void exitExp(JqueryParser.ExpContext ctx) { 
		
	}
	
	@Override public void enterExp1(JqueryParser.Exp1Context ctx) { 
		
	}
	
	@Override public void exitExp1(JqueryParser.Exp1Context ctx) { 
		
	}
	
	@Override public void enterBraexp(JqueryParser.BraexpContext ctx) {
		
	}

	@Override public void exitBraexp(JqueryParser.BraexpContext ctx) {
		
	}
}
