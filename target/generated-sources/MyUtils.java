public class MyUtils {
	public static String getClassName(String nm) {
		switch (nm) {
		case "int":
			return "Integer";
		case "double":
			return "Double";
		case "float":
			return "Float";
		case "boolean":
			return "Boolean";

		default:
			return "Object";
		}
	}
}
