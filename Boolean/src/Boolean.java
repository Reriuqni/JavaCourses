import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
        boolean result;
/*
        // 1
        System.out.println("1. Дано целое число A. Проверить истинность высказывания: «Число\n" +
                "A является положительным».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        result = (a > 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 2
        System.out.println("2. Дано целое число A. Проверить истинность высказывания: «Число A\n" +
                "является нечетным».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        result = (a % 2 != 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 3
        System.out.println("3. Дано целое число A. Проверить истинность высказывания: «Число A\n" +
                "является четным».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        result = (a % 2 == 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 4
        System.out.println("4. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Справедливы неравенства A > 2 и B ≤ 3».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        result = (a > 2) && (b <= 3);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 5
        System.out.println("5. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Справедливы неравенства A ≥ 0 или B < –2».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        result = (a >= 0) || (b < -2);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 6
        System.out.println("6. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Справедливо двойное неравенство A < B < C»");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        int c = s.nextInt();
        result = (a < b) && (b < c);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 7
        System.out.println("7. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Число B находится между числами A и C».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = ((a < b) && (b < c)) || ((a > b) && (b > c));
        System.out.println(result);
        System.out.println("--------------------------------");

        // 8
        System.out.println("8. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Каждое из чисел A и B нечетное».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        result = (a % 2 != 0) && (b % 2 != 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 9
        System.out.println("9. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Хотя бы одно из чисел A и B нечетное».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        result = (a % 2 != 0) || (b % 2 != 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 10
        System.out.println("10. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Ровно одно из чисел A и B нечетное».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        result = (a % 2 != 0) ^ (b % 2 != 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 11
        System.out.println("11. Даны два целых числа: A, B. Проверить истинность высказывания:\n" +
                "«Числа A и B имеют одинаковую четность».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        result = ((a + b) % 2 == 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 12
        System.out.println("13. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Каждое из чисел A, B, C положительное»");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a > 0) && (b > 0) && (c > 0);
        System.out.println(result);
        System.out.println("--------------------------------");
*/
        int c;

        // 13
        System.out.println("13. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Хотя бы одно из чисел A, B, C положительное».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a > 0) || (b > 0) || (c > 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 14
        System.out.println("14. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Ровно одно из чисел A, B, C положительное»");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a > 0 && b < 0 && c < 0) ^ (b > 0 && a < 0 && c < 0) ^ (c > 0 && a < 0 && b < 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 15
        System.out.println("15. Даны три целых числа: A, B, C. Проверить истинность высказыва-\n" +
                "ния: «Ровно два из чисел A, B, C являются положительными»");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a > 0 && b > 0 && c < 0) ^ (a > 0 && c > 0 && b < 0) ^ (b > 0 && c > 0 && a < 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 16
        System.out.println("16. Дано целое положительное число. Проверить истинность высказы-\n" +
                "вания: «Данное число является четным двузначным».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        result = (a % 2 == 0) && (a >= 10) && (a < 100);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 17
        System.out.println("17. Дано целое положительное число. Проверить истинность высказы-\n" +
                "вания: «Данное число является нечетным трехзначным».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        result = (a % 2 != 0) && (a >= 100);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 18
        System.out.println("18. Проверить истинность высказывания: «Среди трех данных целых\n" +
                "чисел есть хотя бы одна пара совпадающих».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a == b) || (b == c) || (a == c);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 19
        System.out.println("19. Проверить истинность высказывания: «Среди трех данных целых\n" +
                "чисел есть хотя бы одна пара взаимно противоположных».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a == -b) || (b == -c) || (a == -c);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 20
        System.out.println("20. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Все цифры данного числа различны»");
        System.out.println("Введите число:");
        c = s.nextInt();
        int sot, des, edn;
        sot = c / 100;
        des = c / 10 % 10;
        edn = c % 10;
        result = (c >= 100) && (sot != des) && (des != edn) && (sot != edn);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 21

    }
}

