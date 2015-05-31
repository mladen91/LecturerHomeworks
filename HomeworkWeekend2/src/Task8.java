public class Task8 {

	public static void main(String[] args) {

		String site = "www.examplepage.com?name=Mladen&surname=Teofilovic";
		int length = site.length();

		// Declaring variables

		int counter = 0;
		String name = " ";
		String surname = " ";
		String backSide = " ";
		String backSideA = " ";

		// We are going from the right side, and we find signs that are
		// different from = and put it into surname.

		for (int i = length - 1; i > 0; i--) {
			char reader = site.charAt(i);
			if (reader != '=') {
				surname += reader;
				counter++;
			} else {
				break;
			}
		}
		// We need to invert our length of a value to get surname
		int surenameLength = surname.length();
		for (int j = surenameLength - 1; j >= 0; j--) {
			char reader1 = surname.charAt(j);
			backSide += reader1;
		}
		counter += 10;
		for (int d = length - counter; d > 0; d--) {
			char reader2 = site.charAt(d);
			if (reader2 != '=') {
				name += reader2;
			} else {
				break;
			}
		}

		// We will do the same with name, going from right side.

		int nameLength = name.length();
		for (int K = nameLength - 1; K >= 0; K--) {
			char reader3 = name.charAt(K);
			backSideA += reader3;
		}

		System.out.printf("%s%s ", backSideA, backSide);
	}

}
