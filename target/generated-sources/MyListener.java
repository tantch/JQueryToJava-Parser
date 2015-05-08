
public class MyListener extends HelloBaseListener {
	
	public MyListener(){
		
	}
	
	@Override public void enterStart(HelloParser.StartContext ctx) {
		System.out.println("hehehe");
	}


}
