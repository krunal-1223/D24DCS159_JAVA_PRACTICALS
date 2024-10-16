public class Main{
public static void main(String[] args) {
    try {
        int result = 10/0;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }

    System.out.println("Program continues after catch block.");
}

}