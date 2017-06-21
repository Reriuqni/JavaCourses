import java.util.Random;
import java.util.Scanner;

public class Matrix24 {

    private static void PrintDelimeter(int a[][]) {

        for (int j = 0; j < a[0].length; j++) System.out.printf("%4c",'-');
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

        System.out.println("24. Дана матрица размера M × N. В каждом столбце матрицы найти\n" +
                "максимальный элемент.");

        Scanner s = new Scanner(System.in);

        System.out.print("Введите M:");
        int m = s.nextInt();

        System.out.print("Введите N:");
        int n = s.nextInt();

        int[][] a = new int[m][n];

        Random r = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) a[i][j] = r.nextInt(100);
        }

        PrintMatrix(a);

        PrintDelimeter(a);

        for (int j = 0; j < n; j++) {
            int max = a[0][j];
            for (int i = 0; i < m; i++) max = (max < a[i][j])? a[i][j]: max;
            System.out.printf("%4d",max);
        }

    }
}
