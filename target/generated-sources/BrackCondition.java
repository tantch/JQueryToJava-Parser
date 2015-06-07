public class BrackCondition extends SelectorCondition {
	private String atrib;
	private String val;
	private String op;

	/**
	 * @param atrib
	 * @param val
	 * @param op
	 */
	public BrackCondition(String atrib, String val, String op) {
		this.atrib = atrib;
		this.val = val;
		this.op = op;
	}

	/**
	 * @return the atrib
	 */
	public String getAtrib() {
		return atrib;
	}

	/**
	 * @return the val
	 */
	public String getVal() {
		return val;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SelectorCondition#getDesc()
	 */
	@Override
	public String getDesc() {
		return "Brackets Condition";
	}

}
