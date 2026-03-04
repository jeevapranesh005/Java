package EmployeeAttendance;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"jeeva");
		Attendance a1 = new Attendance(1);
		e1.markCheckIn(a1);
		e1.markCheckOut(a1);
		a1.getAttendanceDetails();
		
	}
}
