import java.util.Scanner;

public class Boolean15 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("15. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Ровно два из чисел A, B, C являются положительными»");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result;
        result = (a > 0 && b > 0 && c < 0) ^ (a > 0 && c > 0 && b < 0) ^ (b > 0 && c > 0 && a < 0);

        System.out.println(result);

    }
}
