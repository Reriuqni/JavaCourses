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
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        min = a;
        min = (b < min) ? b : min;
        min = (c < min) ? c : min;
        System.out.println("min = " + min);
        System.out.println("min(Math.min) = " + Math.min(a, Math.min(b, c)));
        System.out.println("--------------------------------");

        // 13
        System.out.println("13. Даны три числа. Найти среднее из них (то есть число, расположенное ме-\n" +
                "жду наименьшим и наибольшим).");
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        min = a;
        min = (b < min) ? b : min;
        min = (c < min) ? c : min;
        max = a;
        max = (b > max) ? b : max;
        max = (c > max) ? c : max;
        int average = a;
        if ((a > min) && (a < max)) average = a;
        if ((b > min) && (b < max)) average = b;
        if ((c > min) && (c < max)) average = c;
        System.out.println("average = " + average);
        System.out.println("--------------------------------");

        // 14
        System.out.println("14. Даны три числа. Вывести вначале наименьшее, а затем наибольшее из дан-\n" +
                "ных чисел.");
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        min = a;
        min = (b < min) ? b : min;
        min = (c < min) ? c : min;
        max = a;
        max = (b > max) ? b : max;
        max = (c > max) ? c : max;
        System.out.println("min = " + min + " max = " + max);
        System.out.println("--------------------------------");

        // 15
        System.out.println("15. Даны три числа. Найти сумму двух наибольших из них.");
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        int sum;
        if (a < b) {
            if (a < c) {
                sum = b + c;
            } else {
                sum = a + b;
            }
        } else {
            if (b < c) {
                sum = a + c;
            } else {
                sum = b + a;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("--------------------------------");

        // 16
        System.out.println("16. Даны три переменные вещественного типа: A, B, C. Если их значения упо-\n" +
                "рядочены по возрастанию, то удвоить их; в противном случае заменить\n" +
                "значение каждой переменной на противоположное. Вывести новые значе-\n" +
                "ния переменных A, B, C.");
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        if ((a < b) && (b < c)) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }
        System.out.println("A=" + a + " B=" + b + " C=" + c);
        System.out.println("--------------------------------");

        // 17
        System.out.println("17. Даны три переменные вещественного типа: A, B, C. Если их значения упо-\n" +
                "рядочены по возрастанию или убыванию, то удвоить их; в противном слу-\n" +
                "чае заменить значение каждой переменной на противоположное. Вывести\n" +
                "новые значения переменных A, B, C.");
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        if (((a < b) && (b < c)) || ((a > b) && (b > c))) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }
        System.out.println("A=" + a + " B=" + b + " C=" + c);
        System.out.println("--------------------------------");

        // 18
        System.out.println("18. Даны три целых числа, одно из которых отлично от двух других, равных\n" +
                "между собой. Определить порядковый номер числа, отличного от осталь-\n" +
                "ных.");
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        if (!((a == b && b == c) || (a != b && b != c && a != c))) {
            if (a == b) {
                System.out.println(3);
            }
            if (b == c) {
                System.out.println(1);
            }
            if (a == c) {
                System.out.println(2);
            }
        } else {
            System.out.println("Все числа или равны, или разные");
        }
        System.out.println("--------------------------------");

        // 19

        System.out.println("19. Даны четыре целых числа, одно из которых отлично от трех других, рав-\n" +
                "ных между собой. Определить порядковый номер числа, отличного от ос-\n" +
                "тальных.");
        int d;
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        System.out.print("Введите число d: ");
        d = s.nextInt();
        if (!((a == b) && (b == c) && (c == d) ||
                (a != b && b != c && a != c && a != d && b != d && c != d))) {
            if (a == b && b == c) {
                System.out.println(4);
            }
            if (a == b && b == d) {
                System.out.println(3);
            }
            if (a == c && c == d) {
                System.out.println(2);
            }
            if (b == c && c == d) {
                System.out.println(1);
            }
        } else {
            System.out.println("Все числа или равны, или разные");
        }
        System.out.println("--------------------------------");

        // 20
        System.out.println("20. На числовой оси расположены три точки: A, B, C. Определить, какая из\n" +
                "двух последних точек (B или C) расположена ближе к A, и вывести эту точ-\n" +
                "ку и ее расстояние от точки A.");
        System.out.print("Введите число a: ");
        a = s.nextInt();
        System.out.print("Введите число b: ");
        b = s.nextInt();
        System.out.print("Введите число c: ");
        c = s.nextInt();
        int lb = Math.abs(a - b);
        int lc = Math.abs(a - c);
        if (lb < lc) {
            System.out.println("B, L=" + lb);
        } else {
            System.out.println("C, L=" + lc);
        }
        System.out.println("--------------------------------");

        // 21
        System.out.println("21. Даны целочисленные координаты точки на плоскости. Если точка совпа-\n" +
                "дает с началом координат, то вывести 0. Если точка не совпадает с началом\n" +
                "координат, но лежит на оси OX или OY, то вывести соответственно 1 или 2.\n" +
                "Если точка не лежит на координатных осях, то вывести 3.");
        System.out.print("Введите координаты x: ");
        int x = s.nextInt();
        System.out.print("Введите координаты y: ");
        int y = s.nextInt();
        if (x == 0 && y == 0) System.out.println(0);
        if (x != 0 && y == 0) System.out.println(1);
        if (x == 0 && y != 0) System.out.println(2);
        if (x != 0 && y != 0) System.out.println(3);
        System.out.println("--------------------------------");

        // 22
        System.out.println("22. Даны координаты точки, не лежащей на координатных осях OX и OY.\n" +
                "Определить номер координатной четверти, в которой находится данная\n" +
                "точка.");
        System.out.print("Введите координаты x: ");
        x = s.nextInt();
        System.out.print("Введите координаты y: ");
        y = s.nextInt();
        if (x == 0 || y == 0) {
            System.out.println("Точка лежит на осях");
        } else {
            if (x > 0 && y > 0) System.out.println(1);
            if (x > 0 && y < 0) System.out.println(4);
            if (x < 0 && y > 0) System.out.println(2);
            if (x < 0 && y < 0) System.out.println(3);
        }
        System.out.println("--------------------------------");

        // 23
        System.out.println("23. Даны целочисленные координаты трех вершин прямоугольника, стороны\n" +
                "которого параллельны координатным осям. Найти координаты его четвер-\n" +
                "той вершины.");
        int ax, ay, bx, by, cx, cy, dx = 0, dy = 0;
        System.out.print("Введите координаты ax: ");
        ax = s.nextInt();
        System.out.print("Введите координаты ay: ");
        ay = s.nextInt();
        System.out.print("Введите координаты bx: ");
        bx = s.nextInt();
        System.out.print("Введите координаты by: ");
        by = s.nextInt();
        System.out.print("Введите координаты cx: ");
        cx = s.nextInt();
        System.out.print("Введите координаты cy: ");
        cy = s.nextInt();
        if (ax == bx) {
            dx = cx;
            if (by == cy) {
                dy = ay;
            } else {
                dy = cy;
            }
        }
        if (ax == cx) {
            dx = bx;
            if (by == cy) {
                dy = ay;
            } else {
                dy = cy;
            }
        }
        System.out.println("dx=" + dx + " dy=" + dy);
        System.out.println("--------------------------------");

        // 24
        System.out.println("24. Для данного вещественного x найти значение следующей функции f, при-\n" +
                "нимающей вещественные значения:\n" +
                "2·sin(x), если x > 0,\n" +
                "f(x) =\n" +
                "6 – x, если x ≤ 0.");
        System.out.print("Введите x: ");
        double f, xd = s.nextDouble();
        if (xd > 0) {
            f = 2 * Math.sin(xd);
        } else {
            f = 6.0 - xd;
        }
        System.out.println("f(x)=" + f);
        System.out.println("--------------------------------");

        // 25
        System.out.println("25. Для данного целого x найти значение следующей функции f, принимаю-\n" +
                "щей значения целого типа:\n" +
                "2·x, если x < –2 или x > 2,\n" +
                "f(x) =\n" +
                "–3·x, в противном случае.");
        int fx;
        System.out.print("Введите x: ");
        x = s.nextInt();
        if (x < -2 || x > 2) {
            fx = 2 * x;
        } else {
            fx = -3 * x;
        }
        System.out.println("f(x)=" + fx);
        System.out.println("--------------------------------");

        // 26
        System.out.println("26. Для данного вещественного x найти значение следующей функции f, при-\n" +
                "нимающей вещественные значения:\n" +
                "–x, если x ≤ 0,\n" +
                "f(x) =\n" +
                "x 2 , если 0 < x < 2,\n" +
                "4, если x ≥ 2.");
        System.out.print("Введите x: ");
        xd = s.nextDouble();
        if (xd >= 2) f = 4.0;
        if (xd > 0) f = Math.pow(xd, 2);
        if (xd <= 0) f = -xd;
        System.out.println("f(x)=" + f);
        System.out.println("--------------------------------");

        // 27
        System.out.println("27. Для данного вещественного x найти значение следующей функции f,\n" +
                "принимающей значения целого типа:\n" +
                "0, если x < 0,\n" +
                "f(x) =\n" +
                "1, если x принадлежит [0, 1), [2, 3), ... ,\n" +
                "–1, если x принадлежит [1, 2), [3, 4), ... .");
        System.out.print("Введите x: ");
        xd = s.nextDouble();
        if (xd < 0) {
            fx = 0;
        } else {
            if ((int) xd % 2 == 0) {
                fx = 1;
            }
            if ((int) xd % 2 == 1) {
                fx = -1;
            }
        }
        System.out.println("f(x)=" + fx);
        System.out.println("--------------------------------");

        // 28
        System.out.println("28. Дан номер года (положительное целое число). Определить количество\n" +
                "дней в этом году, учитывая, что обычный год насчитывает 365 дней, а ви-\n" +
                "сокосный — 366 дней. Високосным считается год, делящийся на 4, за ис-\n" +
                "ключением тех годов, которые делятся на 100 и не делятся на 400 (напри-\n" +
                "мер, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — яв-\n" +
                "ляются).");
        System.out.print("Введите номер года: ");
        x = s.nextInt();
        int days = 365;
        if (x > 0) {
            if (x % 4 == 0) {
                days++;
                if (x % 100 == 0 && x % 400 != 0) days--;
            }
            System.out.println("Дней: " + days);
        } else {
            System.out.println("Некорректный год");
        }
        System.out.println("--------------------------------");

        // 29
        System.out.println("29. Дано целое число. Вывести его строку-описание вида «отрицательное чет-\n" +
                "ное число», «нулевое число», «положительное нечетное число» и т. д.");
        System.out.print("Введите число: ");
        x = s.nextInt();
        if (x < 0) {
            if (Math.abs(x) % 2 == 0) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
            }
        }
        if (x == 0) {
            System.out.println("Нулевое число");
        }
        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("Положительное четное число");
            } else {
                System.out.println("Положительное нечетное число");
            }
        }
        System.out.println("--------------------------------");

        // 30
        System.out.println("30. Дано целое число, лежащее в диапазоне 1–999. Вывести его строку-\n" +
                "описание вида «четное двузначное число», «нечетное трехзначное число»\n" +
                "и т. д.");
        System.out.print("Введите число: ");
        x = s.nextInt();
        if (x % 2 == 0) System.out.print("Четное ");
        else System.out.print("Нечетное ");
        if (x >= 10 && x < 100) System.out.print("двузначное ");
        if (x >= 100 && x < 1000) System.out.print("трехзначное ");
        System.out.print("число \n");
        System.out.println("--------------------------------");

    }
}
