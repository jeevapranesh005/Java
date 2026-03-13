package generics;

public class methods {
	static <T> void display(T ele) {
		System.out.println(ele);
		System.out.println(ele.getClass().getName()+" = "+ele);
	}
	public static void main(String[] args) {
		display(1);
		display("jeeva");
	}
}
