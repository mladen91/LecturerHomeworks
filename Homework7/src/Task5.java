public class Task5 {

	public static void main(String[] args) {

		TextIO.readFile("C:/Users/Mladen13/workspace/Homework7/src/decimal.in");

		int n = TextIO.getInt();
		int counter = 0;
		String binary = "";
		int extra = 0;

		TextIO.writeFile("C:/Users/Mladen13/workspace/Homework7/src/binary.out");

		while (n != 0) {
			if (n % 2 == 0) {
				TextIO.put(0 + "\n");
			} else {
				TextIO.put(1 + "\n");
			}
			counter++;
			n /= 2;
		}
		TextIO.readFile("C:/Users/Mladen13/workspace/Homework7/src/binary.out");

		for (int i = 0; i < counter; i++) {
			extra = TextIO.getlnInt();
			binary += extra;
		}

		TextIO.writeFile("src/binary.out");
		TextIO.put(binary);

	}

}
