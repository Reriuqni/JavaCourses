import java.util.Arrays;

public class Array18 {

    public static void main(String[] args) {

        System.out.println("18. Дан массив A ненулевых целых чисел размера 10. Вывести значение\n" +
                "первого из тех его элементов A K , которые удовлетворяют неравенству\n" +
                "A K < A 10 . Если таких элементов нет, то вывести 0.");

        int[] a = new int[10];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }
        a[9] = 3;
        a[0] = 4;

        System.out.println(Arrays.toString(a));

        boolean iselement = false;

        for (int j = 0; j < a.length; j++) {
            if (a[j] < a[a.length - 1]) {
                System.out.print(a[j] + " < " + a[a.length - 1]);
                iselement = true;
                break;
            }
        }

        if (!iselement) {
            System.out.println("Элементов нет.");
        }

    }
}
