import java.util.Scanner;

public class Switch3 {

    enum TimeOfYear {winter, spring, summer, autumn}

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —\n" +
                "февраль и т. д.). Вывести название соответствующего времени года («зи-\n" +
                "ма», «весна», «лето», «осень»).");

        System.out.print("Введите номер месяца: ");
        int a = s.nextInt();

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
    }
}