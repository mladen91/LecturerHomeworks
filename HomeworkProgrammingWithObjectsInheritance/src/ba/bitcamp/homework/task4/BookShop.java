package ba.bitcamp.homework.task4;

import ba.bitcamp.homework.task2.Author;
import ba.bitcamp.homework.task3.Book;

public class BookShop {

	private String name;
	private Book[] bookOnSale;

	// Constructor
	public BookShop(String name, Book[] bookOnSale) {
		this.name = name;
		this.bookOnSale = bookOnSale;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book[] getBookOnSale() {
		return bookOnSale;
	}

	public void setBookOnSale(Book[] bookOnSale) {
		this.bookOnSale = bookOnSale;
	}

	// Finding author and printing his books
	public void printBooksFromThisAuthor(Author a) {
		for (int i = 0; i < bookOnSale.length; i++) {
			if (bookOnSale[i] != null
					&& bookOnSale[i].getName().equals(a.getName())) {
				System.out.println(bookOnSale[i] + " ");
			}
		}
	}

	/**
	 * This method will remove book from book shop
	 * 
	 * @param b
	 *            - removed book
	 */
	public void sellingBook(Book b) {
		// Finding and lowering book status
		for (int i = 0; i < bookOnSale.length; i++) {
			if (bookOnSale[i].equals(b) && bookOnSale[i] != null) {
				bookOnSale[i] = null;
				b.setBookStatus(-1);
				break;
			}
		}
	}

	/**
	 * This method will add book to book shop
	 * 
	 * @param b
	 *            - book added
	 */
	public void addingBook(Book b) {

		int counter = 0;

		for (int i = 0; i < bookOnSale.length; i++) {
			// Increasing book status if it exists in the book shop
			if (bookOnSale[i] != null && bookOnSale[i].equals(b)
					&& b.getBookStatus() < 3) {
				b.setBookStatus(1);
				break;

			} else if (bookOnSale[i] != null && bookOnSale[i].equals(b)
					&& b.getBookStatus() == 3) {
				System.out.println("Book overflow!");
				break;
				// Increasing book status
			} else if (bookOnSale[i] == null) {
				bookOnSale[i] = b;
				b.setBookStatus(1);
				break;
			}
			if (bookOnSale[i] != null) {
				counter++;
			}
		}
		if (counter == bookOnSale.length) {
			System.out.println("No free space.");
		}
	}

	// Printing all books
	public void printBooks() {
		int counter = 0;

		for (int i = 0; i < bookOnSale.length; i++) {
			if (bookOnSale[i] != null) {
				System.out.println(bookOnSale[i] + " ");
				counter++;
			}
		}

	}

}
