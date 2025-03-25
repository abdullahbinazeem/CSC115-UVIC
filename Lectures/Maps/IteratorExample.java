import java.util.*;

public class IteratorExample {
	public static void main(String[] args) {
		LinkedList<Integer> entries = new LinkedList<Integer>();
		entries.add(7);
		entries.add(12);
		entries.add(2);
		entries.add(5);

		Iterator<Integer> it = entries.iterator();
		while (it.hasNext()) {
			Integer cur = it.next();
			System.out.println(cur);
		}
		
		LinkedList<String> stuff = new LinkedList<String>();
		stuff.add("csc");
		stuff.add("115");
		stuff.add("quizzes");
		stuff.add("are");
		stuff.add("fun");
		Iterator<String> iter = stuff.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	}
}