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

        // while 1,2
        System.out.println("while1,2. Даны положительные числа A и B ( A > B ). На отрезке длины A разме-\n" +
                "щено максимально возможное количество отрезков длины B (без наложе-\n" +
                "ний). Не используя операции умножения и деления, найти длину незанятой\n" +
                "части отрезка A .");
        int c = 0;
        System.out.print("Введите A: ");
        a = s.nextInt();
        System.out.print("Введите B: ");
        b = s.nextInt();
        if (a >= b) {
            while (a >= b) {
                a -= b;
                c++;
            }
            System.out.println("Кол-во отрезков: " + c + " Незанятая длина: " + a);
        } else {
            System.out.println("Неверные значения A, B");
        }
        System.out.println("-------------------------------");

        // while 3
        System.out.println("while3. Даны целые положительные числа N и K . Используя только операции\n" +
                "сложения и вычитания, найти частное от деления нацело N на K , а также\n" +
                "остаток от этого деления.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        System.out.print("Введите K: ");
        k = s.nextInt();

        int div, rem;
        if (k != 0) {
            rem = n;
            div = 0;
            while (rem >= k) {
                rem -= k;
                div++;
            }
            System.out.println("Частное: " + div + " Остаток: " + rem);
        } else {
            System.out.println("K = 0");
        }
        System.out.println("-------------------------------");

        // while 4
        System.out.println("while4. Дано целое число N (> 0). Если оно является степенью числа 3, то вы-\n" +
                "вести True, если не является — вывести False.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 0) {
            int power = 1;
            while (Math.pow(3, power) < n) {
                power++;
            }
            System.out.println((Math.pow(3, power) == n));
        } else {
            System.out.println("N = 0");
        }
        System.out.println("-------------------------------");

        // while 5
        System.out.println("while5. Дано целое число N (> 0), являющееся некоторой степенью числа 2:\n" +
                "N = 2 K . Найти целое число K — показатель этой степени.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 0) {
            k = 1;
            while (Math.pow(2, k) < n) {
                k++;
            }
            if (Math.pow(2, k) == n) {
                System.out.println("K=" + k);
            } else {
                System.out.println("N не является степенью числа 2");
            }
        } else {
            System.out.println("N = 0");
        }
        System.out.println("-------------------------------");

        // while 6
        System.out.println("while6. Дано целое число N (> 0). Найти двойной факториал N :\n" +
                "N !! = N ·( N –2)·( N –4)·...\n" +
                "(последний сомножитель равен 2, если N — четное, и 1, если N — нечет-\n" +
                "ное). Чтобы избежать целочисленного переполнения, вычислять это произ-\n" +
                "ведение с помощью вещественной переменной и вывести его как вещест-\n" +
                "венное число.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 0) {
            double factor = 1;
            k = (n % 2 == 0) ? 2 : 1;
            while (n >= k) {
                factor *= n;
                n -= 2;
            }
            System.out.println("N!!=" + factor);
        } else {
            System.out.println("N < 0");
        }
        System.out.println("-------------------------------");

        // while 7
        System.out.println("while7. Дано целое число N (> 0). Найти наименьшее целое положительное\n" +
                "число K , квадрат которого превосходит N : K 2 > N . Функцию извлечения\n" +
                "квадратного корня не использовать.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 0) {
            k = 1;
            while (Math.pow(k, 2) < n) {
                k++;
            }
            System.out.println("K=" + k + " " + (int) Math.pow(k, 2) + ">" + n);
        } else {
            System.out.println("N < 0");
        }
        System.out.println("-------------------------------");

        // while 8
        System.out.println("while8. Дано целое число N (> 0). Найти наибольшее целое число K , квадрат\n" +
                "которого не превосходит N : K 2 ≤ N . Функцию извлечения квадратного кор-\n" +
                "ня не использовать.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 0) {
            k = 1;
            while (Math.pow(k, 2) < n) {
                k++;
            }
            k--;
            System.out.println("K=" + k + " " + (int) Math.pow(k, 2) + "<=" + n);
        } else {
            System.out.println("N < 0");
        }
        System.out.println("-------------------------------");

        // while 9
        System.out.println("while9. Дано целое число N (> 1). Найти наименьшее целое число K , при кото-\n" +
                "ром выполняется неравенство 3 K > N .");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 1) {
            k = 1;
            while (Math.pow(3, k) < n) {
                k++;
            }
            System.out.println("K=" + k + " " + (int) Math.pow(3, k) + ">" + n);
        } else {
            System.out.println("N < 0");
        }
        System.out.println("-------------------------------");

        // while 10
        System.out.println("while10. Дано целое число N (> 1). Найти наибольшее целое число K , при ко-\n" +
                "тором выполняется неравенство 3 K < N .");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 1) {
            k = 1;
            while (Math.pow(3, k) < n) {
                k++;
            }
            k--;
            System.out.println("K=" + k + " " + (int) Math.pow(3, k) + "<" + n);
        } else {
            System.out.println("N < 0");
        }
        System.out.println("-------------------------------");

        // while 11
        System.out.println("while11. Дано целое число N (> 1). Вывести наименьшее из целых чисел K ,\n" +
                "для которых сумма 1 + 2 + ... + K будет больше или равна N , и саму эту\n" +
                "сумму.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 1) {
            int sum = 0;
            k = 0;
            do {
                k++;
                sum += k;
            } while (sum <= n);
            System.out.println("K=" + k + " Sum=" + sum);
        } else {
            System.out.println("N < 0");
        }
        System.out.println("-------------------------------");

        // while 12
        System.out.println("while12. Дано целое число N (> 1). Вывести наибольшее из целых чисел K , для\n" +
                "которых сумма 1 + 2 + ... + K будет меньше или равна N , и саму эту сумму.");

        System.out.print("Введите N: ");
        n = s.nextInt();
        if (n > 1) {
            int sum = 0;
            k = 0;
            do {
                k++;
                sum += k;
            } while (sum + (k + 1) <= n);
            System.out.println("K=" + k + " Sum=" + sum);
        } else {
            System.out.println("N < 0");
        }
        System.out.println("-------------------------------");

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
        s.close();
    }
}

