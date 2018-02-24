import java.util.Scanner;

//http://www.java2s.com/Tutorial/Java/0100__Class-Definition/Recursivefibonaccimethod.htm
public class FibinacciRecursive {

	// recursive declaration of method fibonacci
	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1)) // base cases
			return number;
		else
			// recursion step
			return fibonacci(number - 1) + fibonacci(number - 2);
	}
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		n = input.nextInt();
		for (int counter = 0; counter <= n; counter++)
			System.out.printf("Fibonacci Number, %d is: %d\n", counter, fibonacci(counter));
		//System.out.printf("Fibonacci Number " + n + " is: " + fibonacci(n-1));
	}
}


