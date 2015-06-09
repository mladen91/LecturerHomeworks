public class Task3 {

	
	/**
	 * <h1>This method will calculate number of numbers in our String</h1>
	 * @param s - represents our inserted String
	 * @return we return number of numbers to our main method as integer.
	 */
	public static int getCountOfNumbers(String s) {
		int toNumber = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				toNumber++;
			}
		}
		if (toNumber != 0) {
			System.out.println("There is " + toNumber
					+ " number in this String.");

			return toNumber;
		} else
			System.out.println("There is no numbers in this String.");
		return toNumber;
	}

	public static void main(String[] args) {

		getCountOfNumbers("M14d3n");

	}

}
