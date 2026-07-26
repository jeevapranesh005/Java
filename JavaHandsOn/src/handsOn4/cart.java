package handsOn4;

import java.util.ArrayList;

public class cart {
    ArrayList<product> p=new ArrayList<>();
    public void addProduct(product p1) {
    	p.add(p1);
    }
    public void removeProduct(int id) {
    	for(product i:p) {
    		if(i.getProductid()==id) {
    			p.remove(i);
    			System.out.println("Successfully removed");
    			break;
    		}
    	}
    }
    public void calculatetotal() {
    	int t=0;
    	for(product i:p) {
    		t+=i.calculateTotal();
    	}
    	System.out.println("Total cart price details : "+t);
    }
    public void displayCart() {
    	for(product i:p) {
    		i.getProductdetails();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product(1,"lap",100,2);
		product p2=new product(11,"phone",1000,3);
		cart c=new cart();
		c.addProduct(p1);
		c.addProduct(p2);
		c.displayCart();
		c.calculatetotal();
	}

}
