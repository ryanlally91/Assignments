import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		
		
		int year;
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter Year:");
		year = input.nextInt();


		if ((year % 4 == 0) && (year % 100 != 0))
		{
            System.out.println("Leap Year");
            
        }else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("Leap Year");
            
        } else {
            System.out.println("Not Leap Year");
        }
		
	}

}
