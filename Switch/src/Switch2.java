import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Дано целое число K. Вывести строку-описание оценки, соответствую-\n" +
                "щей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетво-\n" +
                "рительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в диапазоне\n" +
                "1–5, то вывести строку «ошибка».");

        System.out.print("Введите число: ");
        int a = s.nextInt();

        switch (a) {
            case 1:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("ошибка");
                break;
        }

    }
}