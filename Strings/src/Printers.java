/**
 My colleague have retold me this puzzle after visiting an interview at local office of Oracle company.
 I hope I remember it correctly.

 John and Mary founded J&M publishing house and bought two old printers to equip it.

 Now they have their first commercial deal - to print a document consisting of N pages.

 It appears that printers work at different speed. One produces a page in X seconds and other does it in Y seconds.

 So now company founders are curious about minimum time they can spend on printing the whole document with two printers.

 Input data contains number of test cases in the first line.
 Then test-cases will follow, each in separate line.
 Each testcase contains three integer values - X Y N, where N will not exceed 1,000,000,000.
 Answer should contain minumum printing times for each of testcases, separated by spaces.

 Example:

 input data:
 2
 1 1 5
 3 5 4

 answer:
 3 9
 */

import java.util.Arrays;
import java.util.Scanner;

public class Printers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine();

            System.out.println(Arrays.toString(inputText));
            
            for (String line: inputText) {
                String[] parameters = line.split(" ");

                System.out.println(Arrays.toString(parameters));
            }
        }
    }
}
