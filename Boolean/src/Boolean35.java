import java.util.Scanner;

public class Boolean35 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("35. Даны координаты двух различных полей шахматной доски x 1 , y 1 ,\n" +
                "x 2 , y 2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность вы-\n" +
                "сказывания: «Данные поля имеют одинаковый цвет».");

        System.out.println("Введите число x:");
        int x = s.nextInt();

        System.out.println("Введите число y:");
        int y = s.nextInt();

        System.out.println("Введите число x1:");
        int x1 = s.nextInt();

        System.out.println("Введите число y1:");
        int y1 = s.nextInt();

        boolean iscorrectx = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        boolean iscorrectx1 = (x1 >= 1) && (x1 <= 8) && (y1 >= 1) && (y1 <= 8);
        boolean iswhite = ((x + y) % 2 != 0 && (x1 + y1) % 2 != 0);
        boolean isblack = ((x + y) % 2 == 0 && (x1 + y1) % 2 == 0);
        boolean result = iscorrectx && iscorrectx1 && (isblack || iswhite);

        System.out.println(result);

    }
}
