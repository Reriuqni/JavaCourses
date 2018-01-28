import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine();

            for (String line : inputText) {

                String[] parameters = line.split(" ");

                if (parameters.length < 3) throw new IllegalArgumentException("Lack of arguments");

                int a = Integer.parseInt(parameters[0]);
                int b = Integer.parseInt(parameters[1]);
                int n = Integer.parseInt(parameters[2]);

                int result = 0;
                for (int i = 0; i < n; i++) result += a + i * b;

                System.out.print(result + " ");
            }
        }
    }
}
