package Collection;
import java.util.PriorityQueue;
public class PriorityQueue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("a");
		pq.add("n");
		pq.add("c");
		pq.add("d");
		pq.add("e");
		pq.add("f");

		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

}
