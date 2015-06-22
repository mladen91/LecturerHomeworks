package ba.bitcamp.train;

public class Wagon {

	private Circle wheel;
	private Rectangle platform;

	/**
	 * Creating constructor for wagon parts
	 * 
	 * @param wheel
	 * @param platform
	 */
	public Wagon(Circle wheel, Rectangle platform) {
		this.wheel = wheel;
		this.platform = platform;
	}

	// Calculating wagon area
	public double getWagonArea() {

		return 2 * wheel.getAreaCircle() + platform.getAreaRectangle();
	}

	// Calculating wagon circumference
	public double getWagonCircumference() {

		return 2 * wheel.getCircumferenceCircle()
				+ platform.getCircumferenceRectangle();
	}
}
