import java.util.Scanner;

public class Switch7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("7. Единицы массы пронумерованы следующим образом: 1 — килограмм,\n" +
                "2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер. Дан номер единицы\n" +
                "массы (целое число в диапазоне 1–5) и масса тела в этих единицах (веще-\n" +
                "ственное число). Найти массу тела в килограммах.");

        System.out.print("Введите номер единицы массы: ");
        int a = s.nextInt();

        System.out.print("Введите массу: ");
        double mass = s.nextDouble();

        double masskg;
        double k = 0;

        if (a > 0 && a < 6) {
            switch (a) {
                case 1:
                    k = 1;
                    break;
                case 2:
                    k = 0.000001;
                    break;
                case 3:
                    k = 0.001;
                    break;
                case 4:
                    k = 1000;
                    break;
                case 5:
                    k = 100;
                    break;
            }
            masskg = k * mass;
            System.out.println("Масса в кг: " + masskg);
        } else {
            System.out.println("Ошибочная операция!");
        }
    }
}
