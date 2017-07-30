import java.util.Arrays;
import java.util.Scanner;

public class VovelsCount {

    private static char[] vovels = {'a', 'e', 'i', 'o', 'u', 'y'};

    private static boolean isVovel(char c) {
        for (char v : vovels) {
            if (v == c) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine().toLowerCase();

            System.out.println(Arrays.toString(inputText));

            for (int i = 0; i < amount; i++) {
                char[] textChars = inputText[i].toCharArray();
                int num = 0;
                for (char c : textChars) {
                    if (isVovel(c)) num++;
                }
                System.out.print(num + " ");
            }
        } else System.out.println("Wrong number!");
    }
}
