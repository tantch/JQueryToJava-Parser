import java.util.ArrayList;


public class StoreDeclaration extends Declaration{

	private Variable outVar;
	private Variable inVarSelector;
	private ArrayList<Selector> selectors;

	public StoreDeclaration(Variable outVar, Variable inVarSelector) {
		super();
		this.outVar = outVar;
		this.inVarSelector = inVarSelector;
		this.selectors = new ArrayList<Selector>();
	}
	/**
	 * @return the outVar
	 */
	public Variable getOutVar() {
		return outVar;
	}
	/**
	 * @return the inVarSelector
	 */
	public Variable getInVarSelector() {
		return inVarSelector;
	}
	/**
	 * @return the selectors
	 */
	public ArrayList<Selector> getSelectors() {
		return selectors;
	}
	
	@Override
	public String getDesc() {
		String tmp= "StoreDeclaration with "+selectors.size()+" selectors\n";
		for (Selector selector : selectors) {
			tmp+=" " + selector.getDesc() + "\n";
		}
		return tmp;
	}
	public void addSelector(Selector sec){
		selectors.add(sec);
	}
}
