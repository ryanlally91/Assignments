
public abstract class Shapes implements ShapesRelate {

	protected double area;

	public Shapes() {
	}
	public double getArea() {
		return area;
	}
	public void Shapes (Double area){
		this.area=area;
	}
	//Setting up Constructors here
	/*	public double area() {
		return area;
	}*/
	
	//This method compare to shapes objects using the interface ShapesRelate 
	public int compareShapes(ShapesRelate other) { 

		Shapes s1 = (Shapes)other; 

		if (this.getArea() < s1.getArea()) { 
			return -1; 
		}
		else if (this.getArea() > s1.getArea()){ 
			return 1; 
		}
		else
		{ 
			return 0; 
		} 
	} 
	public abstract void calculateArea(); 
}//End of Main Class


