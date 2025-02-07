public class IntegerArrayList implements IntegerList {

	private static final int INITIAL_SIZE = 10;

	private int[] data;
	private int numElements;

	public IntegerArrayList() {
		data = new int[INITIAL_SIZE];
		numElements = 0;
	}
	
	/*
	 * expandAndCopy
	 * Purpose: create a new array twice as big and
	 *          copy all elements from arr into it
	 * Parameters: int[] arr - the array to copy
	 * Return: none
	 */
	public void expandAndCopy(int[] arr) {
		int[] bigger = new int[arr.length*2];
		for (int i=0; i < arr.length; i++) {
			bigger[i] = arr[i];
		}
		data = bigger;
	}

	public void addFront(int val) {
		insertAt(0, val);
	}
	
	public void addBack(int val) {
		insertAt(numElements, val);
	}
	
	public void insertAt(int position, int val) {
		// will inserting this item go outside the array bounds?
		if (numElements >= data.length) {
			//create a bigger array, and copy values over
			expandAndCopy(data);
		}
		
		// assume now there is space in the array...
		// but we need to shuffle items to the right
		// one index so we can insert into 'position' 
		for (int i = numElements; i>position; i--) {
			data[i] = data[i-1];
		}
		// now there is a spot to insert
		data[position] = val;
		numElements++;
	}
	
	public int size() {
		return numElements;
	}
	
	public int get(int position) {
		return data[position];
	}

	/* toString
	 * Purpose: create a string representation of list
	 * Parameters: none
	 * Returns: String - the string representation of the list
	 */
	public String toString() {
		String s = "List contents:";

		for(int i=0; i<numElements; i++) {
			s += " " + data[i];
		}

		return s;
	}

}
