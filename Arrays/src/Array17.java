import java.util.Arrays;

public class Array17 {

    public static void main(String[] args) {

        System.out.println("17. Дан массив A размера N. Вывести его элементы в следующем порядке:\n" +
                "A 1 , A 2 , A N , A N–1 , A 3 , A 4 , A N–2 , A N–3 , ... .");

        int[] a = new int[20];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        for (int j = 0; j < a.length / 2; j += 2) {
            System.out.print(a[j] + " " + a[j + 1] + " ");
            System.out.print(a[a.length - 1 - j] + " " + a[a.length - 2 - j] + " ");
        }
        System.out.println("\n------------------------------");

    }
}
