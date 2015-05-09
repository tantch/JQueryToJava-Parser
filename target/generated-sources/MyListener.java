
public class MyListener extends HelloBaseListener {

	
	private int cnt;
	private String in, out;
	
	public MyListener(){
		
	}
	
	@Override public void enterStart(HelloParser.StartContext ctx) {
		
	}
	
	@Override public void exitStart(HelloParser.StartContext ctx) {
		
	}

	@Override public void enterInput(HelloParser.InputContext ctx) { 
		in = ctx.STRING.getText();
		
	}
	
	@Override public void exitInput(HelloParser.InputContext ctx) { 
	}
	
	@Override public void enterOutput(HelloParser.OutputContext ctx) { 
		out = ctx.STRING.getText();
	}
	
	@Override public void exitOutput(HelloParser.OutputContext ctx) { 
		
	}
	
	@Override public void enterExp(HelloParser.ExpContext ctx) {
		System.out.println(out);
		System.out.println(ctx.ter.getText());
		System.out.println(ctx.exp1().ter.getText());
		System.out.println(in);
		if(!ctx.exp1().ter.getText().equals(in)){
			System.out.println("'in' expression doesn't match! Should be '" + in + "' but is '" + ctx.exp1().ter.getText() + "'");			
		}
		if(!ctx.ter.getText().equals(out))
			System.out.println("'out' expression doesn't match! Should be '" + out + "' but is '" + ctx.ter.getText() + "'");
	}
	
	@Override public void exitExp(HelloParser.ExpContext ctx) { 
		
	}
	
	@Override public void enterExp1(HelloParser.Exp1Context ctx) { 
		
	}
	
	@Override public void exitExp1(HelloParser.Exp1Context ctx) { 
		
	}
	
	@Override public void enterBraexp(HelloParser.BraexpContext ctx) {
		
	}

	@Override public void exitBraexp(HelloParser.BraexpContext ctx) {
		
	}
}
