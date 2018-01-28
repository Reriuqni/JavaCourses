import java.util.ArrayList;
import java.util.Scanner;

public class WeightedSumOfDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount of tests: ");
        int amount = Integer.parseInt(s.nextLine());
        String[] parameters = s.nextLine().split(" ");
        if (amount > 0) {
            for (String value: parameters) {
                int wsd = calcWsd(Integer.parseInt(value));
                System.out.print(wsd + " ");
            }
        }
    }

    private static int calcWsd(int digit) {
        ArrayList<Integer> arr = new ArrayList<>();
        int val = 0;
        while (digit > 0) {
            arr.add(digit % 10);
            digit /= 10;
        }
        for (int i = 0; i < arr.size(); i++) val += arr.get(i) * (arr.size() - i);
        return val;
    }
}
