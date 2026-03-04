package JavaCore;

public class typeConversion {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a= 100;
		double b = a;   // (implicit)
		int c = (int)b;  // (explict)
		System.out.println(b); // int to double
		System.out.println(c);  // double to int 
		
		
		// type promation
		byte d = 50;
		d= (byte)(d*10);
		System.out.println(d);
		
		byte aa=12;
		char bb='b';
		short cc=11;
		int dd=222;
		
		double res =aa+b+cc+dd;
		 System.out.println(res);
		
		
		
		
		
		
	}
}
