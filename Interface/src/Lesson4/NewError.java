package Lesson4;

import java.util.Scanner;

public class NewError {

    public static void main(String[] args) {

        System.out.println("This is runtime calc");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        double sum = 0;

        while (!"true".equals(str)) {

            double num = 0;
            try {
                num = Double.valueOf(str);
            } catch (NumberFormatException e) {
                System.out.println("we catch non number");
            }
            sum += num;
            str = sc.nextLine();
        }

        System.out.println(sum);
    }
}
