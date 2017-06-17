import java.util.Arrays;
import java.util.Scanner;

public class Array22 {

    public static void main(String[] args) {

        System.out.println("22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти сум-\n" +
                "му всех элементов массива, кроме элементов с номерами от K до L вклю-\n" +
                "чительно.");

        Scanner s = new Scanner(System.in);

        System.out.print("Введите К: ");
        int k = s.nextInt();

        System.out.print("Введите L: ");
        int l = s.nextInt();

        int[] a = new int[10];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        if ((k >= 1) && (l > k) && (l <= a.length)) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                if (!((j >= k - 1) && (j <= l - 1))) {
                    sum += a[j];
                }
            }
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Неверные значения K,L");
        }

    }
}
