/**
 * Anagramms
 *
 * @author cortisol
 */

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {

    private static String[] vocabulary = {"bat", "tab", "coal", "cola", "lots", "slot", "lost", "tea", "ate", "eat"};

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine().toLowerCase();

            for (String word : inputText) {

                int sum = 0;

                char[] charWord = word.toCharArray();
                Arrays.sort(charWord);
                String newWord = new String(charWord);

                for (String oldWord : vocabulary) {
                    char[] oldCharWord = oldWord.toCharArray();
                    Arrays.sort(oldCharWord);
                    if (!oldWord.equals(word) && newWord.equals(new String(oldCharWord))) {
                        sum++;
                    }
                }

                System.out.println("Count: " + sum);
            }
        } else System.out.println("Wrong number!");
    }
}
