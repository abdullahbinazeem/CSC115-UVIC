public class Node<T extends Comparable<T>> {
	protected T element;
	protected Node<T> prev;
	protected Node<T> next;

	public Node() {
		this(null,null,null);
	}

	public Node(T element) {
		this(element, null, null);
	}
	
	public Node(T element, Node<T> next, Node<T> prev) {
		this.element = element;
		this.prev = prev;
		this.next = next;
	}
	
	public T getElement() {
		return this.element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
}