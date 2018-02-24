import java.util.ArrayList;
import java.util.LinkedList;

public class Collection 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		for(int i=0; i < 5; i++) 
			//Using a For loop to populate the ArrayList of size 5
		{
			list.add((int)(Math.random()*100));
			//This is an example of Autoboxing
		}

		for ( Integer value: list )
			System.out.println(value);
		//This is Autounboxing
		//Using an enhanced for loop to Display the contents of the array
		
		list.remove(1); 
		{  //Removing the 2nd number in the array (at index 1)
			
			for ( Integer value: list )
				System.out.println(value);
			/*This is Autounboxing
			 *Using an enhanced for loop again to display
			 *the array menus the one removed index
			 */
		}	
	}
}	
