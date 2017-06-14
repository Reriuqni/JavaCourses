import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private static void PrintArray(int[] a) {

        System.out.print("--> ");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1] + " <--\n");

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
        {
            // 9
            System.out.println("9. Дан целочисленный массив размера N. Вывести все содержащиеся в\n" +
                    "данном массиве четные числа в порядке убывания их индексов, а также их\n" +
                    "количество K.");

            int[] b = new int[20];

            int i = 0;
            while (i <= b.length - 1) {
                b[i] = ++i;
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

        {
            // 11
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

            PrintArray(a);

            if ((k >= 1) && (k <= 20)) {
                for (int j = k - 1; j < a.length; j += k) {
                    System.out.print(a[j] + " ");
                }
            } else {
                System.out.println("Неверное значение K");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 14
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

            PrintArray(a);

            for (int j = 0; j < a.length; j += 2) {
                System.out.print(a[j] + " ");
            }
            System.out.print("\n");
            for (int j = 1; j < a.length; j += 2) {
                System.out.print(a[j] + " ");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 15
            System.out.println("15. Дан массив A размера N. Вывести вначале его элементы с нечетными\n" +
                    "номерами в порядке возрастания номеров, а затем — элементы с четными\n" +
                    "номерами в порядке убывания номеров.\n" +
                    "A 1 , A 3 , A 5 , ..., A 6 , A 4 , A 2 .");

            int[] a = new int[20];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

            for (int j = 1; j < a.length; j += 2) {
                System.out.print(a[j] + " ");
            }
            for (int j = a.length - 2; j >= 0; j -= 2) {
                System.out.print(a[j] + " ");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 16
            System.out.println("16. Дан массив A размера N. Вывести его элементы в следующем порядке:\n" +
                    "A 1 , A N , A 2 , A N–1 , A 3 , A N–2 , ... .");

            int[] a = new int[20];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

            for (int j = 0; j < a.length / 2; j++) {
                System.out.print(a[j] + " " + a[a.length - 1 - j] + " ");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 17
            System.out.println("17. Дан массив A размера N. Вывести его элементы в следующем порядке:\n" +
                    "A 1 , A 2 , A N , A N–1 , A 3 , A 4 , A N–2 , A N–3 , ... .");

            int[] a = new int[20];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

            for (int j = 0; j < a.length / 2; j += 2) {
                System.out.print(a[j] + " " + a[j + 1] + " ");
                System.out.print(a[a.length - 1 - j] + " " + a[a.length - 2 - j] + " ");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 18
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

            PrintArray(a);

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
            System.out.println("\n------------------------------");

        }

        {
            // 19
            System.out.println("19. Дан целочисленный массив A размера 10. Вывести порядковый номер\n" +
                    "последнего из тех его элементов A K , которые удовлетворяют двойному не-\n" +
                    "равенству A 1 < A K < A 10 . Если таких элементов нет, то вывести 0.");

            int[] a = new int[10];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

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
            System.out.println("\n------------------------------");
        }

        {
            // 20
            System.out.println("20. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти сум-\n" +
                    "му элементов массива с номерами от K до L включительно.");

            Scanner s = new Scanner(System.in);
            System.out.print("Введите К: ");
            int k = s.nextInt();
            System.out.print("Введите L: ");
            int l = s.nextInt();

            int[] a = new int[10];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

            if ((k >= 1) && (l > k) && (l <= a.length)) {
                int sum = 0;
                for (int j = k - 1; j < l; j++) {
                    sum += a[j];
                }
                System.out.println("Sum: " + sum);
            } else {
                System.out.println("Неверные значения K,L");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 21
            System.out.println("21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти\n" +
                    "среднее арифметическое элементов массива с номерами от K до L включи-\n" +
                    "тельно.");

            Scanner s = new Scanner(System.in);
            System.out.print("Введите К: ");
            int k = s.nextInt();
            System.out.print("Введите L: ");
            int l = s.nextInt();

            int[] a = new int[10];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

            if ((k >= 1) && (l > k) && (l <= a.length)) {
                int sum = 0;
                int c = 0;
                for (int j = k - 1; j < l; j++) {
                    sum += a[j];
                    c++;
                }
                System.out.println("Average: " + ((c != 0) ? sum / c : "Infinity"));
            } else {
                System.out.println("Неверные значения K,L");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 22
            System.out.println("22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти сум-\n" +
                    "му всех элементов массива, кроме элементов с номерами от K до L вклю-\n" +
                    "чительно.");

            Scanner s = new Scanner(System.in);
            System.out.print("Введите К: ");
            int k = s.nextInt();
            System.out.print("Введите L: ");
            int l = s.nextInt();

            int[] a = new int[10];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

            if ((k >= 1) && (l > k) && (l <= a.length)) {
                int sum = 0;
                for (int j = 0; j < a.length; j++) {
                    if (!((j >= k - 1) && (j <= l - 1))) {
                        sum += a[j];
                    }
                }
                System.out.println("Sum: " + sum);
            } else {
                System.out.println("Неверные значения K,L");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 23
            System.out.println("23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти\n" +
                    "среднее арифметическое всех элементов массива, кроме элементов с номе-\n" +
                    "рами от K до L включительно.");

            Scanner s = new Scanner(System.in);
            System.out.print("Введите К: ");
            int k = s.nextInt();
            System.out.print("Введите L: ");
            int l = s.nextInt();

            int[] a = new int[10];

            int i = 0;
            while (i <= a.length - 1) {
                a[i] = ++i;
            }

            PrintArray(a);

            if ((k >= 1) && (l > k) && (l <= a.length)) {
                int sum = 0;
                int c = 0;
                for (int j = 0; j < a.length; j++) {
                    if (!((j >= k - 1) && (j <= l - 1))) {
                        sum += a[j];
                        c++;
                    }
                }
                System.out.println("Average: " + ((c != 0) ? sum / c : "Infinity"));
            } else {
                System.out.println("Неверные значения K,L");
            }
            System.out.println("\n------------------------------");
        }

        {
            // 24
            // TODO: just do it!
        }
    }
}
