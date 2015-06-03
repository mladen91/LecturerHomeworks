import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert number N: ");
		int n = in.nextInt();
		char[] bitCamp = new char[] { 'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A',
				'M', 'P' };

		while (n > 0) {

			char last = bitCamp[bitCamp.length - 1];
			for (int i = bitCamp.length - 1; i > 0; i--) {
				bitCamp[i] = bitCamp[i - 1];
			}
			bitCamp[0] = last;
			n--;
		}
		while (n < 0) {
			char last = bitCamp[0];
			for (int i = 0; i < bitCamp.length - 1; i++) {
				bitCamp[i] = bitCamp[i + 1];
			}
			bitCamp[bitCamp.length - 1] = last;
			n++;
		}
		System.out.println(Arrays.toString(bitCamp));
	}

}
