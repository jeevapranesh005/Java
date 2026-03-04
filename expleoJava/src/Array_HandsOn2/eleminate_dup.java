package Array_HandsOn2;
import java.util.Scanner;
public class eleminate_dup {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the size :");
		int size = x.nextInt();
		
		System.out.println("Enter the element");
		int arr[] = new int[size];
		for(int i =0;i<size ;i++) {
			arr[i]=x.nextInt();
			}
		
		int temp=-1;
		
		for(int i =0;i<size;i++) {
			int count=1;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=temp;
					count++;
				}
			}
			
			if(arr[i]!=temp) {
				System.out.println(arr[i]);
			}
		}
	}

}
