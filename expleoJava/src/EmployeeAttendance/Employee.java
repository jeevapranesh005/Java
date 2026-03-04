package EmployeeAttendance;

public class Employee {
	private int empId;
	private String empName;
	
	//constructor
	public Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	//setter and getter
	public void setId(int empId) {
		this.empId=empId;
	}
	public int getId() {
		return empId;
	}
	
	public void setName(String empName) {
		this.empName= empName;
	}
	public String getName() {
		return empName;
	}
	
	//method
	
	public void markCheckIn(Attendance A1) {
		
		if(A1.getEmpId()==this.empId)
		A1.markcheckin();
	}
	public void markCheckOut(Attendance A1) {
		if(A1.getEmpId()==this.empId)
		A1.markcheckout();
	}
	

}
