package Function_HandsOn_3;
//easy4
import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = x.nextInt();
		vote(age);
	}
	
	public static void vote(int age) {
		
		if(age>=18) {
			System.out.println("elligible to vote");
		}
		else {
			System.out.println("not elligible to vote");
		}
	}

}
