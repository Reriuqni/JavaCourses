import java.util.Scanner;

public class Boolean26 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("26. Даны числа x, y. Проверить истинность высказывания: «Точка с ко-\n" +
                "ординатами (x, y) лежит в четвертой координатной четверти».");

        System.out.println("Введите число x:");
        int x = s.nextInt();

        System.out.println("Введите число y:");
        int y = s.nextInt();

        boolean result = (x > 0) && (y < 0);

        System.out.println(result);

    }
}
