public class RockCollection implements List {

	private Rock[] array;
	private int numElements;
	
	public RockCollection(int size) {
		this.array = new Rock[size];
		this.numElements = 0;
	}
	
	public RockCollection(Rock[] array) {
		if (array == null) {
			this.array = new Rock[0];
		} else {
			this.array = array;
		}
		numElements = array.length;
	}
	
	public void expandAndCopy() {
		Rock[] newStorage = new Rock[array.length*2+1];
		for (int i = 0; i < array.length; i++) {
			newStorage[i] = array[i];
		}
		this.array = newStorage;
	}
	
	public void add(Rock r) {
		while (numElements >= array.length) {
			expandAndCopy();
		}
		array[numElements++] = r;
	}
		
	public int size() {
		return this.numElements;
	}
			
	public Rock get(int index) {
		return array[index];
	}
	
}