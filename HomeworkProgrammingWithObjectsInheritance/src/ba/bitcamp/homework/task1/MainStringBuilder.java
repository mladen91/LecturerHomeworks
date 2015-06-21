package ba.bitcamp.homework.task1;

public class MainStringBuilder {

	public static void main(String[] args) {

		// Array of characters
		char[] characters = {};

		CampStringBuilder csb = new CampStringBuilder(characters);

		// Calling method append which puts an inputed string on the end of a
		// array.
		csb.append(" dva");
		csb.append(" tri");
		csb.prepend("jedan ");

		// Printing an array of characters as a string
		System.out.println(csb.toString());
	}

}
