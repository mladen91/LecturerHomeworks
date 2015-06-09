package ba.Homework;

import java.util.InputMismatchException;

public class Arguments {

	public static void main(String[] args) {
		float product = 1;

		try {

			for (String num : args) {

				float number = Float.parseFloat(num);
				if (number == 0 || num.equals(" ")) {
					System.exit(0);
				} else {

					System.out.printf("%.2f \n", number);

					product *= number;
				}
			}
			System.out.printf("Product of our number is equal to: %.2f",
					product);
		} catch (InputMismatchException ex) {
			System.out.println("Wrong input!");
		} catch (NumberFormatException ex) {
			System.out.println("You inserted word or symbol");
		}
	}

}
