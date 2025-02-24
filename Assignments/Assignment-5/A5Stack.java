public class A5Stack<T> implements Stack<T> {
	
	private A5Node<T> head;

	public A5Stack() {
		head = null;
	}
	
	public void push(T value) {
		A5Node<T> n = new A5Node<T>(value);
		n.next = head;
		head = n;
	}
	
	public T pop() {
		if (isEmpty()) {
			return null;
		} else {
			T toReturn = head.getData();
			head = head.next;
			return toReturn;
		} 		
	}
	
	public T top() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getData();
		} 	
	}
	
	public void popAll() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	
	
	/************
	 FOR TESTING
	************/
	
	// Create a stack from an array of items
	public A5Stack (T[] items) {
		head = null;
		for (int i = items.length-1; i >= 0; i--) {
			push(items[i]);
		}
	}
	
	public String toString() {
		if (isEmpty()) { 
			return "{}";
		}
		String s = "{";
		A5Node<T> cur = head;
		while (cur.next != null) {
			s += cur.getData().toString() + ", ";
			cur = cur.next;
		}
		s += cur.getData().toString() + "}";
		return s;
	}
	
}