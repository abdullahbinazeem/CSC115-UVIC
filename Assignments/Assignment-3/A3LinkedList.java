// Name: Abdullah Azeen
// Student number: v01053750

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

	//Added Function by Student for interleave
	public A3Node getHead() {
		return head;
	}
	
	public void removeFront() {
		if(head == null) {
			return;
		}

		if(head.getNext() == null){
			head = null;
			tail = null;
		} else {
			head = head.getNext();
			head.getPrev().setNext(null);
			head.setPrev(null);
		}
		
	}
	
	public void removeBack() {
		if(head == null) {
			return;
		} 

		if(head.getNext() == null){
			head = null;
			tail = null;
		} else {
			tail = tail.getPrev();
			tail.getNext().setPrev(null);
			tail.setNext(null);
		}
	}
	
	
	
	//////////////////
	/* PART 2 BELOW */
	//////////////////
	
	public void removeMiddle() {
		//Do nothing if the list is already empty
		if(length == 0 || head == null || tail == null) {
			return;
		}

		//Checks if length is even or odd
		if(length % 2 == 0) {
			//Length is even

			int steps = (length / 2) - 1;
			A3Node cur = head;
			//Find middle element - 1
			for(int i = 0; i < steps; i++){
				cur = cur.getNext();
			}

			//If only two elements, empy the list
			if(cur.getNext().getNext() != null){
				cur.getNext().getNext().setPrev(cur.getPrev());
				cur.getPrev().setNext(cur.getNext().getNext());
			} else {
				head = null;
				tail = null;
			}
		} else {
			//Length is odd
			
			int steps = length / 2;
			A3Node cur = head;
			//Find middle elemnt
			for(int i = 0; i < steps; i++){
				cur = cur.getNext();
			}
			
			//If only one elements, empy the list
			if(cur.getNext() != null){
				cur.getNext().setPrev(cur.getPrev());
				cur.getPrev().setNext(cur.getNext());
			} else {
				head = null;
				tail = null;
			}
		}
		length--;
	}
	
	
	public void interleave(A3LinkedList other) {
		if(head == null) {
			return;
		}

		A3Node listCur = head;
		A3Node otherCur = other.getHead();
		for(int i = 0; i < (other.size()-1); i++){
			listCur.getNext().setPrev(otherCur);
			otherCur.getNext().setPrev(listCur);

			A3Node curNext = listCur.getNext();
			A3Node otherNext = otherCur.getNext();

			listCur.setNext(otherCur.getNext());
			otherCur.setNext(curNext);
			
			otherCur = otherNext;
			listCur = curNext;
		}
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
	