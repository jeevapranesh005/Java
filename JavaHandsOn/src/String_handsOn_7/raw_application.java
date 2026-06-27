package String_handsOn_7;
import java.util.Scanner;
public class raw_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner x = new Scanner(System.in);
		

		System.out.println("user= ");
		String name =x.nextLine();
		System.out.println("Password= ");
		String pass= x.nextLine();
		System.out.println("IP= ");
		String ip = x.nextLine();
		System.out.println("Status= ");
		String sta = x.nextLine();
		 System.out.println(ip);
		
		System.out.print("user= ");
		System.out.println(name);
		 
		
		 System.out.print("Password= ");
		 int paslen = pass.length();
		 for(int i=0;i<paslen;i++) {
			 System.out.print('*');
		 }
		 
		 
		 System.out.println();
		 System.out.print("IP= ");
		char splits[]=ip.toCharArray();
		for(int i=0;i<splits.length;i++) {
			if(splits[i]=='.') {
				System.out.print('.');
			}
			else {
				System.out.print('x');
			}
		}
		
		
		System.out.println();
		System.out.print("Status= ");
		System.out.println(sta);
		
		
		
	}

}
