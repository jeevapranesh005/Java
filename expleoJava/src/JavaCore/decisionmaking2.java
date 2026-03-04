package JavaCore;
import java.util.Scanner;
public class decisionmaking2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seatavaliable = true;
		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the Seat number");
		String seatNo= x.next();
		if(seatavaliable) {
			System.out.println("you have booked the seat");
		}
		
	}

}
