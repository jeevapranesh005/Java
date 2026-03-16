package Collection;

import java.util.ArrayList;

public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("inital size "+arr.size());
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println("array size "+arr.size());
		System.out.println("array ele is "+arr);
		
		Integer[] arr1 = new Integer [arr.size()];
		arr1 = arr.toArray(arr1);  // ele put into the array
		
		int sum=0;
		for(int i : arr1) {
			sum +=i;
		}
		System.out.println("total sum is "+sum );
		
	}

}
