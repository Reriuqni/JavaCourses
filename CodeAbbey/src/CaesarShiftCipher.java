import java.util.Scanner;

public class CaesarShiftCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());
        int key = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];
            String output = "";

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine();

            for (String line : inputText) {

                char[] params = line.toUpperCase().toCharArray();

                for (char c : params) {
                    char ch;
                    if ((int) c >= 65 && (int) c <= 90) {
                        int seed = (int) c - 65 - key;
                        seed = (seed < 0) ? 26 - seed : seed;
                        seed += 65;
                        seed = (seed > 90)? (seed % 90) + 64: seed;
                        ch = (char) (seed);
                        System.out.println((int) ch + " " + Character.toString(ch));
                    } else {
                        ch = c;
                    }
                    output = output + Character.toString(ch);
                }
            }
            System.out.println(output);
        }
    }
}