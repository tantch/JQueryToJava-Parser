
public class Declaration {
	protected String javaCode;
	
	public String getDesc(){
		return "Declaration";
	}

	public void processToJava() {
		javaCode = "Extendig class problems, this should show up";
	}

	/**
	 * @return the javaCode
	 */
	public String getJavaCode() {
		return javaCode;
	}
}
