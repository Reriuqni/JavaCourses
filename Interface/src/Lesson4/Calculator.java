package Lesson4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("This is runtime calc. Write 'calc' to stop input and evaluate an expression.");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        double result = 0;

        while (!"calc".equals(str)) {

            if (str == null) throw new NullPointerException("Oops...");

            if (str.isEmpty()) {
                System.out.println("Enter something.");
                str = sc.nextLine();
                continue;
            }

            double num;

            try {
                num = Double.valueOf(str.substring(1, str.length()));
            } catch (NumberFormatException e) {
                System.out.println("You entered non number. Try again!");
                str = sc.nextLine();
                continue;
            }

            try {
                switch (str.substring(0, 1)) {
                    case "+":
                        result += num;
                        break;
                    case "-":
                        result -= num;
                        break;
                    case "*":
                        result *= num;
                        break;
                    case "/":
                        result /= num;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Something gone wrong!");
            } catch (IllegalArgumentException e) {
                System.out.println("Unknown operation. Try again!");
                str = sc.nextLine();
                continue;
            }
            str = sc.nextLine();
        }
        System.out.println("Result: " + result);
    }
}
