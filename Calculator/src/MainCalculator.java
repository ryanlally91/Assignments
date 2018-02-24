import javax.swing.JOptionPane;

public class MainCalculator {

	public static void main(String[] args) {
		
		int UserInput1;
		int UserInput2;
		
		UserInput1 = Integer.parseInt(JOptionPane.showInputDialog(null));
		UserInput2 = Integer.parseInt(JOptionPane.showInputDialog(null));
		//Changes string to int
		
		//System.out.println(UserInput1 + UserInput2);
		//System.out.println(doAddition(UserInput1,UserInput2));
		
		int myAdditionSum = doAddition(UserInput1,UserInput2);
		System.out.println(myAdditionSum);
		//same as System.out.println(doAddition(UserInput1,UserInput2));
					//git
			
	}//end of main void
	
	
	public static int doAddition(int input1, int input2) {
		int sum = input1 + input2;		
		return sum;		
	}

}//end of maincalculator class
