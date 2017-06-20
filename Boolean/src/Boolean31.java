import java.util.Scanner;

public class Boolean31 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("31. Даны целые числа a, b, c, являющиеся сторонами некоторого тре-\n" +
                "угольника. Проверить истинность высказывания: «Треугольник со сторо-\n" +
                "нами a, b, c является равнобедренным».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result = (a == b) || (b == c) || (c == a);

        System.out.println(result);

    }
}
