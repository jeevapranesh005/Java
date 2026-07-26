package handsOn4;
import java.util.*;
public class product {
	int id;
	String name;
	double price;
	int quantity;
	public product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void setQuantity(int n) {
		if(n>0){
			this.quantity=quantity;
		}
	}
	public int getProductid() {
		return id;
	}
	public double calculateTotal() {
		return price*quantity;
	}
	void getProductdetails() {
		System.out.println("     Product details");
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Total cost : "+calculateTotal());
	}
	
}
