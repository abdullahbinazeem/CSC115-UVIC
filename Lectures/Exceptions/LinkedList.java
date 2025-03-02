class OffListException extends Exception {}

public class LinkedList<T> {

	private Node<T> head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	/* Parameters: (int) i
	 * Purpose:  add i to the front of the list
	 * Returns:  nothing
	 */
	public void addFront (T i) {
		Node<T> n = new Node<T>(i);
		n.next = head;
		head = n;
		size++;
	}

	/* Parameters: (int) i
	 * Purpose:  add i to the back of the list
	 * Returns:  nothing
	 */
	public void addBack (T i){
		Node<T> n = new Node<T>(i);
		if(head == null) {
			head = n;
		} else {
			Node<T> cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = n;
		}
		size++;
	}

	/* Parameters: nothing
	 * Purpose:  get the size of the list
	 * Returns:  (int) size
	 */
	public int size () {
		return size;
	}


	/* Parameters: (int) position
	 * Purpose:  get the data value at specified position in the list
	 * Returns:  (int) the data value
	 * Precondition: 0 <= position < list.size()
	 */
	public T get (int position) {
		Node<T> cur = head;
		for(int i = 0; i < position; i++) {
			cur = cur.next;
		}
		return cur.getData();
	}

	/* Parameters: nothing
	 * Purpose: create a string representation of list
	 * Returns: (String) the string representation
	 */
	public String toString() {
		String s = "list contents:";
		Node cur = head;

		while(cur != null) {
			s += " " + cur.getData();
			cur = cur.next;
		}
		return s;
	}
}