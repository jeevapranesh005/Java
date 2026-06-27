package Function_HandsOn_3;
//medium_2
import java.util.*;
public class sums_of_the_running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		System.out.print("Enter the odd numbers from 1 to 1000 is: ");
		int odd= x.nextInt();
		System.out.print("Enter the even numbers from 1 to 1000 is: ");
		int even= x.nextInt();
		
			abs(odd,even);
		
	}
	
	public static void abs(int odd,int even) {
		int res = even-odd;
		System.out.print("The absolute difference between the two sums is: "+res);
	}

}
