public class StackTester {

	private static int testPassCount = 0;
	private static int testCount = 0;

	public static void main(String[] args) {
		
		testStackOperations();
		testUseStack();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
	}
	
	public static void testStackOperations() {
		System.out.println("\nTesting stack operations");
		
		IntegerStack myStack = new IntegerStack();
		int result;

		displayResults(myStack.isEmpty()==true, "isEmpty test1");

		myStack.push(4);
		displayResults(myStack.isEmpty()==false, "isEmpty test2");
		
		result = myStack.peek();
		displayResults(result==4, "top test1");

		myStack.push(7);
		myStack.push(2);
		result = myStack.peek();
		displayResults(result==2, "top test2");

		result = myStack.pop();
		displayResults(result==2, "pop test1");
		result = myStack.peek();
		displayResults(result==7, "top test2");

		myStack.push(8);
		myStack.push(1);
		myStack.push(2);
		myStack.push(6);
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		
		displayResults(myStack.isEmpty()==true, "isEmpty test3");
		
		result = myStack.pop();
		
		displayResults(myStack.isEmpty()==true, "isEmpty test4");
		displayResults(result==-1, "popping empty stack returns -1");
		
		myStack.push(3);
		
		displayResults(myStack.isEmpty()==false, "isEmpty test5");
		displayResults(myStack.peek()==3, "top is now 3");
	}
	
	public static void testUseStack() {
		System.out.println("\nTesting stack use");
		
		IntegerStack s0 = new IntegerStack();
		IntegerStack s1 = new IntegerStack();
		
		s1.push(7);
		s1.push(1);
		s1.push(3);
		s1.push(4);
		
		int result = 0;
		int expected = 0;
		int top = 0;
		
		result = sumElements(s0);
		displayResults(result==expected, "sum elements of empty stack");
		
		top = s1.peek();
		displayResults(top == 4, "top is 4");
		
		result = sumElements(s1);
		expected = 7 + 1 + 3 + 4;
		System.out.println("result = " + result);
		displayResults(result==expected, "sum elements of s1");
		
		top = s1.peek();
		displayResults(top == 4, "stack unchanged after sum: top is still 4");
	}
	
	/*
	 * Purpose: sum all elements in the given stack
	 * Parameters: IntegerStack s
	 * Returns: int - the sum of all element values
	 * Postcondition: the contents of s are unchanged
	 */
	public static int sumElements(IntegerStack s) {
		int sum = 0;

		while(s.peek() != -1){
			sum += s.peek();
			s.pop();
		}
		
		
		return sum; // so it compiles
	}

	public static void displayResults (boolean passed, String testName) {
		/* There is some magic going on here getting the line number
		* Borrowed from:
		* http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
		*/

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