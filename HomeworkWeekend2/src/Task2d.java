public class Task2d {

	public static void main(String[] args) {

		String brackets = "}{}}";
		int counter1 = 0;
		int counter2 = 0;

		for (int i = 0; i < brackets.length(); i++) {

			if (brackets.charAt(i) == '{') {
				counter1++;

			}
			if (brackets.charAt(i) == '}') {
				counter2++;

			}

		}
		if (counter1 == counter2) {
			System.out.println(true);
		} else
			System.out.println(false);

	}

}
