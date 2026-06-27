package Array_HandsOn2;
//hard 1
import java.util.Scanner;
public class split_chocolate {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the no.of friends");
		int fri = x.nextInt();
		System.out.println("Enter no of choloate per person");
		int arr[] = new int[fri];
		int sum=0;
		for(int i =0;i<fri;i++) {
			arr[i]= x.nextInt();
			sum=sum+arr[i];
		}
		
		if(sum%fri==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
	}
}
