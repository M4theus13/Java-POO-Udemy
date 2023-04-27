package entities_exe1;

public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	public double Perimeter() {
		return width * 2.0 + height * 2.0;
	}
	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
