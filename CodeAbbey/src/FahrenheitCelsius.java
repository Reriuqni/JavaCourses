import java.util.Scanner;

public class FahrenheitCelsius {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] parameters = s.nextLine().split(" ");

        int amount = Integer.parseInt(parameters[0]);

        if (amount > 0) {

            for (int i = 1; i < parameters.length; i++) {
                double result = (Integer.parseInt(parameters[i]) - 32) * 5 / 9;
                result += (result > 0) ? 0.5 : -0.5;
                result = Math.round(result);
                System.out.print((long) result + " ");
            }

        }
    }
}
