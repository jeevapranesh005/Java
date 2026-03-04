package JavaHomeWork;
import java.util.Scanner;
public class employeeDetails {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("enter the Wages : ");
		int wages =x.nextInt();
		System.out.print("enter the Number of days worked : ");
		int Days=x.nextInt();
		
		int res = wages*Days;
		
		System.out.println("the total salary is "+res);
	}
}
