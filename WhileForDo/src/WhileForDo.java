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

        int i ;
        for (i = 1, b = i; i < 10 && b < 20; i *= 2) {
            b += i;
            System.out.println(i + "-" + b);
        }


    }
}

