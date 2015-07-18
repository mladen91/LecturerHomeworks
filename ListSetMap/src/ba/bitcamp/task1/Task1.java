package ba.bitcamp.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

/**
 * I used array to get every word as element in this class, then put it to hash
 * set to disallow repetitions of elements, and i used comparable interface to
 * sort my list.
 * 
 * @author Mladen13
 *
 */
public class Task1 implements Comparable<Task1> {

	public static void main(String[] args) {
		// Making array list and hash set.
		ArrayList<String> story = new ArrayList<String>();
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
		// Splitting every word
		String[] words = s.split(" ");
		// Adding words to hash set
		for (int i = 0; i < words.length; i++) {

			hash.add(words[i]);

		}
		// Adding elements from hash set to array list
		story.addAll(hash);
		// Sorting elements in list
		sortByName(story);
		// Writing to another file
		TextIO.writeFile("src/text");
		TextIO.putln(story);
		TextIO.putln("There are: " + story.size()
				+ " different words in this story.");

	}

	/**
	 * This method will sort elements in array list from lowest to highest.
	 * 
	 * @param list
	 */
	public static void sortByName(ArrayList<String> list) {
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}

		});
	}

	@Override
	public int compareTo(Task1 arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
