public interface List {

	/* 
	 * Purpose: add r to the back of the list
	 * Parameters: Rock r - the rock to add
	 * Returns: nothing
	 * Precondition: r is not null
	 */
	public void add(Rock r);
		
	/* 
	 * Purpose: get the current size of the list
	 * Parameters: none
	 * Returns: int - number of rocks in the list
	 */
	public int size(); 
			
	/* 
	 * Purpose: gets the rock at the given index in the list
	 * Parameters: int index - the index of the rock to access
	 * Returns: Rock - the rock at the given index
	 * Precondition: 0 <= index < size()
	 */
	public Rock get(int index);
	
}