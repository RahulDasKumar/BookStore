
/**
 * @author rahul
 *
 */
abstract class Items {
	int price;
	String name;
	public Items() {
		
	}
	// Creating constructors
	public Items(int price, String name) {
		this.price = price;
		this.name = name;
	}
   // Making getters and setters
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
