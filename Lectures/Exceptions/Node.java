public class Node<T> {
    
	private   T data;
	protected Node<T> next;

	public Node () {
		this.data = null;
		this.next = null;
	}

	public Node (T data) {
		this.data = data;
		this.next = null;
	}

	/* Parameters: nothing
	 * Purpose:  get the data value of this Node
	 * Returns:  int - the data value
	 */
	public T getData() {
		return data;
	}

	/* Parameters: int data
	 * Purpose:  set the data value of this Node to data
	 * Returns:  nothing
	 */
	public void setData(T data) {
		this.data = data;
	}

	/* Parameters: nothing
	 * Purpose:  get the next of this Node
	 * Returns:  (Node) the next
	 */
	public Node<T> getNext() {
		return next;
	}

	/* Parameters: Node next
	 * Purpose:  set the next of this Node to next
	 * Returns:  nothing
	 */
	public void setNext(Node<T>  next) {
		this.next = next;
	}

}