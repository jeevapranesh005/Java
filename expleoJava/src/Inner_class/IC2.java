package Inner_class;

//static nested class...
class person{
	int age = 21;
	static int weight=45;
	
	 class gender{
		void nonStaticDisplay() {
			System.out.println("in non static display method");
			System.out.println("weigth value :"+weight);
		}
		static void staticDisplay() {
			System.out.println("it static display method");
			System.out.println("the weight value : "+weight);
		}
	}
	
	gender g = new gender();

}
public class IC2 {

	public static void main(String[] args) {
		
		person p = new person();
		p.g.nonStaticDisplay();
		person.gender.staticDisplay();

	}

}
