import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int lenght = input.nextInt();
		int[] array1 = new int[lenght];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Enter your number: ");
			array1[i] = input.nextInt();
		}
		System.out.println("Enter Q:");
		int Q = input.nextInt();
		boolean search = false;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == Q)
				search = true;
		}
		System.out.println(search);

	}

}
