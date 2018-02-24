import java.util.Scanner;

public class SalesPerson extends SalesEmployee {

	public SalesPerson() {
	}
	//Constructor
	public SalesPerson(String firstName, String lastName, String ppsNumber) {
		this.setfirstName(firstName);
		this.setlastName(lastName);
		this.setppsNumber(ppsNumber);
	}
	//SalesPerson commission is 15%
	public void calculateCommission() {

		double total = (sales * 0.15);
		commission = total;
	}
}
