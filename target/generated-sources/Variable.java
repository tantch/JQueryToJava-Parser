import java.util.ArrayList;

public class Variable {
	private String name;
	private String classType;
	private String genericType;
	private boolean initialized;

	public Variable(String name, String mainClass, boolean initialized) {
		this.name = name;
		String classType = mainClass.split("<|>")[0];
		if (mainClass.split("<|>").length > 2) {
			genericType = mainClass.split("<|>")[1];
		}

		this.initialized = initialized;
		System.out.println("created a variable with name : " + name
				+ " of class " + classType + " with initialized: "
				+ initialized);
	}

}
