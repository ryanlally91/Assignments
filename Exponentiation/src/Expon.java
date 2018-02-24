
import java.util.Scanner;
public class Expon {

	public static void main(String[] args) {

		int x;
		int n;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		x = input.nextInt();
		System.out.print("Enter Exponient: ");
		n = input.nextInt();

		System.out.println(Power(x,n));
	}

	public static int Power (int x, int n){
		if (n < 0) {
			System.out.println("n<0");
			return Power(1/x, -n);
		}
		else if(n == 1) {
			System.out.println("n-1 (Base Case)");
			return(x);
		}
		else if (n == 0) {
			System.out.println("n=0");
			return 1;
		}	
		else if (n % 2 == 0) {
			System.out.println("Calling 'if even' function: ");
			//System.out.println(Power(x * x, n / 2));
			return Power(x * x, n / 2);		
		}	
		else {
			System.out.println("Calling 'if odd' function: ");
			//System.out.println(x * Power(x * x, (n - 1) / 2));
			return x * Power(x * x, (n - 1) / 2);		
		}
	}
}

