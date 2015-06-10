
import java.util.Scanner;

public class Task1 {

	/**
	 * <h1>This method will give us list of values that are into 2D Array.</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - represents our 2D array that would be listed.
	 */
	public static void get2DArray(int[][] array2D) {

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = (int) (Math.random() * 9 + 1);
				// Getting list of our array with values
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * <h1>This method will count how many times was our wanted number occurred
	 * into 2D Array.</h1>
	 * 
	 * @param matrix
	 *            - represents our 2D Array.
	 * @param number
	 *            - wanted number to be counted.
	 * @return returns number of repeats in our Array.
	 */
	public static int countNumber(int[][] matrix, int number) {

		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// If our number was found in array, counter will increase.
				if (matrix[i][j] == number) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Inserting number of rows, columns and number that will be counted.
		System.out.println("Insert number of rows:");
		int rows = in.nextInt();
		System.out.println("Insert number of columns:");
		int columns = in.nextInt();
		int[][] array2D = new int[rows][columns];
		System.out.println("Which number do you want to count");
		int number = in.nextInt();
		// Calling our print 2D Array method
		get2DArray(array2D);
		// Calling count Number method
		System.out.println("Number " + number + " is repeated "
				+ countNumber(array2D, number) + " times.");

		in.close();
	}

}
