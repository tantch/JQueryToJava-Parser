public class StoreVariableDeclaration extends Declaration {
	private String name;
	private boolean redeclaration;
	private Variable var;

	public StoreVariableDeclaration(DeclarationType type, String nm) {
		this.name = nm;

		switch (type) {
		case NEW:
			redeclaration = false;
			break;
		case REDECLARATION:
			redeclaration = true;
			break;
		case REUSE:
			redeclaration = true;
			break;
		default:
			break;
		}
	}

	public void setVar(Variable var2) {
		this.var = var2;
	}

	@Override
	public String getDesc() {
		return "StoreVariable";

	}

	@Override
	public void processToJava() {
		String str = "";
		if (var != null) {
			if (!var.isArrayList()) {
				System.out
						.println("ERROR :  variable is not an arraylist,this error should only happen in semantic part");
				javaCode = null;
				return;
			}

			if (!var.isInitialized()) {
				str += name + " = new ArrayList<" + var.getGenericType()
						+ ">();\n";
			}
			var = new Variable(name, "ArrayList<?>", true);
		} else {
			str += "ArrayList<Object> " + name + " = new ArrayList<Object>();\n";
		}
		str += "\n";
		javaCode = str;

		System.out.println(str);
	}

}