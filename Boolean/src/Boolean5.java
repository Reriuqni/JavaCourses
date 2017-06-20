import java.util.Scanner;

public class Boolean5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("5. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Справедливы неравенства A ≥ 0 или B < –2».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        boolean result = (a >= 0) || (b < -2);

        System.out.println(result);

    }
}
