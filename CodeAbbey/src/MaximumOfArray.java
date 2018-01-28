import java.util.Scanner;

public class MaximumOfArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String inputText = s.nextLine();

        String[] strArray = inputText.split(" ");

        int min = 0, max = 0;

        for (String strElem : strArray) {
            int temp = Integer.valueOf(strElem);
            min = Math.min(temp, min);
            max = Math.max(temp, max);
        }

        System.out.println(max + " " + min);
    }
}
