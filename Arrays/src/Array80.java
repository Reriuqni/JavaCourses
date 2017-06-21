import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array80 {

    public static void main(String[] args) {

        System.out.println("80. Дан массив размера N. Осуществить сдвиг элементов массива влево на\n" +
                "одну позицию (при этом A N перейдет в A N–1 , A N–1 — в A N–2 , ..., A 2 — в A 1 ,\n" +
                "a исходное значение первого элемента будет потеряно). Последний эле-\n" +
                "мент полученного массива положить равным 0.");

        Scanner s = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = s.nextInt();

        int[] a = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) a[i] = rnd.nextInt(100);

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < n-1; i++) a[i] = a[i+1];
        a[n-1] = 0;

        System.out.println(Arrays.toString(a));

    }
}
