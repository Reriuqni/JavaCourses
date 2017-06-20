import java.util.Scanner;

public class If25 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("25. Для данного целого x найти значение следующей функции f, принимаю-\n" +
                "щей значения целого типа:\n" +
                "2·x, если x < –2 или x > 2,\n" +
                "f(x) =\n" +
                "–3·x, в противном случае.");

        System.out.print("Введите x: ");
        int fx, x = s.nextInt();

        if (x < -2 || x > 2) {
            fx = 2 * x;
        } else {
            fx = -3 * x;
        }

        System.out.println("f(x)=" + fx);

    }
}
