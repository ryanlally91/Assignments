import java.util.Scanner;

public class SalesAgent extends SalesEmployee{

	public SalesAgent() {
	}
	//Constructor
	public SalesAgent(String firstName, String lastName, String ppsNumber) {
		this.setfirstName(firstName);
		this.setlastName(lastName);
		this.setppsNumber(ppsNumber);
	}

	//SalesAgent commission is 10%
	public void calculateCommission() {

		double total = (sales * 0.10);
		commission = total;
	}
}