import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checkunchecked {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        System.out.println("File opened successfully.");
    }
    public static void divide(int a, int b) {
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        try {
            readFile("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
        try {
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }}
}