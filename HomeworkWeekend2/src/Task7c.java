public class Task7c {

	public static void main(String[] args) {

		int N = 14;
		int K = 5;
		int counter = 0;
		int boxNeeded = 0;

		for (int i = N; N > 0; N /= 2) {

			counter++;

			if (counter % 2 == 1 && N == K) {
				System.out.println("No new containers needed!");

			}

		}

		int helpBox;
		N = 14;
		if (counter % 2 == 0) {
			boxNeeded = N / counter;
			helpBox = N - boxNeeded * counter;
			System.out.println("Number of extra containers is: " + helpBox);
		}

	}

}
