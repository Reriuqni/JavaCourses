import java.util.Random;
import java.util.Scanner;

public class Matrix90 {

    private static void PrintDelimeter(int a[][]) {

        for (int j = 0; j < a[0].length; j++) System.out.printf("%4c", '-');
        System.out.printf("\n");

    }

    private static void PrintMatrix(int a[][]) {

        for (int i[] : a) {
            for (int j : i) {
                System.out.printf("%4d", j);
            }
            System.out.printf("\n");
        }

    }

    public static void main(String[] args) {

        System.out.println("90. Дана квадратная матрица порядка M. Обнулить элементы матрицы,\n" +
                "лежащие на побочной диагонали и ниже нее. Условный оператор не ис-\n" +
                "пользовать.");

        Scanner s = new Scanner(System.in);

        System.out.print("Введите M:");
        int m = s.nextInt();

        int[][] a = new int[m][m];

        Random r = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) a[i][j] = r.nextInt(10);
        }

        PrintMatrix(a);
        PrintDelimeter(a);

        for (int i = 0; i < m; i++) {
            for (int j = m - 1 - i; j < m; j++) a[i][j] = 0;
        }

        PrintMatrix(a);

    }
}
