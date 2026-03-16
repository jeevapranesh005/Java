package Collection;

import java.util.LinkedList;

public class LinkedList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li = new LinkedList<>();
		LinkedList<String> b = new LinkedList<>();
		System.out.println("initial size "+li.size());
		li.add("py");
		li.add("c");
		li.add("kotlin");
		li.addFirst("c#");
		li.addLast("java");
		System.out.println("the ele are "+ li);
		System.out.println("size is "+li.size());
		li.remove("py");
		li.remove(2);
		System.out.println("the ele is "+li);
		System.out.println("total size is "+li.size());
		b=(LinkedList<String>) li.clone();	//clone 
		System.out.println("clone "+b);
		li.clear();
		System.out.println("the total size after clear() "+li.size());
	}

}
