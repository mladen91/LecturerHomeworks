package ba.bitcamp.homework.task1;

public class CampStringBuilder {

	private char[] characters;

	public CampStringBuilder(char[] characters) {
		this.characters = characters;
	}

	/**
	 * This method will put object o in the end of the String For example, if we
	 * have words "try" and object word "catch" program will write trycatch.
	 * 
	 * @param o
	 *            - represents parameter from class Object that comes in as
	 *            String
	 */
	public void append(Object o) {
		int charLength = characters.length;
		int newChar = charLength;
		for (int i = 0; i < o.toString().length(); i++) {
			newChar++;
		}
		// Creating temp character array that will keep our letters
		char[] temp = new char[newChar];
		// Putting characters into temp array using loop
		for (int i = 0; i < characters.length; i++) {
			temp[i] = characters[i];
		}
		int counter = 0;
		// Converting word that comes in as object to characters, using loop
		for (int i = charLength; i < temp.length; i++) {
			temp[i] = o.toString().charAt(counter++);
		}
		characters = temp;
		System.out.println(characters);

	}

	public void prepend(Object o) {

		int charLength = characters.length;
		int newChar = charLength;
		for (int i = 0; i < o.toString().length(); i++) {
			newChar++;
		}
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
		System.out.println(characters);

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
