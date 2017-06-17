import java.util.Arrays;

public class Array9 {

    public static void main(String[] args) {

        System.out.println("9. Дан целочисленный массив размера N. Вывести все содержащиеся в\n" +
                "данном массиве четные числа в порядке убывания их индексов, а также их\n" +
                "количество K.");

        int[] b = new int[20];

        int i = 0;
        while (i <= b.length - 1) {
            b[i] = ++i;
        }

        System.out.println(Arrays.toString(b));

        int k = 0;

        for (i = b.length - 1; i > 0; i--) {
            if (b[i] % 2 == 0) {
                System.out.print(b[i] + " ");
                k++;
            }
        }

        System.out.println("\nK=" + k);

    }
}
