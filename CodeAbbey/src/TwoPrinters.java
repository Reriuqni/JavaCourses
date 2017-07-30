import java.util.Scanner;

public class TwoPrinters {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];
            String output = "";

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine();

            for (String line : inputText) {

                String[] parameters = line.split(" ");

                if (parameters.length < 3) throw new IllegalArgumentException("Lack of arguments");

                int x = Integer.parseInt(parameters[0]);
                int y = Integer.parseInt(parameters[1]);
                int n = Integer.parseInt(parameters[2]);

                output = output + computeTime(x, y, n) + " ";
            }
            System.out.println(output);
        }
    }

    public static int computeTime(int x, int y, int n) {
        int timex, timey, time;
        time = timex = timey = 0;
        while (timex + timey < n) {
            time++;
            timex = time / x;
            timey = time / y;
        }
        return time;
    }
}
