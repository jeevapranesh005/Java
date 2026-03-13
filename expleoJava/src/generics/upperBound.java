package generics;

import java.util.ArrayList;
import java.util.List;

public class upperBound {
	public static double sum(List<? extends Number>List) {
		double sum =0;
		for(Number n :List) {
			sum +=  n.doubleValue();
			
		}
		return sum;
	}
	public static void main(String[] args) {
		List <Integer> in = new ArrayList<>();
		in.add(3);
		in.add(5);
		in.add(3);
		double sum=sum(in);
		System.out.println("sum is "+sum);
		List <Float> in1 = new ArrayList<>();
		in1.add(3.2f);
		in1.add(5.3f);
		in1.add(3.4f);
		double sum1=sum(in1);
		System.out.println("sum is "+sum1);
	}

}
