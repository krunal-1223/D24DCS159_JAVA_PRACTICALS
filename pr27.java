import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pr27 {

    public static void main(String[] args) {
        // Check if there are files specified on the command line
        if (args.length == 0) {
            System.out.println("No files specified.");
            return;
        }

        // Loop through each file specified in the command line arguments
        for (String fileName : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.out.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}
