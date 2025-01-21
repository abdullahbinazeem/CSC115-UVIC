public interface Vehicle {

	/*
	 * Purpose: determines whether it is safe to begin driving
	 * Parameters: none
	 * Returns: boolean - true if is safe, false otherwise
	 */
	public boolean safetyCheck();

	/*
	 * Purpose: drives the specified amount if it is safe to do so
	 * Parameters: int - the distance to the destination
	 * Returns: void - nothing
	 */
	public void drive(int distance);

	/*
	 * Purpose: get total KMs traveled by the vehicle
	 * Parameters: none
	 * Returns: int - total number of KMs the vehicle has driven
	 */
	public int getKMs();

}
