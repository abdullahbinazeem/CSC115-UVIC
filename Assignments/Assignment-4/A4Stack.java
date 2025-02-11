public class A4Stack<T> implements Stack<T> {
	
	private A4Node<T> head;
	// Do NOT add any other fields to this class.
	// You should be able to implement the Stack 
	// interface with just a head field
	// (and without using any loops)
	
	public A4Stack() {
		// TODO: implement this
		head = null;
	}
	 
	public void push(T value) {
		// TODO: implement this
		A4Node<T> newNode = new A4Node<T>(value);
		if(head == null){
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public T pop() {
		if(head == null){
			return null;
		}

		T data = head.getData();
		head = head.getNext();

		return data; // so it compiles
	}
	
	public void popAll() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null; // so it compiles
	}
	
	public T peek() {
		// TODO: implement this
		if(head == null){
			return null;
		}
		
		return head.getData(); // so it compiles
	}
	
	// Implemented for you for debugging purposes
	public String toString() {
		String result = "{";
		String separator = "";
		
		A4Node<T> cur = head;
		while (cur != null) {
			result += separator + cur.getData().toString();
			separator = ", ";
			cur = cur.next;
		}
	
		result += "}";
		return result;
	}
}