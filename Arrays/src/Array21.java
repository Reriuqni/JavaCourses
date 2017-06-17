import java.util.Arrays;
import java.util.Scanner;

public class Array21 {

    public static void main(String[] args) {

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

        System.out.println(Arrays.toString(a));

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

    }
}
