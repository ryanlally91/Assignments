
public class fizzbuzzMain {

	public static void main(String[] args) {			
			
			int currentNumber;
			//int currentNumber = 0; uncomment for while loop
			
			for (currentNumber = 1; currentNumber<=100; currentNumber++) {
					
				if((currentNumber % 3 == 0) && (currentNumber % 5 == 0) ) {
					System.out.println("FizzBuzz");
				}
				else if (currentNumber % 3 == 0){
					System.out.println("Fizz");	
				} else if (currentNumber % 5 == 0) {
					System.out.println("Buzz");
				} 
				else {
					System.out.println(currentNumber);
				} 
				
				
			} // end of for loop 
			
			/*while (currentNumber <= 100) {
				System.out.println(currentNumber);
				
				currentNumber++;				
			}*/
		
	}// end of void main
	
} // end of the fizzbuzz main class
