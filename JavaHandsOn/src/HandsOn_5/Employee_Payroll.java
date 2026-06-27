package HandsOn_5;

class Employee {
	protected String empId;
	protected String empName;
	protected double baseSalary;

	public Employee(String empId, String empName, double baseSalary) {

		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", baseSalary=" + baseSalary + "]";
	}

}

class PermanentEmployee extends Employee {
	public double bonus;

	public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}

	public double calculateSalary() {
		return baseSalary + bonus;
	}

}

class ContractEmployee extends Employee {
	public double taxRate;
	public double serviceCharge;

	public ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
		// TODO Auto-generated constructor stub
	}

	public double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge;
	}
}

class Intern extends Employee {
	public double stipend;

	public Intern(String empId, String empName, double stipend) {
		super(empId, empName, 0);
		this.stipend = stipend;
		// TODO Auto-generated constructor stub
	}

	public double calculateSalary() {
		return stipend;
	}

}

public class Employee_Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("01", "jeeva", 100);
		PermanentEmployee emp2 = new PermanentEmployee("02", "muhi", 200, 50);
		ContractEmployee emp3 = new ContractEmployee("03", "rishwa", 300, 10, 20);
		Intern emp4 = new Intern("04", "krishna", 400);

		System.out.println(emp1.toString());
		System.out.println();
		System.out.println(emp2.toString());
		System.out.println("Calculated Salary for Permanent Employee : " + emp2.calculateSalary());
		System.out.println();

		System.out.println(emp3.toString());
		System.out.println("Calculated Salary for Contract Employee : " + emp3.calculateSalary());
		System.out.println();
		System.out.println(emp4.toString());
		System.out.println("Calculated Stipend for Intern Employee : " + emp4.calculateSalary());

	}

}
