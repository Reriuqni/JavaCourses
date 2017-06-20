import java.util.Scanner;

public class If2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("2. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае вычесть из него 2. Вывести полученное число.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        if (a > 0) {
            a++;
        } else {
            a -= 2;
        }

        System.out.println("a=" + a);

    }
}
