public class Node {
    
	private int value;
	protected Node next;

	public Node () {
		this.value = 0;
		this.next = null;
	}

	public Node (int value) {
		this.value = value;
		this.next = null;
	}

	public Node (int value, Node next) {
		this.value = value;
		this.next = next;
	}

	/* Purpose:  get the value of this Node
	 * Parameters: none
	 * Returns: int - this node's value
	 */
	public int getValue() {
		return value;
	}

	/* Purpose: set the value of this Node to value
	 * Parameters: (int) value - the new value for the node
	 * Returns: void - nothing
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/* Purpose:  get the next of this Node
	 * Parameters: none
	 * Returns: Node - the node following this node in the list
	 */
	public Node getNext() {
		return next;
	}

	/* Purpose: set the next of this Node to next
	 * Parameters: Node - the node to assign as this node's next
	 * Returns: void - nothing
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}


