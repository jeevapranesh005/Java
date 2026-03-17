package comparable;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobile {
	
	private String name;
	private int ram;
	private double price;
	
	public Mobile(String name, int ram, double price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getRam() {
		return ram;
	}
	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


class PriceCompare implements Comparator<Mobile>{

	public int compare(Mobile m1,Mobile m2) {
		// TODO Auto-generated method stub
		if(m1.getPrice()<m2.getPrice()) return -1;
		if(m1.getPrice()>m2.getPrice()) return 1;
		else return 0;
		
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}

class NameCompare implements Comparator<Mobile>{
	

	@Override
	public int compare(Mobile m1,Mobile m2) {
		// TODO Auto-generated method stub
		return m1.getName().compareTo(m2.getName());
		
	}
}


public class comparable_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("Apple",8,250000));
		mobileList.add(new Mobile("onepluse",4,15000));
		mobileList.add(new Mobile("samsung",2,18000));
		mobileList.add(new Mobile("cmf",18,20000));
		System.out.println("Sorted by price");
		PriceCompare pc = new PriceCompare();
		Collections.sort(mobileList,pc);
	}
	

}
