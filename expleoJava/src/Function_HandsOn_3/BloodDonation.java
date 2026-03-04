package Function_HandsOn_3;
import java.util.Scanner;
//medium4
public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the weight ");
		int wig = x.nextInt();
		System.out.print("Enter the Age ");
		int age = x.nextInt();
		
		System.out.println(bloodDonate(age,wig));
	}
	public static String bloodDonate(int age,int wig) {
		
		if(age>18) {
			if(wig<55 && wig>45) {
				return (" blood donor is eligible ");
			}
			else {
				return("wight is not in perfect");
			}
		}
		else {
			return("Age is under 18");
		}
		
	}

}
