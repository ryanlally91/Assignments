import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {

		int userCelc;
		int userFah;
		int userTemp;
		int option;
		//Declaring all my vairables
		Scanner input = new Scanner(System.in);
		System.out.print("1. Fahrenheit to Celcius \n2. Celcius to Fahrenheit \n3. Exit \nChoice: ");

		option = input.nextInt();//Taking the option from the user
		do {                     //Using a do while loop to ensure the user is repeatedly asked until exits(opt.3)
			System.out.print("Enter temperature: ");
			userTemp = input.nextInt();//Taking in the temperature to convert

			userCelc =F(userTemp);
			userFah = C(userTemp);
			//Calling my conversion methods to act on the user's temperature

			if(option == 1){ //Option 1 to convert fahrenheit to celcius
				System.out.println(userTemp + " Fahrenheit is " + userCelc + " Celcius");
			}
			if(option == 2){ //Option 2 to convert celcius to fahrenheit
				System.out.println(userTemp + " Celcius is " + userFah + " Fahrenheit");
			}
			System.out.print("\n1. Fahrenheit to Celcius \n2. Celcius to Fahrenheit \n3. Exit \nChoice: ");

			option = input.nextInt();
		}while(option != 3); {  //The while condition which terminates the program
			System.out.println("Program Terminated");}
		System.exit(0);
	}
	public static int F(int t) { 
		return (int)( 5.0/9.0*(t-32));
	}
	public static int C(int t ) {
		return (int)(9.0/5.0*t+32); 
		// My methods (F & C) which themselves carry out the actual conversion formula on the User Temperature
	}
}