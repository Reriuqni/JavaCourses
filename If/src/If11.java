import java.util.Scanner;

public class If11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("11. Даны две переменные целого типа: A и B. Если их значения не равны, то\n" +
                "присвоить каждой переменной большее из этих значений, а если равны, то\n" +
                "присвоить переменным нулевые значения. Вывести новые значения пере-\n" +
                "менных A и B.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        System.out.print("Введите число b:");
        int b = s.nextInt();

        a = b = (a == b) ? 0 : (a > b) ? a : b;

        System.out.println("A=" + a + " B=" + b);

    }
}
