/*
 * Lab1Tester.java
 *
 * A tester for the methods in Lab1.java
 *
 */
public class Lab1Part1Tester {

	public static void main(String[] args) {
		testGetString();
		
		// Uncomment the calls to test the methods below one at a time 
		// after you have fixed all of the bugs in the previous method
		
		testGetAverage();
		testCountAbove();
		testGetMax();
		testIsSorted();
	}

	public static void testGetString() {
		System.out.println("\nTesting getString");
		String result = "";
		int[] a0 = {};
		int[] a1 = {2};
		int[] a2 = {2, 1, 3, 0};
		int[] a3 = {2, 1, 3, 2, 3};

		result = Lab1.getString(a0);
		System.out.println("should be {}: " + result);

		result = Lab1.getString(a1);
		System.out.println("should be {2}: " + result);

		result = Lab1.getString(a2);
		System.out.println("should be {2,1,3,0}: " + result);
		
		result = Lab1.getString(a3);
		System.out.println("should be {2,1,3,2,3}: " + result);
	}

	public static void testGetAverage() {
		System.out.println("\nTesting getAverage");
		double result = 0;

		result = Lab1.getAverage(0,0,9);
		System.out.println("should be approx 3.0: " + result);

		result = Lab1.getAverage(6,6,6);
		System.out.println("should be approx 6.0: " + result);
		
		result = Lab1.getAverage(3,9,5);
		System.out.println("should be approx 5.67: " + result);

	}

	public static void testCountAbove() {
		System.out.println("\nTesting countAbove");
		int[] a0 = {};
		int[] a1 = {2};
		int[] a2 = {2, 1, 3, 0};
		int[] a3 = {2, 1, 3, 2, 3};
		
		int result = 0;
		int expected = 0;
		
		result = Lab1.countAbove(a0,2);
		System.out.println("a0: " + Lab1.getString(a0));
		System.out.println("should be: " + expected);
		System.out.println("returned: " + result);

		result = Lab1.countAbove(a1,0);

		result = Lab1.countAbove(a2,-1);
		result = Lab1.countAbove(a2,0);
		result = Lab1.countAbove(a2,2);

		result = Lab1.countAbove(a3,2);
	}

	public static void testGetMax() {
		System.out.println("\nTesting getMax");
		int[] a1 = {2};
		int[] a4 = {2, 1, 3, 0};
		int[] a5 = {-1, 2, 4, 1, 2, 3};
		int[] a8 = {-4, -2, -1, -5};
		int result = 0;

		result = Lab1.getMax(a1);
		System.out.println("a1: " + Lab1.getString(a1));
		System.out.println("should be 2: " + result);

		result = Lab1.getMax(a4);
		System.out.println("a4: " + Lab1.getString(a4));
		System.out.println("should be 3: " + result);

		result = Lab1.getMax(a5);
		System.out.println("a5: " + Lab1.getString(a5));
		System.out.println("should be 4: " + result);

		result = Lab1.getMax(a8);
		System.out.println("a8: " + Lab1.getString(a8));
		System.out.println("should be -1: " + result);

	}

	public static void testIsSorted() {
		System.out.println("\nTesting isSorted");
		int[] a0 = {};
		int[] a1 = {2};
		int[] a4 = {2, 1, 3, 0};
		int[] a5 = {-1, 2, 4, 1, 2, 3};
		int[] a6 = {-1, 2, 4, 5, 9};
		int[] a7 = {-1, 2, 4, 4, 9};
		int[] a8 = {-4, -2, -1, -5};
		boolean result = true;

		result = Lab1.isSorted(a0);
		System.out.println("a0: " + Lab1.getString(a0));
		System.out.println("should be true: " + result);

		result = Lab1.isSorted(a1);
		System.out.println("a1: " + Lab1.getString(a1));
		System.out.println("should be true: " + result);

		result = Lab1.isSorted(a6);
		System.out.println("a6: " + Lab1.getString(a6));
		System.out.println("should be true: " + result);

		result = Lab1.isSorted(a7);
		System.out.println("a7: " + Lab1.getString(a7));
		System.out.println("should be true: " + result);

		result = Lab1.isSorted(a4);
		System.out.println("a4: " + Lab1.getString(a4));
		System.out.println("should be false: " + result);

		result = Lab1.isSorted(a5);
		System.out.println("a5: " + Lab1.getString(a5));
		System.out.println("should be false: " + result);
	}

}
