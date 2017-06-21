import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array40 {

    public static void main(String[] args) {

        System.out.println("40. Дано число R и массив A размера N. Найти элемент массива, который\n" +
                "наиболее близок к числу R (то есть такой элемент A K , для которого величи-\n" +
                "на |A K – R| является минимальной).");

        Scanner s = new Scanner(System.in);

        System.out.print("Введите размер массива N:");
        int n = s.nextInt();

        System.out.print("Введите число R:");
        int r = s.nextInt();

        int[] a = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) a[i] = rnd.nextInt(100);

        System.out.println(Arrays.toString(a));

        int index = 0, delta = r;

        for (int i = 0; i < n; i++) {
            if (Math.abs(a[i] - r) < delta) {
                delta = Math.abs(a[i] - r);
                index = i;
            }
        }

        System.out.println("Наиболее близок элемент: " + a[index] + " с индексом: " + index);

        s.close();
    }
}
