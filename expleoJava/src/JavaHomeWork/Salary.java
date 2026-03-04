package JavaHomeWork;
//function 3
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("enter the salary ");
		int salary = x.nextInt();
		System.out.print("enter the hike ");
		int hike = x.nextInt();
		salaryHike(salary,hike);
	}
	public static void salaryHike(int salary,int hike) {
		int res= salary+(salary+hike/100);
		System.out.println("the salary Hike is "+res);
				
	}

}
