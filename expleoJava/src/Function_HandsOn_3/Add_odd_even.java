package Function_HandsOn_3;
//easy_1
import java.util.Scanner;
public class Add_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int num=x.nextInt();
		add(num);

	}
	public static void add(int num) {
		int sumodd=0;
		int sumEven=0;
		
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				sumodd +=i;
			}
			if(i%2!=0) {
				sumEven +=i;
			}
			
		}
		
		System.out.println("even "+sumEven);
		System.out.println("even "+sumodd);
		
	}

}
