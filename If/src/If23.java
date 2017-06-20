import java.util.Scanner;

public class If23 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("23. Даны целочисленные координаты трех вершин прямоугольника, стороны\n" +
                "которого параллельны координатным осям. Найти координаты его четвер-\n" +
                "той вершины.");

        int ax, ay, bx, by, cx, cy, dx = 0, dy = 0;

        System.out.print("Введите координаты ax: ");
        ax = s.nextInt();

        System.out.print("Введите координаты ay: ");
        ay = s.nextInt();

        System.out.print("Введите координаты bx: ");
        bx = s.nextInt();

        System.out.print("Введите координаты by: ");
        by = s.nextInt();

        System.out.print("Введите координаты cx: ");
        cx = s.nextInt();

        System.out.print("Введите координаты cy: ");
        cy = s.nextInt();

        if (ax == bx) {
            dx = cx;
            if (by == cy) {
                dy = ay;
            } else {
                dy = cy;
            }
        }

        if (ax == cx) {
            dx = bx;
            if (by == cy) {
                dy = ay;
            } else {
                dy = cy;
            }
        }

        System.out.println("dx=" + dx + " dy=" + dy);

    }
}
