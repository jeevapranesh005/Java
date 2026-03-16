package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("A");
		li.add("J");
		li.add("O");
		li.add("T");
		li.add(2,"M");  //replace
		li.add("B");
		System.out.println("Contents of ArrayList "+li);
		System.out.println("size "+li.size());
		li.remove("O");   // remove element
		li.remove(3);    // remove using index value
		System.out.println();
		System.out.println("Contents of ArrayList After remove"+li);
		System.out.println("size "+li.size());
		
	}
}
