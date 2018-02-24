import java.io.Serializable;

public abstract class SalesEmployee implements Serializable {

	private String firstName;
	private String lastName;
	private String ppsNumber;

	protected Double sales;
	protected Double commission;

	public SalesEmployee(){ 
		this("Not given", "Not given", "Not given");
	}		
	public SalesEmployee (String firstName, String lastName, String ppsNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.ppsNumber=ppsNumber;
		//Setting up Constructors here
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName){
		this.firstName=firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName){
		this.lastName=lastName;
	}
	public String getppsNumber() {
		return ppsNumber;
	}			
	public void setppsNumber(String ppsNumber){
		this.ppsNumber=ppsNumber;
	}
	// methods (public getters & setter)

	public String toString() {
		return getfirstName() + " " + getlastName() + " " + getppsNumber() + " " + commission;
		// OVERRIDE toString()
	}
	public abstract void calculateCommission(); 
}//End of Main class

