public class MotorCycle implements Vehicle {
    
	private String model;
	private int distanceTraveled;

	public MotorCycle(String model) {
		this.model = model;
		distanceTraveled = 0;
	}

	public boolean safetyCheck() {
		// motorcycles are always safe(?)
		return true;
	}

	public void drive(int distance) {
		if (safetyCheck()) {
			int scenic = distance + 5;
			System.out.println("Taking the scenic route" +
								" and driving "+scenic+" kms");
			distanceTraveled += scenic;
		}
	}

	public int getKMs() {
		return distanceTraveled;
	}

}


