import java.util.ArrayList;

public class Selector {

	private String name;
	private String prevSeparator;

	/**
	 * @return the prevSeparator
	 */
	public String getPrevSeparator() {
		return prevSeparator;
	}

	/**
	 * @param prevSeparator
	 *            the prevSeparator to set
	 */
	public void setPrevSeparator(String prevSeparator) {
		this.prevSeparator = prevSeparator;
	}

	private ArrayList<SelectorCondition> conds;

	/**
	 * @param name
	 */
	public Selector(String name) {
		this.name = name;
		this.conds = new ArrayList<SelectorCondition>();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the conds
	 */
	public ArrayList<SelectorCondition> getConds() {
		return conds;
	}

	public void addCondition(SelectorCondition cond) {
		conds.add(cond);
	}

	public String getDesc() {
		if (conds.size() > 0) {
			String temp = "This selector has the following conditions : \n";
			for (SelectorCondition selectorCondition : conds) {
				temp +=" " +  selectorCondition.getDesc();
			}
			return temp;
		} else {
			return "Simple selector";
		}
	}

}
