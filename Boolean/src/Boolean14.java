import java.util.Scanner;

public class Boolean14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("14. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Ровно одно из чисел A, B, C положительное»");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result;
        result = (a > 0 && b < 0 && c < 0) ^ (b > 0 && a < 0 && c < 0) ^ (c > 0 && a < 0 && b < 0);

        System.out.println(result);

    }
}
