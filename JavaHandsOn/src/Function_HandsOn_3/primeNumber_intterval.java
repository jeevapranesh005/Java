package Function_HandsOn_3;
//medium2
import java.util.*;
public class primeNumber_intterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("enter the starting no : ");
		int st = x.nextInt();
		System.out.print("enter the end no : ");
		int end = x.nextInt();
		
		prime(st,end);
		
	}
	
	public static void prime(int st, int end) {
		
		for(int i=st;i<=end;i++) {
			int count=0;
			for(int j =2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count<2) {
				System.out.print(i+" ");
			}
		}
	}

}
