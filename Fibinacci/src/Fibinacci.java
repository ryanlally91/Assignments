import java.util.Scanner;
public class Fibinacci 
{
    public static void main(String[] args) 
    {
        int n; 
        int a = 0; 
        int b = 0;
        int c = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = input.nextInt();
        System.out.print("Fibonacci Series:");//Fibonacci series up to value n
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
    }
}