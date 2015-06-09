public class AtribDeclaration {
	private String name;
	private String className;
	private String privacy;

	public AtribDeclaration(String name, String className, String privacy) {
		this.name = name;
		this.className = className;
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
	public String getClassName() {
		return className;
	}

	/**
	 * @return the privacy
	 */
	public String getPrivacy() {
		return privacy;
	}

}
