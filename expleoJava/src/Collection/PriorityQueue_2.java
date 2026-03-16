package Collection;

import java.util.PriorityQueue;

class Tesk implements Comparable<Tesk>{
	private String name;
	private int priority;
	
	
	public Tesk(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	public int compareTo(Tesk other) {
		return Integer.compare(other.priority, this.priority);
	}
	
	
}


public class PriorityQueue_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Tesk> te = new PriorityQueue<>();
		
		te.add(new Tesk("Task 1", 3));
		te.add(new Tesk("Task 2", 1));
		te.add(new Tesk("Task 3", 2));
		
		
		
		
		while (!te.isEmpty()) {
			Tesk task = te.poll();
			System.out.println("Executing: " + task.getName() + " (Priority: " + task.getPriority() + ")");
		
	}

}
}
