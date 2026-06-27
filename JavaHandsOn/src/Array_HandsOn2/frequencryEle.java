package Array_HandsOn2;

import java.util.Scanner;

// easy 4
public class frequencryEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("enter the size ");
		int size = x.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter the element ");
		for(int i =0;i<size;i++) {
			arr[i]=x.nextInt();
			
		}
		
		for(int i =0;i<size;i++) {
			int count=1;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
					count++;
				}
			}
			
			if(arr[i]!=-1) {
				
				System.out.println(arr[i]+" "+count);
				
			}
		}
	}

}
