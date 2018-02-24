import java.util.ArrayList;
import java.util.List;
public class Driver {
	public static void main(String[] args) {

		Circle s1 = new Circle(5.5);
		Circle s2 = new Circle(6.6);
		Rectangle s3 = new Rectangle(1.1, 2.2);
		Rectangle s4 = new Rectangle(3.3, 4.4);
		//testing the constructor, will it take expected arguments

		ArrayList<Shapes> ShapesList = new ArrayList<>( );
		//Creating an array list to store the newly declared shapes objects

		ShapesList.add(s1);
		ShapesList.add(s2);
		ShapesList.add(s3);
		ShapesList.add(s4);		
		//Adding the shapes objects to the array list
	}


		public static Shapes largestShape(List <Shapes> ShapesList) {
		Shapes largestShape = null;
		return largestShape;     
	}
	public static Shapes largestShape(List <Shapes> ShapesList) {
		for (int i = 0; i < ShapesList.size(); i++) {
			for (int j = i+1; j < ShapesList.size(); j++) {
				// compare list.get(i) and list.get(j)
/*				public static Shapes largestShape(List <Shapes> ShapesList) {
					Shapes largestShape = null;
					return largestShape; */

					System.out.println("The largest shape based on area is : " + largestShape(ShapesList).toString()); 
				}
			}
		}
	}


