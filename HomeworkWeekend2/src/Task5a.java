public class Task5a {

	public static int getNextOddNumber(int num) {

		int counter = 0;

		for (int i = num + 1; i > num; i++) {

			// This separates odd numbers
			if (i % 2 == 1) {
				counter += i;
				break;
			}

		}
		return counter;

	}

	public static void main(String[] args) {
		// We call our method here

		int counter = getNextOddNumber(3);
		System.out.println("Next Odd Number is: " + counter);

	}

}
