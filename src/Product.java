
public class Product {
	private String productId;
	private String name;
	private int quantity;
	private int minimumLevel;
	private double price;
	
	public Product(String name, int quantity, int minimumLevel, double price) {
		
	}

	public String getProductId() {
		return productId;
	}

	public boolean setProductId(String productId) {
		this.productId = productId;
		return true;
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean setQuantity(int quantity) {
		this.quantity = quantity;
		return true;
	}

	public int getMinimumLevel() {
		return minimumLevel;
	}

	public boolean setMinimumLevel(int minimumLevel) {
		this.minimumLevel = minimumLevel;
		return true;
	}

	public double getPrice() {
		return price;
	}

	public boolean setPrice(double price) {
		this.price = price;

		return true;
	}
}
