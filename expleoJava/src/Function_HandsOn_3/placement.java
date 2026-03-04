package Function_HandsOn_3;
import java.util.Scanner;
public class placement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter the no of students placed in CS: ");
		int cs = x.nextInt();
		System.out.println("Enter the no of students placed in EC: ");
		int ec = x.nextInt();
		System.out.println("Enter the no of students placed in ME: ");
		int me = x.nextInt();
		
		if(cs==0&&ec==0&&me==0) {
			System.out.println("None of the department has got the highest placement");
		}
		else if(cs>=0 && ec>=0 && me>=0 ) {
			if(cs>ec &&cs>me) {
				System.out.println("Highest placement CS ");
			}
			else if(ec>cs && ec>me) {
				System.out.println("Highest placement EC ");
			}
			else {
				System.out.println("Highest placement ME ");
			}
		}
		else {
			System.out.println("Input is Invalid ");
		}
	}

}
