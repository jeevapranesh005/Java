package projectmanagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(1,"car",50,2);
		Product p2 = new Product(2,"bike",30,2);
		
		cart c = new cart();
		c.addProduct(p1);
		c.addProduct(p2);
		
		c.removeProduct(1);
		c.displayCartItems();
		

	}

}
