import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (true) {
			try {

				System.out.println("Insert file path: ");
				String fileName = in.nextLine();
				TextIO.readFile(fileName);

				int numFromFile = TextIO.getInt();
				int product = 1;

				for (int i = 1; i <= numFromFile; i++) {

					product *= i;

				}
				System.out.println("Factoriel from file number is: " + product);
				break;

			} catch (Exception ex) {
				System.out.println("File not found!");
			}
		}

	}

}
