package ba.bitcamp.task2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

import ba.bitcamp.task1.TextIO;

/**
 * This class uses linked list and hash set to get text from file, and to write
 * elements to another file
 * 
 * @author Mladen13
 *
 */
public class Task2 implements Comparable<Task2> {

	public static void main(String[] args) {
		// Making hash set and linked list
		LinkedList<String> story = new LinkedList<String>();
		HashSet<String> hash = new HashSet<String>();

		String s = "";

		TextIO.readFile("src/text");
		// Getting text from file
		while (!TextIO.eof()) {

			s += TextIO.getln();

		}
		s = s.toLowerCase();
		// Leaving only words in string
		s = s.replaceAll("[^\\p{L}]", " ");
		// Splitting every word in string
		String[] words = s.split(" ");
		// Putting elements to hash set
		for (int i = 0; i < words.length; i++) {

			hash.add(words[i]);

		}
		// adding to list
		story.addAll(hash);
		// sorting list from lowest to highest
		sortByName(story);

		// writing to file
		TextIO.writeFile("src/text");
		TextIO.putln(story);
		TextIO.putln("There are: " + story.size()
				+ " different words in this story.");

	}

	/**
	 * This method will sort elements from linked list
	 * 
	 * @param list
	 */
	public static void sortByName(LinkedList<String> list) {
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}

		});
	}

	@Override
	public int compareTo(Task2 o) {

		return 0;
	}

}
