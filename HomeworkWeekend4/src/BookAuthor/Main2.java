package BookAuthor;

public class Main2 {

	public static void main(String[] args) {

		// Creating books first author 
		Book bfa1 = new Book("The Fellowship of the Ring", 1954, "Fantasy", true);
		Book bfa2 = new Book("The Two Towers", 1954, "Fantasy", false);
		Book bfa3 = new Book("The Return of the King", 1955, "Fantasy", true);

		//Creating books for second author
		Book bsa1= new Book("Harry Potter and the Philosopher's Stone", 2007, "Fantasy, mystery", true);
		Book bsa2= new Book("Harry Potter and the Chamber of Secrets", 2008, "Fantasy, mystery", true);
		Book bsa3= new Book("Harry Potter and the Prisoner of Azkaban", 2009, "Fantasy, mystery", true);
		Book bsa4= new Book("Harry Potter and the Goblet of Fire", 2010, "Fantasy, mystery", true);
		
		
		// Creating book array for first author
		Book[] arrayBook = new Book[3];
		arrayBook[0] = bfa1;
		arrayBook[1] = bfa2;
		arrayBook[2] = bfa3;
		
		//Creating book array for second author 
		Book[] arrayBook1 = new Book[4];
		arrayBook1[0] = bsa1;
		arrayBook1[1] = bsa2;
		arrayBook1[2] = bsa3;
		arrayBook1[3] = bsa4;

		// Creating first author with book array
		Author a1 = new Author("J.R.R. Tolkien", 1892, arrayBook);
		
		// Creating second author with book array
		Author a2 = new Author("J.K. Rowling", 1965, arrayBook1);
		
		//Creating authors array
		Author[] authorArray = new Author[2];
		authorArray[0]=a1;
		authorArray[1]=a2;
		
		
		

		System.out.println("Number of bestselling books is: "
				+ countBestSellingBooks(a1));
		
		System.out.println("Number of books released between our two years is: "+getNumberOfWrittenBooks(a1, 1950, 1956));

		System.out.println(getAuthorWithMostBestsellers(authorArray));
	}

	/**
	 * <h1> This method counts number of bestselling books from our author</h1>
	 * <p>
	 * @param a - represents author
	 * @return Number of bestsellers of wanted author
	 */
	public static int countBestSellingBooks(Author a) {
		int counter = 0;

		for (int i = 0; i < a.arrayBook.length; i++) {
			if (a.arrayBook[i].isBestSeller == true) {
				counter++;
			}
		}
		return counter;

	}
	/**
	 * <h1> This method counts number of books released between two inserted years</h1>
	 * <p>
	 * @param a - represents Author
	 * @param year1 - lower year limit
	 * @param year2 - high limit
	 * @return number of books released between two years
	 */
	public static int getNumberOfWrittenBooks (Author a, int year1, int year2) {
		int counter=0;
		for (int i = 0; i < a.arrayBook.length; i++) {
			if (a.arrayBook[i].yearOfRelease>year1 && a.arrayBook[i].yearOfRelease<year2) {
				counter++;
			}
		}
		
		return counter;
		
	}
	/**
	 * <h1> This method counts which author has most bestsellers</h1>
	 * <p>
	 * @param authors - represents authors array
	 * @return author with most bestsellers
	 */
	public static Author getAuthorWithMostBestsellers (Author[] authors) {
		int counter = 0;
		Author bestSellers= authors[0];
		for (int i = 0; i < authors.length; i++) {
			if (countBestSellingBooks(authors[i])>counter){
			counter = countBestSellingBooks(authors[i]);
			bestSellers = authors[i];
		}
		}
		return bestSellers;		
	}

}
