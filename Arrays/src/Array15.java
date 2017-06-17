import java.util.Arrays;

public class Array15 {

    public static void main(String[] args) {

        System.out.println("15. Дан массив A размера N. Вывести вначале его элементы с нечетными\n" +
                "номерами в порядке возрастания номеров, а затем — элементы с четными\n" +
                "номерами в порядке убывания номеров.\n" +
                "A 1 , A 3 , A 5 , ..., A 6 , A 4 , A 2 .");

        int[] a = new int[20];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        for (int j = 1; j < a.length; j += 2) {
            System.out.print(a[j] + " ");
        }

        for (int j = a.length - 2; j >= 0; j -= 2) {
            System.out.print(a[j] + " ");
        }

    }
}
