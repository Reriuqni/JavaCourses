import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private static void PrintArray(int[] a) {

        for (int c = 0; c < a.length - 1; c++) {
            System.out.print(c + ", ");
        }
        System.out.print(a[a.length - 1] + "\n");

    }

    public static void main(String[] args) {
/*
        { // arrays
            int[] a = new int[]{1, 3, 4, 2, 8, 6, 0, 23, 1, 45, 34, 55};

            PrintArray(a);

            for (int j = 0; j < a.length; j++) {
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        int t = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = t;
                    }
                }
            }

            PrintArray(a);
        }

        { //
            int[] b = new int[10];
            int i = 1;
            b[0] = 1;

            while (i < b.length) {
                b[i] += b[i - 1] + 2;
                i++;
            }

            PrintArray(b);
        }
*/
        { // 9
            System.out.println("Array9. Дан целочисленный массив размера N. Вывести все содержащиеся в\n" +
                    "данном массиве четные числа в порядке убывания их индексов, а также их\n" +
                    "количество K.");

            int[] b = new int[20];
            int i = 0;
            b[0] = 1;

            while (i < b.length) {
                b[i] += i;
                i++;
            }

            PrintArray(b);

            int k = 0;
            for (i = b.length - 1; i > 0; i--) {
                if (b[i] % 2 == 0) {
                    System.out.print(b[i] + " ");
                    k++;
                }
            }
            System.out.println("\nK=" + k);
            System.out.println("\n------------------------------");
        }

        {   // 11
            System.out.println("Дан массив A размера N и целое число K (1 ≤ K ≤ N). Вывести элемен-\n" +
                    "ты массива с порядковыми номерами, кратными K: A K , A 2·K , A 3·K , ... .\n" +
                    "Условный оператор не использовать. ");

            Scanner s = new Scanner(System.in);
            System.out.print("Введите К: ");
            int k = s.nextInt();

            int[] a = new int[20];
            int i = 0;
            a[0] = 0;

            while (i < a.length) {
                a[i] = i;
                i++;
            }

            PrintArray(a);

            for (int j = k - 1; j < a.length; j += k) {
                System.out.print(a[j] + " ");
            }

            System.out.println("\n------------------------------");
        }

        { // 14
            System.out.println("Дан массив A размера N. Вывести вначале его элементы с четными\n" +
                    "номерами (в порядке возрастания номеров), а затем — элементы с нечет-\n" +
                    "ными номерами (также в порядке возрастания номеров):\n" +
                    "A 2 , A 4 , A 6 , ..., A 1 , A 3 , A 5 , ... .\n" +
                    "Условный оператор не использовать.");

            int[] a = new int[20];
            int i = 0;
            a[0] = 0;

            while (i < a.length) {
                a[i] = i;
                i++;
            }

            PrintArray(a);

            for (int j = 0; j < a.length; j += 2) {
                System.out.print(a[j] + " ");
            }
            System.out.print("\n");

            for (int j = 1; j < a.length; j += 2) {
                System.out.print(a[j] + " ");
            }
            System.out.print("\n");

            System.out.println("\n------------------------------");
        }

    }
}
