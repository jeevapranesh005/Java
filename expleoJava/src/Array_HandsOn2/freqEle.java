package Array_HandsOn2;

import java.util.Scanner;

public class freqEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		int arr[] = {10,10,10,10,20,20,20,20,40,40,50,50,30};
		int size = arr.length;

		
		int temp=-1;
		
		for(int i =0;i<size;i++) {
			int count=1;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=temp;
					count++;
				}
			}
		//	System.out.println("the element are");
			if(arr[i]!=temp) {
				System.out.println(arr[i] +" "+count);
			}
		}
		

	}

}
