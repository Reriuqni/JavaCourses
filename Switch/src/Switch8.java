import java.util.Scanner;

public class Switch8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

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

    }
}
