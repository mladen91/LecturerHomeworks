import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Strings {

	public static void shuffleWords(String word1, String word2) {
		//method for shuffling words 
		String collectLetters = "";
		char firstLetter = ' ';
		char firstLetter2 = ' ';

		for (int i = 0; i < word1.length() + word2.length() - 1; i++) {
			firstLetter = word1.charAt(i);
			collectLetters += Character.toString(firstLetter);
			firstLetter2 = word2.charAt(i);
			collectLetters += Character.toString(firstLetter2);
            //getting letter by letter, and shuffling them
			if (i == word2.length() - 1) {

				collectLetters += word1.substring(i + 1);
				break;
			} else if (i == word1.length() - 1) {

				collectLetters += word2.substring(i + 1);
				break;
			}

		}
		System.out.println(collectLetters.trim());

	}

	public static boolean getEquals(String word1, String word2) {
		boolean b = false;
		char letter1 = ' ';
		char letter2 = ' ';
		String letter1AsString = "";
		String letter2AsString = "";
		String finall = "";
		int counter = 0;
        
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				letter1 = word1.charAt(i);
				letter1AsString += Character.toString(letter1);
				letter2 = word2.charAt(j);
				letter2AsString += Character.toString(letter2);
				if (letter1 == letter2) {
					counter++;
					finall += letter2;
				}
			}
		}
		if (counter > word2.length() && word2.length() >= word1.length()) {
			return true;
		}
		return b;

	}

	public static String getChoose(String word1, String word2) {
		int a = word1.compareTo(word2);
		if (a > 0) {
			return word1;
		} else
			return word2;
	}

	public static boolean isAnagram(String word1, String word2) {
		boolean b = false;
		char letter1 = ' ';
		char letter2 = ' ';
		String letter1AsString = "";
		String letter2AsString = "";
		String finall = "";
        //Method for checking anagrams.
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				letter1 = word1.charAt(i);
				letter1AsString += Character.toString(letter1);
				letter2 = word2.charAt(j);
				letter2AsString += Character.toString(letter2);
				if (letter1 == letter2) {
					finall += letter2;

				}
			}
		}
		if (word1.length() == word2.length()) {
			return b = finall.equals(word1);
		}
		return b;

	}

	public static void main(String[] args) {
        //calling into main.
		Scanner in = new Scanner(System.in);
		System.out.println("Insert first String: ");
		String word1 = in.nextLine();
		System.out.println("Insert second String: ");
		String word2 = in.nextLine();
		shuffleWords(word1, word2);
		System.out.println(getEquals(word1, word2));
		System.out.println(getChoose(word1, word2));
		System.out.println(isAnagram(word1, word2));

	}

}
