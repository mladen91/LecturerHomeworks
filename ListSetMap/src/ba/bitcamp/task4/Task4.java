package ba.bitcamp.task4;

import java.util.HashSet;
import java.util.TreeSet;

import ba.bitcamp.task1.TextIO;

/**
 * This class uses hash set to avoid repetitions, and tree set to sort elements
 * from lowest to highest.
 * 
 * @author Mladen13
 *
 */
public class Task4 {

	public static void main(String[] args) {

		// Making tree and hash set
		HashSet<String> hash = new HashSet<String>();
		TreeSet<String> tree = new TreeSet<String>();

		String s = "";

		// Putting text into string
		TextIO.readFile("src/text");
		while (!TextIO.eof()) {

			s += TextIO.getln();

		}
		s = s.toLowerCase();
		s = s.replaceAll("[^\\p{L}]", " ");
		String[] words = s.split(" ");
		// Passing values to tree
		for (int i = 0; i < words.length; i++) {

			tree.add(words[i]);

		}
		// Passing tree values to hash
		hash.addAll(tree);
		// Writing to file
		TextIO.writeFile("src/text");
		TextIO.putln(hash);
		TextIO.putln("There are: " + hash.size()
				+ " different words in this story.");

	}

}
