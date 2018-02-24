
public class Rectangle extends Shapes implements ShapesRelate {
	private double length;
	private double width;

	public Rectangle() {
	}
	//Constructor
	public Rectangle(double length, double width) {
		this.setLength(length);
		this.setWidth(width);
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public void calculateArea() {
		double total = length*width;
		total = area;
	}
	public String toString() {
		return getLength() + " " + getWidth() + " " + getArea();
	}
}
