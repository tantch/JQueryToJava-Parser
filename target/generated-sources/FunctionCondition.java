public class FunctionCondition extends SelectorCondition {
	private String arg;
	private String name;
	public FunctionCondition(String name, String arg) {
		this.name = name;
		switch (name) {
		case ":even":
		case ":first":
		case ":odd":
		case ":last":
			this.arg = "nothing";
			break;
		case ":not":
		case ":contains":
		case ":eq":
		case ":lt":
		case ":gt":
			this.arg = arg;
			break;
		default:
			System.out.println("Selector not recognized");
			break;
		}
	}

	@Override
	public String getDesc() {
		return "Function";
	}
	public String  getName(){
		return name;
	}
	public String getArg(){
		return arg;
	}

}
