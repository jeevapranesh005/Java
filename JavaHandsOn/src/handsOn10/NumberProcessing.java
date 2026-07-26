package handsOn10;

import java.util.*;

public class NumberProcessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sorted set (no duplicates)
        TreeSet<Integer> numbers = new TreeSet<>();

        // 🔹 Read input until "done"
        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("done"))
                break;

            int num = Integer.parseInt(input);
            numbers.add(num);
        }

        // 🔹 Display sorted unique numbers
        System.out.println("\nSorted unique numbers: " + numbers);

        // 🔹 Calculate average
        double sum = 0;
        for (int n : numbers)
            sum += n;

        double average = sum / numbers.size();
        System.out.println("Average: " + average);

        // 🔹 Lowest and highest
        System.out.println("Lowest: " + numbers.first());
        System.out.println("Highest: " + numbers.last());

        // 🔹 Filter odd numbers (not divisible by 2)
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 != 0)
                oddNumbers.add(n);
        }

        System.out.println("Odd numbers: " + oddNumbers);
    }
}