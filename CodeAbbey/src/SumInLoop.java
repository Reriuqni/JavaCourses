import java.util.Scanner;

public class SumInLoop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] parameters = s.nextLine().split(" ");

            int sum = 0;
            for (String param : parameters) {
                sum += Integer.valueOf(param);
            }
            System.out.println(sum);

        }
    }
}
