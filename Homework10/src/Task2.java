import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[5];
		boolean identical = true;
		;

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Insert first array values: ");
			int values = in.nextInt();
			array1[i] = values;
		}

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Insert second array values: ");
			int values = in.nextInt();
			array2[i] = values;
		}

		for (int i = 0; i < array2.length; i++) {

			if (array1[i] != array2[i]) {
				identical = false;
				break;
			}
		}
		if (identical == false) {
			System.out.println("Arrays are not identical.");
		} else
			System.out.println("Arrays are identical.");

	}
}
