import java.util.Scanner;

public class If6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("6. Даны два числа. Вывести большее из них.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        System.out.print("Введите число b:");
        int b = s.nextInt();

        int max = (a > b) ? a : b;

        System.out.println("Max=" + max);

    }
}
