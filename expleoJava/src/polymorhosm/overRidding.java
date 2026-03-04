package polymorhosm;


class animal{
	void sound() {
		System.out.println("animal sound");
	}
	
}
class dog extends animal{
	void sound() {
		System.out.println("dog bark");
	}
	void eat() {
		System.out.println("all");
	}
	
}
public class overRidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a = new dog();   //upcasting
		a.sound();
		a.eat();
		
	}

}
