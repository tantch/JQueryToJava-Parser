public class MethodDeclaration {
	private String name;
	private String classReturnName;
	private String privacy;

	public MethodDeclaration(String name, String className, String privacy) {
		this.name = name;
		this.classReturnName = className;
		this.privacy = privacy;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the className
	 */
	public String getClassReturnName() {
		return classReturnName;
	}

	/**
	 * @return the privacy
	 */
	public String getPrivacy() {
		return privacy;
	}

}
