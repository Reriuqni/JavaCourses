import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
        boolean result;

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
        System.out.println("21. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Цифры данного числа образуют возрастающую последовательность».");
        System.out.println("Введите число:");
        c = s.nextInt();
        sot = c / 100;
        des = c / 10 % 10;
        edn = c % 10;
        result = (c >= 100) && (c < 1000) && (sot < des) && (des < edn) && (sot < edn);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 22
        System.out.println("22. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Цифры данного числа образуют возрастающую или убывающую после-\n" +
                "довательность».");
        System.out.println("Введите число:");
        c = s.nextInt();
        sot = c / 100;
        des = c / 10 % 10;
        edn = c % 10;
        boolean vozr = (sot < des) && (des < edn) && (sot < edn);
        boolean ubyv = (sot > des) && (des > edn) && (sot > edn);
        result = (c >= 100) && (c < 1000) && (vozr || ubyv);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 23
        System.out.println("23. Дано четырехзначное число. Проверить истинность высказывания:\n" +
                "«Данное число читается одинаково слева направо и справа налево».");
        System.out.println("Введите число:");
        c = s.nextInt();
        int tys;
        tys = c / 1000;
        sot = c / 100 % 10;
        des = c / 10 % 10;
        edn = c % 10;
        result = (c >= 1000) && (tys == edn) && (sot == des);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 24
        System.out.println("24. Даны числа A, B, C (число A не равно 0). Рассмотрев дискриминант\n" +
                "D = B 2 – 4·A·C, проверить истинность высказывания:«Квадратное уравне-\n" +
                "ние A·x 2 + B·x + C = 0 имеет вещественные корни».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        if (a != 0) {
            result = (b * b - 4 * a * c) >= 0;
            System.out.println(result);
        } else {
            System.out.println("А=0");
        }
        System.out.println("--------------------------------");

        // 25
        System.out.println("25. Даны числа x, y. Проверить истинность высказывания: «Точка с ко-\n" +
                "ординатами (x, y) лежит во второй координатной четверти».");
        System.out.println("Введите число x:");
        int x = s.nextInt();
        System.out.println("Введите число y:");
        int y = s.nextInt();
        result = (x < 0) && (y > 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 26
        System.out.println("26. Даны числа x, y. Проверить истинность высказывания: «Точка с ко-\n" +
                "ординатами (x, y) лежит в четвертой координатной четверти».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        result = (x > 0) && (y < 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 27
        System.out.println("27. Даны числа x, y. Проверить истинность высказывания: «Точка с ко-\n" +
                "ординатами (x, y) лежит во второй или третьей координатной четверти».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        result = (x < 0) && (y != 0);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 28
        System.out.println("28. Даны числа x, y. Проверить истинность высказывания: «Точка с ко-\n" +
                "ординатами (x, y) лежит в первой или третьей координатной четверти».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        result = ((x < 0) && (y < 0)) || ((x > 0) && (y > 0));
        System.out.println(result);
        System.out.println("--------------------------------");

        // 29
        System.out.println("29. Даны числа x, y, x 1 , y 1 , x 2 , y 2 . Проверить истинность высказывания:\n" +
                "«Точка с координатами (x, y) лежит внутри прямоугольника, левая верхняя\n" +
                "вершина которого имеет координаты (x 1 , y 1 ), правая нижняя — (x 2 , y 2 ),\n" +
                "а стороны параллельны координатным осям».");
        int x1, y1, x2, y2;
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        System.out.println("Введите число x1:");
        x1 = s.nextInt();
        System.out.println("Введите число y1:");
        y1 = s.nextInt();
        System.out.println("Введите число x2:");
        x2 = s.nextInt();
        System.out.println("Введите число y2:");
        y2 = s.nextInt();
        result = (x >= x1) && (x <= x2) && (y <= y1) && (y >= y2) && (x2 > x1) && (y2 < y1);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 30
        System.out.println("30. Даны целые числа a, b, c, являющиеся сторонами некоторого тре-\n" +
                "угольника. Проверить истинность высказывания: «Треугольник со сторо-\n" +
                "нами a, b, c является равносторонним».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a == b) && (b == c);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 31
        System.out.println("31. Даны целые числа a, b, c, являющиеся сторонами некоторого тре-\n" +
                "угольника. Проверить истинность высказывания: «Треугольник со сторо-\n" +
                "нами a, b, c является равнобедренным».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a == b) || (b == c) || (c == a);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 32
        System.out.println("32. Даны целые числа a, b, c, являющиеся сторонами некоторого тре-\n" +
                "угольника. Проверить истинность высказывания: «Треугольник со сторо-\n" +
                "нами a, b, c является прямоугольным».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (c * c == a * a + b * b) || (b * b == a * a + c * c) || (a * a == c * c + b * b);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 33
        System.out.println("33. Даны целые числа a, b, c. Проверить истинность высказывания:\n" +
                "«Существует треугольник со сторонами a, b, c».");
        System.out.println("Введите число a:");
        a = s.nextInt();
        System.out.println("Введите число b:");
        b = s.nextInt();
        System.out.println("Введите число c:");
        c = s.nextInt();
        result = (a + b > c) || (a + c > b) || (c + b > a);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 34
        System.out.println("34. Даны координаты поля шахматной доски x, y (целые числа, лежа-\n" +
                "щие в диапазоне 1–8). Учитывая, что левое нижнее поле доски (1, 1) явля-\n" +
                "ется черным, проверить истинность высказывания: «Данное поле является\n" +
                "белым».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        boolean iscorrect = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        result = iscorrect && (x + y) % 2 != 0;
        System.out.println(result);
        System.out.println("--------------------------------");

        // 35
        System.out.println("35. Даны координаты двух различных полей шахматной доски x 1 , y 1 ,\n" +
                "x 2 , y 2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность вы-\n" +
                "сказывания: «Данные поля имеют одинаковый цвет».");

        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        System.out.println("Введите число x1:");
        x1 = s.nextInt();
        System.out.println("Введите число y1:");
        y1 = s.nextInt();
        boolean iscorrectx = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        boolean iscorrectx1 = (x1 >= 1) && (x1 <= 8) && (y1 >= 1) && (y1 <= 8);
        boolean iswhite = ((x + y) % 2 != 0 && (x1 + y1) % 2 != 0);
        boolean isblack = ((x + y) % 2 == 0 && (x1 + y1) % 2 == 0);
        result = iscorrectx && iscorrectx1 && (isblack || iswhite);
        System.out.println(result);
        System.out.println("--------------------------------");

        // 36
        System.out.println("36. Даны координаты двух различных полей шахматной доски x 1 , y 1 ,\n" +
                "x 2 , y 2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность вы-\n" +
                "сказывания: «Ладья за один ход может перейти с одного поля на другое».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        System.out.println("Введите число x1:");
        x1 = s.nextInt();
        System.out.println("Введите число y1:");
        y1 = s.nextInt();
        iscorrectx = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        iscorrectx1 = (x1 >= 1) && (x1 <= 8) && (y1 >= 1) && (y1 <= 8);
        result = iscorrectx && iscorrectx1 && ((x == x1) || (y == y1));
        System.out.println(result);
        System.out.println("--------------------------------");

        // 37
        System.out.println("37. Даны координаты двух различных полей шахматной доски x 1 , y 1 ,\n" +
                "x 2 , y 2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность вы-\n" +
                "сказывания: «Король за один ход может перейти с одного поля на другое».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        System.out.println("Введите число x1:");
        x1 = s.nextInt();
        System.out.println("Введите число y1:");
        y1 = s.nextInt();
        iscorrectx = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        iscorrectx1 = (x1 >= 1) && (x1 <= 8) && (y1 >= 1) && (y1 <= 8);
        result = iscorrectx && iscorrectx1 && ((Math.abs(x1 - x) <= 1) && (Math.abs(y1 - y) <= 1));
        System.out.println(result);
        System.out.println("--------------------------------");

        // 38
        System.out.println("38. Даны координаты двух различных полей шахматной доски x 1 , y 1 ,\n" +
                "x 2 , y 2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность вы-\n" +
                "сказывания: «Слон за один ход может перейти с одного поля на другое».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        System.out.println("Введите число x1:");
        x1 = s.nextInt();
        System.out.println("Введите число y1:");
        y1 = s.nextInt();
        iscorrectx = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        iscorrectx1 = (x1 >= 1) && (x1 <= 8) && (y1 >= 1) && (y1 <= 8);
        result = iscorrectx && iscorrectx1 && (Math.abs(x1 - x) == Math.abs(y1 - y));
        System.out.println(result);
        System.out.println("--------------------------------");

        // 39
        System.out.println("39. Даны координаты двух различных полей шахматной доски x 1 , y 1 ,\n" +
                "x 2 , y 2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность вы-\n" +
                "сказывания: «Ферзь за один ход может перейти с одного поля на другое»");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        System.out.println("Введите число x1:");
        x1 = s.nextInt();
        System.out.println("Введите число y1:");
        y1 = s.nextInt();
        iscorrectx = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        iscorrectx1 = (x1 >= 1) && (x1 <= 8) && (y1 >= 1) && (y1 <= 8);
        result = iscorrectx && iscorrectx1 && ((Math.abs(x1 - x) == Math.abs(y1 - y)) || ((x == x1) || (y == y1)));
        System.out.println(result);
        System.out.println("--------------------------------");

        // 40
        System.out.println("40. Даны координаты двух различных полей шахматной доски x 1 , y 1 ,\n" +
                "x 2 , y 2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность вы-\n" +
                "сказывания: «Конь за один ход может перейти с одного поля на другое».");
        System.out.println("Введите число x:");
        x = s.nextInt();
        System.out.println("Введите число y:");
        y = s.nextInt();
        System.out.println("Введите число x1:");
        x1 = s.nextInt();
        System.out.println("Введите число y1:");
        y1 = s.nextInt();
        iscorrectx = (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
        iscorrectx1 = (x1 >= 1) && (x1 <= 8) && (y1 >= 1) && (y1 <= 8);
        boolean xhorse = (Math.abs(x1 - x) == 2) && (Math.abs(y1 - y) == 1);
        boolean yhorse = (Math.abs(x1 - x) == 1) && (Math.abs(y1 - y) == 2);
        result = iscorrectx && iscorrectx1 && (xhorse || yhorse);
        System.out.println(result);
        System.out.println("--------------------------------");

    }
}

