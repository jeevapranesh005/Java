package Array_HandsOn2;
// hard 
import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the m ");
		int m = x.nextInt();
		int arr1[]= new int[m];
		for(int i =0;i<m;i++) {
			arr1[i]=x.nextInt();
		}
		System.out.println("Enter the n");
		int n = x.nextInt();
		int arr2[]= new int[n];
		for(int i =0;i<n;i++) {
			arr2[i]=x.nextInt();
		}
		System.out.println("Enter the o");
		int o = x.nextInt();
		int arr3[]= new int[o];
		for(int i =0;i<o;i++) {
			arr3[i]=x.nextInt();
		}
		
		int size=m+n+o;
		int fin[]= new int [size];
		
		for(int i=0;i<m;i++) {
			fin[i]=arr1[i];
		}
		for(int i=0;i<n;i++) {
			fin[m+i]=arr2[i];
		}
		for(int i=0;i<o;i++) {
			fin[m+n+i]=arr3[i];
		}
		
		
		for(int i =0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(fin[i]>fin[j]) {
					int temp=fin[i];
					fin[i]=fin[j];
					fin[j]=temp;
				}
			}
		}
		
		
		//output
		
		for(int num : fin) {
			System.out.print(num+" ");
		}
		
	}

}
