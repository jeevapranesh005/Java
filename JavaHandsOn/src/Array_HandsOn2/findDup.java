package Array_HandsOn2;
//count a total number of duplicate and unique elements
import java.util.Scanner;
public class findDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner (System.in);
		System.out.println("Enter array size: ");
		int size = x.nextInt();
		
		int arr[]= new int[size];
		System.out.println("Array elements are:");
		
		for(int i=0;i<size;i++) {
			arr[i]=x.nextInt();
		}
		
		int dup=0;
		int temp=-1;
		int uniq=0;
		int ind=0;
		int arr1[]= new int[size];
		for(int i=0;i<size;i++) {
			int count=1;
			for(int j =i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=temp;
					count++;
				}
				
				
			}
			
			if(arr[i]!=-1) {
				System.out.print(arr[i]+" ");
				System.out.println(count);
				arr1[ind]=count;
				ind++;
				
			}
		}
		
		for(int i=0; i<ind; i++) {
		    if(arr1[i] < 2) {
		        uniq++;
		    } else {
		        dup++;
		    }
		}
		
		System.out.println("No of duplicate element: "+dup);
		System.out.println("No of unique elements:"+ uniq);
		


	}

}
