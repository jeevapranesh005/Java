package JeevaPranesh_Assessment_13;
import java.util.Scanner;
public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print(" Enter a positive integer: ");
		int num = x.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		System.out.println();
		if(sum==num) {
			System.out.println(" The given number is perfect");
		}
		else {
			System.out.println(" The given number is not perfect\r\n"
					+ "");
		}

	}

}
