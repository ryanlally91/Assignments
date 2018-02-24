import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		//Instantiation of 2 new Sales Agents and 2 new Sales Person objects, with names and IDs. 
		SalesAgent lukeKelly = new SalesAgent("Luke", "Kelly", "0987654321F");
		SalesAgent roryGallagher = new SalesAgent("Rory", "Gallagher",  "1234567890F");
		SalesPerson christyMoore = new SalesPerson("Christy", "Moore", "0929283321F");
		SalesPerson phillLynott = new SalesPerson("Phill", "Lynott", "9989994321F");

		// create an array list
		ArrayList<SalesEmployee> empArray = new ArrayList<SalesEmployee>();

		empArray.add(lukeKelly);
		empArray.add(roryGallagher);
		empArray.add(christyMoore);
		empArray.add(phillLynott);

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < empArray.size(); i++) {
			System.out.println("Enter Sale:" );
			empArray.get(i).sales=input.nextDouble();
		}
		//Looping through Employee Array and printing relevant info with the
		//overridden toString and calculateCommission methods.
		for(SalesEmployee i:empArray) {
			i.calculateCommission();
			System.out.println(i.toString());
			System.out.println();		
		} // end for loop

		Serialize(empArray);
		Deserialize(empArray);
		writeFile(empArray);
		readFile(empArray);
	} //end main

	public static void Serialize(ArrayList <SalesEmployee> empArray){
		try {
			// create a connection stream (write bytes)
			FileOutputStream fileStream = new FileOutputStream("EmployeeInfo.dat");
			// create a chain stream (allows objects to be written to a stream)
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			// call writeObject() on the Object stream
			os.writeObject(empArray);
			os.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}// end serialize method


	public static void Deserialize(ArrayList <SalesEmployee> empArray){
		try{
			FileInputStream fileStream = new FileInputStream("EmployeeInfo.dat");

			ObjectInputStream os = new ObjectInputStream(fileStream);

			List<SalesEmployee> emp = (List<SalesEmployee>)os.readObject();
			for (SalesEmployee element:emp){
				System.out.println(element.toString());
			}
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end deserialize method

	public static void writeFile(ArrayList<SalesEmployee> empArray) {
		try {

			FileWriter fileWriter = new FileWriter("EmployeeList.txt");
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write("Employee List \n");
			for(SalesEmployee element : empArray){
				writer.write("Name: " + element.getfirstName() + element.getlastName() + " \n ");
				writer.write("PPS Number: " + element.getppsNumber() + " \n ");
				if (element instanceof SalesPerson){
					writer.write("Commission: " + Double.toString(((SalesPerson)
							element).commission) + " \n ");
				}
				else {
					writer.write("Commission " + Double.toString(((SalesAgent)
							element).commission) + " \n ");
				}
			}//end of for loop

			writer.close();
		} catch(IOException e){
			e.printStackTrace();
		}

	}  // end writeFile method

	public static void readFile(ArrayList <SalesEmployee> empArray) {
		try{
			File employeeFile = new File("EmployeeList.txt");
			FileReader fileReader = new FileReader(employeeFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}// end readFile method
}//end class