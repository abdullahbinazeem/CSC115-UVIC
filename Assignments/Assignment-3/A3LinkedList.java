// Name:
// Student number: v00

public class A3LinkedList implements A3List {
	private A3Node head;
	private A3Node tail;
	private int length;
	
	public A3LinkedList() {
		head = null;
		tail = null;
		length = 0;
	}
	
	public void addFront(String s) {
		A3Node n = new A3Node(s);

		//Checks if first item
		if(head == null){
			tail = n;
		} else {
			head.setPrev(n);
			n.setNext(head);
		}
			
		//Sets head to new node
		head = n;

		//Adds to length
		length++;
	}

	public void addBack(String s) {
		A3Node n = new A3Node(s);
		
		//Checks if first item
		if(head == null){
			head = n;
		} else {
			tail.setNext(n);
			n.setPrev(tail);
		}

		//Sets tail to new node
		tail = n;

		//Adds to length
		length++;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void removeFront() {
		head = head.getNext();
		head.getPrev().setNext(null);
		head.setPrev(null);
	}
	
	public void removeBack() {
		tail = tail.getPrev();
		tail.getNext().setPrev(null);
		tail.setNext(null);
	}
	
	
	
	//////////////////
	/* PART 2 BELOW */
	//////////////////
	
	public void removeMiddle() {
		// TODO: implement this
	}
	
	
	public void interleave(A3LinkedList other) {
		// TODO: implement this
	}
	
	
	
	////////////////////////////////////////
	/* METHODS BELOW TO HELP WITH TESTING */
	////////////////////////////////////////
	
	/*
	 * Purpose: return a string representation of the list 
	 *          when traversed from front to back
	 * Parameters: none
	 * Returns: nothing
	 *
	 * USED TO HELP YOU WITH DEBUGGING
	 * DO NOT CHANGE THIS METHOD
	 */
	public String frontToBack() {
		String result = "{";
		A3Node cur = head;
		while (cur != null) {
			result += cur.getData();
			cur = cur.next;
		}
		result += "}";
		return result;
	}
	
	/*
	 * Purpose: return a string representation of the list 
	 *          when traversed from back to front
	 * Parameters: none
	 * Returns: nothing
	 *
	 * USED TO HELP YOU WITH DEBUGGING
	 * DO NOT CHANGE THIS METHOD
	 */
	public String backToFront() {
		String result = "{";
		A3Node cur = tail;
		while (cur != null) {
			result += cur.getData();
			cur = cur.prev;
		}
		result += "}";
		return result;
	}
}
	