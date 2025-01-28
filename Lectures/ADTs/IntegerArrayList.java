public class IntegerArrayList implements IntegerList {

	private static final int INITIAL_SIZE = 10;

	private int[] data; // the array storing the elements
	private int numElements; // the current number of elements in the integer list

	public IntegerArrayList() {
		data = new int[INITIAL_SIZE];
		numElements = 0;
	}

	public void addFront(int val) {
		if(numElements > 0){
			for(int i = numElements-1; i >= 0; i--){
				data[i + 1] = data[i];
			}
		}
		
		data[0] = val;
		numElements++;
	}
	
	public void addBack(int val) {
		data[numElements] = val;
		numElements++;
	}

	public void insertAt(int position, int val) {
		if(numElements > 0){
			for(int i = numElements-1; i >= position; i--){
                data[i+1] = data[i];
            }
		}

		data[position] = val;
		numElements++;
	}

	public int size() {
		return numElements; // so it compiles
	}
	
	public int get(int position) {
		return data[position]; // so it compiles
	}

	/* toString
	 * Purpose: create a string representation of list
	 * Parameters: nothing
	 * Returns: (String) the string representation of the list
	 */
	public String toString() {
		String s = "List contents:";

		for(int i=0; i<numElements; i++) {
			s += " " + data[i];
		}

		return s;
	}

}
