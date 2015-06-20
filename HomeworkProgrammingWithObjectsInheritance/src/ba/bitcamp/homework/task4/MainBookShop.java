package ba.bitcamp.homework.task4;


import ba.bitcamp.homework.task3.Book;

public class MainBookShop {

	public static void main(String[] args) {

		// Creating an array of books
		Book[] bookArray = new Book[5];

		// Creating book-shop
		BookShop bs1 = new BookShop("Bicamp", bookArray);

		// Creating books
		Book b1 = new Book("Author1", "book1@mail.ba", "Male", "Book1", 20, 0);
		Book b2 = new Book("Author2", "book2@mail.ba", "Male", "Book2", 10, 0);
		Book b3 = new Book("Author3", "book3@mail.ba", "Female", "Book3", 15, 0);

		// Adding books in the book-shop
		bs1.addingBook(b1);
		bs1.addingBook(b2);
		bs1.addingBook(b3);

		// Selling books from the book-shop
		bs1.sellingBook(b1);
	//bs1.sellingBook(b2);

		// Printing all books from the book-shop
		bs1.printBooks();

		// Printing books from one author
		 bs1.printBooksFromThisAuthor(b2);

	}

}
