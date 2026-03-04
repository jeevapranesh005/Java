package JeevaPranesh_Assessment_13;
import java.util.Scanner;
public class question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		int arr[]= new int[10];
		int index=0;
		System.out.println("Enter the scores (enter a negative number to stop input): ");
		for(int i=0;i<10;i++) {
			int num = x.nextInt();
			if(num>0) {
				arr[index]=num;
				index++;
			}
			else {
				break;
			}
		}
		System.out.println("Scores before processing:");
		for(int i : arr) {
			if(i!=0) {
				System.out.print(i+" ");
			}
		}
		int arr1[]= new int[10];
		int ind=0;
		for(int i : arr) {
			if(i!=0) {
				if(i%2==0) {
					if(i%8==0) {
						arr1[ind]=2;
						
						
						
						ind++;
					}
					else {
						arr1[ind]=0;
						ind++;
					}
					
				}
				else if(i%2!=0) {
					if(i%3==0 && i%9==0) {
						arr1[ind]=3;
						ind++;
					}
					else if(i%9==0) {
						arr1[ind]=4;
						ind++;
					}
					else {
						arr1[ind]=1;
						ind++;
					}
				}
			}
		}
		
		System.out.println("Scores after processing:");
		for(int i:arr1) {
			if(i!=0)
			System.out.print(i+" ");
		}
		

	}

}
