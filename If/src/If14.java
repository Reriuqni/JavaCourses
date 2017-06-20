import java.util.Scanner;

public class If14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("14. Даны три числа. Вывести вначале наименьшее, а затем наибольшее из дан-\n" +
                "ных чисел.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        int min = a;
        min = (b < min) ? b : min;
        min = (c < min) ? c : min;

        int max = a;
        max = (b > max) ? b : max;
        max = (c > max) ? c : max;

        System.out.println("min = " + min + " max = " + max);

    }
}
