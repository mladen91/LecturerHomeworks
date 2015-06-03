import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert array length: ");
		int array1Length = in.nextInt();
		String[] array1 = new String[array1Length];
		in.nextLine();

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Insert value: ");
			array1[i] = in.nextLine();
		}
		int[] counterArray = new int[10];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length(); j++) {
				switch (array1[i].charAt(j)) {
				case '0':
					counterArray[0] += 1;
					break;
				case '1':
					counterArray[1] += 1;
					break;
				case '2':
					counterArray[2] += 1;
					break;
				case '3':
					counterArray[3] += 1;
					break;
				case '4':
					counterArray[4] += 1;
					break;
				case '5':
					counterArray[5] += 1;
					break;
				case '6':
					counterArray[6] += 1;
					break;
				case '7':
					counterArray[7] += 1;
					break;
				case '8':
					counterArray[8] += 1;
					break;
				case '9':
					counterArray[9] += 1;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(counterArray));
	}

}
