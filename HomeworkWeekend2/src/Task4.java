public class Task4 {

	public static void main(String[] args) {

		//Reading from file, and declaring variables
		TextIO.readFile("src/encodedFile.in");
		int a = TextIO.getlnInt();
		String row = "";
		char b = '1';

		//Using two for loops, we would get char by char from file, convert it, work with integer
		//And then again return it as char.
		for (int i = 0; i < a; i++) {

			row = TextIO.getln();
			for (int j = 0; j < row.length(); j++) {
				b = (char) (row.charAt(j) - 1);
				System.out.print(b);
			}
			System.out.println();

		}
	}
}
