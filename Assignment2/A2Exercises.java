public class A2Exercises {
	
	
	/*
	 * Purpose: get the total cost of items across all packages	
	 *          found in the given array
	 * Parameters: Package[] array - the array of packages
	 * Returns: int - total cost of items across all packages
	 * Precondition: the array is not null (and does not
	 *               contain any null elements)
	 */	
	public static double totalCost(Package[] array) {
		// TODO: implement this method
		double sum = 0;
		
		for(int i = 0; i < array.length; i++){
			sum += array[i].costOfItems();
		}

		return sum; // so it compiles
	}
	
	/*
	 * Purpose: get the number of packages in the array with
	 *          at least n items that have a rating above the cutOff
	 * Parameters: Package[] array - the array of packages
	 *             double cutOff - ratings must be higher than cutOff
	 *             int n - the minimum number of high-rated items required
	 * Returns: int - the number of packages that contain n items thave
	 *                that have a rating above the cutOff.
	 * Precondition: the array is not null (and does not
	 *               contain any null elements)
	 */	
	public static int highRatedPackages(Package[] array, double cutOff, int n) {
		// TODO: implement this method
		int numOfHighRatedPackages = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i].countAboveRating(cutOff) >= n){
				numOfHighRatedPackages++;
			}
		}

		return numOfHighRatedPackages;
	}

	/*
	 * Purpose: create a new array of StoreItems that contains
	 *          only the most expensive item from each package
	 * Parameters: Package[] array - the array of packages
	 * Returns: StoreItem[]: the array of most expensive items
	 * Precondition: the array is not null (and does not
	 *               contain any null elements (or empty arrays))
	 */	
	public static StoreItem[] mostExpensiveItems(Package[] array) {
		// TODO: implement this method
		StoreItem[] expensivePackage = new StoreItem[array.length];

		for(int i = 0; i < array.length; i++){
			expensivePackage[i] = array[i].mostExpensive();
		}

		return expensivePackage; 
	}
	
	/*
	 * Purpose: Create a new array containing the names 
	 *          of the most expensive item in each package
	 * Parameters: Package[] array - the array of packages
	 * Returns: String[]: the array of names of most expensive items
	 * Precondition: the array is not null (and does not
	 *               contain any null elements (or empty arrays))
	 */
	public static String[] expensiveItemNames(Package[] array) {
		// TODO: implement this method
		String[] expensiveItemNames = new String[array.length];

		for(int i = 0; i < array.length; i++){
			expensiveItemNames[i] = array[i].mostExpensive().getName();
		}

		return expensiveItemNames; 
	}
	
}