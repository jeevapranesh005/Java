package Function_HandsOn_3;
//easy3
import java.util.Scanner;
public class salary_hike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the old salary");
		int old=x.nextInt();
		System.out.println("Enter the hike");
		int hike=x.nextInt();
		
		newsalary(old,  hike);
	}
	
	public static void newsalary(int old, int hike) {
		int newslary = old+(old*hike/100);
		System.out.print("the new Salary is ");
		System.out.println(newslary);
	}

}
