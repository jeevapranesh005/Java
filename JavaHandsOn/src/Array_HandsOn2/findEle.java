package Array_HandsOn2;
import java.util.Scanner;
public class findEle {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int size = x.nextInt();
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++ ) {
			arr[i]=x.nextInt();
		}
		System.out.println("enter the element");
		int k = x.nextInt();
		boolean ele=false;
		
		for(int i :arr) {
			if(i==k) {
				ele=true;
			}
				
		}
		if(ele==true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
