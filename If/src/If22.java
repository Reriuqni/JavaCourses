import java.util.Scanner;

public class If22 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("22. Даны координаты точки, не лежащей на координатных осях OX и OY.\n" +
                "Определить номер координатной четверти, в которой находится данная\n" +
                "точка.");

        System.out.print("Введите координаты x: ");
        int x = s.nextInt();

        System.out.print("Введите координаты y: ");
        int y = s.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("Точка лежит на осях");
        } else {
            if (x > 0 && y > 0) System.out.println(1);
            if (x > 0 && y < 0) System.out.println(4);
            if (x < 0 && y > 0) System.out.println(2);
            if (x < 0 && y < 0) System.out.println(3);
        }

    }
}
