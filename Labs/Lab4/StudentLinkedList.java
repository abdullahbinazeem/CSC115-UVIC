public class StudentLinkedList implements StudentList {

	StudentNode head;
	int count;

	public StudentLinkedList() {
		head = null;
		count = 0;
	}

	public void add(Student s) {
		// TODO: complete
		StudentNode newNode = new StudentNode(s); 

		if (head == null) {
			head = newNode;
		} else {
			StudentNode cur = head;
			while(cur.getNext() != null){
				cur = cur.getNext();
			}
			cur.setNext(newNode);
		}

		count++;
	}

	public int size() {
		// TODO: complete
		return count;
	}

	public void removeFront() {
		// TODO: complete
		if(head == null) {
            return;
        }

		if(head.getNext() == null) {
			head = null; 
			count --;
			return;
		}

        head = head.getNext();
        count--;
	}

	public boolean contains(Student s) {
		// TODO: complete
		StudentNode cur = head;

		if(cur == null){
			return false;
		}


		if(cur.getData().getSID() == s.getSID()){
                return true;
        }
		
		while(cur.getNext() != null){
			cur = cur.getNext();
			if(cur.getData().getSID() == s.getSID()){
                return true;
            }
			
		}
		return false;
	}
	
	/*
	 * Purpose: returns a String reprensentation of elements
	 *      in this list separated by newlines
	 * Parameters: none
	 * Returns: String - the representation
	 */
	public String toString() {
		// DO NOT CHANGE THIS METHOD - it is correct
		// Changing it will result in your code getting
		// a score of 0 from the autograder for this lab
		
		String s = "";
		StudentNode tmp = head;

		while(tmp != null) {
			s  += tmp.getData() + "\n";
			tmp = tmp.next;
		}

		return s;
	}
}
