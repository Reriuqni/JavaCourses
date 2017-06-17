import java.util.Scanner;

public class Switch4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("4. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —\n" +
                "февраль и т. д.). Определить количество дней в этом месяце для невисо-\n" +
                "косного года");

        System.out.print("Введите номер месяца: ");
        int a = s.nextInt();

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

    }
}
