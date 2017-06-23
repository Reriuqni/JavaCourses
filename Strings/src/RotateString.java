/*
 * To rotate string by K characters means to cut these characters from the beginning and transfer them to the end.
 * If K is negative, characters, on contrary should be transferred from the end to the beginning.
 *
 * Input data will contain the number of test-cases in the first line.
 * Following lines will contain number K and some string S separated by space - one pair in each line.
 * String S will contain only small latin letters. K will not exceed half the length of S by absolute value.
 * Answer should contain strings rotated in accordance with the rule above, separated by spaces. For example:
 *
 * input data:
 * 2
 * 3 forwhomthebelltolls
 * -6 verycomplexnumber
 *
 * answer:
 * whomthebelltollsfor numberverycomplex
 */

import java.util.Scanner;

public class RotateString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine().toLowerCase();

            for (int i = 0; i < amount; i++) {

                int spaceIndex = inputText[i].indexOf(" ");

                int shift = Integer.parseInt(inputText[i].substring(0, spaceIndex));

                inputText[i] = inputText[i].substring(spaceIndex + 1, inputText[i].length());

                if (Math.abs(shift) <= inputText[i].length() / 2) {

                    String prefix, suffix;

                    if (shift > 0) {
                        prefix = inputText[i].substring(shift, inputText[i].length());
                        suffix = inputText[i].substring(0, shift);
                    } else {
                        prefix = inputText[i].substring(inputText[i].length() + shift, inputText[i].length());
                        suffix = inputText[i].substring(0, inputText[i].length() + shift);
                    }

                    inputText[i] = prefix + suffix;

                    System.out.printf("%s ", inputText[i]);
                }
            }
        } else System.out.println("Wrong number!");
    }
}
