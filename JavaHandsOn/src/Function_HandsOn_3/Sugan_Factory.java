package Function_HandsOn_3;
//medium_3
import java.util.*;
public class Sugan_Factory {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the 5 employee time :");
		int emp1= x.nextInt();
		int emp2= x.nextInt();
		int emp3= x.nextInt();
		int emp4= x.nextInt();
		int emp5= x.nextInt();
		
		int arr [] = {emp1,emp2,emp3,emp4,emp5};
		overtime(arr);
	}
	
	public static void overtime(int[]arr) {
		for(int i: arr) {
			if(i>40) {
				int num=i-40;
				int tot= num*15;
				System.out.println(tot);
			}
		}
	}
}
