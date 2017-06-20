import java.util.Scanner;

public class If13 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("13. Даны три числа. Найти среднее из них (то есть число, расположенное ме-\n" +
                "жду наименьшим и наибольшим).");

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

        int average = a;

        if ((a > min) && (a < max)) average = a;
        if ((b > min) && (b < max)) average = b;
        if ((c > min) && (c < max)) average = c;

        System.out.println("average = " + average);

    }
}
