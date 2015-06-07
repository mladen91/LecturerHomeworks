import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

	public static boolean getEqualArray2(int n, int m) {

		Scanner in = new Scanner(System.in);
		int N = 0;
		int M = 0;
        //Method for checking values from N and M. If they are equal program returns true.
		int[] array1 = new int[n];
		int[] array2 = new int[m];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Insert index " + i + " value for N: ");
			N = in.nextInt();
			array1[i] += N;
		}
		for (int j = 0; j < array2.length; j++) {
			System.out.println("Insert index " + j + " value for M: ");
			M = in.nextInt();
			array2[j] += M;
		}
		for (int i = 0; i < array1.length; i++) {

			if (array1[i] != array2[i] || n>m || n<m) {
				return false;
			}
		}
		return true;
	}

	public static int[] getSum(int n, int m) {

		Scanner in = new Scanner(System.in);
		int N = 0;
		int M = 0;
        //Method for summing M and N..
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		int[] arraySum = new int[n];
		if (n > m) {
			arraySum = new int[n];
		} else
			arraySum = new int[m];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Insert index " + i + " value for N: ");
			N = in.nextInt();
			array1[i] += N;
		}
		for (int j = 0; j < array2.length; j++) {
			System.out.println("Insert index " + j + " value for M: ");
			M = in.nextInt();
			array2[j] += M;
		}
		for (int i = 0; i < arraySum.length; i++) {

			if (i == array2.length || i > array2.length) {
				arraySum[i] += array1[i];
			} else if (i == array1.length || i > array1.length) {
				arraySum[i] += array2[i];
			} else {
				arraySum[i] += array1[i] + array2[i];
			}
		}
		return arraySum;

	}

	public static int[] getAllInOne(int n, int m) {

		Scanner in = new Scanner(System.in);
		int N = 0;
		int M = 0;
		int counter = 0;

		int[] array1 = new int[n];
		int[] array2 = new int[m];
		int[] arrayAll = new int[n + m];
        //Method for merging two arrays into one
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Insert index " + i + " value for N: ");
			N = in.nextInt();
			array1[i] += N;
		}
		for (int j = 0; j < array2.length; j++) {
			System.out.println("Insert index " + j + " value for M: ");
			M = in.nextInt();
			array2[j] += M;
		}
		for (int i = 0; i < array1.length; i++) {

			counter++;
			arrayAll[i] += array1[i];
		}
		
		for (int i = counter; i < arrayAll.length; i++) {

			arrayAll[i] += array2[i - counter];

		}
		return arrayAll;

	}

	public static void main(String[] args) {

		//calling our methods.
		Scanner in = new Scanner(System.in);
		System.out.println("Insert array N length: ");
		int n = in.nextInt();
		System.out.println("Insert array M length: ");
		int m = in.nextInt();
		 System.out.println(getEqualArray2(n, m));
		 System.out.println(Arrays.toString(getSum(n, m)));
		System.out.println(Arrays.toString(getAllInOne(n, m)));

	}

}
