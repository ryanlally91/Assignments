import java.util.Scanner;
public class ExponTwo {

	public static void main(String[] args) {

		//int x = 3;
		//int n = 3;
		
       // Scanner input = new Scanner(System.in);
        //System.out.print("Enter Number: ");
       // x = input.nextInt();
        
       // System.out.print("Enter Exponient: ");
		//n = input.nextInt();
		
		//Power(x,n);
	//}
		
	//public static int Power (int a, int b){
			
		int x;
		int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        x = input.nextInt();
        
        System.out.print("Enter Exponient: ");
		n = input.nextInt();

		if(n == 1) {
			System.out.println(n);
		
		}
		if (n % 2 == 0) {
			System.out.println(x * (x * (n / 2)));
			
		}
		else {
			System.out.println(x * (x * ((n - 1) / 2)));
		}	
	}
}
