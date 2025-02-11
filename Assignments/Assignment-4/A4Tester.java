public class A4Tester {
	
	private static int testPassCount = 0;
	private static int testCount = 0;
	
	public static void main (String[] args)	{
		
		/* Part 1: Using the List ADT */		
		testCount();
		testSittingCapacity();
		testFitAtLeastN();
		testGetTallest();
		testCountVisible();
		testCanCross();
		
		/* Part 2: Implementing the Generic Stack ADT */
		// testStackOperations();
		// testStackIsGeneric();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
	}
	
	public static void testCount() {
		System.out.println("\nTesting count...");
		Rock r1 = new Rock(2, 3);
		Rock r2 = new Rock(4, 2);
		Rock r3 = new Rock(3, 4);
		Rock r4 = new Rock(2, 0);
		Rock r5 = new Rock(1, 5);
		Rock r6 = new Rock(3, 2);
		Rock r7 = new Rock(2, 1);
		Rock[] arr0 = {};
		Rock[] arr1 = {r1};
		Rock[] arr2 = {r1, r2, r3};
		Rock[] arr3 = {r1, r2, r3, r4, r5, r6, r7};
		RockCollection rc0 = new RockCollection(arr0);
		RockCollection rc1 = new RockCollection(arr1);
		RockCollection rc2 = new RockCollection(arr2);
		RockCollection rc3 = new RockCollection(arr3);
		
		int expected = 0;
		int result = 0;
		
		result = A4Exercises.count(rc0);
		expected = 0;
		displayResults(result==expected, "Number of rocks in empty rock collection");
		
		result = A4Exercises.count(rc1);
		expected = 1;
		displayResults(result==expected, "Number of rocks in rc1");
		
		result = A4Exercises.count(rc2);
		expected = 3;
		displayResults(result==expected, "Number of rocks in rc2");
		
		result = A4Exercises.count(rc3);
		expected = 7;
		displayResults(result==expected, "Number of rocks in rc3");
	}
	
	public static void testSittingCapacity() {
		System.out.println("\nTesting sittingCapacity...");
		Rock r1 = new Rock(2, 3);
		Rock r2 = new Rock(4, 2);
		Rock r3 = new Rock(3, 4);
		Rock r4 = new Rock(2, 0);
		Rock r5 = new Rock(1, 5);
		Rock r6 = new Rock(3, 2);
		Rock r7 = new Rock(2, 1);
		Rock[] arr0 = {};
		Rock[] arr1 = {r1};
		Rock[] arr2 = {r1, r2, r3};
		Rock[] arr3 = {r1, r2, r3, r4, r5, r6, r7};
		RockCollection rc0 = new RockCollection(arr0);
		RockCollection rc1 = new RockCollection(arr1);
		RockCollection rc2 = new RockCollection(arr2);
		RockCollection rc3 = new RockCollection(arr3);
		
		int expected = 0;
		int result = 0;
		
		result = A4Exercises.sittingCapacity(rc0);
		expected = 0;
		displayResults(result==expected, "Sitting capacity in empty rock collection");
		
		result = A4Exercises.sittingCapacity(rc1);
		expected = 3;
		displayResults(result==expected, "Sitting capacity in rc1");
		
		result = A4Exercises.sittingCapacity(rc2);
		expected = 9;
		displayResults(result==expected, "Sitting capacity in rc2");
		
		result = A4Exercises.sittingCapacity(rc3);
		expected = 17;
		displayResults(result==expected, "Sitting capacity in rc3");
	}
	
	public static void testFitAtLeastN() {
		System.out.println("\nTesting fitAtLeastN...");
		Rock r1 = new Rock(2, 3);
		Rock r2 = new Rock(4, 2);
		Rock r3 = new Rock(3, 4);
		Rock r4 = new Rock(2, 0);
		Rock r5 = new Rock(1, 5);
		Rock r6 = new Rock(3, 2);
		Rock r7 = new Rock(2, 1);
		Rock[] arr0 = {};
		Rock[] arr1 = {r1};
		Rock[] arr2 = {r1, r2, r3};
		Rock[] arr3 = {r1, r2, r3, r4, r5, r6, r7};
		RockCollection rc0 = new RockCollection(arr0);
		RockCollection rc1 = new RockCollection(arr1);
		RockCollection rc2 = new RockCollection(arr2);
		RockCollection rc3 = new RockCollection(arr3);
		
		int expected = 0;
		int result = 0;
		int n = 2;
		
		result = A4Exercises.fitAtLeastN(rc0, n);
		expected = 0;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in an empty rock collection");
		
		result = A4Exercises.fitAtLeastN(rc1, n);
		expected = 1;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in rc1");
		n = 3;
		result = A4Exercises.fitAtLeastN(rc1, n);
		expected = 1;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in rc1");
		n = 4;
		result = A4Exercises.fitAtLeastN(rc1, n);
		expected = 0;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in rc1");
		
		n = 2;
		result = A4Exercises.fitAtLeastN(rc2, n);
		expected = 3;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in rc2");
		n = 3;
		result = A4Exercises.fitAtLeastN(rc2, n);
		expected = 2;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in rc2");
		n = 4;
		result = A4Exercises.fitAtLeastN(rc2, n);
		expected = 1;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in rc2");
		n = 5;
		result = A4Exercises.fitAtLeastN(rc2, n);
		expected = 0;
		displayResults(result==expected, "Number of rocks that can fit "+n+" in rc2");
		
		// Add more tests here
		
	}
	
	public static void testGetTallest() {
		System.out.println("\nTesting getTallest...");
		Rock r1 = new Rock(2, 3);
		Rock r2 = new Rock(4, 2);
		Rock r3 = new Rock(3, 4);
		Rock r4 = new Rock(2, 0);
		Rock r5 = new Rock(1, 5);
		Rock r6 = new Rock(3, 2);
		Rock r7 = new Rock(2, 1);
		Rock[] arr1 = {r1};
		Rock[] arr2 = {r1, r2, r3};
		Rock[] arr3 = {r4, r1, r5};
		Rock[] arr4 = {r7, r3, r2, r5, r4};
		Rock[] arr5 = {r1, r3, r5, r7, r6};
		Rock[] arr6 = {r1, r2, r3, r4, r5, r6, r7};
		RockCollection rc1 = new RockCollection(arr1);
		RockCollection rc2 = new RockCollection(arr2);
		RockCollection rc3 = new RockCollection(arr3);
		RockCollection rc4 = new RockCollection(arr4);
		RockCollection rc5 = new RockCollection(arr5);
		RockCollection rc6 = new RockCollection(arr6);
		
		Rock expected;
		Rock result;
		
		result = A4Exercises.getTallest(rc1);
		expected = r1;
		displayResults(result.equals(expected), "Tallest rock in rc1");
		
		result = A4Exercises.getTallest(rc2);
		expected = r2;
		displayResults(result.equals(expected), "Tallest rock in rc2");
		
		result = A4Exercises.getTallest(rc3);
		expected = r4;
		displayResults(result.equals(expected), "Tallest rock in rc3");
		
		result = A4Exercises.getTallest(rc4);
		expected = r2;
		displayResults(result.equals(expected), "Tallest rock in rc4");
		
		// Add more tests here
	}
	
	public static void testCountVisible() {
		System.out.println("\nTesting countVisible...");
		Rock r1 = new Rock(2, 3);
		Rock r2 = new Rock(4, 2);
		Rock r3 = new Rock(3, 4);
		Rock r4 = new Rock(2, 0);
		Rock r5 = new Rock(1, 5);
		Rock r6 = new Rock(3, 2);
		Rock r7 = new Rock(2, 1);
		Rock[] arr0 = {};
		Rock[] arr1 = {r1};
		Rock[] arr2 = {r1, r2, r3};
		Rock[] arr3 = {r1, r2, r3, r4, r5, r6, r7};
		RockCollection rc0 = new RockCollection(arr0);
		RockCollection rc1 = new RockCollection(arr1);
		RockCollection rc2 = new RockCollection(arr2);
		RockCollection rc3 = new RockCollection(arr3);
		
		int expected = 0;
		int result = 0;
		
		result = A4Exercises.countVisible(rc0, 2);
		expected = 0;
		displayResults(result==expected, "Visible rocks in empty collection");
		
		result = A4Exercises.countVisible(rc1, 1);
		expected = 1;
		displayResults(result==expected, "Visible rocks in rc1 with water level at 1");
		
		result = A4Exercises.countVisible(rc1, 2);
		expected = 1;
		displayResults(result==expected, "Visible rocks in rc1 with water level at 2");
		
		result = A4Exercises.countVisible(rc1, 3);
		expected = 0;
		displayResults(result==expected, "Visible rocks in rc1 with water level at 3");
		
		
		result = A4Exercises.countVisible(rc2, 2);
		expected = 3;
		displayResults(result==expected, "Visible rocks in rc2 with water level at 2");
		
		result = A4Exercises.countVisible(rc2, 3);
		expected = 2;
		displayResults(result==expected, "Visible rocks in rc2 with water level at 3");
		
		result = A4Exercises.countVisible(rc2, 4);
		expected = 1;
		displayResults(result==expected, "Visible rocks in rc2 with water level at 4");
		
		result = A4Exercises.countVisible(rc2, 5);
		expected = 0;
		displayResults(result==expected, "Visible rocks in rc2 with water level at 5");
		
		
		// Add more tests here
		
	}
	
	public static void testCanCross() {
		System.out.println("\nTesting canCross...");
		Rock r1 = new Rock(2, 3);
		Rock r2 = new Rock(4, 2);
		Rock r3 = new Rock(3, 4);
		Rock r4 = new Rock(2, 0);
		Rock r5 = new Rock(1, 5);
		Rock r6 = new Rock(3, 2);
		Rock r7 = new Rock(2, 1);
		Rock[] arr0 = {};
		Rock[] arr1 = {r1};
		Rock[] arr2 = {r1, r2, r3};
		Rock[] arr3 = {r1, r2, r3, r4, r5, r6, r7};
		Rock[] arr4 = {r1, r3, r2, r5, r4, r6, r7};
				
		RockCollection rc0 = new RockCollection(arr0);
		RockCollection rc1 = new RockCollection(arr1);
		RockCollection rc2 = new RockCollection(arr2);
		RockCollection rc3 = new RockCollection(arr3);
		RockCollection rc4 = new RockCollection(arr4);
		
		boolean result = false;
		boolean expected = false;
		
		result = A4Exercises.canCross(rc0, 2);
		expected = true;
		displayResults(result==expected, "no rocks to jump over, so trivially easy to cross");
		
		result = A4Exercises.canCross(rc1, 2);
		expected = true;
		displayResults(result==expected, "can cross rc1 with water level 2");
		
		result = A4Exercises.canCross(rc1, 3);
		expected = false; // water too high
		displayResults(result==expected, "can cross rc1 with water level 3");
		
		result = A4Exercises.canCross(rc2, 2);
		expected = false; // can't jump high enough
		displayResults(result==expected, "can cross rc2 with water level 2");
	
		result = A4Exercises.canCross(rc3, 1);
		expected = false; // can't jump high enough
		displayResults(result==expected, "can cross rc3 with water level 1");
		
		result = A4Exercises.canCross(rc4, 1);
		expected = true;
		displayResults(result==expected, "can cross rc4 with water level 1");
		
		result = A4Exercises.canCross(rc4, 2);
		expected = false; // water too high
		displayResults(result==expected, "can cross rc4 with water level 1");
	
		// write more tests here
		
	}
	
	public static void testStackOperations() {
		System.out.println("\nTesting stack operations...");
		A4Stack<Integer> testStack = new A4Stack<Integer>();
		Integer result = 0;
		
		displayResults(testStack.isEmpty(), "stack initially empty");
				
		testStack.push(2);
		result = testStack.peek();
		displayResults(!testStack.isEmpty(), "stack no longer empty");
		displayResults(result.equals(2), "peek works after initial push");
		
		// Write more of your own tests here

	}
	
	public static void testStackIsGeneric() {
		System.out.println("\nTesting generics...");
		A4Stack<Integer> s1 = new A4Stack<Integer>();
		A4Stack<String> s2 = new A4Stack<String>();
		A4Stack<Double> s3 = new A4Stack<Double>();
		
		Integer result1;
		String result2;
		Double result3;
		
		s1.push(3);
		s1.push(8);
		s2.push("CSC");
		s2.push("ENGR");
		s3.push(5.5);
		s3.push(9.1);
		
		result1 = s1.pop();
		result2 = s2.pop();
		result3 = s3.pop();
		
		displayResults(result1.equals(8), "Integer Stack");
		displayResults(result2.equals("ENGR"), "String Stack");
		displayResults(result3.equals(9.1), "Double Stack");		

		// Write more of your own tests here
			
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