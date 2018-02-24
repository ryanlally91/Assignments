import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketSales {

	public static void main(String[] args) {
		
	
		int seatA;
		int seatB;
     	int seatC;
     	
     	float priceSeatA;
     	float priceSeatB;
     	float priceSeatC;
     	
     	float totalSales;
 
     	
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Enter amount of seat A tickes sold:");
		seatA = input.nextInt();
		
		System.out.print("Enter the cost of ticket:");
		priceSeatA = input.nextFloat();
		
		System.out.print("Enter amount of B tickets sold:");
		seatB = input.nextInt();
		
		System.out.print("Enter the price of B tickets sold:");
		priceSeatB = input.nextFloat();
		
		System.out.print("Enter the amount of tickets C sold:");
		seatC = input.nextInt();
		
		System.out.print("Enter the price of C tickets sold:");
		priceSeatC = input.nextFloat();
		
		totalSales = ((seatA*priceSeatA)+(seatB*priceSeatB)+(seatC*priceSeatC));
     	
		System.out.println("\n\t\tTickets Sold\t Price per Ticket");
		System.out.println("\n\t\t----------\t----------");
		System.out.printf("\nA Tickets:\t%d \t\t %.2f" ,seatA, priceSeatA);
		System.out.printf("\nB Tickets:\t%d \t\t %.2f" ,seatB, priceSeatB);
		System.out.printf("\nC Tickets:\t%d \t\t %.2f" ,seatC, priceSeatC);
		
		System.out.print("\n\n\t Total Sales  €"+totalSales);
		
		
				
	}//End of Main Method
}//End of Class

