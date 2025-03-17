/*
 * represents a system to handle patients waiting in an emergency room in a hospital
 */
public class EmergencyRoom {

	private PriorityQueue<Patient> patients;
	// DO NOT ADD ANY ADDITIONAL FIELDS. YOU SHOULD BE ABLE TO 
	// SOLVE ALL THE PROBLEMS BELOW WITH JUST THE FIELD PROVIDED.

	/* 
 	 * constructor that initializes passengers to a default-sized priority queue
	 */
	public EmergencyRoom() {
		// DO NOT CHANGE THIS
		patients = new HeapPriorityQueue<Patient>(Patient.class);
	}

	/* 
	 * constructor that initializes passengers to a priority queue of given size
	 */
	public EmergencyRoom(int size) {
		// DO NOT CHANGE THIS
		patients = new HeapPriorityQueue<Patient>(Patient.class, size);
	}


	/* Purpose: add given Patient p to patients or prints
	 *          a notification message if patients is full
	 * Parameters: Patient p - the patient who just arrived at
	 *             the emergency room and needs to be added
	 * Returns: void - nothing
	 */
	public void addPatient(Patient p) {
		try{
			patients.insert(p);
		} catch (HeapFullException e){
			return;
		}
	}


	/* Purpose: gets the number of patients waiting to be helped
	 * Parameters: none
	 * Returns: int - number of patients waiting to be helped
	 */
	public int numPatientsWaiting() {
		return patients.size(); 
	}


	/* Purpose: removes and returns the next patient from patients
	 * Parameters: none
	 * Returns: Patient - the next patient, null if there is no more patients.
	 */
	public Patient nextPatient() {
		try{
			Patient removed = patients.removeMin();
			return removed;
		} catch (HeapEmptyException e){
			return null;
		}
	}
}

