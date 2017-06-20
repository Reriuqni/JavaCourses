import java.util.Scanner;

public class Boolean20 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("20. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Все цифры данного числа различны»");

        System.out.println("Введите число:");
        int c = s.nextInt();

        int sot, des, edn;

        sot = c / 100;
        des = c / 10 % 10;
        edn = c % 10;

        boolean result = (c >= 100) && (c <= 999) && (sot != des) && (des != edn) && (sot != edn);

        System.out.println(result);

    }
}
