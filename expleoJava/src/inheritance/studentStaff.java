package inheritance;


class person{
	String name;
	String address;
	
	person(String name, String address){
		this.name=name;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public String getAdress() {
		return address;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	
	
}

class Student extends person{
	String program;
	int year;
	double fee;
	public Student(String name,String adress,String program, int year, double fee) {
		super(name,adress);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", name=" + name + ", address="
				+ address + "]";
	}

	
}

class staff extends person{
	String school;
	double pay;
	public staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "staff [school=" + school + ", pay=" + pay + ", name=" + name + ", address=" + address + "]";
	}
	
	

	
}


public class studentStaff {
	
	public static void main(String[] args) {
		Student st = new Student("jeeva","chennai","python",4,1200);
		staff sf = new staff("pranesh","salem","svm School",20000);
		
		System.out.println(st.toString());
		System.out.println(sf.toString());
	}

}
