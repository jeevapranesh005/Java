package handson6.Question1;

/**
 * Student inherits from Person.
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student() {
    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Program: " + program);
        System.out.println("Year: " + year);
        System.out.println("Fee: " + fee);
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
        return "Student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}
