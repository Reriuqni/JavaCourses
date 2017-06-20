import java.util.Scanner;

public class Boolean11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("11. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Числа A и B имеют одинаковую четность».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        boolean result = ((a + b) % 2 == 0);

        System.out.println(result);

    }
}
