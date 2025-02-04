import java.util.Arrays;

public class A2Tester {
	
	private static int testPassCount = 0;
	private static int testCount = 0;
	private static double THRESHOLD = 0.1; // allowable margin of error for floating point results
	
	
	public static void main(String[] args) {
		/* Tests for methods inside Package.java */
		testConstructor();
		testCostOfItems();
		testCountAboveRating();
		testMostExpensive();
		testAddToPackage();
		
		/* Tests for methods inside A2Exercises.java */
		testTotalCost();
		testHighRatedPackages();
		testMostExpensiveItems();
		testExpensiveItemNames();
		
		System.out.println();
		System.out.println("PASSED " +testPassCount+ " / " +testCount+ " TESTS");
	}
		
	public static void testConstructor() {
		System.out.println("\nTesting Package Constructor");
		String nameResult = "";
		int shippingResult = -1;
		StoreItem[] itemsResult = null;
		
		// Not sure how to get started on this part?
		// The pre-lecture video found in Module 2: 
		// Video: Fields and Constructors
	
		// Testing default constructor
		// (the constructor with 0 arguments)
		
		Package p0 = new Package();
		nameResult = p0.getBuyerName();
		// System.out.println(nameResult); // uncomment this if the test is failing
										 // to see what your constructor is doing
		displayResults(nameResult.equals("unknown"), "empty constructor name");
		shippingResult = p0.getShipping();
		// System.out.println(shippingResult); // uncomment this if the test is failing
										   // to see what your constructor is doing
		displayResults(shippingResult==3, "empty constructor shipping");
		itemsResult = p0.getItems();
		// System.out.println(itemsResult); // uncomment this if the test is failing
										 // to see what your constructor is doing
		displayResults(itemsResult==null, "empty constructor items");
	
		// Setting up store items for Package objects
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i2  = new StoreItem("iPad", 1799.99, 4.7);
		
		StoreItem[] arr1 = {i1a, i1b};
		StoreItem[] arr2 = {i2};

		// Testing second constructor with p1 and p2
		Package p1 = new Package("psMaster", 1, arr1);
		Package p2 = new Package("buyer987", 2, arr2);
		
		String expectedName = "";
		int expectedShipping = 0;
		StoreItem[] expectedItems = null;
						
		nameResult = p1.getBuyerName();
		shippingResult = p1.getShipping();
		itemsResult = p1.getItems();
		expectedName = new String("psMaster");
		expectedShipping = 1;
		expectedItems = arr1;
		// System.out.println(nameResult); // uncomment this if the test is failing
										 // to see what your constructor is doing
		// System.out.println(shippingResult); // uncomment this if the test is failing
										   // to see what your constructor is doing
		// System.out.println(itemsResult); // uncomment this if the test is failing
										 // to see what your constructor is doing
		displayResults(expectedName.equals(nameResult), "p1 constructor name");
		displayResults(expectedShipping==shippingResult, "p1 constructor shipping");
		displayResults(Arrays.equals(itemsResult,expectedItems), "p1 constructor items");
	
		nameResult = p2.getBuyerName();
		shippingResult = p2.getShipping();
		itemsResult = p2.getItems();
		expectedName = new String("buyer987");
		expectedShipping = 2;
		expectedItems = arr2;
		// System.out.println(nameResult); // uncomment this if the test is failing
										 // to see what your constructor is doing
		// System.out.println(shippingResult); // uncomment this if the test is failing
										   // to see what your constructor is doing
		// System.out.println(itemsResult); // uncomment this if the test is failing
										 // to see what your constructor is doing
		displayResults(expectedName.equals(nameResult), "p2 constructor name");
		displayResults(expectedShipping==shippingResult, "p2 constructor shipping");
		displayResults(Arrays.equals(itemsResult,expectedItems), "p2 constructor items");

	}
	
	public static void testCostOfItems() {
		System.out.println("\nTesting costOfItems");
		
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
				
		StoreItem i2a = new StoreItem("iPad", 1799.99, 4.7);
		StoreItem i2b = new StoreItem("iPad pen", 59.99, 4.1);
		StoreItem i2c = new StoreItem("textbook", 250.00, 2.4);
		StoreItem i2d = new StoreItem("calculator", 39.99, 3.5);
						
		StoreItem i3a = new StoreItem("winter jacket", 325.00, 3.8);
		StoreItem i3b = new StoreItem("shoes", 180.00, 4.1);
		StoreItem i3c = new StoreItem("umbrella", 12.00, 1.9);
		
		StoreItem i4  = new StoreItem("fantasy novel", 19.99, 4.4);
		
		StoreItem i5a = new StoreItem("sports team jersey", 250.00, 3.7);
		StoreItem i5b = new StoreItem("sports tickets", 175.00, 4.3);
				
		StoreItem[] empty = {};
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		StoreItem[] schoolStuff = {i2a, i2b, i2c, i2d};
		StoreItem[] apparel = {i3a, i3b, i3c};
		StoreItem[] books = {i4};
		StoreItem[] sports = {i5a, i5b};
		
		Package p0 = new Package("default", 3, empty);
		Package p1 = new Package("gamerGG", 2, gamerStuff);
		Package p2 = new Package("uvic-student", 2, schoolStuff);
		Package p3 = new Package("uptownGirl", 1, apparel);
		Package p4 = new Package("hp-fan", 3, books);
		Package p5 = new Package("canucksFan", 1, sports);
		
		double result = 0;
		double expected = 0;
		
		result = p0.costOfItems();
		expected = 0.0;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "cost of items in package with 0 items");
		
		result = p1.costOfItems();
		expected = 699.99 + 89.99 + 129.99;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "cost of items in gaming package");
		
		result = p2.costOfItems();
		expected = 1799.99 + 59.99 + 250.00 + 39.99;	
		// System.out.println("result returned: " + result); // uncomment this if your test is failing		
		displayResults(Math.abs(result-expected)<THRESHOLD, "cost of items in school supplies package");
		
		result = p3.costOfItems();
		expected = 325.00 + 180.00 + 12.00;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "cost of items in clothing and apparel package");
		
		result = p4.costOfItems();
		expected = 19.99;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "cost of items in books package");
		
		result = p5.costOfItems();
		expected = 250.00 + 175.00;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "cost of items in sports package");
		
		// It is possible to create a Package that has an array of
		// items that is null. Can you make it so that youre code 
		// handles this case without crashing? Uncomment the test
		// below when you have handled this case in your code.
		
		// Package p6 = new Package("incomplete", 1, null);
		// result = p6.costOfItems();
		// expected = 0;
		// displayResults(Math.abs(result-expected)<THRESHOLD, "cost of items in incomplete package");
		
		
		// Write more tests here
		
		// It is really good practice to create some StoreItems, put them
		// in an array, and then create a Package with them in it. Then
		// call the costOfItems method on that array and ensure the result
		// returned matches the result you expect by calling displayResults.
		// (The Math.abs(result-expected)<THRESHOLD checks to make sure the 
		// difference between the expected result and the returned result
		// are within 0.1 of each other)
		
	}
	
	public static void testCountAboveRating() {
		System.out.println("\nTesting countAboveRating");
		
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
							
		StoreItem[] empty = {};
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		
		Package p0 = new Package("default", 3, empty);
		Package p1 = new Package("gamerGG", 2, gamerStuff);
		
		int result = 0;
		int expected = 0;
		double targetRating = 4.2;
		
		result = p0.countAboveRating(targetRating);
		expected = 0;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result==expected, "count above "+targetRating+" in empty package");
		
		result = p1.countAboveRating(targetRating);
		expected = 3;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result==expected, "count above "+targetRating+" in p1");
		
		targetRating = 4.3;
		result = p1.countAboveRating(targetRating);
		expected = 2;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result==expected, "count above "+targetRating+" in p1");
		
		// Write more tests here
		
	}
	
	public static void testMostExpensive() {
		System.out.println("\nTesting mostExpensive");
		 
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
				
		StoreItem i2a = new StoreItem("iPad", 1799.99, 4.7);
		StoreItem i2b = new StoreItem("iPad pen", 59.99, 4.1);
		StoreItem i2c = new StoreItem("textbook", 250.00, 2.4);
		StoreItem i2d = new StoreItem("calculator", 39.99, 3.5);
						
		StoreItem i3a = new StoreItem("winter jacket", 325.00, 3.8);
		StoreItem i3b = new StoreItem("shoes", 180.00, 4.1);
		StoreItem i3c = new StoreItem("umbrella", 12.00, 1.9);
		
		StoreItem i4  = new StoreItem("fantasy novel", 19.99, 4.4);
		
		StoreItem i5a = new StoreItem("sports team jersey", 250.00, 3.7);
		StoreItem i5b = new StoreItem("sports tickets", 175.00, 4.3);
		
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		StoreItem[] schoolStuff = {i2a, i2b, i2c, i2d};
		StoreItem[] apparel = {i3a, i3b, i3c};
		StoreItem[] books = {i4};
		StoreItem[] sports = {i5a, i5b};

		Package p1 = new Package("gamerGG", 2, gamerStuff);
		Package p2 = new Package("uvic-student", 2, schoolStuff);
		Package p3 = new Package("uptownGirl", 1, apparel);
		Package p4 = new Package("hp-fan", 3, books);
		Package p5 = new Package("canucksFan", 1, sports);
		
		StoreItem result = null;
		StoreItem expected = null;
		
		result = p1.mostExpensive();
		expected = i1a;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(expected.equals(result), "most expensive item in p1");
		
		result = p2.mostExpensive();
		expected = i2a;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(expected.equals(result), "most expensive item in p2");
		
		result = p3.mostExpensive();
		expected = i3a;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(expected.equals(result), "most expensive item in p3");
		
		result = p4.mostExpensive();
		expected = i4;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(expected.equals(result), "most expensive item in p4");
		
		result = p5.mostExpensive();
		expected = i5a;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(expected.equals(result), "most expensive item in p5");
		
		// Write more tests here 
		// There is a serious problem with the provided
		// test coverage -- what is it???
		
	}
	
	public static void testAddToPackage() {
		System.out.println("\nTesting addToPackage");
		
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
				
		StoreItem i2a = new StoreItem("iPad", 1799.99, 4.7);
		StoreItem i2b = new StoreItem("iPad pen", 59.99, 4.1);
		StoreItem i2c = new StoreItem("textbook", 250.00, 2.4);
		StoreItem i2d = new StoreItem("calculator", 39.99, 3.5);
							
		StoreItem i4  = new StoreItem("fantasy novel", 19.99, 4.4);
		
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		StoreItem[] schoolStuff = {i2a, i2b, i2c, i2d};
		StoreItem[] empty = {};
		StoreItem[] books = {i4};

		Package p1 = new Package("gamerGG", 2, gamerStuff);
		Package p2 = new Package("uvic-student", 2, schoolStuff);
		Package p3 = new Package("fakeAccount", 1, empty);
		Package p4 = new Package("hp-fan", 3, books);
		
		StoreItem[] result = null;
		StoreItem[] expected = null;
						
		StoreItem ps5Controller = new StoreItem("PS5 controller", 79.99, 4.8);
		p1.addToPackage(ps5Controller);
		result = p1.getItems();
		expected = new StoreItem[] {i1a, i1b, i1c, ps5Controller};
		// System.out.println("result returned: " + Arrays.toString(result)); // uncomment this if your test is failing
		displayResults(Arrays.equals(result, expected), "added a controller to gaming package");
		
		StoreItem pencilCase = new StoreItem("pencil case", 8.99, 3.6);
		p2.addToPackage(pencilCase);
		result = p2.getItems();
		expected = new StoreItem[] {i2a, i2b, i2c, i2d, pencilCase};
		// System.out.println("result returned: " + Arrays.toString(result)); // uncomment this if your test is failing
		displayResults(Arrays.equals(result, expected), "added a pencil case to school package");
		
		StoreItem gift = new StoreItem("restaurant gift certificate", 80.00, 4.1);
		p3.addToPackage(gift);
		result = p3.getItems();
		expected = new StoreItem[] {gift};
		// System.out.println("result returned: " + Arrays.toString(result)); // uncomment this if your test is failing
		displayResults(Arrays.equals(result, expected), "added one item to an empty package");
		
		StoreItem prequel = new StoreItem("Fantastic Beasts", 18.99, 4.4);
		p4.addToPackage(prequel);
		result = p4.getItems();
		expected = new StoreItem[] {i4, prequel};
		// System.out.println("result returned: " + Arrays.toString(result)); // uncomment this if your test is failing
		displayResults(Arrays.equals(result, expected), "added an item to a package with only 1 element");
		
		// Write more tests here 
		
	}
		
	public static void testTotalCost() {
		System.out.println("\nTesting totalCost");
		
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
				
		StoreItem i2a = new StoreItem("iPad", 1799.99, 4.7);
		StoreItem i2b = new StoreItem("iPad pen", 59.99, 4.1);
		StoreItem i2c = new StoreItem("textbook", 250.00, 2.4);
		StoreItem i2d = new StoreItem("calculator", 39.99, 3.5);
						
		StoreItem i3a = new StoreItem("winter jacket", 325.00, 3.8);
		StoreItem i3b = new StoreItem("shoes", 180.00, 4.1);
		StoreItem i3c = new StoreItem("umbrella", 12.00, 1.9);
		
		StoreItem i4  = new StoreItem("fantasy novel", 19.99, 4.4);
		
		StoreItem i5a = new StoreItem("sports team jersey", 250.00, 3.7);
		StoreItem i5b = new StoreItem("sports tickets", 175.00, 4.3);
		
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		StoreItem[] schoolStuff = {i2a, i2b, i2c, i2d};
		StoreItem[] apparel = {i3a, i3b, i3c};
		StoreItem[] books = {i4};
		StoreItem[] sports = {i5a, i5b};

		Package p1 = new Package("gamerGG", 2, gamerStuff);
		Package p2 = new Package("uvic-student", 2, schoolStuff);
		Package p3 = new Package("uptownGirl", 1, apparel);
		Package p4 = new Package("hp-fan", 3, books);
		Package p5 = new Package("canucksFan", 1, sports);
		
		Package[] arr0 = {};
		Package[] arr1 = {p1};
		Package[] arr2 = {p1, p2, p3};
		Package[] arr3 = {p1, p2, p3, p4, p5};
		
		double result = 0;
		double expected = 0;
		
		result = A2Exercises.totalCost(arr0);
		expected = 0;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "total cost of items in empty array");
		
		result = A2Exercises.totalCost(arr1);
		expected = 699.99 + 89.99 + 129.99;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "total cost of items in arr1");
	
		result = A2Exercises.totalCost(arr2);
		expected = 699.99 + 89.99 + 129.99 + 1799.99 + 59.99 + 250.00 + 39.99 + 325.00 + 180.00 + 12.00;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "total cost of items in arr2");
		
		result = A2Exercises.totalCost(arr3);
		expected = 699.99 + 89.99 + 129.99 + 1799.99 + 59.99 + 
					250.00 + 39.99 + 325.00 + 180.00 + 12.00 + 
					  19.99 + 250.00 + 175.00;
					  // System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(Math.abs(result-expected)<THRESHOLD, "total cost of items in arr3");
				
		// Write more tests here 
		// Notice how now I am creating an array of packages and calling 
		// the method in the A2Exercises class with a2Exercises.totalCost
		// Try to create at least one test yourself
				
	}
	
	public static void testHighRatedPackages() {
		System.out.println("\nTesting highRatedPackages");
		
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
				
		StoreItem i2a = new StoreItem("iPad", 1799.99, 4.7);
		StoreItem i2b = new StoreItem("iPad pen", 59.99, 4.1);
		StoreItem i2c = new StoreItem("textbook", 250.00, 2.4);
		StoreItem i2d = new StoreItem("calculator", 39.99, 3.5);
						
		StoreItem i3a = new StoreItem("winter jacket", 325.00, 3.8);
		StoreItem i3b = new StoreItem("shoes", 180.00, 4.1);
		StoreItem i3c = new StoreItem("umbrella", 12.00, 1.9);
				
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		StoreItem[] schoolStuff = {i2a, i2b, i2c, i2d};
		StoreItem[] apparel = {i3a, i3b, i3c};
		
		Package p1 = new Package("gamerGG", 2, gamerStuff);
		Package p2 = new Package("uvic-student", 2, schoolStuff);
		Package p3 = new Package("uptownGirl", 1, apparel);
		
		Package[] arr0 = {};
		Package[] arr1 = {p1};
		Package[] arr2 = {p1, p2, p3};		
		
		int result = 0;
		int expected = 0;
		
		double min = 4.0; // needs a rating above 4.0
		int needed = 2;	  // at least two of the items must be rated > 4.0
		result = A2Exercises.highRatedPackages(arr0, min, needed);
		expected = 0;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in empty array");
		
		result = A2Exercises.highRatedPackages(arr1, min, needed);
		expected = 1;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in arr1");
		
		min = 4.3; // now looking for 2 packages with ratings above 4.3
		result = A2Exercises.highRatedPackages(arr1, min, needed);
		expected = 1;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in arr1");
		
		min = 4.4; // now looking for 2 packages with ratings above 4.4
		result = A2Exercises.highRatedPackages(arr1, min, needed);
		expected = 0;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in arr1");
		
		needed = 1; // now looking for just 1 package with ratings above 4.4
		result = A2Exercises.highRatedPackages(arr1, min, needed);
		expected = 1;
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in arr1");
		
		min = 3.4; // min rating must be above 3.4
		needed = 3; // need at least three items above 3.4
		result = A2Exercises.highRatedPackages(arr2, min, needed);
		expected = 2; // package 1 and 2 meet the requirement (p3 only has 2 above 3.4)
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in arr2");
		
		needed = 2; // now only 2 items above 3.4
		result = A2Exercises.highRatedPackages(arr2, min, needed);
		expected = 3; // all packages in array meet requirement
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in arr2");
		
		min = 4.1; // min rating now must be above 4.1
		result = A2Exercises.highRatedPackages(arr2, min, needed);
		expected = 1; // only p1 meets requirement
		// System.out.println("result returned: " + result); // uncomment this if your test is failing
		displayResults(result == expected, "number with at least "+needed+" packages with a rating at least "+min+" in arr2");
		
		// Write more tests here
		
	}
	
	public static void testMostExpensiveItems() {
		System.out.println("\nTesting mostExpensiveItems");
		
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
				
		StoreItem i2a = new StoreItem("iPad", 1799.99, 4.7);
		StoreItem i2b = new StoreItem("iPad pen", 59.99, 4.1);
		StoreItem i2c = new StoreItem("textbook", 250.00, 2.4);
		StoreItem i2d = new StoreItem("calculator", 39.99, 3.5);
						
		StoreItem i3a = new StoreItem("winter jacket", 325.00, 3.8);
		StoreItem i3b = new StoreItem("shoes", 180.00, 4.1);
		StoreItem i3c = new StoreItem("umbrella", 12.00, 1.9);
		
		StoreItem i4  = new StoreItem("fantasy novel", 19.99, 4.4);
		
		StoreItem i5a = new StoreItem("sports team jersey", 250.00, 3.7);
		StoreItem i5b = new StoreItem("sports tickets", 175.00, 4.3);
		
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		StoreItem[] schoolStuff = {i2a, i2b, i2c, i2d};
		StoreItem[] apparel = {i3a, i3b, i3c};
		StoreItem[] books = {i4};
		StoreItem[] sports = {i5a, i5b};

		Package p1 = new Package("gamerGG", 2, gamerStuff);
		Package p2 = new Package("uvic-student", 2, schoolStuff);
		Package p3 = new Package("uptownGirl", 1, apparel);
		Package p4 = new Package("hp-fan", 3, books);
		Package p5 = new Package("canucksFan", 1, sports);
		
		Package[] arr1 = {p1};
		Package[] arr2 = {p1, p2, p3};
		Package[] arr3 = {p1, p2, p3, p4, p5};
		
		StoreItem[] result = null;
		StoreItem[] expected1 = {i1a};
		StoreItem[] expected2 = {i1a, i2a, i3a};
		StoreItem[] expected3 = {i1a, i2a, i3a, i4, i5a};
		
		result = A2Exercises.mostExpensiveItems(arr1);
		displayResults(Arrays.equals(result,expected1), "most expensive items in arr1");
		
		result = A2Exercises.mostExpensiveItems(arr2);
		// System.out.println(Arrays.toString(result));
		displayResults(Arrays.equals(result,expected2), "most expensive items in arr2");
		
		result = A2Exercises.mostExpensiveItems(arr3);
		// System.out.println(Arrays.toString(result));
		displayResults(Arrays.equals(result,expected3), "most expensive items in arr3");
		
		// Write more tests here.
		
	}
	
	public static void testExpensiveItemNames() {
		System.out.println("\nTesting expensiveItemNames");
		
		StoreItem i1a = new StoreItem("PS5", 699.99, 4.3);
		StoreItem i1b = new StoreItem("PS5 game", 89.99, 4.8);
		StoreItem i1c = new StoreItem("PS5 headset", 129.99, 4.4);
				
		StoreItem i2a = new StoreItem("iPad", 1799.99, 4.7);
		StoreItem i2b = new StoreItem("iPad pen", 59.99, 4.1);
		StoreItem i2c = new StoreItem("textbook", 250.00, 2.4);
		StoreItem i2d = new StoreItem("calculator", 39.99, 3.5);
						
		StoreItem i3a = new StoreItem("winter jacket", 325.00, 3.8);
		StoreItem i3b = new StoreItem("shoes", 180.00, 4.1);
		StoreItem i3c = new StoreItem("umbrella", 12.00, 1.9);
		
		StoreItem i4  = new StoreItem("fantasy novel", 19.99, 4.4);
		
		StoreItem i5a = new StoreItem("sports team jersey", 250.00, 3.7);
		StoreItem i5b = new StoreItem("sports tickets", 175.00, 4.3);
		
		StoreItem[] gamerStuff = {i1a, i1b, i1c};
		StoreItem[] schoolStuff = {i2a, i2b, i2c, i2d};
		StoreItem[] apparel = {i3a, i3b, i3c};
		StoreItem[] books = {i4};
		StoreItem[] sports = {i5a, i5b};

		Package p1 = new Package("gamerGG", 2, gamerStuff);
		Package p2 = new Package("uvic-student", 2, schoolStuff);
		Package p3 = new Package("uptownGirl", 1, apparel);
		Package p4 = new Package("hp-fan", 3, books);
		Package p5 = new Package("canucksFan", 1, sports);
		
		Package[] arr1 = {p1};
		Package[] arr2 = {p1, p2, p3};
		Package[] arr3 = {p1, p2, p3, p4, p5};
		
		String[] result = null;
		String[] expected1 = {"PS5"};
		String[] expected2 = {"PS5", "iPad", "winter jacket"};
		String[] expected3 = {"PS5", "iPad", "winter jacket", "fantasy novel", "sports team jersey"};
		
		result = A2Exercises.expensiveItemNames(arr1);
		// System.out.println(Arrays.toString(result));
		displayResults(Arrays.equals(result,expected1), "most expensive items in arr1");
		
		result = A2Exercises.expensiveItemNames(arr2);
		// System.out.println(Arrays.toString(result));
		displayResults(Arrays.equals(result,expected2), "most expensive items in arr2");
		
		result = A2Exercises.expensiveItemNames(arr3);
		// System.out.println(Arrays.toString(result));
		displayResults(Arrays.equals(result,expected3), "most expensive items in arr3");
		
		// Write more tests here.
		
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