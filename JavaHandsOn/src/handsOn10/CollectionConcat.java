package handsOn10;
import java.util.*;
public class CollectionConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>st=new HashSet<>();
		st.add("Java");
		st.add("Programming");
		st.add("Helo");
		st.add("world");
		String res="";
		Iterator<String>it=st.iterator();
		while(it.hasNext()) {
			System.out.println("Elements in the Set : " + st);
			res+=it.next()+" ";
		}
			
			System.out.println(res);
	}

}
