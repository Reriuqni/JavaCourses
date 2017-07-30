/**
 * My colleague have retold me this puzzle after visiting an interview at local office of Oracle company.
 * I hope I remember it correctly.
 * <p>
 * John and Mary founded J&M publishing house and bought two old printers to equip it.
 * <p>
 * Now they have their first commercial deal - to print a document consisting of N pages.
 * <p>
 * It appears that printers work at different speed. One produces a page in X seconds and other does it in Y seconds.
 * <p>
 * So now company founders are curious about minimum time they can spend on printing the whole document with two printers.
 * <p>
 * Input data contains number of test cases in the first line.
 * Then test-cases will follow, each in separate line.
 * Each testcase contains three integer values - X Y N, where N will not exceed 1,000,000,000.
 * Answer should contain minumum printing times for each of testcases, separated by spaces.
 * <p>
 * Example:
 * <p>
 * input data:
 * 2
 * 1 1 5
 * 3 5 4
 * <p>
 * answer:
 * 3 9
 */

import java.util.Scanner;

public class Printers {

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
