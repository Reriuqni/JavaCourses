import java.util.Scanner;

public class Boolean34 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("34. Даны координаты поля шахматной доски x, y (целые числа, лежа-\n" +
                "щие в диапазоне 1–8). Учитывая, что левое нижнее поле доски (1, 1) явля-\n" +
                "ется черным, проверить истинность высказывания: «Данное поле является\n" +
                "белым».");

        System.out.println("Введите число x:");
        int x = s.nextInt();

        System.out.println("Введите число y:");
        int y = s.nextInt();

        boolean iscorrect = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        boolean result = iscorrect && (x + y) % 2 != 0;

        System.out.println(result);

    }
}
