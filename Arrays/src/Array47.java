import java.util.Arrays;

public class Array47 {

    public static void main(String[] args) {

        System.out.println("47. Дан целочисленный массив размера N. Найти количество различных\n" +
                "элементов в данном массиве.");

        int[] a = new int[10];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        int c = a.length;
        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] == a[k]) c--;
            }
        }
        System.out.println("Кол-во элементов: " + c);

    }
}
