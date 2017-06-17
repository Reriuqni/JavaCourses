import java.util.Arrays;
import java.util.Scanner;

public class Array11 {

    public static void main(String[] args) {

        System.out.println("11. Дан массив A размера N и целое число K (1 ≤ K ≤ N). Вывести элемен-\n" +
                "ты массива с порядковыми номерами, кратными K: A K , A 2·K , A 3·K , ... .\n" +
                "Условный оператор не использовать. ");

        Scanner s = new Scanner(System.in);
        System.out.print("Введите К: ");
        int k = s.nextInt();

        int[] a = new int[20];

        int i = 0;
        while (i <= a.length - 1) {
            a[i] = ++i;
        }

        System.out.println(Arrays.toString(a));

        if ((k >= 1) && (k <= 20)) {
            for (int j = k - 1; j < a.length; j += k) {
                System.out.print(a[j] + " ");
            }
        } else {
            System.out.println("Неверное значение K");
        }
        System.out.println("\n------------------------------");
    }
}
