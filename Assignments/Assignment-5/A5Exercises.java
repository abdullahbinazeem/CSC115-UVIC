public class A5Exercises {

	// PART 2

	/*
	 * Purpose: get the total number of books in s
	 * Parameters: Stack<Book> s - the stack of books
	 * Returns: int - the total number of books
	 * Post-condition: s is not modified
	 */
	public static int totalBooks(Stack<Book> s) {
		// TODO: implement this recursively
		return totalBooksRec(s); // so it compiles
	}

	private static int totalBooksRec(Stack<Book> s) {
		if(s.isEmpty()){
			return 0;
		} else {
			Book removed = s.pop();
			int count = totalBooksRec(s);
			s.push(removed);

			return count + 1;
		}
	}

	/*
	 * Purpose: get the total number of pages of all 
	 *          books in the stack
	 * Parameters: Stack<Book> s - the stack of books
	 * Returns: int - the total number of pages
	 * Post-condition: s is not modified
	 */
	public static int totalPages(Stack<Book> s) {
		// TODO: implement this recursively
		return totalPagesRec(s); // so it compiles
	}
	
	public static int totalPagesRec(Stack<Book> s) {
		if(s.isEmpty()){
			return 0;
		} else {
			Book removed = s.pop();
			int count = totalPagesRec(s);
			s.push(removed);

			return count + removed.getPages();
		}
	}

	/*
	 * Purpose: get the average number of pages of books in s
	 * Parameters: Stack<Book> s - the stack of books
	 * Returns: double - the average number of pages
	 *                   0.0 if there are no books in s
	 * Post-condition: s is not modified
	 */
	public static double averagePages(Stack<Book> s) {
		if (s.isEmpty()) {
			return 0.0;
		} else {
			// completed for you -- uses the two methods above
			double sum = totalPages(s);
			int count = totalBooks(s);
			return sum/count;
		}
	}

	/*
	 * Purpose: determine whether toFind is contained in s
	 * Parameters: Stack<Book> s - the stack of books
	 *             Book toFind - the book to search for
	 * Returns: boolean - true if s contains toFind, false otherwise
	 * Post-condition: s is not modified
	 */
	public static boolean containsBook(Stack<Book> s, Book toFind) {
		// TODO: implement this recursively
		return containsBookRec(s, toFind); // so it compiles
	}

	public static boolean containsBookRec(Stack<Book> s, Book toFind) {
		if(s.isEmpty()){
			return false;
		} else {
			Book removed = s.pop();
			boolean found = containsBookRec(s, toFind);
			s.push(removed);

			return removed == toFind || found;
		}
	}

	/*
	 * Purpose: determine the books in s are stacked correctly
	 *          (ie. there is never a book stacked on top of 
	 *               another book with fewer pages)
	 * Parameters: Stack<Book> s - the stack of books
	 * Returns: boolean - true if books in s are stacked correctly
	 * Post-condition: s is not modified
	 */
	public static boolean stackedCorrectly(Stack<Book> s) {
		// TODO: implement this recursively
		//       our solution calls a recursive helper method
		return stackedCorrectlyRec(s, null); // so it compiles
	}

	public static boolean stackedCorrectlyRec(Stack<Book> s, Book prevRemoved) {
		if(s.isEmpty()){
			return true;
		} else {
			Book removed = s.pop();
			boolean found = stackedCorrectlyRec(s, removed);
			s.push(removed);

			if(prevRemoved != null){
				return (removed.getPages() > prevRemoved.getPages()) && found;
			} else {
				return found; 
			}
		}
	}
}