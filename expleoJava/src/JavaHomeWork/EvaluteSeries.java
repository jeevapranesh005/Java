package JavaHomeWork;
import java.util.Scanner;
public class EvaluteSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int num =x.nextInt();
		int input= 0;
		int i=0;
		do {
			i=i+input;
			input++;
		}while(input<=num);
		
		System.out.println("the result is "+i);
	}

}
