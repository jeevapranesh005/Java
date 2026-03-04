package Function_HandsOn_3;
import java.util.Scanner;
public class increment_the_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter the salary ");
		int sal =  x.nextInt();
		System.out.print("Enter the appraisal rating ");
		double app = x.nextDouble();
		
		System.out.println(total(sal,app));
	}
	
	public static int total(int sal,double app) {
		double res=0;
		if(app>=1 && app<=4) {
			res= sal*0.10;
			
			return(int) (res+sal);
		}
		else if(app>=4.1 && app<=7) {
			res= (sal*0.25);
			return(int) (res+sal);
		}
		else if(app>=7.1 && app<=10) {
			res=(sal*0.30);
			return(int ) (res+sal);
		}
		else {
			return sal;
		}
	}

}
