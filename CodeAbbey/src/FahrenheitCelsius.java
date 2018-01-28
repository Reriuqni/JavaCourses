import java.util.Scanner;

public class FahrenheitCelsius {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] parameters = s.nextLine().split(" ");

        int amount = Integer.parseInt(parameters[0]);

        if (amount > 0) {

            for (int i = 1; i < parameters.length; i++) {
                int result = (int) Math.round((Integer.parseInt(parameters[i]) - 32) * 5.0 / 9.0);
                System.out.print(result + " ");
            }

        }
    }
}
