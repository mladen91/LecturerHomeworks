package BookAuthor;

import java.util.Arrays;

public class Author {

	public String authorName;
	public Integer yearOfBirth;
	public Book[] arrayBook;
	public Author(String authorName, Integer yearOfBirth, Book[] arrayBook) {
		this.authorName = authorName;
		this.yearOfBirth = yearOfBirth;
		this.arrayBook = arrayBook;
	}
	
	public String toString() {
		return "Author [authorName=" + authorName + ", yearOfBirth="
				+ yearOfBirth + ", arrayBook=" + Arrays.toString(arrayBook)
				+ "]";
	}
	
	
	
	
}
