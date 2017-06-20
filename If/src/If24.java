import java.util.Scanner;

public class If24 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("24. Для данного вещественного x найти значение следующей функции f, при-\n" +
                "нимающей вещественные значения:\n" +
                "2·sin(x), если x > 0,\n" +
                "f(x) =\n" +
                "6 – x, если x ≤ 0.");

        System.out.print("Введите x: ");
        double f, xd = s.nextDouble();

        if (xd > 0) {
            f = 2 * Math.sin(xd);
        } else {
            f = 6.0 - xd;
        }

        System.out.println("f(x)=" + f);

    }
}
