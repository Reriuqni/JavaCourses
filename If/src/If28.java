import java.util.Scanner;

public class If28 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("28. Дан номер года (положительное целое число). Определить количество\n" +
                "дней в этом году, учитывая, что обычный год насчитывает 365 дней, а ви-\n" +
                "сокосный — 366 дней. Високосным считается год, делящийся на 4, за ис-\n" +
                "ключением тех годов, которые делятся на 100 и не делятся на 400 (напри-\n" +
                "мер, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — яв-\n" +
                "ляются).");

        System.out.print("Введите номер года: ");
        int x = s.nextInt();

        int days = 365;

        if (x > 0) {
            if (x % 4 == 0) {
                days++;
                if (x % 100 == 0 && x % 400 != 0) days--;
            }
            System.out.println("Дней: " + days);
        } else {
            System.out.println("Некорректный год");
        }

    }
}
