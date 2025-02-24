public interface Stack {
	
	/*
	 * Purpose: insert an item onto the top of the stack
	 * Parameters: int - the item to insert 
	 * Returns: Nothing
	 */
	public void push(int v);
	
	/*
	 * Purpose: removes and returns the top item from the stack
	 * Parameters: None
	 * Returns: int - the data value of the element removed
	 *                  -1 if the stack is empty
	 */
	public int pop();
	
	/*
	 * Purpose: Accesses the top item on the stack
	 * Parameters: None
	 * Returns: int - the data value of the top element
	 *                  -1 if the stack is empty
	 */
	public int peek();

	/*
	 * Purpose: determines whether the stack is empty
	 * Parameters: None
	 * Returns: boolean - true if the stack is empty, false otherwise
	 */
	public boolean isEmpty();

}