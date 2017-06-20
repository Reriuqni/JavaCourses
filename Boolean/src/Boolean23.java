import java.util.Scanner;

public class Boolean23 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("23. Дано четырехзначное число. Проверить истинность высказывания:\n" +
                "«Данное число читается одинаково слева направо и справа налево».");

        System.out.println("Введите число:");
        int c = s.nextInt();

        int tys, sot, des, edn;
        tys = c / 1000;
        sot = c / 100 % 10;
        des = c / 10 % 10;
        edn = c % 10;

        boolean result = (c >= 1000) && (tys == edn) && (sot == des);

        System.out.println(result);

    }
}
