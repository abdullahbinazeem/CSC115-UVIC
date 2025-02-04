public class Package {
	private String buyerName;
	private int shipping; // 1 is priority, 2 is express, 3 is standard
	private StoreItem[] items;
	
	public Package() {
		this.buyerName = "unknown";
		this.shipping = 3; // default
		this.items = null;
	}
	
	public Package(String buyerName, int shipping, StoreItem[] items) {
		this.buyerName = buyerName;
		this.shipping = shipping; // default
		this.items = items;
	}
	
	public String getBuyerName() {
		return buyerName;
	}
	
	public int getShipping() {
		return shipping;
	}
	
	public StoreItem[] getItems() {
		return this.items;
	}

	/*
	 * Purpose: get the total cost of all items in this package
	 * Parameters: none
	 * Returns: double - the total cost of all items in this package
	 */
	public double costOfItems() {
		double totalCost = 0;

			for(int i = 0; i < items.length; i++){
				totalCost += items[i].getPrice();
		}

		return totalCost;
	}
	
	/*
	 * Purpose: get the total number of items in this package with
	 *          a rating equal to or greater than the given rating
	 * Parameters: double rating - the minimum acceptable rating
	 * Returns: int - the total number of items with a rating
	 *                higher than the given rating
	 */
	public int countAboveRating(double rating) {
		int itemsAboveRating = 0;
		
		for(int i = 0; i < items.length; i++){
			if(items[i].getRating() > rating){
				itemsAboveRating++;
			}
		}

		return itemsAboveRating;
	}
	
	/* 
	 * Purpose: get the most expensive item in this package
	 * Parameters: none
	 * Returns: StoreItem - the most expensive item
	 * Preconditions: items is not null, and items.length > 0
	 */
	public StoreItem mostExpensive() {
		StoreItem mostExpensiveItem = items[0];

		for(int i = 0; i < items.length; i++){
			if(items[i].getPrice() > mostExpensiveItem.getPrice()){
				mostExpensiveItem = items[i];
			}
		}
		return mostExpensiveItem; // so it compiles
	}
	
	/* 
	 * Purpose: adds the new item to this package
	 * Parameters: StoreItem newItem - the item to add to the package
	 * Returns: void - nothing
	 */
	public void addToPackage(StoreItem newItem) {
		// TODO: implement this method
		StoreItem[] updatedItems = new StoreItem[items.length + 1];
		for(int i = 0; i < items.length; i++){
			updatedItems[i] = this.items[i];
		}

		updatedItems[items.length] = newItem;
		this.items = updatedItems;
	}
}