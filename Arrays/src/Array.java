import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // arrays
        int[] a = new int[]{1, 3, 4, 2, 8, 6, 0, 23, 1, 45, 34, 55};

        System.out.println(Arrays.toString(a));

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }

        System.out.println(Arrays.toString(a));

    }
}
