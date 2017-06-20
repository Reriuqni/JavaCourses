import java.util.Scanner;

public class If16 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("16. Даны три переменные вещественного типа: A, B, C. Если их значения упо-\n" +
                "рядочены по возрастанию, то удвоить их; в противном случае заменить\n" +
                "значение каждой переменной на противоположное. Вывести новые значе-\n" +
                "ния переменных A, B, C.");

        System.out.print("Введите число a: ");
        int a = s.nextInt();

        System.out.print("Введите число b: ");
        int b = s.nextInt();

        System.out.print("Введите число c: ");
        int c = s.nextInt();

        if ((a < b) && (b < c)) {
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
