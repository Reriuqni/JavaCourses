import java.util.Arrays;

public class ArrayInvert {

    public static void main(String[] args) {

        int[] a = new int[10];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        int t;
        for (i = 0; i < a.length / 2; i++) {
            t = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = t;
        }

        System.out.println(Arrays.toString(a));

    }
}
