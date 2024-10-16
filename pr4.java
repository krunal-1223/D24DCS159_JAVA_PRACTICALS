import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();
        double totalAmount = 0.0;

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter product code and price for item " + (i + 1) + ": ");
            int code = scanner.nextInt();
            double price = scanner.nextDouble();
            double taxRate;

            switch (code) {
                case 1 -> taxRate = 0.08;
                case 2 -> taxRate = 0.12;
                case 3 -> taxRate = 0.05;
                case 4 -> taxRate = 0.075;
                default -> taxRate = 0.03;
            }

            totalAmount += price + (price * taxRate);
        }

        System.out.printf("Total Amount: $%.2f%n", totalAmount);
        
    }
}
