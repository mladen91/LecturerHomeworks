package BookAuthor;

public class Book {

	public String bookName;
	public Integer yearOfRelease;
	public String genre;
	public boolean isBestSeller;
	
	
	public Book(String bookName, Integer yearOfRelease, String genre,
			boolean isBestSeller) {
		this.bookName = bookName;
		this.yearOfRelease = yearOfRelease;
		this.genre = genre;
		this.isBestSeller = isBestSeller;
	}


	
	public String toString() {
		return "Book [bookName=" + bookName + ", yearOfRelease="
				+ yearOfRelease + ", genre=" + genre + ", isBestSeller="
				+ isBestSeller + "]";
	}
	
	
	
	
	
}
