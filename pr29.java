import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pr29 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java WordSearch <word> <filename>");
            return;
        }

        String targetWord = args[0];
        String filename = args[1];
        int lineNumber = 0;
        boolean found = false;

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();
                if (line.contains(targetWord)) {
                    System.out.println("Found \"" + targetWord + "\" in line " + Integer.valueOf(lineNumber) + ": " + line);
                    found = true;
                }
            }

            scanner.close();

            if (!found) {
                System.out.println("The word \"" + targetWord + "\" was not found in " + filename + ".");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
