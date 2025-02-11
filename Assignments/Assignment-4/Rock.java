public class Rock {
	private int height; // height of the rock in metres
	private int seats; // how many people can stand on the rock
	
	public Rock(int height, int seats) {
		this.height = height;
		this.seats = seats;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public boolean equals(Rock other) {
		return height==other.height && seats==other.seats;
	}
}