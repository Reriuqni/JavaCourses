import java.util.Random;
import java.util.Scanner;

public class WhileForDo {

    public static void main(String[] args) {

    /*
        for (each:data) {}

        while (true) {
        }

        for(;;) {
        }

        do {
        } while (true);

     */
        System.out.println("While1. Даны положительные числа A и B ( A > B ). На отрезке длины A разме-\n" +
                "щено максимально возможное количество отрезков длины B (без наложе-\n" +
                "ний). Не используя операции умножения и деления, найти длину незанятой\n" +
                "части отрезка A .");
        int a, b, c = 0;
        Scanner s = new Scanner(System.in);
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
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println(r.nextInt(11) - 5);
            System.out.println((int) (10 * Math.random()) - 5);
        }

        sc.close();
    }
}

