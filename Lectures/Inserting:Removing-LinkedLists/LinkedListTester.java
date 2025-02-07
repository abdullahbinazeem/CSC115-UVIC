public class LinkedListTester {

	public static void main (String[] args) {
		
		//adding to new empty list starting at front
		System.out.println("Testing a new list");
		IntegerList myList2 = new IntegerLinkedList();
		
		myList2.addFront(11);
		myList2.addFront(14);
		myList2.addBack(3);
		myList2.addBack(13);

		System.out.println("List should contain: 14 11 3 13");
		System.out.println(myList2);
		System.out.println("Size is 4. Size returned: " + myList2.size());
		System.out.println("Value at pos 2 is 3. Value returned: " + myList2.get(2));
		System.out.println();

		/* The following tester code was used to test IntegerArrayList
		   change it so that it tests the IntegerLinkedList we implement */
		// IntegerList myList = new IntegerLinkedList();

		// System.out.println("Created a new IntegerList");
		// System.out.println(myList);
		// System.out.println("Size of new list: " +myList.size());
		// System.out.println();

		// myList.addBack(10);
		// myList.addBack(12);
		// myList.addBack(4);
		// myList.addBack(6);
		// myList.addBack(7);
		// System.out.println("Added 10 12 4 6 7 to back");
		// System.out.println(myList);
		// System.out.println("size of list: "+myList.size());
		// System.out.println();

		// System.out.println("Getting element at position 3");
		// System.out.println(myList.get(3));
		// System.out.println();

		// myList.addFront(15);
		// myList.addFront(71);
		// System.out.println("Added 15 to front, then 71 to front");
		// System.out.println(myList);
		// System.out.println("size of list: "+myList.size());
		// System.out.println();
		
		// myList.addFront(4);
		// myList.addFront(3);
		// myList.addFront(2);
		// myList.addFront(1);
		// System.out.println("Added 4, 3, 2, then 1 to the front");
		// System.out.println(myList);
		// System.out.println("size of list: "+myList.size());
		// System.out.println();		
		
		// myList.insertAt(2, 42);
		// myList.insertAt(5, 99);
		// System.out.println("Inserted 42 at position 2");
		// System.out.println("and then 99 at position 5");
		// System.out.println(myList);
		// System.out.println("size of list: "+myList.size());
		// System.out.println();

	}
}

