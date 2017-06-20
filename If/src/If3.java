import java.util.Scanner;

public class If3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("3. Дано целое число. Если оно является положительным, то прибавить к не-\n" +
                "му 1; если отрицательным, то вычесть из него 2; если нулевым, то заме-\n" +
                "нить его на 10. Вывести полученное число.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        if (a > 0) {
            a++;
        } else {
            if (a == 0) {
                a = 10;
            } else {
                a -= 2;
            }
        }

        System.out.println("a=" + a);

    }
}
