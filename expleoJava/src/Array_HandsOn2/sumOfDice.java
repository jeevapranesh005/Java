package Array_HandsOn2;
// hard 2
import java.util.Scanner;
public class sumOfDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		
		int arun[]=new int[10];
		int naveen[]= new int[10];
		int arunSum=0;
		int naveenSum=0;
		System.out.println("Enter the value of arun");
		for(int i =0;i<10;i++) {
			arun[i]=x.nextInt();
			arunSum +=arun[i];
		}
		System.out.println("Enter the value of naveen");
		for(int i =0;i<10;i++) {
			naveen[i]=x.nextInt();
			naveenSum +=naveen[i];
			
		}
		
		if(naveenSum>arunSum) {
			System.out.println("Naveen Wins!!! ");
		}
		else if(naveenSum<arunSum) {
			System.out.println("Arun Wins!!! ");
		}
		else {
			System.out.println("Match draw!!!");
		}
		
		
		
	}

}
