
public class Circle extends Shapes implements ShapesRelate{
	private double radius;
	private double PI;

	public Circle() {
	}
	//Constructor
	public Circle(double radius) {
		this.setRadius(radius);

	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}

	public void calculateArea() {
		double total = PI*radius*radius;
		total = area;
	}
	public String toString() {
		return getRadius() + " " + getArea();
	}
}

