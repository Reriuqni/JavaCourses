import java.util.Random;
import java.util.Scanner;

public class WhileForDo {

    public static void main(String[] args) {

        // For 1
        System.out.println("For1. Даны целые числа K и N ( N > 0). Вывести N раз число K .");

        int k, n;

        Scanner s = new Scanner(System.in);

        System.out.print("Введите K: ");
        k = s.nextInt();

        System.out.print("Введите N: ");
        n = s.nextInt();

        if (n > 0) {
            for (int i = 0; i < n; i++) System.out.print(k + " ");
        }
        System.out.println("\n-------------------------------");

        // For 2
        System.out.println("For2. Даны два целых числа A и B ( A < B ). Вывести в порядке возрастания все\n" +
                "целые числа, расположенные между A и B (включая сами числа A и B ),\n" +
                "а также количество N этих чисел.");

        int a, b;
        System.out.print("Введите A: ");
        a = s.nextInt();
        System.out.print("Введите B: ");
        b = s.nextInt();
        if (a < b) {
            k = 0;
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                k++;
            }
            System.out.println("Количество чисел: " + k);
        }
        System.out.println("-------------------------------");

        // For 3
        System.out.println("For3. Даны два целых числа A и B ( A < B ). Вывести в порядке убывания все це-\n" +
                "лые числа, расположенные между A и B (не включая числа A и B ), а также\n" +
                "количество N этих чисел.");

        System.out.print("Введите A: ");
        a = s.nextInt();
        System.out.print("Введите B: ");
        b = s.nextInt();
        if (a < b) {
            k = 0;
            for (int i = --b; i > a; i--) {
                System.out.print(i + " ");
                k++;
            }
            System.out.println("Количество чисел: " + k);
        }
        System.out.println("-------------------------------");

        // For 4
        System.out.println("For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,\n" +
                "2, ..., 10 кг конфет.");

        System.out.print("Введите цену: ");
        double price = s.nextDouble();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " kg = " + i * price);
        }
        System.out.println("-------------------------------");

        // For 5
        System.out.println("For5. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,\n" +
                "0.2, ..., 1 кг конфет.");

        System.out.print("Введите цену: ");
        price = s.nextDouble();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i / 10.0 + " kg = " + i / 10.0 * price);
        }
        System.out.println("-------------------------------");

        // For 6
        System.out.println("For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,\n" +
                "1.4, ..., 2 кг конфет");
        System.out.print("Введите цену: ");
        price = s.nextDouble();
        for (double i = 1.2; i <= 2.0; i += 0.2) {
            System.out.println(i + " kg = " + i * price);
        }
        System.out.println("-------------------------------");

        // For 7
        System.out.println("For7. Даны два целых числа A и B ( A < B ). Найти сумму всех целых чисел от A\n" +
                "до B включительно.");

        System.out.print("Введите A: ");
        a = s.nextInt();
        System.out.print("Введите B: ");
        b = s.nextInt();
        if (a < b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("Сумма чисел: " + sum);
        }
        System.out.println("-------------------------------");

        // For 8
        System.out.println("For8. Даны два целых числа A и B ( A < B ). Найти произведение всех целых чи-\n" +
                "сел от A до B включительно.");

        System.out.print("Введите A: ");
        a = s.nextInt();
        System.out.print("Введите B: ");
        b = s.nextInt();
        if (a < b) {
            int sum = 1;
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                sum *= i;
            }
            System.out.println("Произведение чисел: " + sum);
        }
        System.out.println("-------------------------------");

        // For 9
        System.out.println("For9. Даны два целых числа A и B ( A < B ). Найти сумму квадратов всех целых\n" +
                "чисел от A до B включительно.");
        System.out.print("Введите A: ");
        a = s.nextInt();
        System.out.print("Введите B: ");
        b = s.nextInt();
        if (a < b) {
            int sum = 1;
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                sum += Math.pow(i, 2);
            }
            System.out.println("Сумма квадратов чисел: " + sum);
        }
        System.out.println("-------------------------------");

        // For 10
        System.out.println("For10. Дано целое число N (> 0). Найти сумму\n" +
                "1 + 1/2 + 1/3 + ... + 1/ N\n" +
                "(вещественное число).");
        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 0) {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }
            System.out.println("Сумма ряда:" + sum);
        }
        System.out.println("-------------------------------");

        // While 1
        System.out.println("While1. Даны положительные числа A и B ( A > B ). На отрезке длины A разме-\n" +
                "щено максимально возможное количество отрезков длины B (без наложе-\n" +
                "ний). Не используя операции умножения и деления, найти длину незанятой\n" +
                "части отрезка A .");
        int c = 0;
        System.out.print("Введите A: ");
        a = s.nextInt();
        System.out.print("Введите B: ");
        b = s.nextInt();
        if (a > b) {
            while (a >= b) {
                a -= b;
                c++;
            }
            System.out.println("Кол-во отрезков: " + c + " Незанятая длина: " + a);
        } else {
            System.out.println("Неверные значения A, B");
        }

        System.out.println("For:");
        for (int i = 0; i < 10; i++) System.out.print(i + " ");

        System.out.println("\nWhile:");

        {
            int i = 0;
            while (i < 10) {
                System.out.print(i + " ");
                i++;
            }
        }

        System.out.print("\n\nВведите число: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println(r.nextInt(11) - 5);
            System.out.println((int) (10 * Math.random()) - 5);
        }

        sc.close();
    }
}

