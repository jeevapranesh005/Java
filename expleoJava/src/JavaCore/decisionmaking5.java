package JavaCore;
//seat price
import java.util.Scanner;
public class decisionmaking5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("select the seat\n1.Regular\n2.Premium\n3.Executive\n4.Vip");
		Scanner x = new Scanner(System.in);
		
		String settype = x.next().toLowerCase();
		
		
		if(settype.equals("regular")) {
			System.out.println("the regulae seat price is 150");
		}
		else if(settype.equals("premium")) {
			System.out.println("the preminum seat price is 250");
		}
		else if(settype.equals("executive")) {
			System.err.println("the executive seat price is 80");
		}
		else if(settype.equals("vip")) {
			System.out.println("the vip seat price is 500");
		}
		else {
			System.out.println("you have not select the type of seat");
		}
	}

}
