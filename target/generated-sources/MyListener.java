
public class MyListener extends HelloBaseListener {
	
	private int cnt;
	private String in, out;
	
	public MyListener(){
		
	}
	
	@Override public void enterStart(HelloParser.StartContext ctx) {
		System.out.println("entering start : " + cnt);
		cnt++;
	}
	
	@Override public void exitStart(HelloParser.StartContext ctx) {
		System.out.println("exiting start : " + cnt);
		cnt++;
	}

	@Override public void enterInput(HelloParser.InputContext ctx) { 
		in = ctx.STRING.getText();
		
	}
	
	@Override public void exitInput(HelloParser.InputContext ctx) { 
		System.out.println("exiting input : " + cnt);
		cnt++;
	}
	
	@Override public void enterOutput(HelloParser.OutputContext ctx) { 
		out = ctx.STRING.getText();
	}
	
	@Override public void exitOutput(HelloParser.OutputContext ctx) { 
		
	}
	
	@Override public void enterExp(HelloParser.ExpContext ctx) { 
		if(!ctx.ter.getText().equals(out) || !ctx.ter1.getText().equals(out))
			System.out.println("'out' expression doesn't match!");
	}
	
	@Override public void exitExp(HelloParser.ExpContext ctx) { 
		
	}
	
	@Override public void enterExp1(HelloParser.Exp1Context ctx) { 
		if(!ctx.STRING().getText().equals(in))
			System.out.println("'in' expression doesn't match!");
	}
	
	@Override public void exitExp1(HelloParser.Exp1Context ctx) { 
		
	}
	
	@Override public void enterBraexp(HelloParser.BraexpContext ctx) {
		
	}

	@Override public void exitBraexp(HelloParser.BraexpContext ctx) {
		
	}
}
