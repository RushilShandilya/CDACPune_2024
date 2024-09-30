pakcage com.walmart.customer;
import com.walmart.items.Item;

public class Customer{
	private int customerID;
	private String customerName;
	private Item[] itemsBought;

	private static int customerIDGenerator = 1000;

	public Customer(){}
	public Customer(String customerName){
		customerID = customerIDGenerator++;
		this.customerName = customerName;
	}	
}
