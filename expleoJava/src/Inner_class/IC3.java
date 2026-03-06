package Inner_class;
//method local inner class
class outer1{
	int value = 56;
	public void outerClassMethod() {
		System.out.println("inside the method of outter classs");
		
		class inner1{
			public void innerClassMethod() {
				System.out.println("inside the method of inner");
				System.out.println("value : "+value);
				
			}
		}
		
		inner1 in = new inner1();
		in.innerClassMethod();
	}
}
public class IC3 {
	public static void main(String[] agrs) {
		
		outer1 ot = new outer1();
		ot.outerClassMethod();
	}

}
