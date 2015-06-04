import java.util.Scanner;

public class Task4 {

	public static double getPercentage(int N, int M) {

		//Divising two numbers and casting them to double
		double division = ((double) N / (double) M) * 100;

		return division;

	}
    //Calling get Percentage method
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert number of points: ");
		int points = in.nextInt();
		System.out.println("Insert Max number of points: ");
		int maxPoints = in.nextInt();

		System.out.println(getPercentage(points, maxPoints));

	}

}
