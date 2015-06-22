package ba.bitcamp.train;

public class Rectangle {

	private double length;
	private double width;

	//Constructor for generating length and width from rectangle
	public Rectangle(double length, double width) {
		if (length <= 0 || width <= 0) {
			throw new IllegalArgumentException();
		}
		this.length = length;
		this.width = width;
	}
    //Calculating rectangle circumference
	public double getCircumferenceRectangle() {
		return 2 * (length + width);
	}
    //Calculating rectangle area
	public double getAreaRectangle() {
		return length * width;
	}
}
