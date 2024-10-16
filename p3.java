import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days in the month: ");
        int days = scanner.nextInt();

        double totalExpenses = 0.0;

        for (int i = 1; i <= days; i++) {
            System.out.print("Enter expense for day " + i + ": ");
            totalExpenses += scanner.nextDouble();
        }

        System.out.println("Total expenses for the month: $" + totalExpenses);
        scanner.close();
    }
}
