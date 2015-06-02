import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert your day: ");
		int day = in.nextInt();

		switch (day) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Work day");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;

		default:
			System.out.println("There is no day greater than 7(Sunday)!");
			break;
		}

	}

}
