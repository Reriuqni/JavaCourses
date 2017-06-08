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
        int amountofdays = 0;
        if (a >= 1 && a <= 12) {
            switch (a) {
                case 2:
                    amountofdays = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    amountofdays = 30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
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

        // 7
        System.out.println("7. Единицы массы пронумерованы следующим образом: 1 — килограмм,\n" +
                "2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер. Дан номер единицы\n" +
                "массы (целое число в диапазоне 1–5) и масса тела в этих единицах (веще-\n" +
                "ственное число). Найти массу тела в килограммах.");

        System.out.print("Введите номер единицы массы: ");
        a = s.nextInt();

        System.out.print("Введите массу: ");
        double mass = s.nextDouble();

        double masskg;
        k = 0;

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
        System.out.println("--------------------------");

        // 8
        System.out.println("8. Даны два целых числа: D (день) и M (месяц), определяющие правиль-\n" +
                "ную дату невисокосного года. Вывести значения D и M для даты, предше-\n" +
                "ствующей указанной.");

        System.out.print("Введите день: ");
        int d = s.nextInt();

        System.out.print("Введите номер месяца: ");
        int m = s.nextInt();

        if (d > 0 && d < 32 && m > 0 && m < 13) {
            int days = 0;
            if (d == 1) {
                if (--m < 1) m = 12;
                switch (m) {
                    case 2:
                        days = 28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                }
                d = days;
            } else {
                d--;
            }
            System.out.println("Пред. дата: " + d + "-" + m);
        } else {
            System.out.println("Некорректная дата!");
        }
        System.out.println("--------------------------");

        // 9
        System.out.println("9. Даны два целых числа: D (день) и M (месяц), определяющие правиль-\n" +
                "ную дату невисокосного года. Вывести значения D и M для даты, следую-\n" +
                "щей за указанной.");

        System.out.print("Введите день: ");
        d = s.nextInt();

        System.out.print("Введите номер месяца: ");
        m = s.nextInt();

        if (d > 0 && d < 32 && m > 0 && m < 13) {
            int days = 0;
            switch (m) {
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
            }
            if (++d > days) {
                d = 1;
                if (++m > 12) m = 1;
            }
            System.out.println("След. дата: " + d + "-" + m);
        } else {
            System.out.println("Некорректная дата!");
        }
        System.out.println("--------------------------");

        //TODO
    }
}
