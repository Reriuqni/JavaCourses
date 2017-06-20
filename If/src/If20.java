import java.util.Scanner;

public class If20 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("20. На числовой оси расположены три точки: A, B, C. Определить, какая из\n" +
                "двух последних точек (B или C) расположена ближе к A, и вывести эту точ-\n" +
                "ку и ее расстояние от точки A.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        int lb = Math.abs(a - b);
        int lc = Math.abs(a - c);

        if (lb < lc) {
            System.out.println("B, L=" + lb);
        } else {
            System.out.println("C, L=" + lc);
        }

    }
}
