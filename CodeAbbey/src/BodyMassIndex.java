import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter amount of tests: ");

        int amount = Integer.parseInt(s.nextLine());

        if (amount > 0) {

            String[] inputText = new String[amount];

            for (int i = 0; i < amount; i++) inputText[i] = s.nextLine();

            for (String line : inputText) {

                String[] parameters = line.split(" ");

                if (parameters.length < 2) throw new IllegalArgumentException("Lack of arguments");

                int weight = Integer.parseInt(parameters[0]);
                double height = Double.parseDouble(parameters[1]);
                double bmi = weight / Math.pow(height, 2);

                System.out.print(checkBMI(bmi) + " ");
            }
        }
    }

    private static String checkBMI(double bmi) {
        String str = "";
        if (bmi >= 30.0) str = "obese";
        if (bmi >= 25.0 && bmi < 30) str = "over";
        if (bmi >= 18.5 && bmi < 25) str = "normal";
        if (bmi < 18.5) str = "under";
        return str;
    }
}
