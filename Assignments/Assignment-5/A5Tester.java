import java.util.Arrays;

public class A5Tester {
	
	private static int testPassCount = 0;
	private static int testCount = 0;
	private static double THRESHOLD = 0.1; 
	
    public static void main(String[] args) {
			
		/* 
		 * PART 1:
		 * implement and test each of the following methods
		 * found in LinkedBookList.java, one at a time		
		 */
		testTotalPagesList();
		testCountLongerThan();
		// testPagesBeforeBookByAuthor();
		// testLongestBook();
		// testDistanceBetweenBooksByAuthor();
		
		/*
		 * PART 2:
		 * implement and test each of the following methods
		 * found in A5Exercises.java, one at a time.
		 * Documentation can be found in Stack.java
		 */
		// testTotalBooks();
		// testTotalPages();
		// testAveragePages();
		// testContainsBook();
		// testStackedCorrectly();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
	}
	
	public static void testTotalPagesList() {
		System.out.println("\nTesting totalPages");
		LinkedBookList list1 = new LinkedBookList();
		LinkedBookList list2 = new LinkedBookList();
		LinkedBookList list3 = new LinkedBookList();
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b4 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b5 = new Book("Jade City", "Fonda Lee", 560);
		Book b6 = new Book("Insurgent", "Veronica Roth", 525);
		Book b7 = new Book("Allegiant", "Veronica Roth", 526);
		Book[] books1 = {b1};
		Book[] books2 = {b1, b2, b3};
		Book[] books3 = {b1, b2, b3, b4, b5};
		list1.buildFromArray(books1);
		list2.buildFromArray(books2);
		list3.buildFromArray(books3);
		
		int result = 0;
		int expected = 0;
		
		result = list1.totalPages();
		expected = 432;
		displayResults(result==expected, "totalPages in list1");
		
		result = list2.totalPages();
		expected = 432+487+374;
		displayResults(result==expected, "totalPages in list2");
		
		result = list3.totalPages();
		expected = 432+487+374+390+560;
		displayResults(result==expected, "totalPages in list3");
		
		// Write more tests here
		
	}
	
	public static void testCountLongerThan() {
		System.out.println("\nTesting countLongerThan");
		LinkedBookList list1 = new LinkedBookList();
		LinkedBookList list2 = new LinkedBookList();
		LinkedBookList list3 = new LinkedBookList();
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b4 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b5 = new Book("Jade City", "Fonda Lee", 560);
		Book b6 = new Book("Insurgent", "Veronica Roth", 525);
		Book b7 = new Book("Allegiant", "Veronica Roth", 526);
		Book[] books1 = {b1};
		Book[] books2 = {b1, b2, b3};
		list1.buildFromArray(books1);
		list2.buildFromArray(books2);
		
		int result = 0;
		int expected = 0;
		
		result = list1.countLongerThan(b2);
		expected = 0;
		displayResults(result==expected, "count books longer than b2 in list1");
		
		result = list1.countLongerThan(b3);
		expected = 1;
		displayResults(result==expected, "count books longer than b3 in list1");
		
		result = list2.countLongerThan(b4);
		expected = 2;
		displayResults(result==expected, "count books longer than b4 in list2");

		result = list2.countLongerThan(b5);
		expected = 0;
		displayResults(result==expected, "count books longer than b5 in list2");
		
		// Write more tests here
		
	}
	
	public static void testPagesBeforeBookByAuthor() {
		System.out.println("\nTesting pagesBeforeBookByAuthor");
		LinkedBookList list1 = new LinkedBookList();
		LinkedBookList list2 = new LinkedBookList();
		LinkedBookList list3 = new LinkedBookList();
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b4 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b5 = new Book("Jade City", "Fonda Lee", 560);
		Book b6 = new Book("Insurgent", "Veronica Roth", 525);
		Book b7 = new Book("Allegiant", "Veronica Roth", 526);
		Book[] books1 = {b1};
		Book[] books2 = {b1, b2, b3};
		Book[] books3 = {b1, b2, b3, b4, b5, b6, b7};
		list1.buildFromArray(books1);
		list2.buildFromArray(books2);
		list3.buildFromArray(books3);
		
		int result = 0;
		int expected = 0;
		
		result = list1.pagesBeforeBookByAuthor("Gillian Flynn");
		expected = 0;
		displayResults(result==expected, "pagesBeforeBookByAuthor Gillian Flynn in list1");
		
		result = list2.pagesBeforeBookByAuthor("Suzanne Collins");
		expected = 432+487;
		displayResults(result==expected, "pagesBeforeBookByAuthor Suzanne Collins in list2");
		
		result = list3.pagesBeforeBookByAuthor("Fonda Lee");
		expected = 432+487+374+390;
		displayResults(result==expected, "pagesBeforeBookByAuthor Fonda Lee in list3");
		
		// TODO: add more tests here

	}

	public static void testLongestBook() {
		System.out.println("\nTesting longestBook");
		LinkedBookList list1 = new LinkedBookList();
		LinkedBookList list2 = new LinkedBookList();
		LinkedBookList list3 = new LinkedBookList();
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b4 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b5 = new Book("Jade City", "Fonda Lee", 560);
		Book[] books1 = {b1};
		Book[] books2 = {b1, b2};
		Book[] books3 = {b1, b2, b3, b4, b5};
		list1.buildFromArray(books1);
		list2.buildFromArray(books2);
		list3.buildFromArray(books3);
		
		Book result = null;
		Book expected = null;
		
		result = list1.longestBook();
		expected = b1;
		displayResults(result.equals(expected), "longest book in list1");
		
		result = list2.longestBook();
		expected = b2;
		displayResults(result.equals(expected), "longest book in list2");
		
		result = list3.longestBook();
		expected = b5;
		displayResults(result.equals(expected), "longest book in list3");
		
		// TODO: add more tests here
		
	}

	public static void testDistanceBetweenBooksByAuthor() {
		System.out.println("\nTesting distanceBetweenBooksByAuthor");
		LinkedBookList list1 = new LinkedBookList();
		LinkedBookList list2 = new LinkedBookList();
		LinkedBookList list3 = new LinkedBookList();
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b4 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b5 = new Book("Jade City", "Fonda Lee", 560);
		Book b6 = new Book("Insurgent", "Veronica Roth", 525);
		Book b7 = new Book("Allegiant", "Veronica Roth", 526);
		Book[] books1 = {b1, b1};
		Book[] books2 = {b1, b2, b1};
		Book[] books3 = {b1, b2, b3, b4, b5, b6, b1};
		list1.buildFromArray(books1);
		list2.buildFromArray(books2);
		list3.buildFromArray(books3);

		int result = 0;
		int expected = 0;
		
		result = list1.distanceBetweenBooksByAuthor("Gillian Flynn");
		expected = 0;
		displayResults(result==expected, "distance between books by Gillian Flynn in list1");
		
		result = list2.distanceBetweenBooksByAuthor("Gillian Flynn");
		expected = 1;
		displayResults(result==expected, "distance between books by Gillian Flynn in list2");
		
		result = list3.distanceBetweenBooksByAuthor("Gillian Flynn");
		expected = 5;
		displayResults(result==expected, "distance between books by Gillian Flynn in list3");

		// Write more tests here
	
	}
	
	public static void testTotalBooks() {
		System.out.println("\nStarting totalBooks tests");
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Allegiant", "Veronica Roth", 526);
		Book b4 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b5 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b6 = new Book("Jade City", "Fonda Lee", 560);
		
		Book[] arr1 = {b1};
		Book[] arr2 = {b1, b2, b3};
		Book[] arr3 = {b1, b2, b3, b4, b5, b6};
		
		A5Stack<Book> s0 = new A5Stack<Book>();
		A5Stack<Book> s1 = new A5Stack<Book>(arr1);
		A5Stack<Book> s2 = new A5Stack<Book>(arr2);
		A5Stack<Book> s3 = new A5Stack<Book>(arr3);
		String s0Contents = s0.toString();
		String s1Contents = s1.toString();
		String s2Contents = s2.toString();
		String s3Contents = s3.toString();
		
		
		int result = 0;
		int expected = 0;
		
		result = A5Exercises.totalBooks(s0);
		expected = 0;
		displayResults(result==expected, "total books in empty stack");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A5Exercises.totalBooks(s1);
		expected = 1;
		displayResults(result==expected, "total books in s1");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A5Exercises.totalBooks(s2);
		expected = 3;
		// System.out.println(result);
		displayResults(result==expected, "total books in s2");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");
		
		result = A5Exercises.totalBooks(s3);
		expected = 6;
		// System.out.println(result);
		displayResults(result==expected, "total books in s3");
		displayResults(s3Contents.equals(s3.toString()), "stack unchanged");

	}
	
	public static void testTotalPages() {
		System.out.println("\nStarting totalPages tests");
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Allegiant", "Veronica Roth", 526);
		Book b4 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b5 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b6 = new Book("Jade City", "Fonda Lee", 560);
		
		Book[] arr1 = {b1};
		Book[] arr2 = {b1, b2, b3};
		Book[] arr3 = {b1, b2, b3, b4, b5, b6};
		
		A5Stack<Book> s0 = new A5Stack<Book>();
		A5Stack<Book> s1 = new A5Stack<Book>(arr1);
		A5Stack<Book> s2 = new A5Stack<Book>(arr2);
		A5Stack<Book> s3 = new A5Stack<Book>(arr3);
		String s0Contents = s0.toString();
		String s1Contents = s1.toString();
		String s2Contents = s2.toString();
		String s3Contents = s3.toString();
		
		int result = 0;
		int expected = 0;
		
		result = A5Exercises.totalPages(s0);
		expected = 0;
		displayResults(result==expected, "total pages in empty stack");
		
		result = A5Exercises.totalPages(s1);
		expected = 432;
		displayResults(result==expected, "total pages in s1");
		
		result = A5Exercises.totalPages(s2);
		expected = 432 + 487 + 526;
		// System.out.println(result);
		displayResults(result==expected, "total pages in s2");
		
		result = A5Exercises.totalPages(s3);
		expected = 432 + 487 + 526 + 374 + 390 + 560;
		// System.out.println(result);
		displayResults(result==expected, "total pages in s3");	
	}
	
	public static void testAveragePages() {
		System.out.println("\nStarting averagePages tests");
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Allegiant", "Veronica Roth", 526);
		Book b4 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b5 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b6 = new Book("Jade City", "Fonda Lee", 560);
		
		Book[] arr1 = {b1};
		Book[] arr2 = {b1, b2, b3};
		Book[] arr3 = {b1, b2, b3, b4, b5, b6};
		
		A5Stack<Book> s0 = new A5Stack<Book>();
		A5Stack<Book> s1 = new A5Stack<Book>(arr1);
		A5Stack<Book> s2 = new A5Stack<Book>(arr2);
		A5Stack<Book> s3 = new A5Stack<Book>(arr3);
		
		double result = 0.0;
		double expected = 0.0;
		
		result = A5Exercises.averagePages(s0);
		expected = 0.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average pages in empty stack");
		
		result = A5Exercises.averagePages(s1);
		expected = 432/1.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average pages in s1");
		
		result = A5Exercises.averagePages(s2);
		expected = (432 + 487 + 526)/3.0;
		// System.out.println(result);
		displayResults(Math.abs(result-expected)<THRESHOLD, "average pages in s2");
		
		result = A5Exercises.averagePages(s3);
		expected = (432 + 487 + 526 + 374 + 390 + 560)/6.0;
		// System.out.println(result);
		displayResults(Math.abs(result-expected)<THRESHOLD, "average pages in s3");	
	}
	
	public static void testContainsBook() {
		System.out.println("\nStarting containsBook tests");
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Allegiant", "Veronica Roth", 526);
		Book b4 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b5 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b6 = new Book("Jade City", "Fonda Lee", 560);
		
		Book[] arr1 = {b1};
		Book[] arr2 = {b1, b2, b3};
		Book[] arr3 = {b1, b2, b3, b4, b5, b6};
		
		A5Stack<Book> s0 = new A5Stack<Book>();
		A5Stack<Book> s1 = new A5Stack<Book>(arr1);
		A5Stack<Book> s2 = new A5Stack<Book>(arr2);
		A5Stack<Book> s3 = new A5Stack<Book>(arr3);
		String s0Contents = s0.toString();
		String s1Contents = s1.toString();
		String s2Contents = s2.toString();
		String s3Contents = s3.toString();
		
		boolean result = false;
		boolean expected = false;
		
		result = A5Exercises.containsBook(s0, b1);
		expected = false;
		displayResults(result==expected, "empty stack contains b1");
		
		result = A5Exercises.containsBook(s1, b1);
		expected = true;
		displayResults(result==expected, "s1 contains b1");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A5Exercises.containsBook(s1, b2);
		expected = false;
		displayResults(result==expected, "s1 contains b2");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A5Exercises.containsBook(s2, b1);
		expected = true;
		displayResults(result==expected, "s2 contains b1");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");
		
		result = A5Exercises.containsBook(s2, b3);
		expected = true;
		displayResults(result==expected, "s2 contains b3");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");
		
		result = A5Exercises.containsBook(s2, b4);
		expected = false;
		displayResults(result==expected, "s2 contains b4");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");
		
		result = A5Exercises.containsBook(s3, b1);
		expected = true;
		displayResults(result==expected, "s3 contains b1");
		displayResults(s3Contents.equals(s3.toString()), "stack unchanged");
		
		result = A5Exercises.containsBook(s3, b3);
		expected = true;
		displayResults(result==expected, "s3 contains b3");
		displayResults(s3Contents.equals(s3.toString()), "stack unchanged");
		
		result = A5Exercises.containsBook(s3, b6);
		expected = true;
		displayResults(result==expected, "s3 contains b4");
		displayResults(s3Contents.equals(s3.toString()), "stack unchanged");
	}
	
	public static void testStackedCorrectly() {
		System.out.println("\nStarting stackedCorrectly tests");
		
		Book b1 = new Book("Gone Girl", "Gillian Flynn", 432);
		Book b2 = new Book("Divergent", "Veronica Roth", 487);
		Book b3 = new Book("Allegiant", "Veronica Roth", 526);
		Book b4 = new Book("Hunger Games", "Suzanne Collins", 374);
		Book b5 = new Book("Mockingjay", "Suzanne Collins", 390);
		Book b6 = new Book("Jade City", "Fonda Lee", 560);
		
		Book[] arr1 = {b1}; // trivially correct
		Book[] arr2 = {b1, b2}; // stacked correctly
		Book[] arr3 = {b2, b1};
		Book[] arr4 = {b4, b5, b1, b2, b3, b6}; // stacked correctly
		Book[] arr5 = {b5, b4, b1, b2, b3, b6}; // first two out of order
		Book[] arr6 = {b4, b5, b1, b2, b6, b3}; // bottom two out of order
		Book[] arr7 = {b4, b5, b2, b1, b3, b6}; // middle two out of order
		
		A5Stack<Book> s0 = new A5Stack<Book>();
		A5Stack<Book> s1 = new A5Stack<Book>(arr1);
		A5Stack<Book> s2 = new A5Stack<Book>(arr2);
		A5Stack<Book> s3 = new A5Stack<Book>(arr3);
		A5Stack<Book> s4 = new A5Stack<Book>(arr4);
		A5Stack<Book> s5 = new A5Stack<Book>(arr5);
		A5Stack<Book> s6 = new A5Stack<Book>(arr6);
		A5Stack<Book> s7 = new A5Stack<Book>(arr7);
		String s0Contents = s0.toString();
		String s1Contents = s1.toString();
		String s2Contents = s2.toString();
		String s3Contents = s3.toString();
		String s4Contents = s4.toString();
		String s5Contents = s5.toString();
		String s6Contents = s6.toString();
		String s7Contents = s7.toString();
		
		boolean result = false;
		boolean expected = false;
		
		result = A5Exercises.stackedCorrectly(s0);
		expected = true;
		displayResults(result==expected, "empty stack stacked correctly");
		displayResults(s0Contents.equals(s0.toString()), "stack unchanged");
		
		result = A5Exercises.stackedCorrectly(s1);
		expected = true;
		displayResults(result==expected, "s1 stacked correctly");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A5Exercises.stackedCorrectly(s2);
		expected = true;
		displayResults(result==expected, "s2 stacked correctly");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");

		result = A5Exercises.stackedCorrectly(s3);
		expected = false;
		displayResults(result==expected, "s3 stacked correctly");
		displayResults(s3Contents.equals(s3.toString()), "stack unchanged");

		result = A5Exercises.stackedCorrectly(s4);
		expected = true;
		displayResults(result==expected, "s4 stacked correctly");
		displayResults(s4Contents.equals(s4.toString()), "stack unchanged");		
		
		result = A5Exercises.stackedCorrectly(s5);
		expected = false;
		displayResults(result==expected, "s5 stacked correctly");
		displayResults(s5Contents.equals(s5.toString()), "stack unchanged");

		result = A5Exercises.stackedCorrectly(s6);
		expected = false;
		displayResults(result==expected, "s6 stacked correctly");
		displayResults(s6Contents.equals(s6.toString()), "stack unchanged");
		
		result = A5Exercises.stackedCorrectly(s7);
		expected = false;
		displayResults(result==expected, "s7 stacked correctly");
		displayResults(s7Contents.equals(s7.toString()), "stack unchanged");
	}
	
	public static void displayResults (boolean passed, String testName) {
		testCount++;
		if (passed) {
			System.out.println ("Passed test: " + testName);
			testPassCount++;
		} else {
			System.out.println ("Failed test: " + testName + " at line "
				+ Thread.currentThread().getStackTrace()[2].getLineNumber());
		}
    }
}