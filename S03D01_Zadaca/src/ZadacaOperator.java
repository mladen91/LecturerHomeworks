import java.util.Scanner;

public class ZadacaOperator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// While loop will let our user to insert number again and again if our
		// statement is not valid.
		while (true) {

			try {
				// Declaring variables, replacing blank space with chars, and
				// calculating expression length
				System.out.println("Insert your expression: ");
				String expression = in.nextLine();
				expression = expression.replaceAll("\\s", "");
				int length = expression.length();
				int counter = 0;
				int counter1 = 0;
				String num1 = "";
				String num2 = "";

				// Finding our operator using for loop
				for (int i = 0; i < length; i++) {

					if (expression.charAt(i) == '+'
							|| expression.charAt(i) == '-'
							|| expression.charAt(i) == '*'
							|| expression.charAt(i) == '/') {

						// counter will count our spot of operator, and later
						// convert it to int.
						counter = expression.indexOf(expression.charAt(i));
						// counter will evoke operator from string.
						counter1 = expression.charAt(i);
					}

				}

				num1 = expression.substring(0, counter);
				num2 = expression.substring(counter + 1, length);

				// Converting to integer
				int intNum1 = Integer.parseInt(num1);
				int intNum2 = Integer.parseInt(num2);

				// Operating with our string, now like numbers.
				switch (counter1) {

				case '+':
					System.out.println(intNum1 + intNum2);
					break;
				case '-':
					System.out.println(intNum1 - intNum2);
					break;
				case '*':
					System.out.println(intNum1 * intNum2);
					break;
				case '/':
					System.out.println(intNum1 / intNum2);
					break;
				}
			} catch (Exception e) {
				System.out.println("Wrong statement!");

			}
		}

	}

}
