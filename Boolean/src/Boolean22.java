import java.util.Scanner;

public class Boolean22 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("22. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Цифры данного числа образуют возрастающую или убывающую после-\n" +
                "довательность».");

        System.out.println("Введите число:");
        int c = s.nextInt();

        int sot = c / 100;
        int des = c / 10 % 10;
        int edn = c % 10;

        boolean vozr = (sot < des) && (des < edn) && (sot < edn);
        boolean ubyv = (sot > des) && (des > edn) && (sot > edn);
        boolean result = (c >= 100) && (c <= 999) && (vozr || ubyv);

        System.out.println(result);

    }
}
