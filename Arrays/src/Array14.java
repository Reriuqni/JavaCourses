import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {

        System.out.println("14. Дан массив A размера N. Вывести вначале его элементы с четными\n" +
                "номерами (в порядке возрастания номеров), а затем — элементы с нечет-\n" +
                "ными номерами (также в порядке возрастания номеров):\n" +
                "A 2 , A 4 , A 6 , ..., A 1 , A 3 , A 5 , ... .\n" +
                "Условный оператор не использовать.");

        int[] a = new int[20];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        for (int j = 0; j < a.length; j += 2) {
            System.out.print(a[j] + " ");
        }
        System.out.print("\n");
        for (int j = 1; j < a.length; j += 2) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\n------------------------------");
    }
}
