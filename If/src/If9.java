import java.util.Scanner;

public class If9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("9. Даны две переменные вещественного типа: A, B. Перераспределить значе-\n" +
                "ния данных переменных так, чтобы в A оказалось меньшее из значений,\n" +
                "а в B — большее. Вывести новые значения переменных A и B.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        System.out.print("Введите число b:");
        int b = s.nextInt();

        if (a > b) {
            a = a ^ b ^ (b = a);
        }

        System.out.println("A=" + a + " B=" + b);
    }
}
