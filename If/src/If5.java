import java.util.Scanner;

public class If5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("5. Даны три целых числа. Найти количество положительных и количество от-\n" +
                "рицательных чисел в исходном наборе.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        System.out.print("Введите число b:");
        int b = s.nextInt();

        System.out.print("Введите число c:");
        int c = s.nextInt();

        int positive_amount = 0, negative_amount = 0;

        positive_amount += (a == 0) ? 0 : (a > 0) ? 1 : 0;
        negative_amount += (a == 0) ? 0 : (a < 0) ? 1 : 0;
        positive_amount += (b == 0) ? 0 : (b > 0) ? 1 : 0;
        negative_amount += (b == 0) ? 0 : (b < 0) ? 1 : 0;
        positive_amount += (c == 0) ? 0 : (c > 0) ? 1 : 0;
        negative_amount += (c == 0) ? 0 : (c < 0) ? 1 : 0;

        System.out.println("положительных: " + positive_amount + " отрицательных: " + negative_amount);

        positive_amount = 0;
        negative_amount = 0;

        if (a != 0) {
            if (a > 0) {
                positive_amount++;
            } else {
                negative_amount++;
            }
        }

        if (b != 0) {
            if (b > 0) {
                positive_amount++;
            } else {
                negative_amount++;
            }
        }

        if (c != 0) {
            if (c > 0) {
                positive_amount++;
            } else {
                negative_amount++;
            }
        }

        System.out.println("положительных: " + positive_amount + " отрицательных: " + negative_amount);

    }
}
