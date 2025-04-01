public class Hashtable{
    
private static final int TABLE_SZ = 7; // a prime number

	Student[] table;
	int count;  // number of Students in the table

	public Hashtable() {
		table = new Student[TABLE_SZ];
		count = 0;
	}



	/* MethodName: insertCollisions
	 * Purpose: insert (or update entry) s in this Hashtable with no collision handling strategy
	 * Parameters: Student - s
	 * Throws:  TableFullException - if inserting a new key into a full table
	 *          CollisionException - if inserting a new key into table at index that is full
	 * Returns: nothing
	 */
	// TODO: complete this function
	public void insertCollisions(Student s) throws TableFullException, CollisionException{
		int hash = s.hashCode() % TABLE_SZ;

		if(table[hash] == null){
			table[hash] = s;
			count++;
		} else if (table[hash].equals(s)){
			table[hash].setGrade(s.getGrade());
		} else {
			if(count == TABLE_SZ){
				throw new TableFullException();
			} else {
				throw new CollisionException();
			}
		}
	}


	/* MethodName: getCollisions
	 * Purpose: find Student with sid in this Hashtable with no collision handling and returns their grade
	 * Parameters: String - sid
	 * Throws:  KeyNotFoundException  - if Student with sid is not found in table
	 * Returns: int - the grade of Student with sid
	 */
	// TODO: complete this function
	public int getCollisions(String sID) throws KeyNotFoundException{
		int hash = sID.hashCode() % TABLE_SZ;

		//Either empty spot or not the same student
		if(table[hash] == null || table[hash].getSID().compareTo(sID) != 0){
			throw new KeyNotFoundException();
		} else {
			return table[hash].getGrade();
		}
	}

	/* MethodName: insertLinearProbing
	 * Purpose: insert (or update entry) s in this Hashtable with Linear Probing to handle collisions
	 * Parameters: Student - s
	 * Throws: TableFullException  - if inserting a new key into a full table
	 * Returns: nothing
	 */
	// TODO: complete this function
	public void insertLinearProbing(Student s) throws TableFullException{
		int hash = s.hashCode() % TABLE_SZ;
		int curHash = hash;

		while(1==1){
			//Insert if possible
			if(table[curHash] == null){
				table[curHash] = s;
				return;
			}

			//Update if possible
			if(table[curHash].equals(s)){
				table[curHash].setGrade(s.getGrade());
				return;
			}
			
			curHash = (curHash+1)%TABLE_SZ;
			if(curHash == hash){
				throw new TableFullException();
			}
		}
	}



	/* getLinearProbing
	 * Purpose: find Student with sid in this Hashtable that uses Linear Probing and returns their grade
	 * Parameters: String - sid
	 * Throws:  KeyNotFoundException  - if Student with sid is not found in table
	 * Returns: int - the grade of Student with sid
	 */
	// TODO: complete this function
	public int getLinearProbing(String sID) throws KeyNotFoundException{
		int hash = sID.hashCode() % TABLE_SZ;
		int curHash = hash;

		while(1==1){
			//Excpetion if key not found
			if(table[curHash] == null){
				throw new KeyNotFoundException();
			}

			if(table[curHash].getSID().compareTo(sID) == 0){
				return table[curHash].getGrade();
			}
			
			curHash = (curHash+1)%TABLE_SZ;
			if(curHash == hash){
				throw new KeyNotFoundException();
			}
		}
	}


	/*
	 * Purpose: returns the number of elements in this Hashtable
	 * Parameters: none
	 * Returns: int - the number of elements
	 */
	public int size() {
		return count;
	}

	/*
	 * Purpose: returns a String reprensentation of elements
	 *      in this Hashtable separated by newlines
	 * Parameters: none
	 * Returns: String - the representation
	 */
	public String toString() {
		String s = "";

		for(int i=0; i<TABLE_SZ; i++) {
			if (table[i] != null) {
				s  += table[i] + "\n";
			}
		}
		
		return s;
	}
    

}
