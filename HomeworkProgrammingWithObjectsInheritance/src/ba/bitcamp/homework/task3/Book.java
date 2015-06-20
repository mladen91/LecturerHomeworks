package ba.bitcamp.homework.task3;

import ba.bitcamp.homework.task2.Author;

public class Book extends Author {

	private String bookName;
	private int bookPrice;
	private int bookStatus;

	/**
	 * <h1> Creating constructor for Class Book that extends Class Author</h1>
	 * <p>
	 * @param name - Author name
	 * @param mail - Author email address
	 * @param gender - Author gender
	 * @param bookName - represents book name
	 * @param bookPrice - represents book price
	 * @param bookStatus - represents how many books are on sale
	 */
	public Book(String name, String mail, String gender, String bookName,
			int bookPrice, int bookStatus) {
		super(name, mail, gender);
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		if (bookStatus > 3 || bookStatus < 0) {
			throw new UnsupportedOperationException(
					"Max number of examples is 3 and min 0.");
		}else {
		this.bookStatus = bookStatus;
		}
	}

	// Getters and setters
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(int bookStatus) {
		this.bookStatus = bookStatus;
	}

	// Standard equals method
	public boolean equals(Book b) {
		return this.bookName.equals(b.bookName) && this.bookPrice == b.bookPrice
				&& super.getName().equals(b.getName());
	}

	//Standard toString method
	public String toString() {
		String s = "";
		s = "Book name: " + bookName;
		s = s + "\nBook prize: " + bookPrice;
		s = s + "\nBook status: " + bookStatus;
		return s;
	}

}
