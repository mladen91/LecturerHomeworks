package ba.bitcamp.task5;

import java.util.TreeSet;

import ba.bitcamp.task1.TextIO;

/**
 * This is most elegant result using only tree set, that will do automatic sort
 * of elements. We only used array to split elements from string, and pass that
 * values to Set.
 * 
 * @author Mladen13
 *
 */
public class Task5 {

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
