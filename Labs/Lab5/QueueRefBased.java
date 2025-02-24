public class QueueRefBased implements Queue {

	private QueueNode front;
	private QueueNode back;
	// no numElements for this implementation

	public QueueRefBased() {
		front = null;
		back = null;
	}

	public int size() {
		int count = 0;

		if(isEmpty()) {
			return 0;
		}	
		
		QueueNode current = front;

		while(current!=null){
            count++;
            current = current.getNext();
        }

		return count;			
	}

	public boolean isEmpty() {
		return front==null || back==null;
	}

	public void enqueue (int value) {
		QueueNode newNode = new QueueNode(value);

		if(isEmpty()){
			front = newNode;
            back = front;
			return;
		}

		back.setNext(newNode);
		back = newNode;
	}

	public int dequeue() {
		if(isEmpty()){
			return 0;
		}
		int data = front.getValue();

		if(front.getNext() == null){
			front = null;
			back = null;

			return data;
		}

		front = front.getNext();
		return data;
	}

	public int peek()  {
		if(isEmpty()){
			return 0;
		}

		return front.getValue(); // so it compiles
	}

	public void makeEmpty() {
		front = null;
		back = null;
	}
}
