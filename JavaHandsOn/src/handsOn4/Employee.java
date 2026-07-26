package handsOn4;
import java.time.*;
public class Employee {
	private int id;
    private String name;
    
    public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void checkin(attendance a1) {
    	a1.markcheckin();
    }
    public void checkout(attendance a1) {
    	a1.checkout();
    }
    
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a=new Employee(12,"Tamil");
		attendance a1=new attendance(12);
		System.out.println(a);
		a.checkin(a1);
		a1.getdetails();
	}

}
