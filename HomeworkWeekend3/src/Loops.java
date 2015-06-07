import java.util.Scanner;

public class Loops {

	public static void getNumbers(int n) {
        //method for getting numbers with comma.
		String spots = Integer.toString(n);
		int length = spots.length();
		String commaWord = "";
		String rewStringac = "";
		String finall = "";

		for (int i = length - 1; i >= 0; i--) {

			commaWord += spots.charAt(i);
			//I assume that number couldn't have more than integer digits.
			if (commaWord.length() == 3 || commaWord.length() == 7
					|| commaWord.length() == 11 || commaWord.length() == 15) {
				commaWord += ",";
			}
		}
		//This collects our letters starting from back
		for (int i = commaWord.length() - 1; i >= 0; i--) {
			rewStringac += commaWord.charAt(i);

		}
		if (rewStringac.charAt(0) == ',') {
			for (int i = 1; i < rewStringac.length(); i++) {
				finall += rewStringac.charAt(i);
			}
			System.out.println(finall);
		} else
			System.out.println(rewStringac);

	}

	public static void getNumOfDig(int n) {
        //method for getting number of digits.
		int counter = 0;
		for (int i = n; i > 0; i /= 10) {

			counter++;

		}
		System.out.println("Number " + n + " has " + counter + " digits.");
	}

	public static int getNumReplace(int n) {
		//Method for replacing first and last number.
		int q = 0;
		String str = Integer.toString(n);
		String revStr = "";
		String middle = "";
		String finall = "";
		if (str.length() > 1) {
			char x = str.charAt(0);
			char y = str.charAt(str.length() - 1);
			revStr = Character.toString(x);
			x = y;
			String y1 = Character.toString(y);
			y1 = revStr;
			middle += str.substring(1, str.length() - 1);
			finall = y + middle + revStr;
			q = Integer.parseInt(finall);
			return q;
		} else
			return n;
	}

	public static void getEvenOdd(int n, int q) {

		int counter = 0;
        //Method getting number of even or odd digits between N and Q
		for (int i = n + 1; i < q; i++) {
			counter++;
		}

		for (int i = n + 1; i < q; i++) {
			if (i % 2 == 0 && counter % 2 == 0) {
				System.out.println(i);
			} else if (i % 2 == 1 && counter % 2 == 1) {
				System.out.println(i);
			} else if (q - n <= 2) {
				System.out
						.println("There is no digits between those two numbers.");
			}
		}

	}

	public static void main(String[] args) {

		//calling our methods in main.
		Scanner in = new Scanner(System.in);
		System.out.println("Insert number N: ");
		int num = in.nextInt();
		System.out.println("Insert number Q: ");
		int ourQ = in.nextInt();
		getNumbers(num);
		getNumOfDig(num);
		System.out.println("Replaced first and last digit: "
				+ getNumReplace(num));
		getEvenOdd(num, ourQ);

	}

}
