import java.util.Scanner;

public class Switch {

    enum TimeOfYear {winter, spring, summer, autumn}

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 1
        System.out.println("1. Дано целое число в диапазоне 1–7. Вывести строку — название дня не-\n" +
                "дели, соответствующее данному числу (1 — «понедельник», 2 — «втор-\n" +
                "ник» и т. д.).");

        System.out.print("Введите номер дня: ");
        int a = s.nextInt();

        if (a > 0 && a < 8) {
            switch (a) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
            }
        } else {
            System.out.println("Неверный день");
        }
        System.out.println("--------------------------");

        // 2
        System.out.println("Дано целое число K. Вывести строку-описание оценки, соответствую-\n" +
                "щей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетво-\n" +
                "рительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в диапазоне\n" +
                "1–5, то вывести строку «ошибка».");

        System.out.print("Введите число: ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("ошибка");
                break;
        }
        System.out.println("--------------------------");

        // 3
        System.out.println("3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —\n" +
                "февраль и т. д.). Вывести название соответствующего времени года («зи-\n" +
                "ма», «весна», «лето», «осень»).");

        System.out.print("Введите номер месяца: ");
        a = s.nextInt();

        if (a >= 1 && a <= 12) {

            TimeOfYear yeartime = TimeOfYear.winter;
            yeartime = (a >= 3 && a <= 5) ? TimeOfYear.spring : yeartime;
            yeartime = (a >= 6 && a <= 8) ? TimeOfYear.summer : yeartime;
            yeartime = (a >= 9 && a <= 11) ? TimeOfYear.autumn : yeartime;

            switch (yeartime) {
                case winter:
                    System.out.println("Зима");
                    break;
                case spring:
                    System.out.println("Весна");
                    break;
                case summer:
                    System.out.println("Лето");
                    break;
                case autumn:
                    System.out.println("Осень");
                    break;
            }
        } else {
            System.out.println("Ошибка");
        }
        System.out.println("--------------------------");

        // 4
        System.out.println("4. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —\n" +
                "февраль и т. д.). Определить количество дней в этом месяце для невисо-\n" +
                "косного года");

        System.out.print("Введите номер месяца: ");
        a = s.nextInt();
        int amountofdays;
        if (a >= 1 && a <= 12) {
            switch (a) {
                case 2:
                    amountofdays = 28;
                    break;
                case 4:
                    amountofdays = 30;
                    break;
                case 6:
                    amountofdays = 30;
                    break;
                case 9:
                    amountofdays = 30;
                    break;
                case 11:
                    amountofdays = 30;
                    break;
                default:
                    amountofdays = 31;
                    break;
            }
            System.out.println("Количество дней в месяце: " + amountofdays);
        } else {
            System.out.println("Ошибка");
        }
        System.out.println("--------------------------");

        // 5
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
        a = s.nextInt();

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
        System.out.println("--------------------------");

        // 6
        System.out.println("6. Единицы длины пронумерованы следующим образом: 1 — дециметр,\n" +
                "2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер еди-\n" +
                "ницы длины (целое число в диапазоне 1–5) и длина отрезка в этих едини-\n" +
                "цах (вещественное число). Найти длину отрезка в метрах");

        System.out.print("Введите номер единицы длины: ");
        a = s.nextInt();

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
        System.out.println("--------------------------");


    }
}
