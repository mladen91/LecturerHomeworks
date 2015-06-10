import java.util.Scanner;

public class Task3 {

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
	 * <h1>This method will get maximum number of points which Knight can get
	 * playing from the selected field.</h1>
	 * <p>
	 * 
	 * @param matrix
	 *            - represents our randomly generated 2D Array
	 * @param x
	 *            - number of selected column.
	 * @param y
	 *            - number of selected row.
	 * @return - best score for knight.
	 */

	public static int getMaxPoints(int[][] matrix, int x, int y) {
		int sum = 0;

		// If and else if cases for every row and column in 3 x 3 array
		// Knight can be played on two fields from selected field..
		// Using If case, I compared those two fields and then printed bigger
		// one.
		// The biggest number represents our highest score.
		if (x == 0 && y==0) {
			if (matrix[2][1] > matrix[1][2]) {
				sum += matrix[2][1];
			} else {
				sum += matrix[1][2];
			}
		} else if (x == 0 && y==1) {
			if (matrix[2][0] > matrix[2][2]) {
				sum += matrix[2][0];
			} else {
				sum += matrix[2][2];
			}
		} else if (x == 0 && y==2) {
			if (matrix[1][0] > matrix[2][1]) {
				sum += matrix[1][0];
			} else {
				sum += matrix[2][1];
			}
		} else if (x == 1 && y==0) {
			if (matrix[0][2] > matrix[2][2]) {
				sum += matrix[0][2];
			} else {
				sum += matrix[2][2];
			}
		} else if (x == 1 && y==2) {
			if (matrix[0][0] > matrix[2][0]) {
				sum += matrix[0][0];
			} else {
				sum += matrix[2][0];
			}
		} else if (x == 2 && y==0) {
			if (matrix[0][1] > matrix[1][2]) {
				sum += matrix[0][1];
			} else {
				sum += matrix[1][2];
			}
		} else if (x == 2 && y==1) {
			if (matrix[0][0] > matrix[0][2]) {
				sum += matrix[0][0];
			} else {
				sum += matrix[0][2];
			}
		} else if (x == 2 && y==2) {
			if (matrix[1][0] > matrix[0][1]) {
				sum += matrix[1][0];
			} else {
				sum += matrix[0][1];
			}
		} else if (x == 1 && y==1) {
			sum += matrix[1][1];
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Inserting number of rows, columns and number that will be counted.
		System.out.println("Insert column number:");
		int x = in.nextInt();
		System.out.println("Insert row number:");
		int y = in.nextInt();
		int[][] array2D = new int[3][3];
		// Calling our print 2D Array method
		get2DArray(array2D);
		System.out.println("Knigth can get max " + getMaxPoints(array2D, x, y)
				+ " points.");

		in.close();
	}

}
