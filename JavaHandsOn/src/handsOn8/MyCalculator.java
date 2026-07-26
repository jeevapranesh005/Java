package handsOn8;
import java.util.Scanner;

public class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        long result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter n and p: ");
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            System.out.println(calculator.power(n, p));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
