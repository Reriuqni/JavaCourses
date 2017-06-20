import java.util.Scanner;

public class Boolean8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("8. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Каждое из чисел A и B нечетное».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        boolean result = (a % 2 != 0) && (b % 2 != 0);

        System.out.println(result);

    }
}
