public class A5Node<T>{
	    
	private T data;
	protected A5Node<T> next;

	public A5Node (T value) {
		this.data = value;
		this.next = null;
	}

	/*
	 * Purpose: get the data value of this Node
	 * Parameters: nothing	 
	 * Returns: T - the data value
	 */
	public T getData() {
		return data;
	}

	/*
	 * Purpose: get the next node
	 * Parameters: nothing
	 * Returns: A5Node - the next node
	 */
	public A5Node<T> getNext() {
		return next;
	}

	/*
	 * Purpose: update the next reference for this node
	 * Parameters: A5Node next - the new next
	 * Returns: void - nothing
	 */
	public void setNext(A5Node<T> next) {
		this.next = next;
	}

}