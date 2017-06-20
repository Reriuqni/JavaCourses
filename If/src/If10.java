import java.util.Scanner;

public class If10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("10. Даны две переменные целого типа: A и B. Если их значения не равны, то\n" +
                "присвоить каждой переменной сумму этих значений, а если равны, то при-\n" +
                "своить переменным нулевые значения. Вывести новые значения перемен-\n" +
                "ных A и B.");

        System.out.print("Введите число a:");
        int a = s.nextInt();

        System.out.print("Введите число b:");
        int b = s.nextInt();

        a = b = (a != b) ? a + b : 0;

        System.out.println("A=" + a + " B=" + b);

    }
}
