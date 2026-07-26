package handson6.Question1;

/**
 * Main class for Question 1.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aarav", "Kolkata", "Computer Science", 2, 120000.0);
        Staff staff = new Staff("Mr. Sharma", "Delhi", "Bright Future School", 45000.0);

        System.out.println("Student details:");
        student.displayDetails();
        System.out.println();

        System.out.println("Staff details:");
        staff.displayDetails();
    }
}
