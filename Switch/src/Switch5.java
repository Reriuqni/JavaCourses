import java.util.Scanner;

public class Switch5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("5. Арифметические действия над числами пронумерованы следующим\n" +
                "образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.\n" +
                "Дан номер действия N (целое число в диапазоне 1–4) и вещественные чис-\n" +
                "ла A и B (В не равно 0). Выполнить над числами указанное действие и вы-\n" +
                "вести результат.");

        System.out.print("Введите число А: ");
        double xA = s.nextDouble();

        System.out.print("Введите число B: ");
        double xB = s.nextDouble();

        System.out.print("Введите номер операции: ");
        int a = s.nextInt();

        if (a > 0 && a < 5) {
            double result = 0;
            switch (a) {
                case 1:
                    result = xA + xB;
                    break;
                case 2:
                    result = xA - xB;
                    break;
                case 3:
                    result = xA * xB;
                    break;
                case 4:
                    result = xA / xB;
                    break;
            }
            System.out.println("Результат:" + result);
        } else {
            System.out.println("Ошибочная операция!");
        }

    }
}
