import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = s.nextInt();
        System.out.println("Введите число b:");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("Сумма: "+sum);
    }
}

