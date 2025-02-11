public class A4Exercises {
	
	/*
	 * Purpose: Get the number of rocks in the given collection
	 * Parameters: RockCollection r - the collect of rocks to analyze
	 * Returns: int - the number of rocks in the collection
	 */
	public static int count(RockCollection r) {
		return r.size(); // so it compiles
	}
	
	/*
	 * Purpose: Get the total sitting capacity in the collection
	 * Parameters: RockCollection r - the collect of rocks to analyze
	 * Returns: int - the total number of seats across
	 *                all rocks in the collection.
	 */
	public static int sittingCapacity(RockCollection r) {
		int sum = 0;
		for(int i = 0; i < r.size(); i++) {
			sum += r.get(i).getSeats();
		}
		return sum; // so it compiles
	}
	
	/*
	 * Purpose: Get the number of rocks in the given collection
	 *          with at least n seats. 
	 * Parameters: RockCollection r - the collect of rocks to analyze
	 * Returns: int - the number of rocks in the collection
	 *                with at least n seats
	 */
	public static int fitAtLeastN(RockCollection r, int n) {
		int count = 0;

		for(int i = 0; i < r.size(); i++) {
			if(r.get(i).getSeats() >= n){
				count++;
			}
		}
		return count; // so it compiles
	}
	
	/**
	 * Purpose: Gets the tallest rock in the given collection
	 * Parameters: RockCollection r - the collection of rocks
	 * Returns: Rock - the tallest rock, or the rock
	 *                 that comes first in the collection
	 *                 if there is a tie for tallest
	 * Precondition: there is at least one rock in the collection
	 */
	public static Rock getTallest(RockCollection r) {
		int tallestHeight = -999;
		Rock tallestRock = null;

		for(int i = 0; i < r.size(); i++){
			if(r.get(i).getHeight() > tallestHeight){
				tallestHeight = r.get(i).getHeight();
				tallestRock = r.get(i);
			}
		}
		return tallestRock;
	}
	
	/*
	 * Purpose: Get the number of visible rocks in the collection
	 * Parameters: RockCollection r - the collect of rocks to analyze
	 * Returns: int - the number of visible rocks, where a rock
	 *                is considered visible if it is not completely 
	 *                submerged below the water (see video in .pdf) 
	 */
	public static int countVisible(RockCollection r, int waterLevel) {
		int count = 0;

		for(int i = 0; i < r.size(); i++){
			if(r.get(i).getHeight() >= waterLevel){
				count++;
			}
		}
		return count; 
	}
	
	/*
	 * Purpose: Determines if someone is able to walk across the 
	 *          rocks in the collection without getting their feet wet
	 * Parameters: RockCollection r - the collect of rocks to analyze
	 * Returns: boolean - true if someone can cross the rocks, 
	 *                    false otherwise. 
	 * Note: To cross the rocks, no rocks can be submerged, and no 
	 *       rock can be more than 1 height taller than the previous
	 *       rock (otherwise it would be too high to jump to)
	 */
	public static boolean canCross(RockCollection r, int waterLevel) {
		Rock previousRock = null;
		for(int i = 0; i < r.size(); i++){
			if(r.get(i).getHeight() < waterLevel){
				return false;
			} 

			if(previousRock != null && ((previousRock.getHeight()+1) < r.get(i).getHeight())){
				return false;
			}

			previousRock = r.get(i);
		}

		return true; 
	}
}