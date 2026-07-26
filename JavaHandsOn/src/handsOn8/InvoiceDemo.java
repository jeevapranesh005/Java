package handsOn8;
import java.util.InputMismatchException;
import java.util.Scanner;

class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {
        if (partNumber <= 0) {
            throw new IllegalArgumentException("Part number must be greater than 0.");
        }
        if (partDescription == null || partDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Part description cannot be empty.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0.");
        }
        if (pricePerItem <= 0) {
            throw new IllegalArgumentException("Price per item must be greater than 0.");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "Part Number: " + partNumber + "\n" +
                "Part Description: " + partDescription + "\n" +
                "Quantity: " + quantity + "\n" +
                "Price per Item: " + pricePerItem;
    }
}

public class InvoiceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int partNumber = readInt(scanner, "Enter part number: ");
            String partDescription = readString(scanner, "Enter part description: ");
            int quantity = readInt(scanner, "Enter quantity: ");
            double pricePerItem = readDouble(scanner, "Enter price per item: ");

            Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
            System.out.println("\nInvoice created successfully.");
            System.out.println(invoice);
            System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static String readString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
