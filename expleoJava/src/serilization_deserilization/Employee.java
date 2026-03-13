package serilization_deserilization;

public class Employee implements java.io.Serializable {
	public int id;
	public String name;
	public Employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	
}

