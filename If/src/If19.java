import java.util.Scanner;

public class If19 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("19. Даны четыре целых числа, одно из которых отлично от трех других, рав-\n" +
                "ных между собой. Определить порядковый номер числа, отличного от ос-\n" +
                "тальных.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        System.out.print("Введите число d: ");
        int d = s.nextInt();

        if (!((a == b) && (b == c) && (c == d) || (a != b && b != c && a != c && a != d && b != d && c != d))) {
            if (a == b && b == c) {
                System.out.println(4);
            }
            if (a == b && b == d) {
                System.out.println(3);
            }
            if (a == c && c == d) {
                System.out.println(2);
            }
            if (b == c && c == d) {
                System.out.println(1);
            }
        } else {
            System.out.println("Все числа или равны, или разные");
        }

    }
}
