public class Test9 {

    public static void main(String[] args) {

        String text = "Input data contain number of test-cases in the first line." +
                "Then the specified number of lines follows each representing one test-case." +
                "Lines consist only of lowercase English (Latin) letters and spaces." +
                "Answer should contain the number of vowels in each line, separated by spaces.";

        text = text.toLowerCase();

        int[] symbols = new int[128];

        for (int i = 0; i < text.length(); i++) symbols[text.charAt(i)]++;

        for (int i = 0; i < symbols.length; i++) if (symbols[i] > 0) System.out.printf("%c - %d\n", i, symbols[i]);

    }
}
