import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000);
		}
		Arrays.sort(array);
		System.out.print("Input number: ");
		int num = input.nextInt();
		long start = System.currentTimeMillis();
		Arrays.binarySearch(array, num);
		long end = System.currentTimeMillis() - start;
		System.out.println(" Binary Search method: " + end);

		start = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				break;
			}
		}
		end = System.currentTimeMillis() - start;
		System.out.println("It took " + end + " millis.");

	}

}
