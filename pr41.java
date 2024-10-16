import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class pr41 {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String> keywords = new HashSet<>();
        String[] keywordArray = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", 
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", 
            "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", 
            "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", 
            "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", 
            "while", "true", "false"
        };
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }

        File file = new File("Test.java"); 
        Scanner scanner = new Scanner(file);

        int keywordCount = 0;

        while (scanner.hasNext()) {
            String word = scanner.next();
            if (keywords.contains(word)) {
                keywordCount++;
            }
        }

        scanner.close();
        System.out.println("Total number of keywords: " + keywordCount);
    }
}
