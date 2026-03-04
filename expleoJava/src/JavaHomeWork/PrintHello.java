package JavaHomeWork;
import java.util.Scanner;
public class PrintHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int n = sc.nextInt();

            if (n < 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                System.out.println("Hello");
                total++;
            }
        }

        System.out.println("Total Hello displayed = " + total);

	}

}
