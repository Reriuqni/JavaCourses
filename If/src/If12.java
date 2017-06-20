import java.util.Scanner;

public class If12 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("12. Даны три числа. Найти наименьшее из них.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        int min = a;
        min = (b < min) ? b : min;
        min = (c < min) ? c : min;

        System.out.println("min = " + min);
        System.out.println("min(Math.min) = " + Math.min(a, Math.min(b, c)));

    }
}
