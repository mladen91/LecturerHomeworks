package ba.bitcamp.train;

public class Locomotive {

	private Rectangle platform;
	private Circle wheel;
	private Circle window;
	private Rectangle chimney;

	/**
	 * Creating constructor for locomotive parts
	 * 
	 * @param platform
	 * @param wheel
	 * @param chimney
	 * @param window
	 */
	public Locomotive(Rectangle platform, Circle wheel, Rectangle chimney,
			Circle window) {
		this.platform = platform;
		this.wheel = wheel;
		this.chimney = chimney;
		this.window = window;
	}

	//Calculating locomotive circumference
	public double getLokomotiveCircumference() {

		return 2 * wheel.getCircumferenceCircle()
				+ platform.getCircumferenceRectangle()
				+ chimney.getCircumferenceRectangle() + 2
				* window.getCircumferenceCircle();
	}

	//Calculating locomotive area
	public double getLokomotiveSurface() {

		return 2 * wheel.getAreaCircle() + platform.getAreaRectangle()
				+ chimney.getAreaRectangle() - 2 * window.getAreaCircle();
	}
}
