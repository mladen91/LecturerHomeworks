package ba.bitcamp.homework.task1;

public class CampStringBuilder {

	private char[] characters;
	public static final int DEFAULT_SIZE = 0;

	public CampStringBuilder() {
		this.characters = new char[DEFAULT_SIZE];
	}

	/**
	 * Places characters in the end
	 */
	public void append(Object o) {
		int charLength = characters.length;
		int newChar = charLength;
		newChar += o.toString().length();
		// Creating temp character array that will keep our letters
		char[] temp = new char[newChar];
		// Putting characters into temp array using loop
		for (int i = 0; i < characters.length; i++) {
			temp[i] = characters[i];
		}
		int counter = 0;
		// Converting word that comes in as object to characters, using loop
		for (int i = characters.length; i < temp.length; i++) {
			temp[i] = o.toString().charAt(counter++);
		}
		characters = temp;
	}

	// Places characters at the beginning
	public void prepend(Object o) {

		int charLength = characters.length;
		int newChar = charLength;
		newChar += o.toString().length();

		// Creating temp character array that will keep our letters
		char[] temp = new char[newChar];
		// Putting letters from Object o to temp as character using loop
		for (int i = 0; i < o.toString().length(); i++) {
			temp[i] = o.toString().charAt(i);
		}
		int counter = 0;
		// Putting characters one by one to temp
		for (int i = o.toString().length(); i < temp.length; i++) {
			temp[i] = characters[counter++];
		}
		characters = temp;
	}

	// Print method
	public String toString() {
		String s = "";
		for (int i = 0; i < characters.length; i++) {
			s += characters[i];
		}
		return s;
	}
}
