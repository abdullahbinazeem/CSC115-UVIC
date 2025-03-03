public class A6Tester {	
	private static int testPassCount = 0;
	private static int testCount = 0;	
	
	public static void main(String[] args) {
		//queueTests();
		eventLineTests();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
	}
	
	public static void queueTests() {
		System.out.println("\nTesting queue implementation");
		
		Queue<Integer> q1 = new GenericQueue<Integer>();
		Integer expected = 0;
		Integer result = 0;
		
		displayResults(q1.size()==0, "size of empty list");
		displayResults(q1.isEmpty(), "empty list is empty");
		
		q1.enqueue(2);
		displayResults(q1.size()==1, "size after inserting to front");
		displayResults(!q1.isEmpty(), "after insertion no longer empty");
		
		try {
			result = q1.peek();
			expected = 2;
			displayResults(result.equals(expected), "correct element at front of queue");
		} catch (QueueEmptyException e) {
			displayResults(false, "exception thrown when it should not have been");
		}
		
		q1.enqueue(4);
		q1.enqueue(9);
		q1.enqueue(1);
		displayResults(q1.size()==4, "size after inserting to front");
		
		try {
			result = q1.peek();
			expected = 2;
			displayResults(result.equals(expected), "correct element at front of queue");
		} catch (QueueEmptyException e) {
			displayResults(false, "exception thrown when it should not have been");
		}
		
		try {
			result = q1.dequeue();
			result = q1.dequeue();
			expected = 4;
			displayResults(result.equals(expected), "correct element at dequeued");
		} catch (QueueEmptyException e) {
			displayResults(false, "exception thrown when it should not have been");
		}
		
		try {
			result = q1.peek();
			expected = 9;
			displayResults(result.equals(expected), "correct element at front of queue");
		} catch (QueueEmptyException e) {
			displayResults(false, "exception thrown when it should not have been");
		}
		
		try {
			result = q1.dequeue();
			result = q1.dequeue();
			expected = 1;
			displayResults(result.equals(expected), "correct element at dequeued");
		} catch (QueueEmptyException e) {
			displayResults(false, "exception thrown when it should not have been");
		}
		
		displayResults(q1.size()==0, "size of empty list");
		displayResults(q1.isEmpty(), "empty list is empty");
		
		try {
			result = q1.peek();
			displayResults(false, "cannot peek when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}
		
		try {
			result = q1.dequeue();
			displayResults(false, "cannot dequeue when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}		
		
		Queue<String> q2 = new GenericQueue<String>();

		displayResults(q2.size()==0, "q2 initially has size 0");
		displayResults(q2.isEmpty(), "q2 initially empty");

		try {
			q2.peek();
			displayResults(false, "cannot peek when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}
		
		try {
			q2.dequeue();
			displayResults(false, "cannot dequeue when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}
		
		q2.enqueue(new String("csc110"));
		q2.enqueue(new String("assignment6"));
		
		displayResults(q2.size()==2, "size after two enqueues");
		displayResults(!q2.isEmpty(), "not empty after two enqueues");
		
		q2.makeEmpty();
		
		try {
			q2.peek();
			displayResults(false, "cannot peek when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}
		
		try {
			q2.dequeue();
			displayResults(false, "cannot dequeue when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}
		
		q2.enqueue(new String("more inserts"));
		
		displayResults(q2.size()==1, "size after two enqueues");
		displayResults(!q2.isEmpty(), "not empty after two enqueues");
		
		try {
			displayResults(q2.peek().equals("more inserts"), "correct element at front of queue");
		} catch (QueueEmptyException e) {
			displayResults(false, "exception thrown when it should not have been");
		}
		
		try {
			displayResults(q2.dequeue().equals("more inserts"), "correct element at dequeued from queue");
		} catch (QueueEmptyException e) {
			displayResults(false, "exception thrown when it should not have been");
		}
		
		try {
			q2.peek();
			displayResults(false, "cannot peek when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}
		
		try {
			q2.dequeue();
			displayResults(false, "cannot dequeue when queue is empty");
		} catch (QueueEmptyException e) {
			displayResults(true, "exception thrown when it should have been");
		} catch (Exception e) {
			displayResults(false, "incorrect exception thrown");
		}
	}
		
	public static void eventLineTests() {
		System.out.println("\nTesting event lineup implementation");
		
		Person p1 = new Person("Ali", 23);
		Person p2 = new Person("Juan", 23);
		Person p3 = new Person("Sam", 23);
		Person p4 = new Person("Yiyi", 23);
		Person p5 = new Person("Lee", 23);
		Person p6 = new Person("Mika", 23);
		Person p7 = new Person("Ola", 23);
		
		EventLine eLine = new EventLine();
		Person result = null;
		Person expected = null;
		boolean inserted = false;
		int numRemoved = 0;
		
		displayResults(eLine.peopleInLine()==0, "people in empty line");
		
		try {
			result = eLine.handleOne();
			displayResults(result == null, "handled person in empty line");
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled person in empty line");
		}
		
		eLine.enterLine(p1);
		displayResults(eLine.peopleInLine()==1, "people in line 1");
		eLine.enterLine(p2);
		eLine.enterLine(p3);
		eLine.enterLine(p4);
		displayResults(eLine.peopleInLine()==4, "people in line 2");
		
		
		try {
			result = eLine.handleOne();
			expected = p1;
			if (result == null) {
				displayResults(false, "handled first person in line 1");
			} else {
				displayResults(result.equals(expected), "handled first person in line 1");
			}
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 1");
		}
		
		displayResults(eLine.peopleInLine()==3, "people in line 3");
		eLine.enterLine(p5);
		eLine.enterLine(p6);
		displayResults(eLine.peopleInLine()==5, "people in line 4");
		
		try {
			inserted = eLine.premiumEntry(p7, 2);
			displayResults(inserted==true, "inserted into specific pos");
		} catch (Exception e) {
			displayResults(false, "inserted into specific pos");
		}
		
		try {
			result = eLine.handleOne();
			expected = p2;
			if (result == null) {
				displayResults(false, "handled first person in line 2");
			} else {
				displayResults(result.equals(expected), "handled first person in line 2");
			}
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 2");
		}

		try {
			result = eLine.handleOne();
			expected = p3;
			if (result == null) {
				displayResults(false, "handled first person in line 3");
			} else {
				displayResults(result.equals(expected), "handled first person in line 3");
			}
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 3");
		}

		try {
			result = eLine.handleOne();
			expected = p7;
			System.out.println(result);
			if (result == null) {
				displayResults(false, "handled first person in line 4");
			} else {
				displayResults(result.equals(expected), "handled first person in line 4");
			}
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 4");
		}
		
		displayResults(eLine.peopleInLine()==3, "people in line 4");		
		eLine.enterLine(p7);
		eLine.enterLine(p1);
		eLine.enterLine(p2);
		eLine.enterLine(p3);		
		displayResults(eLine.peopleInLine()==7, "people in line 5");
		
		try {
			numRemoved = eLine.handleMultiple(5);
			displayResults(numRemoved==5, "group of 5 enter disneyland");
		} catch (Exception e) {
			displayResults(false, "group of 5 enter disneyland");
		}
		displayResults(eLine.peopleInLine()==2, "people in line 6");
		
		try {
			numRemoved = eLine.handleMultiple(5); // buy 5 tickets, but only 2 in line
			displayResults(numRemoved==2, "group of 2 enter disneyland");
		} catch (Exception e) {
			displayResults(false, "group of 2 enter disneyland");
		}
		displayResults(eLine.peopleInLine()==0, "people in line 7");
		
		try {
			numRemoved = eLine.handleMultiple(5); // buy 5 tickets, but no one in line
			displayResults(numRemoved==0, "group of 0 enter disneyland");
		} catch (Exception e) {
			displayResults(false, "group of 0 enter disneyland");
		}
		displayResults(eLine.peopleInLine()==0, "people in line 8");		
		
		eLine.enterLine(p1);
		displayResults(eLine.peopleInLine()==1, "people in line 9");		

		try {
			inserted = eLine.premiumEntry(p2, 0); 
			displayResults(inserted==true, "inserted into specific pos");
		} catch (Exception e) {
			displayResults(false, "inserted into specific pos");
		}
		displayResults(eLine.peopleInLine()==2, "people in line 10");	

		try {
			inserted = eLine.premiumEntry(p3, 2); 
			displayResults(inserted==true, "inserted into specific pos");
		} catch (Exception e) {
			displayResults(false, "inserted into specific pos");
		}
		displayResults(eLine.peopleInLine()==3, "people in line 11");	

		try {
			inserted = eLine.premiumEntry(p4, -2); 
			displayResults(inserted==false, "inserted into specific pos");
		} catch (Exception e) {
			displayResults(false, "inserted into specific pos");
		}
		displayResults(eLine.peopleInLine()==3, "people in line 12");	

		try {
			inserted = eLine.premiumEntry(p5, 4); 
			displayResults(inserted==false, "inserted into specific pos");
		} catch (Exception e) {
			displayResults(false, "inserted into specific pos");
		}
		System.out.println(eLine.peopleInLine());
		displayResults(eLine.peopleInLine()==3, "people in line 13");		

		try {
			result = eLine.handleOne();
			expected = p2;
			if (result == null) {
				displayResults(false, "handled first person in line 5");
			} else {
				displayResults(result.equals(expected), "handled first person in line 5");
			}
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 5");
		}

		try {
			result = eLine.handleOne();
			expected = p1;
			if (result == null) {
				displayResults(false, "handled first person in line 6");
			} else {
				displayResults(result.equals(expected), "handled first person in line 6");
			}
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 6");
		}

		try {
			result = eLine.handleOne();
			expected = p3;
			if (result == null) {
				displayResults(false, "handled first person in line 7");
			} else {
				displayResults(result.equals(expected), "handled first person in line 7");
			}
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 7");
		}
		
		try {
			result = eLine.handleOne();
			displayResults(result == null, "handled first person in line 8");
		} catch (Exception e) {
			System.out.println("exception thrown");
			displayResults(false, "handled first person in line 8");
		}
	}

	public static void displayResults (boolean passed, String testName) {
		testCount++;
		if (passed) {
			System.out.println ("Passed test: " + testCount);
			testPassCount++;
		} else {
			System.out.println ("Failed test: " + testName + " at line "
								+ Thread.currentThread().getStackTrace()[2].getLineNumber());
		}
	}
}