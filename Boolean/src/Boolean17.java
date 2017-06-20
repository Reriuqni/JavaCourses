import java.util.Scanner;

public class Boolean17 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("17. Дано целое положительное число. Проверить истинность высказы-\n" +
                "вания: «Данное число является нечетным трехзначным».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        boolean result = (a % 2 != 0) && (a >= 100);

        System.out.println(result);

    }
}
