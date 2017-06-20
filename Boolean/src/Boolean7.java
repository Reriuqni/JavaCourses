import java.util.Scanner;

public class Boolean7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("7. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Число B находится между числами A и C».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result = ((a < b) && (b < c)) || ((a > b) && (b > c));

        System.out.println(result);

    }
}
