package JeevaPranesh_Assessment_13;
import java.util.Scanner;
public class question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int start = x.nextInt();
		int end = x.nextInt();
		
		for(int i =start;i<=end;i++) {
			
			if(i%10==0) {
				System.out.println("dong");
				
			}
			else if(i%5==0) {
				System.out.println("ding");
			}
			else {
				System.out.println( i+" ");
			}
		}
		
		

	}

}
