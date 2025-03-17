public class LinkedPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {
	Node<T>	front;
	Node<T>	back;
	int	count;

	public LinkedPriorityQueue() {
		front = null;
		back = null;
		count = 0;
	}

 	public void insert (T key) {
		Node<T> nn = new Node<T>(key);

		// add to front if empty
		if(front == null) {
			front = nn;
			back = nn;
			count++;
			return;
		}	
		
		// add to back if priority is lower than lowest in this Queue
		if((back.getElement()).compareTo(key) < 0) {
			append(nn);	
			return;
		}

		// find node-after in q that has lower priority than nn
		Node<T> after = front;	 
		
		while(after!=null && (after.getElement()).compareTo(key) < 0) {
			after = after.next;
		}
	
		// insert nn into q before node-after
		insertBefore(nn, after);
	}

	public T removeMin() {
		if (count == 0) {
			throw new HeapEmptyException();
		}
		
		T retval = front.getElement();
		front = front.next;
		if(front != null) {
			front.prev = null;
		}
		count--;
		
		if (count == 0) {
			back = null;
		}
		
		return retval;
	}

	private void append (Node<T> n) {
		n.prev = back;
		if(back == null) {
			front = n;
		} else {
			back.next = n;
		}
		
		back = n;
		count++;
	}
	
	private void insertBefore (Node<T> n, Node<T> after) {
	
		if(after == null) {
			append(n);
			return;
		}
		n.next = after;
		n.prev = after.prev;
		after.prev = n;
		if(n.prev == null) {
			front = n;
		} else {
			n.prev.next = n;
		}
		
		count++;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
			
	public int size() {
		return count;
	}
	
	public String toString() {
		String s = "";
		Node<T> cur = front;
		while(cur != null) {
			s += cur.getElement().toString() + " ";
			cur = cur.next;	
		}	
		return s;
	}	
}

