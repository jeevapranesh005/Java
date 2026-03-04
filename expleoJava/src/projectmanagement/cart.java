package projectmanagement;
//Handson 4 
import java.util.List;
import java.util.ArrayList;
public class cart {
	private  List<Product> products=  new ArrayList<>();;
	
	
	
	public void addProduct(Product p) {
		products.add(p);
	}
	public void removeProduct(int Id) {
		for(Product pro: products) {
			if(pro.getId()==Id) {
				products.remove(pro);
			}
		}
	}
	public void calculateCartTotal() {
		int total = 0;
		for(Product pro : products) {
			total += pro.calculateTotal();
		}
		System.out.println("the total "+total);
	}
	
	public void displayCartItems() {
		for(Product pro : products) {
			pro.getProductDetails();
		}
	}
	
	
	
	
}
