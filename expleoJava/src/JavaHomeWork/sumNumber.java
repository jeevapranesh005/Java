package JavaHomeWork;
import java.util.Scanner;
public class sumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int sum = 0;
	        int n = Math.abs(num);   // handles negative numbers

	        while (n > 0) {
	            sum = sum + (n % 10);  // get last digit
	            n = n / 10;            // remove last digit
	        }

	        System.out.println("Sum of digits = " + sum);

	}

}
