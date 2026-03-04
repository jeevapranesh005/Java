package Array_HandsOn2;
// hard 3
import java.util.Scanner;
import java.util.ArrayList;
public class Standar_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
		ArrayList <Integer> arr = new ArrayList<>();
		System.out.println("enter the value");
		while(true) {
			int num = x.nextInt();
			if(num<0) {
				break;
			}
			arr.add(num);
		}
		
		for(int i=0;i<arr.size() ;i++){
			if(arr.get(i)%8==0 && arr.get(i)%7==0) {
				arr.set(i,-6);
			}
			else if(arr.get(i)%8==0) {
				arr.set(i, -9);
			}
			else if (arr.get(i)%7==0){
				arr.set(i, -2);
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
	}

}
