package ba.bitcamp.task3;

import java.util.TreeSet;

import ba.bitcamp.task1.TextIO;

public class Task3 {

	public static void main(String[] args) {

		// Making a Tree set
		TreeSet<String> tree = new TreeSet<String>();

		String s = "";

		// Reading from text file
		TextIO.readFile("src/text");
		// Going trough all file
		while (!TextIO.eof()) {

			s += TextIO.getln();

		}
		s = s.toLowerCase();
		// Leaving only letters into string.
		s = s.replaceAll("[^\\p{L}]", " ");
		String[] words = s.split(" ");
		// Passing values to tree
		for (int i = 0; i < words.length; i++) {

			tree.add(words[i]);

		}
		// Writing to another file
		TextIO.writeFile("src/text");
		TextIO.putln(tree);
		TextIO.putln("There are: " + tree.size()
				+ " different words in this story.");

	}

}
