package handsOn8;
import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class UserAuthentication {
    private static final String STORED_USERNAME = "AdminUser";
    private static final String STORED_PASSWORD = "Admin@123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            validateUsername(username);
            validatePassword(password);

            if (username.equals(STORED_USERNAME) && password.equals(STORED_PASSWORD)) {
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Invalid username or password.");
            }
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validateUsername(String username) throws InvalidUsernameException {
        if (username == null || username.length() < 6 || username.length() > 30) {
            throw new InvalidUsernameException("Invalid username. Length should be between 6 and 30 characters.");
        }
        if (!username.matches("^[A-Za-z][A-Za-z0-9_]{5,29}$")) {
            throw new InvalidUsernameException("Invalid username. Use letters, digits, or underscores and start with a letter.");
        }
    }

    private static void validatePassword(String password) throws InvalidPasswordException {
        if (password == null || password.length() < 8) {
            throw new InvalidPasswordException("Invalid password. Length should be at least 8 characters.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Invalid password. It must contain at least one lowercase letter.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Invalid password. It must contain at least one uppercase letter.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Invalid password. It must contain at least one digit.");
        }
        if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
            throw new InvalidPasswordException("Invalid password. It must contain at least one special character.");
        }
    }
}
