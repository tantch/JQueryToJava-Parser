import java.util.ArrayList;

public class Selector {

	private String name;
	private String prevSeparator;
	private ArrayList<SelectorCondition> conds;

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
	public String getName(String className) {
		if(Starter.classes.get(className).getAtribPrivacy(name).equals("public")){
		return name;
		}
		else{
			String temp=  "get"+name.substring(0, 1).toUpperCase() + name.substring(1);
			if(Starter.classes.get(className).getMethodReturnClass(temp) ==null){
				System.out.println("ERROR: Class "+className+" has private atributes with no default getter for use");
			}
			return temp+"()";
			
		}
	}
	public String getName(){
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
