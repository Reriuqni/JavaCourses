import java.util.Scanner;

public class If27 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("27. Для данного вещественного x найти значение следующей функции f,\n" +
                "принимающей значения целого типа:\n" +
                "0, если x < 0,\n" +
                "f(x) =\n" +
                "1, если x принадлежит [0, 1), [2, 3), ... ,\n" +
                "–1, если x принадлежит [1, 2), [3, 4), ... .");

        System.out.print("Введите x: ");
        double xd = s.nextDouble();

        int fx = 0;

        if (xd < 0) {
            fx = 0;
        } else {
            if ((int) xd % 2 == 0) {
                fx = 1;
            }
            if ((int) xd % 2 == 1) {
                fx = -1;
            }
        }

        System.out.println("f(x)=" + fx);

    }
}
