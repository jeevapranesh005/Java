package JavaHomeWork;

/**
 * find the number is divisor of 7 
    * */
import java.util.Scanner;
public class divisorOf7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = x.nextInt();
		if(num%7==0) {
			System.out.println("the number "+num+ " is divsible by 7");
		}
		else {
			System.out.println(" Not divsible by 7");
		}

	}

}
