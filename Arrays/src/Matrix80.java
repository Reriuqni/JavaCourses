import java.util.Random;
import java.util.Scanner;

public class Matrix80 {

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

        System.out.println("80. Дана квадратная матрица A порядка M. Найти сумму элементов ее\n" +
                "главной диагонали, то есть диагонали, содержащей следующие элементы:\n" +
                "A 1,1 , A 2,2 , A 3,3 , ..., A M,M .");

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

        int sum = 0;
        for (int i = 0; i < m; i++) sum += a[i][i];

        System.out.println("Сумма элементов главной диагонали: " + sum);

    }
}
