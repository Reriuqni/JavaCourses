import java.util.Scanner;

public class Boolean18 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("18. Проверить истинность высказывания: «Среди трех данных целых\n" +
                "чисел есть хотя бы одна пара совпадающих».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result = (a == b) || (b == c) || (a == c);

        System.out.println(result);

    }
}
