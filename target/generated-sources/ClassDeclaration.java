import java.util.HashMap;

public class ClassDeclaration {

	private String name;
	private HashMap<String, AtribDeclaration> atribs;
	private HashMap<String, MethodDeclaration> methods;

	public ClassDeclaration(String name) {
		this.name = name;
		atribs = new HashMap<String, AtribDeclaration>();
		methods = new HashMap<String, MethodDeclaration>();
	}

	public String getName() {
		return name;
	}

	public void addAtrib(String name, String className, String privacy) {
		atribs.put(name, new AtribDeclaration(name, className, privacy));
		// System.out.println("LOG: atribute of name : " + name +
		// " className : "
		// + className + " privacy : " + privacy);
	}

	public String getAtribClass(String name) {
		if (!atribs.containsKey(name)) {
			return "Object";
		}
		String cls = atribs.get(name).getClassName();
		String[] str = cls.split("<|>");
		return str[str.length - 1];
	}

	public String getAtribPrivacy(String name) {
		return atribs.get(name).getPrivacy();
	}

	public void addMethod(String name, String className, String privacy) {
		methods.put(name, new MethodDeclaration(name, className, privacy));
		// System.out.println("LOG: method of name : " + name + " className : "
		// + className + " privacy : " + privacy);
	}

	public String getMethodReturnClass(String name) {
		if (methods.containsKey(name)) {

			return methods.get(name).getClassReturnName();
		} else {
			return null;
		}
	}

	public String getMethodPrivacy(String name) {
		return methods.get(name).getPrivacy();
	}

	public boolean getIsArray(String name) {
		String cls = atribs.get(name).getClassName();
		String[] str = cls.split("<|>");
		return str.length > 1;
	}
}
