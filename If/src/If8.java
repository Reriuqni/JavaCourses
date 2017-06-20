import java.util.Scanner;

public class If8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("8. Даны два числа. Вывести вначале большее, а затем меньшее из них.");

        System.out.print("Введите число b:");
        int b = s.nextInt();

        System.out.print("Введите число c:");
        int c = s.nextInt();

        int min, max;

        max = (b > c) ? b : c;
        min = (b < c) ? b : c;

        System.out.println("max =" + max);
        System.out.println("min =" + min);

    }
}
