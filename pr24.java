import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer (x): ");
            int x = myobj.nextInt();

            System.out.print("Enter the second integer (y): ");
            int y = myobj.nextInt();

            int result = x / y;
            System.out.println("The result of x / y is: " + result);
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            myobj.close();
        }
    }
}

