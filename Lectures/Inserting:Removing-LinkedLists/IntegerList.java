public interface IntegerList {
    
	/* Purpose:  add val to the front of the list
	 * Parameters: int val - the value to insert
	 * Returns: void - nothing
	 */
	void addFront (int val);

	/* Purpose:  add val to the back of the list
	 * Parameters: int val - the value to insert
	 * Returns: void - nothing
	 */
	void addBack (int val);
	
	/* Purpose: get the number of elements in the list
	 * Parameters: none
	 * Returns: int - number of elements in list
	 */
	int size ();

	/* Purpose:  get the int value at specified position in the list
	 * Parameters: int position - a 0-based position
	 * Returns: int - the value of the element
	 * Precondition: 0 <= position < list.size()
	 */
	int get (int position);
	
	/* Purpose: insert val into the specified position while
	 *          maintaining the order of all other positions
	 * Parameters: int position - the 0-based position to insert
	 *             int val - the value to insert
	 * Returns: void - nothing
	 * Precondition: 0 <= position <= list.size()
	 */
	void insertAt (int position, int val);
    
}

