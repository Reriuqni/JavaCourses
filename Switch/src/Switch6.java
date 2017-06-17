import java.util.Scanner;

public class Switch6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("6. Единицы длины пронумерованы следующим образом: 1 — дециметр,\n" +
                "2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер еди-\n" +
                "ницы длины (целое число в диапазоне 1–5) и длина отрезка в этих едини-\n" +
                "цах (вещественное число). Найти длину отрезка в метрах");

        System.out.print("Введите номер единицы длины: ");
        int a = s.nextInt();

        System.out.print("Введите длину отрезка: ");
        double length = s.nextDouble();

        double meters, k = 0;

        if (a > 0 && a < 6) {
            switch (a) {
                case 1:
                    k = 0.1;
                    break;
                case 2:
                    k = 1000;
                    break;
                case 3:
                    k = 1;
                    break;
                case 4:
                    k = 0.001;
                    break;
                case 5:
                    k = 0.01;
                    break;
            }
            meters = k * length;
            System.out.println("Длина в метрах: " + meters);
        } else {
            System.out.println("Ошибочная операция!");
        }

    }
}
