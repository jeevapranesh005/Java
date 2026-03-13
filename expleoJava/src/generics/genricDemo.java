package generics;
////1.... Demo
///

class Demo<T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}
public class genricDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo<Integer> obj = new Demo<Integer>();
		obj.set(25);
		System.out.println(obj.get());
		Demo<String> obj1 = new Demo<String>();
		obj1.set("demo");
		System.out.println(obj1.get());
	}

}
