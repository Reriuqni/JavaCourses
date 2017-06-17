import java.util.Arrays;

public class Array19 {

    public static void main(String[] args) {

        System.out.println("19. Дан целочисленный массив A размера 10. Вывести порядковый номер\n" +
                "последнего из тех его элементов A K , которые удовлетворяют двойному не-\n" +
                "равенству A 1 < A K < A 10 . Если таких элементов нет, то вывести 0.");

        int[] a = new int[10];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        boolean iselement = false;

        for (int j = 0; j < a.length; j++) {
            if ((a[0] < a[j]) && (a[j] < a[a.length - 1])) {
                System.out.print(a[0] + " < " + a[j] + " < " + a[a.length - 1]);
                iselement = true;
                break;
            }
        }

        if (!iselement) {
            System.out.println("Элементов нет.");
        }

    }
}
