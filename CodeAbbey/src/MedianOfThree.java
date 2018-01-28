import java.util.Arrays;
import java.util.Scanner;

public class MedianOfThree {

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

                int[] arr = new int[parameters.length];
                for (int i = 0; i < parameters.length; i++) {
                    arr[i] = Integer.parseInt(parameters[i]);
                }
                Arrays.sort(arr);
                System.out.print(arr[1] + " ");

            }
        }
    }
}
