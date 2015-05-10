
public class InOutVar {

	private String name;
	private boolean in;
	private boolean used;
	private boolean full;
	
	public InOutVar(String name){
		this.name=name;
		used=false;
		in=false;
		full=false;
	}
	@Override
	public boolean equals(Object obj) {
		return name.equals((String) obj);
	}
	
	public boolean isInput(){
		return in;
	}
	public boolean isOutput(){
		return !in;
	}
	public void setAsInput(){
		in=true;
		used=false;
	}
	public void setAsOutput(){
		in=false;
		used=false;
	}
	public void setAsUsed(){
		used=true;
	}
	public void setAsFull(){
		full=true;
	}
	public void setAsEmpty(){
		full=false;
	}
	public boolean isUsed(){
		return used;
	}
	public String getName(){
		return name;
	}
	public boolean isFull(){
		return full;
	}
}
