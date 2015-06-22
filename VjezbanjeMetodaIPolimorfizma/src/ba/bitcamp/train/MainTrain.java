package ba.bitcamp.train;

public class MainTrain {

	public static void main(String[] args) {

		// Creating window
		Circle window = new Circle(1);

		// Creating wheel
		Circle wheel = new Circle(2);

		// Creating platform
		Rectangle platform = new Rectangle(15, 5);

		// Creating chimney
		Rectangle chimney = new Rectangle(1, 2.5);

		// Creating locomotive
		Locomotive l = new Locomotive(platform, wheel, chimney, window);

		// Creating wagons
		Wagon v1 = new Wagon(wheel, platform);
		Wagon v2 = new Wagon(wheel, platform);

		// Creating Wagons array
		Wagon[] arrayWagons = new Wagon[2];
		arrayWagons[0] = v1;
		arrayWagons[1] = v2;

		// Creating train
		Train metro = new Train(l, arrayWagons);

		// Calculating train's surface and circumference
		double area = metro.getTrainArea();
		double circumference = metro.getTrainCircumference();

		// Printing results
		printAmountOfColorForDrawing(metro, 2);
		printAmountOfColor(metro);

		// Calling methods to calculate area and circumference
		System.out.printf("Train area is %.2f, and train circumference %.2f",
				area, circumference);

	}
    //Method that will calculate how much paint is 
	public static void printAmountOfColor(Train t) {
		double color = t.getTrainArea();
		System.out
				.printf("Amount of color needed for painting: %.2f.\n", color);
	}

	public static void printAmountOfColorForDrawing(Train t, int line) {
		double color = line * t.getTrainCircumference();
		System.out.printf("Amount of color needed for drawing is: %.2f.\n",
				color);
	}

}
