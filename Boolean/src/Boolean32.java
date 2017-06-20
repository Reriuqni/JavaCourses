import java.util.Scanner;

public class Boolean32 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("32. Даны целые числа a, b, c, являющиеся сторонами некоторого тре-\n" +
                "угольника. Проверить истинность высказывания: «Треугольник со сторо-\n" +
                "нами a, b, c является прямоугольным».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result;
        result = (c * c == a * a + b * b) || (b * b == a * a + c * c) || (a * a == c * c + b * b);

        System.out.println(result);

    }
}
