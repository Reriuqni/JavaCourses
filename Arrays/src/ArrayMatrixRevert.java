import java.util.Random;
import java.util.Scanner;

public class ArrayMatrixRevert {

    private static void PrintMatrix(int a[][]) {

        for (int i[] : a) {
            for (int j : i) {
                System.out.printf("%4d", j);
            }
            System.out.printf("\n");
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = s.nextInt();
        System.out.print("Введите число m: ");
        int m = s.nextInt();

        Random r = new Random();

        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = r.nextInt(100);
        }

        PrintMatrix(a);
        System.out.printf("\n");

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                int t = a[i][j + 1];
                a[i][j + 1] = a[j + 1][i];
                a[j + 1][i] = t;
            }
        }

        PrintMatrix(a);

    }
}
