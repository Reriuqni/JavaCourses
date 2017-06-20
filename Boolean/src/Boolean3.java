import java.util.Scanner;

public class Boolean3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("3. Дано целое число A. Проверить истинность высказывания: «Число A\n" +
                "является четным».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        boolean result = (a % 2 == 0);

        System.out.println(result);

    }
}
