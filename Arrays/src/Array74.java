import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array74 {

    public static void main(String[] args) {

        System.out.println("74. Дан массив размера N. Обнулить элементы массива, расположенные\n" +
                "между его минимальным и максимальным элементами (не включая мини-\n" +
                "мальный и максимальный элементы).");

        Scanner s = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = s.nextInt();

        int[] a = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(a));

        int index_min = 0, index_max = 0, min = a[0], max = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] < min) { min = a[i]; index_min = i; }
            if (a[i] > max) { max = a[i]; index_max = i; }
        }

        if (index_max < index_min) index_max = index_max ^ index_min ^ (index_min = index_max);

        for (int i = index_min + 1; i < index_max; i++) a[i] = 0;

        System.out.println("Max=" + max + " Min=" + min);

        System.out.println(Arrays.toString(a));

        s.close();
    }
}
