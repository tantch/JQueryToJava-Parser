
public class LoadVariableDeclaration extends Declaration{
	
	private String name;
	private boolean redeclaration;
	private Variable var;


	public LoadVariableDeclaration(DeclarationType type, String nm) {
		this.name=nm;
		
		switch (type) {
		case NEW:
			redeclaration=false;
			break;
		case REDECLARATION:
			redeclaration=true;
			break;
		case REUSE:
			redeclaration=true;
			break;
		default:
			break;
		}
	}
	


	public void setVar(Variable var2) {
		this.var=var2;
	}

	@Override
	public String getDesc() {
		return "LoadVariable";
	
	}
	
	
	
}
