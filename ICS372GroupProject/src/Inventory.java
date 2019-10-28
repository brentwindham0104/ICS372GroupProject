import java.util.LinkedList;
import java.util.Iterator;

public class Inventory {
	private LinkedList<Product> productList = new LinkedList<Product>();
	private static Inventory inventory;
	
	public static Inventory getInstance() {
		//TODO
	}
	
	private Inventory() {
		//TODO
	}
	
	public boolean addProduct(Product product) {
		//TODO
	}
	
	public boolean removeProduct(String productId) {
		//TODO
	}
	
	public Product findProduct(String productId) {
		//TODO
	}
	
	public Iterator getProducts() {
		//TODO
	}
}
