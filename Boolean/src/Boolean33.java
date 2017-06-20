import java.util.Scanner;

public class Boolean33 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("33. Даны целые числа a, b, c. Проверить истинность высказывания:\n" +
                "«Существует треугольник со сторонами a, b, c».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        boolean result = (a + b > c) || (a + c > b) || (c + b > a);

        System.out.println(result);

    }
}
