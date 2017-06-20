import java.util.Scanner;

public class Boolean4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("4. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Справедливы неравенства A > 2 и B ≤ 3».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        boolean result = (a > 2) && (b <= 3);

        System.out.println(result);

    }
}
