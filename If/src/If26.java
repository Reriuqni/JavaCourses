import java.util.Scanner;

public class If26 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("26. Для данного вещественного x найти значение следующей функции f, при-\n" +
                "нимающей вещественные значения:\n" +
                "–x, если x ≤ 0,\n" +
                "f(x) =\n" +
                "x 2 , если 0 < x < 2,\n" +
                "4, если x ≥ 2.");

        System.out.print("Введите x: ");
        double f=0, xd = s.nextDouble();

        if (xd >= 2) f = 4.0;
        if (xd > 0) f = Math.pow(xd, 2);
        if (xd <= 0) f = -xd;

        System.out.println("f(x)=" + f);

    }
}
