package Inner_class;


class outerclass{
	int age=10;
	public void checkAge() {
		System.out.println("the age is printed");
	}
	class innerclass{
		 public void show() {
			System.out.println("the show() is worked");
			
		}
	}
}

public class IC1 {  //inner class 1

	public static void main(String[] args) {
		
		outerclass out = new outerclass();
		out.checkAge();
	
		
		outerclass.innerclass inner = out.new innerclass();
			inner.show();
			
		
			
			
			
		}

}
