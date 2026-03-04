package EmployeeAttendance;

import java.time.*;

public class Attendance {
	private int empId;
	private LocalTime checkInTime;
	private LocalTime checkoutTime;
	private boolean isCheckedIn = false;
	private boolean isCheckedout = true;

	public Attendance(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void markcheckin() {
		if (!isCheckedIn) {
			checkInTime = LocalTime.now();
			isCheckedIn = true;
			System.out.println("the employe is checked in time " + checkInTime);
		} else {
			System.out.println("not checkin");
		}
	}

	public void markcheckout() {
		if (isCheckedIn) {
			isCheckedIn = false;
			isCheckedout = true;
			checkoutTime = LocalTime.now();
			System.out.println("the employe is checkout at " + checkoutTime);

		} else {
			System.out.println("not checkedout");
		}
	}

	public void getAttendanceDetails() {
		System.out.println("the emp id " + empId);
		System.out.println("checkinTime " + checkInTime);
		System.out.println("checkoutTime " + checkoutTime);
	}
}
