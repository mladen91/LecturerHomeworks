package ba.bitcamp.train;

public class Train {

	private Locomotive locomotive;
	private Wagon[] wagons;
	private double area;
	private double circumference;

	/**
	 * Creating constructor for train parts
	 * 
	 * @param locomotive
	 * @param wagons
	 * @param area
	 * @param circumference
	 */
	public Train(Locomotive locomotive, Wagon[] wagons) {
		super();
		this.locomotive = locomotive;
		this.wagons = wagons;
	}

	// Calculating train area
	public double getTrainArea() {
		area = locomotive.getLokomotiveSurface();
		for (int i = 0; i < wagons.length; i++) {
			area += wagons[i].getWagonArea();
		}
		return area;

	}

	// Calculating train circumference
	public double getTrainCircumference() {
		circumference = locomotive.getLokomotiveCircumference();
		for (int i = 0; i < wagons.length; i++) {
			circumference += wagons[i].getWagonCircumference();
		}
		return circumference;
	}
}
