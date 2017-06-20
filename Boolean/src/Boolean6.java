import java.util.Scanner;

public class Boolean6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("6. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Справедливо двойное неравенство A < B < C»");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result = (a < b) && (b < c);

        System.out.println(result);

    }
}
