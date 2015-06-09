
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
	@Override
	public void processToJava() {
		if(!var.isArrayList()){
			System.out.println("ERROR :  variable is not an arraylist,this error should only happen in semantic part");
			javaCode=null;
			return;
		}
		if(!var.isInitialized()){
			System.out.println("WARNING: arraylist may not have been initialized");
		}
		String str="";
		str+="try{\n";
		str+="\tif("+name+".size() <1){\n";
		str+="\t\tSystem.out.println(\"An empty arraylist cannot be used as an in var\");\n";
		str+="\t\treturn;\n";
		str+="\t}\n";
		str+="}catch (NullPointerException e) {\n";
		str+="\tSystem.out.println(\"ERROR : ArrayList<> "+name+" is null \");\n";
		str+="\tSystem.exit(-1);\n";
		str+="}\n";
		javaCode=str;
		
		System.out.println(str);
	}
	
	
}
