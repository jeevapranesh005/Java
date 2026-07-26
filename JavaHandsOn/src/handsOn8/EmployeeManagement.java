package handsOn8;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class InvalidEmpNumberException extends Exception {
    public InvalidEmpNumberException(String message) {
        super(message);
    }
}

class InvalidDateOfJoinException extends Exception {
    public InvalidDateOfJoinException(String message) {
        super(message);
    }
}

class Employee {
    private int employeeCode;
    private String name;
    private LocalDate dateOfBirth;
    private LocalDate dateOfAppointment;

    public Employee(int employeeCode, String name, LocalDate dateOfBirth, LocalDate dateOfAppointment) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfAppointment = dateOfAppointment;
    }

    @Override
    public String toString() {
        return "Employee Code: " + employeeCode + "\n" +
                "Name: " + name + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Date of Appointment: " + dateOfAppointment;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter employee code: ");
            int employeeCode = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter date of birth (yyyy-MM-dd): ");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

            System.out.print("Enter date of appointment (yyyy-MM-dd): ");
            LocalDate dateOfAppointment = LocalDate.parse(scanner.nextLine());

            validateEmployeeCode(employeeCode);
            validateDates(dateOfBirth, dateOfAppointment);

            Employee employee = new Employee(employeeCode, name, dateOfBirth, dateOfAppointment);
            System.out.println("\nEmployee details:");
            System.out.println(employee);

            int yearsOfExperience = Period.between(dateOfAppointment, LocalDate.now()).getYears();
            System.out.println("Years of experience: " + yearsOfExperience);
        } catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }

    private static void validateEmployeeCode(int employeeCode) throws InvalidEmpNumberException {
        if (employeeCode <= 0) {
            throw new InvalidEmpNumberException("Invalid employee number. Employee code must be a positive integer.");
        }
    }

    private static void validateDates(LocalDate dateOfBirth, LocalDate dateOfAppointment) throws InvalidDateOfJoinException {
        if (!dateOfBirth.isBefore(dateOfAppointment)) {
            throw new InvalidDateOfJoinException("Invalid date of join. Date of birth must be before date of appointment.");
        }
    }
}
