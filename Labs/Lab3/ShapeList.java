public class ShapeList{
    
	private static final int DEFAULT_SIZE = 2;

	private Shape[] elements;
	private int count;
	private int maxSize = DEFAULT_SIZE;

	public ShapeList() {
		elements = new Shape[maxSize];
		count = 0;
	}

	/*
	 * Purpose: returns the number of elements in list
	 * Parameters: none
	 * Returns: int - the number of elements
	 */
	public int size() {
		return count;
	}

	/*
	 * Purpose: adds Shape s to back of this list
	 * Parameters: Shape - s
	 * Returns: nothing
	 *
	 * IMPLEMENTATION NOTE: if elements is full, a new
	 * array should be created to hold all of the original
	 * elements and also shape s.
	 */
	public void add(Shape s) {
		if(count >= (maxSize-1)){
			maxSize = count*2;
			Shape[] newShape = new Shape[maxSize];
			
		
			for(int i = 0; i < count; i++){
				newShape[i] = elements[i];
			}
			newShape[count] = s;

			elements = newShape;
		} else {
			elements[count] = s;
		}
		

		count++;
	}

	/*
	 * Purpose: returns a String reprensentation of the elements
	 *      in this list separated by newlines
	 * Parameters: none
	 * Returns: String - the representation
	 */
	public String toString() {
		String s = "";

		for(int i=0; i<count; i++) {
			s  += elements[i] + "\n";
		}

		return s;
	}

	/*
	 * Purpose: removes the first element in this list
	 * Parameters: none
	 * Returns: nothing
	 *
	 * IMPLEMENTATION NOTE: After removing the first element,
	 * all other elements should be shuffled forward 
	 * so that there are no gaps in the array.
	 */
	public void removeFront() {
		// You are not required to implement this method for lab 2
		// It is here as an additional exercise for those of you
		// who would like a little more practice working with 
		// arrays of objects in Java.
	}
    
    
}
