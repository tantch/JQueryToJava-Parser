public class Variable {
	private String name;
	private String classType;
	private String genericType;
	private boolean initialized;

	public Variable(String name, String mainClass, boolean initialized) {
		this.name = name;
		classType = mainClass.split("<|>")[0];
		if (mainClass.split("<|>").length > 1) {
			genericType = mainClass.split("<|>")[1];
		}

		this.initialized = initialized;
		/*System.out.println("created a variable with name : " + name
				+ " of class " + classType + " with initialized: "
				+ initialized);*/
	}

	public boolean isArrayList() {
		return classType.equals("ArrayList");
	}

	public boolean isString() {
		return classType.equals("String");
	}

	public boolean isInitialized() {
		return initialized;
	}
	public String getGenericType(){
		if(genericType ==null){
			return classType;
		}else{
			return genericType;
		}
	}
	public String getName(){
		return name;
	}
}
