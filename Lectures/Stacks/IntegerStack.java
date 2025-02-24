public class IntegerStack implements Stack {
	
	private static final int CAPACITY = 10;
	
	private int[] data;
	private int top;
	
	public IntegerStack() {
		data = new int[CAPACITY];
		top = 0;
	}
	
	public void push(int v) {
		data[top] = v;
		top++;
	}
	
	public int pop() {
		if(top != 0){
			data[top] = 0;
			top--;
			return data[top];
		}
		return -1; 
	}
	
	public boolean isEmpty() {
		// TODO: implement this
		return top==0; // so it compiles
	}
	
	public int peek() {
		if(top != 0){
			return data[top-1];
		}
		return -1; // so it compiles
	}

}