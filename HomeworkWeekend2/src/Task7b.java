public class Task7b {

	public static void main(String[] args) {

		int N = 15;
		int K = 1;
		int counter = 0;
		int boxNeeded = 0;

		for (int i = N; N > 0; N /= 2) {

			counter++;

			if (counter % 2 == 1 && N == K) {
				System.out.println("No new containers needed!");

			}

		}

		if (counter % 2 == 0) {
			boxNeeded = K - N;
			System.out.println("Number of needed containers is: " + boxNeeded);
		}

	}

}
