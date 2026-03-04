package JavaCore;



final class a{
	 void add(int a, int b) {
		System.out.println(a+b);
	}
}
class b extends a{
	 void add(int a, int b) {
		 System.out.println("the res "+(a+b));
		
	}
}

public class FinalKeyword {
	 double pi=3.14;
	
	public FinalKeyword() {
		pi=55.5;
		System.out.println(pi);
	}
	
	public static void main(String[] args) {
		FinalKeyword fi = new FinalKeyword();
		a obj = new b();
		obj.add(2, 6);
	}
}
