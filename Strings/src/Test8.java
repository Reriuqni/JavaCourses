import java.util.Arrays;

public class Test8 {

    public static void main(String[] args) {

        String text = "Input data contain number of test-cases in the first line." +
                "Then the specified number of lines follows each representing one test-case." +
                "Lines consist only of lowercase English (Latin) letters and spaces." +
                "Answer should contain the number of vowels in each line, separated by spaces.";

        text = text.toLowerCase();

        int[] symbols = new int[128];

        for (int i = 0; i < text.length(); i++) symbols[text.charAt(i)]++;

        int[] copy = Arrays.copyOf(symbols, symbols.length);

        for (int sym : symbols) {
            if (sym > 0) {
                int value = symbols[0], index = 0;
                for (int j = 0; j < copy.length; j++) {
                    if (value < copy[j]) {
                        value = copy[j];
                        index = j;
                    }
                }
                copy[index] = 0;
                System.out.printf("%c - %d\n", index, value);
            }
        }
    }
}
