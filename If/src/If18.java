import java.util.Scanner;

public class If18 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("18. Даны три целых числа, одно из которых отлично от двух других, равных\n" +
                "между собой. Определить порядковый номер числа, отличного от осталь-\n" +
                "ных.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        if (!((a == b && b == c) || (a != b && b != c && a != c))) {
            if (a == b) {
                System.out.println(3);
            }
            if (b == c) {
                System.out.println(1);
            }
            if (a == c) {
                System.out.println(2);
            }
        } else {
            System.out.println("Все числа или равны, или разные");
        }

    }
}
