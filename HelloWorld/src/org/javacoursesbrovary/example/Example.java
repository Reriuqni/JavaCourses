package org.javacoursesbrovary.example;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        System.out.print("Hi, bro! \n");

        int a = 5, b = 7, c = a + b;

        System.out.println("My age is " + c);
        System.out.println(b + 7);
        System.out.println(b + c);
        System.out.println(a++);
        System.out.println(++a);

        a = 5;
        System.out.println(a);
        a = a + 2;
        System.out.println(a);
        c = a - 2;
        System.out.println(c);
        int d = a * 5;
        System.out.println(d);
        int e = d / 3;
        System.out.println(e);

        // home work
        int x = -3, y = 55;

        System.out.println("x=" + x + " y=" + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x=" + x + " y=" + y);

        x = 3;
        y = 5;

        System.out.println("x=" + x + " y=" + y);

        x = x ^ y ^ (y = x);

        System.out.println("x=" + x + " y=" + y);

        byte w = 1;
        byte w1 = 1 + 2;
        w = w1;
        w = (byte) (w1 + 1);

        final byte W = 127;
        w = W + 0;

        w = (byte) (-w);

        final int I = 12;
        w = I;
        int i = 3;

        w = 1;
        w += i++;
        w += 1000;
        System.out.println(w);
        w *= 2;
        System.out.println(w);

        float f = 1.1F;

        w /= f;
        System.out.println(w);

        int i1 = (int) 2_200_000_000L;
        System.out.println(i1);

        int c1 = 1_100_000_000, c2 = 1_100_000_000, c3;
        c3 = c1 + c2;
        int c4 = 0B101;
        System.out.println(c4);

        System.out.println(2 - 1.1);

        double i5 = 3 / 2.0;
        System.out.println(i5);

        int i6 = 1;
        i6++;
        System.out.println(i6);
        int i7 = ++i6;
        System.out.println(i7);

        char c5 = 'c';
        char c6 = 'a';
        System.out.println(c5);
        System.out.println(c6);

        int i8 = Character.getNumericValue(c6);
        System.out.println(i8);
        System.out.println(Character.getNumericValue('A'));
        System.out.println(Character.getNumericValue('a'));

        System.out.println(Character.getNumericValue('.'));
        System.out.println(Character.getNumericValue('?'));

        int i9 = 2, i10 = 3;
        boolean z = i9 == i10;

        i = 3;
        i = i++ + ++i + i++;
        System.out.println(i);

        i = 1;
        System.out.println(++i);

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число a:");
        int aa = s.nextInt();
        System.out.println("Введите число b:");
        int bb = s.nextInt();


    }
}

