import java.util.Arrays;

public class Array31 {

    public static void main(String[] args) {

        System.out.println("31. Дан массив размера N. Найти номера тех элементов массива, которые\n" +
                "больше своего левого соседа, и количество таких элементов. Найденные\n" +
                "номера выводить в порядке их убывания.");

        int[] a = new int[10];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        a[3] = 2;

        System.out.println(Arrays.toString(a));

        int c = 0;

        for (int j = a.length - 1; j > 0; j--) {
            if (a[j] > a[j - 1]) {
                System.out.print((j + 1) + " ");
                c++;
            }
        }

        System.out.println("\nКол-во элементов: " + c);

    }
}
