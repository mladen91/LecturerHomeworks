package ba.bitcamp.train;

public class Square {

	private double length;
	
	//Constructor for square side length
	public Square(double length) {
		if(length<=0){
			throw new IllegalArgumentException("Square side can't be negative.");
		}		
		this.length = length;
	}
    //Calculating circumference of square
	public double getCircumferenceSquare() {
		return 4 * length;
	}
    //Calculating area of square
	public double getAreaSquare() {
		return length * length;
	}
}
