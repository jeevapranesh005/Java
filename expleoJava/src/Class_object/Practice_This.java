package Class_object;

import java.util.*;
public class Practice_This {
	int empid;
	String empNam;
	double empsal;
	//parameter constructor
	Practice_This(int empid,String empName,double empsal){
		this.empid = empid;
		this.empNam = empName;
		this.empsal = empsal;
		System.out.println("Employee record created ");
	}
	//default constructor
	Practice_This(){
		this(101,"Muhi",300000);
		System.out.println("Default constructor called ");
	}
	//Using "this" to call another method in same cls
	void register() {
		System.out.println("Registering Employee");
		this.display();
	}
	//for displaying
	void display() {
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Name: "+empNam);
		System.out.println("Employee Salary : "+empsal);
	}
	void sendhr() {
		Hrdept hr = new Hrdept();
		hr.processEmployee(thi);
	}
	
	Practice_This updatesal(double hikper) {
		this.empsal = empsal+(empsal*hikper/100);
		return this;
	}
	Practice_This updname(String newName) {
		this.empNam = newName;
		return this;
	}
	
	
	class Hrdept{
		void 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Practice_This(empid,empName,empsal);
	}

}
