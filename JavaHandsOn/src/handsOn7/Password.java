package handsOn7;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String username=s.nextLine();
		String password=s.nextLine();
		String Ip=s.nextLine();
		String status=s.nextLine();
		password=password.replaceAll(password, "***********");
		Ip=Ip.replaceAll(Ip, "xxxx.xxxx.xxxx.xxxx");
		System.out.println("User name : "+username+" Password : "+password+" Ip : "+Ip+" Status : "+status);
		
		
	}

}
