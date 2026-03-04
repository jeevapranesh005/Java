package Array_HandsOn2;
//easy-7
import java.util.*;
public class merge {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int m = x.nextInt();
		int arr1[]= new int[m];
		for(int i =0;i<m;i++) {
			arr1[i]=x.nextInt();
		}
		
		System.out.println("Enter size of 2nd array");
		int n = x.nextInt();
		int arr2[]= new int[n];
		for(int i =0;i<n;i++) {
			arr2[i]=x.nextInt();
		}
		
		int size = m+n;
		int arr3[] = new int[size];
		for(int i=0;i<m;i++) {
			arr3[i]=arr1[i];
		}
		for(int i =0;i<n;i++) {
			arr3[m+i]=arr2[i];
		}
		
		
		System.out.println("the 1st arry is ");
		for(int num1: arr1) {
			System.out.print(num1+" ");
		}
		System.out.println();
		System.out.println("the 2nd arry is ");
		for(int num1: arr2) {
			System.out.print(num1+" ");
		}
		System.out.println();
		System.out.println("the 3rd arry is ");
		for(int num1: arr3) {
			System.out.print(num1+" ");
		}
		
	}
}
