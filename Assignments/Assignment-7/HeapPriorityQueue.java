/*
* HeapPriorityQueue.java
*
* An implementation of a minimum PriorityQueue using a heap.
* based on the implementation in "Data Structures and Algorithms
* in Java", by Goodrich and Tamassia
*
* This implementation will throw a Runtime, HeapEmptyException
*	if the heap is empty and removeMin is called.
*
* This implementation will throw a Runtime, HeapFullException
*	if the heap is full and insert is called.
*
*/
public class HeapPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {

	protected final static int DEFAULT_SIZE = 10000;
	
	protected T[] storage;
	protected int currentSize;
	
	// Feel free to change rootIndex to 0 if you want to 
	// use 0-based indexing (either option is fine)
	private static final int rootIndex = 1;

	/*
	 * Constructor that initializes the array to hold DEFAULT_SIZE elements
	 */
	@SuppressWarnings({"unchecked"})
	public HeapPriorityQueue(Class<T> dataType) {
		// Creating generics arrays in Java is not very clean. The following 
		// two lines allocate the generic array for you based on whether you
		// have selected to store the root at index 0 or 1 above.
		if (rootIndex == 0) {
			storage = (T[]) java.lang.reflect.Array.newInstance(dataType, DEFAULT_SIZE);
		} else {
			storage = (T[]) java.lang.reflect.Array.newInstance(dataType, DEFAULT_SIZE+1);
		}
		currentSize = 0;
	}
	
	/*
	 * Constructor that initializes the array to hold size elements
	 */
	@SuppressWarnings({"unchecked"})
	public HeapPriorityQueue(Class<T> clazz, int size) {
		// Creating generics arrays in Java is not very clean. The following 
		// two lines allocate the generic array for you based on whether you
		// have selected to store the root at index 0 or 1 above.
		if (rootIndex == 0) {
			storage = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
		} else {
			storage = (T[]) java.lang.reflect.Array.newInstance(clazz, size+1);
		}
		currentSize = 0;
	}

	public void insert (T element) throws HeapFullException {
		if(isFull()){
			throw new HeapFullException();
		}

		if(currentSize == 0){
			storage[rootIndex] = element;
		} else {
			storage[rootIndex + currentSize] = element;
			bubbleUp(rootIndex + currentSize);
		}	

		currentSize++;
    }
	
	private void bubbleUp(int index) {
		// TODO: implement this
		int parent = index/2;
		if(parent > 0 && (storage[parent].compareTo(storage[index]) > 0)){
			T tmp = storage[parent];
			storage[parent] = storage[index];
			storage[index] = tmp;

			bubbleUp(parent);
		}
	}
			
	public T removeMin() throws HeapEmptyException {
		if(isEmpty()){
			throw new HeapEmptyException();
		}

		T removedItem = storage[rootIndex];
		if(currentSize == 0){
			storage[rootIndex] = null;
		} else {
			storage[rootIndex] = storage[currentSize + rootIndex - 1];
			storage[currentSize + rootIndex - 1] = null;
			bubbleDown(rootIndex);
		}
		currentSize--;
		
		return removedItem;
	}
	
	private void bubbleDown(int index) {
		T root = storage[index];
		T left;
		T right;

		if((index*2) >= storage.length){
			return;
		} else if ((index*2 + 1) >= storage.length){
			left = storage[index*2];
			right = null;
		} else {
			left = storage[index*2];
			right = storage[(index*2) + 1];
		}
		
		if(left == null & right == null){
			return;
		}

		if(right == null){
			if(root.compareTo(left) < 0){
				return;
			} else {
				storage[index] = left;
				storage[index*2] = root;
				bubbleDown(index*2);
				return;
			}
		}

		if(root.compareTo(left) < 0 && root.compareTo(right) < 0){
			return;
		} else {
			if(right.compareTo(left) < 0){
				storage[index] = right;
				storage[(index*2) + 1] = root;
				bubbleDown((index*2) + 1);
 			} else {
				storage[index] = left;
				storage[index*2] = root;
				bubbleDown(index*2);
			}
		}
	}

	public boolean isEmpty(){
		return size() == 0;
	}
	
	public boolean isFull() {
		return size() >= storage.length - rootIndex;
	}
	
	public int size () {
		return currentSize; 
	}
	
	// FOR DEBUGGING:
	public String toString() {
		String s = "";
		String sep = "";
		if (rootIndex == 0) {
			for (int i = 0; i < currentSize; i++) {
				s += sep + storage[i];
				sep = " ";				
			}
		} else if (rootIndex == 1) {
			for(int i=1; i<=currentSize; i++) {
				s += sep + storage[i];
				sep = " ";
			}
		}
		return s;
	}
}
