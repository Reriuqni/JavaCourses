import java.util.Scanner;

public class Boolean29 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("29. Даны числа x, y, x 1 , y 1 , x 2 , y 2 . Проверить истинность высказывания:\n" +
                "«Точка с координатами (x, y) лежит внутри прямоугольника, левая верхняя\n" +
                "вершина которого имеет координаты (x 1 , y 1 ), правая нижняя — (x 2 , y 2 ),\n" +
                "а стороны параллельны координатным осям».");

        int x,y,x1, y1, x2, y2;

        System.out.println("Введите число x:");
        x = s.nextInt();

        System.out.println("Введите число y:");
        y = s.nextInt();

        System.out.println("Введите число x1:");
        x1 = s.nextInt();

        System.out.println("Введите число y1:");
        y1 = s.nextInt();

        System.out.println("Введите число x2:");
        x2 = s.nextInt();

        System.out.println("Введите число y2:");
        y2 = s.nextInt();

        boolean result = (x >= x1) && (x <= x2) && (y <= y1) && (y >= y2) && (x2 > x1) && (y2 < y1);

        System.out.println(result);

    }
}
