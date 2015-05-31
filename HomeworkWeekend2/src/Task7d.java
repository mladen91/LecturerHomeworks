public class Task7d {

	public static void main(String[] args) {
		int N = 28;
		int K = 7;
		int counter = 0;
		int boxNedeed = 0;

		for (int i = N; N > 0; N /= 2) {

			counter++;

			if (counter % 2 == 1 && N == K) {
				System.out.println("No new containers needed!");

			}

		}

		if (counter % 2 == 0 && N < K) {
			boxNedeed = K - N;
			System.out.println("Number of extra containers is: " + boxNedeed);
		}

	}

}
