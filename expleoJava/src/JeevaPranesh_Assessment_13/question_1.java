package JeevaPranesh_Assessment_13;
import java.util.Scanner;
public class question_1 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int size = x.nextInt();
		
		int arr[]= new int[size];
		int  arr1[]=new int[size];
		
		for(int i =0;i<size;i++) {
			arr[i]=x.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			int num = arr[i];
			int temp = num;
			int sum=0;
			while(temp>0) {
				int last = temp%10;
				sum = sum+last;
				temp=temp/10;
			}
			int temp1 = sum;
			int res=0;
			while(temp1>0) {
				int last1 = temp1%10;
				res= res+last1;
				temp1 = temp1/10;
			}
			arr1[i]= res;
			
		}
		int first=0;
		int sec=0;
		int third=0;
		for(int i =0;i<size;i++) {
			if(arr1[i]==7) {
				first=i;
			}
			else if(arr1[i]==5) {
				sec=i;
			}
			else if(arr1[i]==3) {
				third=i;
			}
			
		}
		if(first>0 ||sec>0 || third>0) {
			System.out.println("First Prize is to token "+arr[first]);
			System.out.println("Second Prize is to token "+arr[sec]);
			System.out.println("Third Prize is to token: "+arr[third]);
		}
		else {
			System.out.println("No price");
		}
		
	}
}
