import java.util.Scanner;

public class If17 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("17. Даны три переменные вещественного типа: A, B, C. Если их значения упо-\n" +
                "рядочены по возрастанию или убыванию, то удвоить их; в противном слу-\n" +
                "чае заменить значение каждой переменной на противоположное. Вывести\n" +
                "новые значения переменных A, B, C.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        if (((a < b) && (b < c)) || ((a > b) && (b > c))) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }

        System.out.println("A=" + a + " B=" + b + " C=" + c);

    }
}
