import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class pr30 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            return;
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully from " + sourceFileName + " to " + destinationFileName);
        } catch (IOException e) {
            System.out.println("An error occurred during file copying: " + e.getMessage());
        }
    }
}
