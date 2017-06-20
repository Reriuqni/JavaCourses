import java.util.Scanner;

public class If29 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("29. Дано целое число. Вывести его строку-описание вида «отрицательное чет-\n" +
                "ное число», «нулевое число», «положительное нечетное число» и т. д.");

        System.out.print("Введите число: ");
        int x = s.nextInt();

        if (x < 0) {
            if (Math.abs(x) % 2 == 0) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
            }
        }

        if (x == 0) {
            System.out.println("Нулевое число");
        }

        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("Положительное четное число");
            } else {
                System.out.println("Положительное нечетное число");
            }
        }

    }
}
