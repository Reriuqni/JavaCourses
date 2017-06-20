import java.util.Scanner;

public class If21 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("21. Даны целочисленные координаты точки на плоскости. Если точка совпа-\n" +
                "дает с началом координат, то вывести 0. Если точка не совпадает с началом\n" +
                "координат, но лежит на оси OX или OY, то вывести соответственно 1 или 2.\n" +
                "Если точка не лежит на координатных осях, то вывести 3.");

        System.out.print("Введите координаты x: ");
        int x = s.nextInt();
        System.out.print("Введите координаты y: ");
        int y = s.nextInt();

        if (x == 0 && y == 0) System.out.println(0);
        if (x != 0 && y == 0) System.out.println(1);
        if (x == 0 && y != 0) System.out.println(2);
        if (x != 0 && y != 0) System.out.println(3);

    }
}
