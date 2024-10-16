import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class pr40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine().toLowerCase();

        String[] words = text.split("\\W+");

        Map<String, Integer> wordMap = new TreeMap<>();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
