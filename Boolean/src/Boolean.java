import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите число a:");

        int a = s.nextInt();

        System.out.println("Введите число b:");

        int b = s.nextInt();

        boolean result;

        // 1
        result = a > 0;
        System.out.println(result);

        // 2
        result = a % 2 != 0;
        System.out.println(result);

        // 3
        result = a % 2 == 0;
        System.out.println(result);

        // 9
        result = (a % 2 != 0) || (b % 2 != 0);
        System.out.println(result);

        // 20
        System.out.println("Введите трехзначное число c:");

        int c = s.nextInt(), sot, des, edn;
        sot = c / 100;
        des = c / 10 % 10;
        edn = c % 10;
        result = (sot != des) && (des != edn) && (sot != edn);

        System.out.println(result);

    }
}

