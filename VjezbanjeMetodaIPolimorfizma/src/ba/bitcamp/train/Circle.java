package ba.bitcamp.train;

public class Circle {

	private double radius;

	// Constructor that generates circle diameter
	public Circle(double radius) {
		this.radius = radius;
	}

	// Calculating circle area
	public double getAreaCircle() {
		return radius * radius * Math.PI;
	}

	// Calculating circumference circle
	public double getCircumferenceCircle() {
		return 2 * radius * Math.PI;
	}
}
