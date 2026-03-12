package String_handsOn_7;
//question_1
import java.util.Scanner;
public class removes_all_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String s= x.nextLine();
		int len = s.length();
		
		
		char ar[]=s.toCharArray();
		char tep ='1';
		for(int i=0;i<len;i++) {
			int count =1;
			for(int j =i+1;j<len;j++) {
				if(ar[i]==ar[j]) {
					ar[j]=tep;
					count++;
				}
			}
			if(ar[i]!='1') {
				System.out.print(ar[i]);
			}
		}

	}

}
