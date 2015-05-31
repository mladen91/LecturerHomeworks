public class Task7a {

	public static void main(String[] args) {

		int N = 4;
		int K = 1;
		int counter = 0;
		int boxNeeded = 0;

		for (int i = N; N > 0; N /= 2) {

			counter++;

			if (counter % 2 == 1 && N == K) {
				System.out.println("No new containers needed!");

			}

		}

		if (counter % 2 == 0 && N < K) {
			boxNeeded = K - N;
			System.out.println("Number of needed containters is: " + boxNeeded);
		}

	}

}
