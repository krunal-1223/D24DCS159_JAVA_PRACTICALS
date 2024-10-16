import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr31 {
    public static void main(String[] args) {
        String filename = "output.txt";
        
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename))) {

            System.out.println("Enter text (type 'exit' to finish):");

            String inputLine;
            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(inputLine);
                fileWriter.newLine();
            }

            System.out.println("Data written to " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Reading the file using byte stream
        File file = new File(filename);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            System.out.println("\nContents of " + filename + ":");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
