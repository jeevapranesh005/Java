package String_handsOn_7;
//question_2
import java.util.Scanner;
public class myTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		String s=x.nextLine();
		char ar[]= s.toCharArray();
		int len = ar.length;
		int start=0;
		int end=len;
		for(int i =0;i<len;i++) {
			if(ar[i]==' ') {
				start++;
			}
			else {
				break;
			}
		}
		
		for(int i =len-1;i>=0;i--) {
			if(ar[i]==' ') {
				end--;
			}
			else {
				break;
			}
		}
		
		for(int i=start;i<=end;i++) {
			System.out.print(ar[i]);
		}
	}

}
