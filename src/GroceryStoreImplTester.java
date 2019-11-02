import java.util.GregorianCalendar;

/**
 * Tests the GroceryImplTester class using assert statements.
 * 
 */
public class GorceryStoreImplTester {

	public static void main(String[] args) {
		/*Creating a groceryStore Object for assert testing purposes*/
		GroceryStore.getInstance();
		
		
		//Assert to check if members can be succesfully enrolled
		assert (GroceryStore.enrollMember("n1", 612, 10.0));
		
		/*This field holds the id for the first member object
		in memberlist collection for test purposes*/
		String memberId = members.get(0).getMemberId();
		

		//Assert to check if members can be succesfully removed
		assert (GroceryStore.removeMember(memberId));
		
		/*Assert to check if removeMember works properly by returning
		false when an unknown member removal is attempted*/
		assert (!(GroceryStore.removeMember("FakeId")));
		
		//Assert to check if a product can succesfully be added
		assert (GroceryStore.addProduct("p1",3,9.99, 100));
			
		/*This field holds the productId for the first product  object
		in inventroy for test purposes*/
		String productId = productList.get(0).getProductId();
		
		
		/*Assert to check if the addition of a non-new product will be
		caught*/
		assert (!(GroceryStore.addProduct("p1",3,9.99, 100)));
		
		//Assert to check if a shipment is successfully processed
		assert (GroceryStore.processShipment(productId, 199));
		
		/*Assert to check if processShipment would return false if
		an unkown product is attempted to be sent as a shipment*/
		assert (!(GroceryStore.processShipment("FakeId", 199)));
		
		//Assert to check if a product price is successfully changed
		assert (GroceryStore.changePrice(productId, 7.45));
		

		/*Assert to check if a changePrice method returns false
		when a negative product price is entered*/
		assert (!(GroceryStore.changePrice(productId, -7.45)));
		
		
		//Assert to check if the Grocery Store object  is successfully serilized
		assert (GroceryStore.save());
		
		//Assert to check if the Grocery Store object  is successfully de-serilized
		assert (GroceryStore.retrieve);
	}
}
