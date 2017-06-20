import java.util.Scanner;

public class If15 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("15. Даны три числа. Найти сумму двух наибольших из них.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        int sum;

        if (a < b) {
            if (a < c) {
                sum = b + c;
            } else {
                sum = a + b;
            }
        } else {
            if (b < c) {
                sum = a + c;
            } else {
                sum = b + a;
            }
        }

        System.out.println("Sum = " + sum);

    }
}
