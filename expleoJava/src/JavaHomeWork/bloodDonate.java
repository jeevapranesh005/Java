package JavaHomeWork;
import java.util.Scanner;
public class bloodDonate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter age: ");
	        int age = sc.nextInt();

	        System.out.print("Enter weight (kg): ");
	        int weight = sc.nextInt();

	        if (age > 18 && age < 55) {
	            if (weight > 45) {
	                System.out.println("Eligible for blood donation");
	            } else {
	                System.out.println("Not eligible: Weight must be more than 45 kg");
	            }
	        } else {
	            System.out.println("Not eligible: Age must be above 18 and below 55");
	        }


	}

}
