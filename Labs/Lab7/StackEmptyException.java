public class StackEmptyException extends Exception {
	private String message;
	
	public StackEmptyException (String m) {
		this.message = m;
	}

	public String toString(){
		return "StackEmptyException: " + message;
	}
}
