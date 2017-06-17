import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

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

    }
}
