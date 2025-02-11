public class A4Stack<T> implements Stack<T> {
	
	private A4Node<T> head;
	// Do NOT add any other fields to this class.
	// You should be able to implement the Stack 
	// interface with just a head field
	// (and without using any loops)
	
	public A4Stack() {
		// TODO: implement this
	}
	
	public void push(T value) {
		// TODO: implement this
	}
	
	public T pop() {
		// TODO: implement this
		return null; // so it compiles
	}
	
	public void popAll() {
		// TODO: implement this
	}
	
	public boolean isEmpty() {
		// TODO: implement this
		return false; // so it compiles
	}
	
	public T peek() {
		// TODO: implement this
		return null; // so it compiles
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