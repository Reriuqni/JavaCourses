import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        int a, b, sum;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a first number: ");

        a = s.nextInt();

        System.out.print("Enter a second number: ");

        b = s.nextInt();

        sum = a + b;

        System.out.println("Sum is: " + sum);
    }
}

