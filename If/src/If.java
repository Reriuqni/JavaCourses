import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 1
        System.out.println("1. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.");
        System.out.print("Введите число a:");
        int a = s.nextInt();
        if (a > 0) a++;
        System.out.println("a=" + a);
        System.out.println("--------------------------------");

        // 2
        System.out.println("2. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае вычесть из него 2. Вывести полученное число.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        if (a > 0) {
            a++;
        } else {
            a -= 2;
        }
        System.out.println("a=" + a);
        System.out.println("--------------------------------");

        // 3
        System.out.println("3. Дано целое число. Если оно является положительным, то прибавить к не-\n" +
                "му 1; если отрицательным, то вычесть из него 2; если нулевым, то заме-\n" +
                "нить его на 10. Вывести полученное число.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        if (a > 0) {
            a++;
        } else {
            if (a == 0) {
                a = 10;
            } else {
                a -= 2;
            }
        }
        System.out.println("a=" + a);
        System.out.println("--------------------------------");

        // 4
        System.out.println("4. Даны три целых числа. Найти количество положительных чисел в исход-\n" +
                "ном наборе.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        int b = s.nextInt();
        System.out.print("Введите число c:");
        int c = s.nextInt();
        int plus_amount = 0;
        if (a > 0) {
            plus_amount++;
        }
        if (b > 0) {
            plus_amount++;
        }
        if (c > 0) {
            plus_amount++;
        }
        System.out.println("Кол-во положительных: " + plus_amount);
        System.out.println("--------------------------------");

        // 5
        System.out.println("5. Даны три целых числа. Найти количество положительных и количество от-\n" +
                "рицательных чисел в исходном наборе.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        System.out.print("Введите число c:");
        c = s.nextInt();
        int positive_amount = 0, negative_amount = 0;
        positive_amount += (a == 0) ? 0 : (a > 0) ? 1 : 0;
        negative_amount += (a == 0) ? 0 : (a < 0) ? 1 : 0;
        positive_amount += (b == 0) ? 0 : (b > 0) ? 1 : 0;
        negative_amount += (b == 0) ? 0 : (b < 0) ? 1 : 0;
        positive_amount += (c == 0) ? 0 : (c > 0) ? 1 : 0;
        negative_amount += (c == 0) ? 0 : (c < 0) ? 1 : 0;
        System.out.println("положительных: " + positive_amount + " отрицательных: " + negative_amount);
        positive_amount = 0;
        negative_amount = 0;
        if (a != 0) {
            if (a > 0) {
                positive_amount++;
            } else {
                negative_amount++;
            }
        }
        if (b != 0) {
            if (b > 0) {
                positive_amount++;
            } else {
                negative_amount++;
            }
        }
        if (c != 0) {
            if (c > 0) {
                positive_amount++;
            } else {
                negative_amount++;
            }
        }
        System.out.println("положительных: " + positive_amount + " отрицательных: " + negative_amount);
        System.out.println("--------------------------------");

        // 6
        System.out.println("6. Даны два числа. Вывести большее из них.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Max=" + max);
        System.out.println("--------------------------------");

        // 7
        System.out.println("7. Даны два числа. Вывести порядковый номер меньшего из них");
        System.out.print("Введите число b:");
        b = s.nextInt();
        System.out.print("Введите число c:");
        c = s.nextInt();
        int number = (b < c) ? 1 : 2;
        System.out.println("Номер: " + number);
        System.out.println("--------------------------------");

        // 8
        System.out.println("8. Даны два числа. Вывести вначале большее, а затем меньшее из них.");
        System.out.print("Введите число b:");
        b = s.nextInt();
        System.out.print("Введите число c:");
        c = s.nextInt();
        int min;
        max = (b > c) ? b : c;
        min = (b < c) ? b : c;
        System.out.println("max =" + max);
        System.out.println("min =" + min);
        System.out.println("--------------------------------");

        // 9
        System.out.println("9. Даны две переменные вещественного типа: A, B. Перераспределить значе-\n" +
                "ния данных переменных так, чтобы в A оказалось меньшее из значений,\n" +
                "а в B — большее. Вывести новые значения переменных A и B.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        if (a > b) {
            a = a ^ b ^ (b = a);
        }
        System.out.println("A=" + a + " B=" + b);
        System.out.println("--------------------------------");

        // 10
        System.out.println("10. Даны две переменные целого типа: A и B. Если их значения не равны, то\n" +
                "присвоить каждой переменной сумму этих значений, а если равны, то при-\n" +
                "своить переменным нулевые значения. Вывести новые значения перемен-\n" +
                "ных A и B.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        a = b = (a != b) ? a + b : 0;
        System.out.println("A=" + a + " B=" + b);
        System.out.println("--------------------------------");

        // 11
        System.out.println("11. Даны две переменные целого типа: A и B. Если их значения не равны, то\n" +
                "присвоить каждой переменной большее из этих значений, а если равны, то\n" +
                "присвоить переменным нулевые значения. Вывести новые значения пере-\n" +
                "менных A и B.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        a = b = (a == b) ? 0 : (a > b) ? a : b;
        System.out.println("A=" + a + " B=" + b);
        System.out.println("--------------------------------");

        // 12
        System.out.println("12. Даны три числа. Найти наименьшее из них.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        System.out.print("Введите число c:");
        c = s.nextInt();
        min = (a > b) ? b : (a > c) ? c : a;
        System.out.println("min=" + min);
        System.out.println("min(Math.min)=" + Math.min(a, Math.min(b, c)));
        System.out.println("--------------------------------");

        // 13
        System.out.println("13. Даны три числа. Найти среднее из них (то есть число, расположенное ме-\n" +
                "жду наименьшим и наибольшим).");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        System.out.print("Введите число c:");
        c = s.nextInt();
        max = (a < b) ? b : (a < c) ? c : a;
        min = (a > b) ? b : (a > c) ? c : a;
        int average = 0;
        if ((a > min) && (a < max)) average = a;
        if ((b > min) && (b < max)) average = b;
        if ((c > min) && (c < max)) average = c;
        System.out.println("average=" + average);
        System.out.println("--------------------------------");

        // 14
        System.out.println("14. Даны три числа. Вывести вначале наименьшее, а затем наибольшее из дан-\n" +
                "ных чисел.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        System.out.print("Введите число c:");
        c = s.nextInt();
        max = (a < b) ? b : (a < c) ? c : a;
        min = (a > b) ? b : (a > c) ? c : a;
        System.out.println("min=" + min + " max=" + max);
        System.out.println("--------------------------------");

        // 15
        System.out.println("15. Даны три числа. Найти сумму двух наибольших из них.");
        System.out.print("Введите число a:");
        a = s.nextInt();
        System.out.print("Введите число b:");
        b = s.nextInt();
        System.out.print("Введите число c:");
        c = s.nextInt();

        System.out.println("--------------------------------");

    }
}
