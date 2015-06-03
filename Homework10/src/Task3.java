import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[5];
		boolean identical = true;
		int[] counterArray = new int[5];

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
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {
					counterArray[i]++;
				}
			}

		}

		System.out.println(Arrays.toString(counterArray));
		for (int i = 0; i < counterArray.length; i++) {

			if (counterArray[i] == 0) {
				identical = false;
				break;
			} else
				identical = true;
		}
		if (identical==false) {
			System.out.println("They are not identical!");
		}else {
			System.out.println("They are identical.");
		}
	}

}
