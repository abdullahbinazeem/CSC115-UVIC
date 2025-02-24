public class BookNode {
	    
	private Book data;
	protected BookNode next;

	public BookNode (Book data) {
		this.data = data;
		this.next = null;
	}

	/*
	 * Purpose: get the data value of this Node
	 * Parameters: nothing	 
	 * Returns: Book - the data value (a book)
	 */
	public Book getData() {
		return data;
	}
	
	/*
	 * Purpose: get the data value of this Node
	 * Parameters: nothing	 
	 * Returns: Book - the data value (a book)
	 */
	public void setData(Book data) {
		this.data = data;
	}

	/*
	 * Purpose: get the next node in this list
	 * Parameters: nothing
	 * Returns: BookNode - the next node
	 */
	public BookNode getNext() {
		return next;
	}

	/*
	 * Purpose: update the next reference for this node
	 * Parameters: BookNode next - the new next
	 * Returns: void - nothing
	 */
	public void setNext(BookNode next) {
		this.next = next;
	}

}