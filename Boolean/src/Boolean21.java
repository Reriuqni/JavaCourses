import java.util.Scanner;

public class Boolean21 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("21. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Цифры данного числа образуют возрастающую последовательность».");

        System.out.println("Введите число:");
        int c = s.nextInt();

        int sot = c / 100;
        int des = c / 10 % 10;
        int edn = c % 10;

        boolean result = (c >= 100) && (c <= 999) && (sot < des) && (des < edn) && (sot < edn);

        System.out.println(result);

    }
}
