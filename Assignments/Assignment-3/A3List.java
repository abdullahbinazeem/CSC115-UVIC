public interface A3List {

	/* 
	 * Purpose: add s to the front of the list
	 * Parameters: String s - the string to add
	 * Returns: nothing
	 * Precondition: s is not null
	 */
	public void addFront(String s);

	/* 
	 * Purpose: add s to the back of the list
	 * Parameters: String s - the string to add
	 * Returns: nothing
	 * Precondition: s is not null
	 */
	public void addBack(String s);
	
	/* 
	 * Purpose: get the current size of the list
	 * Parameters: none
	 * Returns: int - number of elements in list
	 */
	public int size(); 
	
	/* 
	 * Purpose: determines if the list is empty
	 * Parameters: none
	 * Returns: boolean - true if empty, false otherwise
	 */
	public boolean isEmpty();
	
	/* 
	 * Purpose: removes the element from the front of the list
	 * Parameters: none
	 * Returns: nothing
	 */
	public void removeFront();
	
	/* 
	 * Purpose: removes the element from the back of the list
	 * Parameters: none
	 * Returns: nothing
	 */
	public void removeBack();
	
	/*
	 * Purpose: removes the middle element(s) from this list
	 * Parameters: none
	 * Returns: void - nothing
	 * Note: - if there are an odd number of elements, 
	 *         then the middle element is removed
	 *       - if there are an even number of elements, 
	 *         then the middle TWO elements are removed
	 */
	public void removeMiddle();
	
	/* 
	 * Purpose: interleaves the list with another list
	 * Parameters: A3LinkedList other - the list to interleave with
	 * Returns: void - nothing
	 * Example:  If listA: {a1, a2, a3, a4, a5}
	 * 		    and listB: {b1, b2, b3, b4, b5}
	 *          and the two lists were interleaves, the result would
	 *           be listA: {a1, b2, a3, b4, a5}
	 *		    and listB{ {b1, a2, b3, a4, b5}.
	 *
	 * Precondition: the two lists are the same length
	 */
	public void interleave(A3LinkedList other);
}