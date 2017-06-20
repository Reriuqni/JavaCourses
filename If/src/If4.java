import java.util.Scanner;

public class If4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("4. Даны три целых числа. Найти количество положительных чисел в исход-\n" +
                "ном наборе.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        System.out.print("Введите число b:");
        int b = s.nextInt();

        System.out.print("Введите число c:");
        int c = s.nextInt();

        int plus_amount = 0;

        if (a > 0) {
            plus_amount++;
        }
        if (b > 0) {
            plus_amount++;
        }
        if (c > 0) {
            plus_amount++;
        }

        System.out.println("Кол-во положительных: " + plus_amount);

    }
}
