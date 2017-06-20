import java.util.Scanner;

public class If1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("1. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        if (a > 0) a++;

        System.out.println("a=" + a);

    }
}
