import java.util.Scanner;

public class Boolean28 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("28. Даны числа x, y. Проверить истинность высказывания: «Точка с ко-\n" +
                "ординатами (x, y) лежит в первой или третьей координатной четверти».");

        System.out.println("Введите число x:");
        int x = s.nextInt();

        System.out.println("Введите число y:");
        int y = s.nextInt();

        boolean result = ((x < 0) && (y < 0)) || ((x > 0) && (y > 0));

        System.out.println(result);

    }
}
