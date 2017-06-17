import java.util.Arrays;

public class Array41 {

    public static void main(String[] args) {

        System.out.println("41. Дан массив размера N. Найти два соседних элемента, сумма которых\n" +
                "максимальна, и вывести эти элементы в порядке возрастания их индексов.");

        int[] a = new int[10];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        int sum = a[0] + a[1];
        int index = 0;

        for (int j = 1; j < a.length - 1; j++) {
            if (sum < a[j] + a[j + 1]) {
                sum = a[j] + a[j + 1];
                index = j;
            }
        }

        System.out.println(a[index] + " " + a[index+1]);

    }
}
