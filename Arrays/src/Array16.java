import java.util.Arrays;

public class Array16 {

    public static void main(String[] args) {

        System.out.println("16. Дан массив A размера N. Вывести его элементы в следующем порядке:\n" +
                "A 1 , A N , A 2 , A N–1 , A 3 , A N–2 , ... .");

        int[] a = new int[20];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        for (int j = 0; j < a.length / 2; j++) {
            System.out.print(a[j] + " " + a[a.length - 1 - j] + " ");
        }

    }
}
