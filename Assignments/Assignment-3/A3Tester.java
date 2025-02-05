/*
 * A3Tester
 *
 * A class to test the methods required for Assignment 3
 *
 */
public class A3Tester {
    
	private static int testPassCount = 0;
	private static int testCount = 0;

    public static void main(String[] args) {
		
		/*
		Uncomment each method one at a time, 
		and implement the method in A3LinkedList.java 
		until all tests pass. It is strongly
		recommended that you add additional tests 
		to ensure the correctness of your implementation.
		*/
		
		/* Part 1: */
		// testAddFront();
		// testAddBack();
		// testSizeAndIsEmpty();
		// testRemoveFront();
		 testRemoveBack();
		
		/* Part 2 */
		// testRemoveMiddle();
		// testInterleave();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
    }
	
		
	public static void testAddFront() {
		System.out.println("\nTesting addFront...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testAddFront");
		
		list1.addFront("A");
		result = list1.frontToBack();
		displayResults(result.equals("{A}"), "testAddFront");
		
		list1.addFront("V");
		list1.addFront("A");
		list1.addFront("J");
		result = list1.frontToBack();
		displayResults(result.equals("{JAVA}"), "testAddFront");
		result = list1.backToFront();
		displayResults(result.equals("{AVAJ}"), "testAddFront");
	}
	
	public static void testAddBack() {
		System.out.println("\nTesting addBack...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testAddBack");
		
		list1.addBack("F");
		result = list1.frontToBack();
		displayResults(result.equals("{F}"), "testAddBack");
		
		list1.addBack("U");
		list1.addBack("N");
		result = list1.frontToBack();
		displayResults(result.equals("{FUN}"), "testAddBack");
		result = list1.backToFront();
		displayResults(result.equals("{NUF}"), "testAddBack");
	}
	
	public static void testSizeAndIsEmpty() {
		System.out.println("\nTesting size and isEmpty...");
		int result = 0;
		A3LinkedList list1 = new A3LinkedList();

		result = list1.size();
		displayResults(result==0, "testSizeAndIsEmpty");
		displayResults(list1.isEmpty()==true, "testSizeAndIsEmpty");
		
		list1.addFront("C");
		list1.addFront("S");
		list1.addFront("C");
		result = list1.size();
		displayResults(result==3, "testSizeAndIsEmpty");
		displayResults(list1.isEmpty()==false, "testSizeAndIsEmpty");
		
		list1.addBack("115");
		result = list1.size();
		displayResults(result==4, "testSizeAndIsEmpty");
		
	}
	
	public static void testRemoveFront() {
		System.out.println("\nTesting removeFront...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		list1.addBack("P");
		list1.addBack("I");
		list1.addBack("N");
		list1.addBack("K");
		result = list1.frontToBack();
		displayResults(result.equals("{PINK}"), "testRemoveFront");
		
		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{INK}"), "testRemoveFront");
		
		/* Write additional tests here to ensure all of your pointers
		   have been updated correctly.
		
		   You should also ensure that your size and isEmpty 
		   methods work with removal as well as addition */
		
		A3LinkedList list2 = new A3LinkedList();
		list2.addBack("P");
		list2.removeFront();
		result = list2.frontToBack();
		displayResults(result.equals("{}"), "testRemoveFront, 1 element");

		A3LinkedList list3 = new A3LinkedList();
		list3.removeFront();
		result = list3.frontToBack();
		displayResults(result.equals("{}"), "testRemoveFront, 0 element");
	}
	
	public static void testRemoveBack() {
		System.out.println("\nTesting removeBack...");
		// Write all of your own tests here 
		A3LinkedList list1 = new A3LinkedList();
		list1.addBack("P");
		list1.addBack("I");
		list1.addBack("N");
		list1.addBack("K");
		
		list1.removeBack();
		String result = list1.backToFront();
		displayResults(result.equals("{NIP}"), "testRemoveFront");


		A3LinkedList list2 = new A3LinkedList();
		list2.addBack("P");
		list2.removeBack();
		result = list2.backToFront();
		displayResults(result.equals("{}"), "testRemoveBack, 1 element");

		A3LinkedList list3 = new A3LinkedList();
		list3.removeBack();
		result = list3.backToFront();
		displayResults(result.equals("{}"), "testRemoveBack, 0 element");
	}
	
	public static void testRemoveMiddle() {
		System.out.println("\nTesting removeMiddle...");
		
		A3LinkedList list1 = new A3LinkedList();
		String result1 = "";
		list1.addBack("T");
		list1.addBack("A");
		list1.addBack("B");
		list1.addBack("L");
		list1.addBack("E");
		
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{TALE}"), "frontToBack after removeMiddle called on TABLE");
		result1 = list1.backToFront();
		displayResults(result1.equals("{ELAT}"), "backToFront after removeMiddle called on TABLE");
		
		
		list1 = new A3LinkedList();
		list1.addBack("B");
		list1.addBack("E");
		list1.addBack("T");
		list1.addBack("T");
		list1.addBack("E");
		list1.addBack("R");
		
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{BEER}"), "frontToBack after removeMiddle called on BETTER");
		result1 = list1.backToFront();
		displayResults(result1.equals("{REEB}"), "backToFront after removeMiddle called on BETTER");
		
		list1 = new A3LinkedList();
		list1.addBack("A");
		
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{}"), "frontToBack after removeMiddle called on length 1");
		result1 = list1.backToFront();
		displayResults(result1.equals("{}"), "backToFront after removeMiddle called on length 1");
		
		// Write additional tests here to ensure all of your pointers
		// and other fields have been updated correctly.

		A3LinkedList test1 = new A3LinkedList();		
		test1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{}"), "length 0 test");

		A3LinkedList test2 = new A3LinkedList();		
		test2.addBack("A");
		test2.addBack("B");
		test2.removeMiddle();
		
		result1 = list1.frontToBack();
		displayResults(result1.equals("{}"), "length 2 test");
	}
	
	
	public static void testInterleave() {
		System.out.println("\nTesting interleave...");
		A3LinkedList list1 = new A3LinkedList();
		A3LinkedList list2 = new A3LinkedList();
		String result1 = "";
		String result2 = "";
		
		list1.addBack("A");
		list1.addBack("B");
		list1.addBack("C");
		list1.addBack("D");
		list1.addBack("E");
		list1.addBack("F");
		list1.addBack("G");
		result1 = list1.frontToBack();
		displayResults(result1.equals("{ABCDEFG}"), "testInterleave, original first list is ABCDEFG");
		
		list2.addBack("L");
		list2.addBack("M");
		list2.addBack("N");
		list2.addBack("O");
		list2.addBack("P");
		list2.addBack("Q");
		list2.addBack("R");
		result2 = list2.frontToBack();
		displayResults(result2.equals("{LMNOPQR}"), "testInterleave, original second list is LMNOPQR");
		
		list1.interleave(list2);
		result1 = list1.frontToBack();
		result2 = list2.frontToBack();

		String result1b = list1.backToFront();
		String result2b = list2.backToFront();
		
		displayResults(result1.equals("{AMCOEQG}"), "after interleave, first list now contains AMCOEQG");
		displayResults(result2.equals("{LBNDPFR}"), "after interleave, second list now contains LBNDPFR");

		// Write additional tests here to ensure all of your pointers
		// have been updated correctly.

		// Even numbers of elements test
		A3LinkedList test1list1 = new A3LinkedList();
		A3LinkedList test1list2 = new A3LinkedList();
		
		test1list1.addBack("A");
		test1list1.addBack("B");
		test1list1.addBack("C");
		test1list1.addBack("D");
		test1list1.addBack("E");
		test1list1.addBack("F");

		test1list2.addBack("L");
		test1list2.addBack("M");
		test1list2.addBack("N");
		test1list2.addBack("O");
		test1list2.addBack("P");
		test1list2.addBack("Q");

		test1list1.interleave(test1list2);
		result1 = test1list1.frontToBack();
		result2 = test1list2.frontToBack();
		displayResults(result1.equals("{AMCOEQ}"), "after interleave, even test");
		displayResults(result2.equals("{LBNDPF}"), "after interleave, even test");

		A3LinkedList test2list1 = new A3LinkedList();
		A3LinkedList test2list2 = new A3LinkedList();
		
		test2list1.addBack("A");
		test2list2.addBack("B");

		test2list1.interleave(test2list2);
		result1 = test2list1.frontToBack();
		result2 = test2list2.frontToBack();
		displayResults(result1.equals("{A}"), "after interleave, one element test");
		displayResults(result2.equals("{B}"), "after interleave, one element test");
	}
	
	public static void displayResults (boolean passed, String testName) {
       /* There is some magic going on here getting the line number
        * Borrowed from:
        * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
        */
        
        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
    }
	
}
