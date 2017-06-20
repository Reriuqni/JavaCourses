import java.util.Scanner;

public class Boolean30 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("30. Даны целые числа a, b, c, являющиеся сторонами некоторого тре-\n" +
                "угольника. Проверить истинность высказывания: «Треугольник со сторо-\n" +
                "нами a, b, c является равносторонним».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result = (a == b) && (b == c);

        System.out.println(result);

    }
}
