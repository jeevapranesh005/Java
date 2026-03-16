package Collection;

import java.util.Vector;

public class vector_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> vi = new Vector<>(2,4);    //+4
												// default -*2;
		System.out.println(vi.size());
		vi.add("a");
		vi.add("b");
		vi.add("c");
		vi.add("d");
		vi.add("y");
		vi.add("q");
		vi.add("j");
		vi.add("a");
		vi.add("b");
		vi.add("c");
		vi.add("n");

		System.out.println("the ele is "+vi);
		System.out.println("size is "+vi.size());
		System.out.println("capacity "+vi.capacity());
		
	}

}
