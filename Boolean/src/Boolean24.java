import java.util.Scanner;

public class Boolean24 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("24. Даны числа A, B, C (число A не равно 0). Рассмотрев дискриминант\n" +
                "D = B 2 – 4·A·C, проверить истинность высказывания:«Квадратное уравне-\n" +
                "ние A·x 2 + B·x + C = 0 имеет вещественные корни».");

        System.out.println("Введите число a:");
        int a = s.nextInt();

        System.out.println("Введите число b:");
        int b = s.nextInt();

        System.out.println("Введите число c:");
        int c = s.nextInt();

        if (a != 0) {
            boolean result = (b * b - 4 * a * c) >= 0;
            System.out.println(result);
        } else {
            System.out.println("А=0");
        }

    }
}
