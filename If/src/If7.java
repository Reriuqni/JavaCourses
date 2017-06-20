import java.util.Scanner;

public class If7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("7. Даны два числа. Вывести порядковый номер меньшего из них");

        System.out.print("Введите число b:");
        int b = s.nextInt();

        System.out.print("Введите число c:");
        int c = s.nextInt();

        int number = (b < c) ? 1 : 2;

        System.out.println("Номер: " + number);

    }
}
