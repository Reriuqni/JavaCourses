import java.util.Scanner;

public class Boolean1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("1. Дано целое число A. Проверить истинность высказывания: «Число\n" +
                "A является положительным».");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        boolean result = (a > 0);

        System.out.println(result);

    }
}
