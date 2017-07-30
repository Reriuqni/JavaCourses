import java.util.Scanner;

public class SumAB {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String output = "", inputText = s.nextLine();

        String[] parameters = inputText.split(" ");

        if (parameters.length < 2) throw new IllegalArgumentException("Lack of arguments");

        int x = Integer.parseInt(parameters[0]);
        int y = Integer.parseInt(parameters[1]);

        output = output + compute(x, y) + " ";

        System.out.println(output);

    }

    public static int compute(int x, int y) {
        return x + y;
    }
}
