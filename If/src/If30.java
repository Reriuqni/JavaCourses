import java.util.Scanner;

public class If30 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("30. Дано целое число, лежащее в диапазоне 1–999. Вывести его строку-\n" +
                "описание вида «четное двузначное число», «нечетное трехзначное число»\n" +
                "и т. д.");

        System.out.print("Введите число: ");
        int x = s.nextInt();

        if (x % 2 == 0) {
            System.out.print("Четное ");
        } else {
            System.out.print("Нечетное ");
        }

        if (x >= 10 && x < 100) System.out.print("двузначное ");
        if (x >= 100 && x < 1000) System.out.print("трехзначное ");

        System.out.print("число \n");

    }
}
