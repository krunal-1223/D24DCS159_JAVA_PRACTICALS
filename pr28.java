import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pr28 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CharacterCounter <character> <filename>");
            return;
        }

        char targetChar = args[0].charAt(0);
        String filename = args[1];

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            int charCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == targetChar) {
                        charCount++;
                    }
                }
            }

            scanner.close();
            System.out.println("The character '" + targetChar + "' appears " + charCount + " times in " + filename + ".");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
