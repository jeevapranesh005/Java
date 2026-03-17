package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile>{
	
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
		if(this.ram>o.getRam()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
public class comparable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("Apple",8,250000));
		mobileList.add(new Mobile("onepluse",4,15000));
		mobileList.add(new Mobile("samsung",2,18000));
		mobileList.add(new Mobile("cmf",18,20000));
		Collections.sort(mobileList);
		System.out.println("Mobile after sorting : ");
		System.out.println("Name : "+"\t"+"ram : "+"\t"+"price : "+"\t");
		for(Mobile mob : mobileList) {
			System.out.println(mob.getName()+ "\t" + mob.getRam() + "\t"+mob.getPrice());
		}
			
		

	}

}
