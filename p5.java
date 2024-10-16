import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();

            System.out.print("Enter student grade: ");
            double grade = scanner.nextDouble();

            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("Status: " + (grade >= 50 ? "Passed" : "Failed"));
            System.out.println();
        }

        scanner.close();
    }
}
