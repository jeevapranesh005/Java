package inheritance;

public class class12 extends parent12 {
	void animal() {
		System.out.println("small animal");
	}
	
	void cat() {
		super.animal();
		System.out.println("elephant");
	}

}
