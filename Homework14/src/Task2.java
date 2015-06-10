import java.util.Scanner;

public class Task2 {

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
				array2D[i][j] = (int) (Math.random() * 19 - 9);
				// Getting list of our array with random values (-9 to 9)
				System.out.printf("%2d ", array2D[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * <h1>This method will generate number of rows and columns which have sum
	 * equal to 0</h1>
	 * <p>
	 * 
	 * @param matrix
	 *            - represents our 2D Array.
	 * @return returns sum of two counters, where counter represents row or
	 *         column which sum is 0.
	 */

	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {
		int counter1 = 0;
		int sum = 0;
		int counter2 = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			// When sum from i row is equal to 0, counter will increase.
			if (sum == 0) {
				counter1++;
			}
			sum = 0;
		}
		sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];
				// I just changed places to get sum of columns.
			}
			if (sum == 0) {
				counter2++;
			}
			sum = 0;
		}
		// sum from counter1 and counter2 will give us final result.
		return counter1 + counter2;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Inserting number of rows, columns and number that will be counted.
		System.out.println("Insert number of rows:");
		int rows = in.nextInt();
		System.out.println("Insert number of columns:");
		int columns = in.nextInt();
		int[][] array2D = new int[rows][columns];
		get2DArray(array2D);
		System.out.println("Rows and columns that have sum equal to 0 is: "
				+ getNumOfZeroRowsAndColumns(array2D));

		in.close();
	}

}
