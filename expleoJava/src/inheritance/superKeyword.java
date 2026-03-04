package inheritance;


class parent{
	int x=10;
	String name ="jeeva";
}
class child extends parent{
	int x = 20;
	
	void display() {
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(super.name);
	}
}


public class superKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch  = new child();
		
		ch.display();

	}

}
