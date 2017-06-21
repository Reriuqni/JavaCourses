import java.util.Arrays;
import java.util.Random;

public class Array32 {

    public static void main(String[] args) {

        System.out.println("32. Дан массив размера N. Найти номер его первого локального миниму-\n" +
                "ма (локальный минимум — это элемент, который меньше любого из своих\n" +
                "соседей).");

        int[] a = new int[10];

        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) a[i] = rnd.nextInt(100);

        System.out.println(Arrays.toString(a));

        for (int j = 1; j < a.length - 1; j++) {
            if (a[j] < a[j - 1] && a[j] < a[j + 1]) {
                System.out.println("Первый элемент: " + (j+1));
                break;
            }
        }

    }
}
