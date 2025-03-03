public class Node<T> {
	private T value;
	private Node<T> next;

	public Node(T value) {
		this.value = value;
		this.next = null;
	}

	public T getValue() {
		return this.value;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public String toString() {
		return value.toString();
	}
}