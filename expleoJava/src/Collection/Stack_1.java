package Collection;
import java.util.*;
public class Stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> st =new Stack<>();
		
		System.out.println("The inital size "+st.size());
		
		st.add("A");
		st.add("c");
		st.add("b");
		st.add("d");
		st.add("e");
		
		System.out.println(st);
		System.out.println("pop "+st.pop());
		System.out.println("the peak "+st.peek());
		
	}

}
