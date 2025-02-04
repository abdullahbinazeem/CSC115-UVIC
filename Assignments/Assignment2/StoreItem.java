public class StoreItem {
	private String name;
	private double price;
	private double rating; // on a scale of 1 to 5
	
	public StoreItem(String name, double price, double rating) {
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public String toString() {
		return name+": $"+String.format("%.2f", price)+" ("+String.format("%.1f", rating)+"/5)";
	}
	
	public boolean equals(StoreItem other) {
		return other != null &&
			this.name.equals(other.name)
				&& this.price == other.price
					&& this.rating == other.rating;
	}
}