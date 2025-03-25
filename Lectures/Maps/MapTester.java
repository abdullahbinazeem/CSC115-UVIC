import java.util.*;

public class MapTester {
	private static int testPassCount = 0;
	private static int testCount = 0;
	
	public static void main(String[] args) {
		
		testMapOperations();
		//testMapGeneric();		
		
		System.out.println("Passed "+testPassCount+ "/" +testCount+" tests");
	}
	
	public static void testMapOperations() {
		Map<Integer, String> map1 = new ListMap<Integer, String>();
		
		displayResults(map1.size()==0, "empty size");
		
		map1.put(104, "Ali");
		map1.put(145, "Taylor");
		map1.put(384, "Li");
		
		System.out.println();
		System.out.println(map1);
		
		displayResults(map1.size()==3, "size after insertions");
		displayResults(map1.containsKey(104), "map should contain a key 104");
		
		try {
			displayResults(map1.get(104).equals("Ali"), "get value for key 104");
		} catch (KeyNotFoundException e) {
			displayResults(false, "exception thrown when it shouldn't");
		}
		
		try {
			map1.get(105);
			displayResults(false, "get an item for which a key does not exist");
		} catch (KeyNotFoundException e) {
			displayResults(true, "exception thrown correctly, key not in map");
		}
		
		displayResults(!map1.containsKey(234), "map does not yet contain key 234");
		map1.put(234, "Sam");
		displayResults(map1.size()==4, "size added after insertions");
		displayResults(map1.containsKey(234), "map now contains key 234");
		
		try {
			displayResults(map1.get(145).equals("Taylor"), "get value for key 145 should be Taylor");
		} catch (KeyNotFoundException e) {
			displayResults(false, "map should be able to find key 145");
		}
		map1.put(145, "Mia");
		displayResults(map1.size()==4, "size added after insertions");
		try {
			displayResults(map1.get(145).equals("Mia"), "get value for key 145 should now be Mia");
		} catch (KeyNotFoundException e) {
			displayResults(false, "map should be able to find key 145");
		}
		
	
		// List<Entry<Integer, String>> entries = map1.entryList();
		// Entry<Integer, String> e1 = entries.get(0);
		// System.out.println(e1);
		// Entry<Integer, String> e2 = new Entry<Integer, String>(104, "Ali");
		// System.out.println(e2);
		// displayResults(entries.contains(e2), "entryList returns correct list");
		
		//System.out.println(entries);
		
		// Can we use an iterator here?
			
	}
	
	public static void testMapGeneric() {
		Map<String, String> map2 = new ListMap<String, String>();
		
		map2.put("homework", "school work assigned to be done outside the classroom");
		map2.put("test", "a set of questions to assess whether learning objectives have been met");
		map2.put("student", "a person formally engaged in learning");
		map2.put("lecture", "a speech delivered before a class");
		
		displayResults(map2.size()==4, "size added after insertions");
		displayResults(map2.containsKey("test"), "containsKey");
		map2.remove("test");
		displayResults(map2.size()==3, "remove key, then size");
		displayResults(!map2.containsKey("test"), "no longer contains key");
		
		Map<String, Double> map3 = new ListMap<String, Double>();
		map3.put("Sam", 8.9);
		map3.put("Alex", 7.2);
		map3.put("Jules", 9.6);
		
		displayResults(map3.size()==3, "size added after insertions");
		displayResults(map3.containsKey("Jules"), "containsKey");
		map3.remove("Jules");
		displayResults(map3.size()==2, "remove key, then size");
		displayResults(!map3.containsKey("Jules"), "no longer contains key");
	}
	
	public static void displayResults (boolean passed, String testName) {
		/* There is some magic going on here getting the line number
		* Borrowed from:
		* http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
		*/
		
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