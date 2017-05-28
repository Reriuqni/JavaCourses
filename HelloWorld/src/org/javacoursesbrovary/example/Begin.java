package org.javacoursesbrovary.example;

public class Begin {

    Begin() {

        System.out.println("------------------------------------");
        System.out.println("-= Begin start =-");
        System.out.println("------------------------------------");

        // 1
        int a1 = 3, p1;
        p1 = 4 * a1;
        System.out.println("P=" + p1);
        System.out.println("------------------------------------");

        // 2
        double a2 = 3, s2;
        s2 = Math.pow(a2, 2);
        System.out.println("S=" + s2);
        System.out.println("------------------------------------");

        // 3
        int a3 = 4, b3 = 5, s3, p3;
        s3 = a3 * b3;
        p3 = 2 * (a3 + b3);
        System.out.println("S=" + s3 + " P=" + p3);
        System.out.println("------------------------------------");

        // 4
        double l4, d4 = 2.0;
        l4 = Math.PI * d4;
        System.out.println("L=" + l4);
        System.out.println("------------------------------------");

        // 5
        double a5 = 3, v5, s5;
        v5 = Math.pow(a5, 3);
        s5 = 6 * Math.pow(a5, 2);
        System.out.println("a=" + a5 + " v=" + v5 + " s=" + s5);
        System.out.println("------------------------------------");

        // 6
        double a6 = 3, b6 = 4, c6 = 5, v6, s6;
        v6 = a6 * b6 * c6;
        s6 = 2 * (a6 * b6 + b6 * c6 + a6 * c6);
        System.out.println("a=" + a6 + " v=" + v6 + " s=" + s6);
        System.out.println("------------------------------------");

        // 7
        double r7 = 5.0, l7, s7;
        l7 = 2 * Math.PI * r7;
        s7 = Math.PI * Math.pow(r7, 2);
        System.out.println("r=" + r7 + " l=" + l7 + " s=" + s7);
        System.out.println("------------------------------------");

        // 8
        double a8 = 3, b8 = 5, s8;
        s8 = (a8 + b8) / 2.0;
        System.out.println("Sv=" + s8);
        System.out.println("------------------------------------");

        // 9
        double a9 = 3, b9 = 9, s9;
        s9 = Math.sqrt(a9 * b9);
        System.out.println("Sg=" + s9);
        System.out.println("------------------------------------");

        // 10
        double a10 = 2, b10 = 4, x10, y10, z10, j10;
        x10 = Math.pow(a10, 2) + Math.pow(b10, 2);
        y10 = Math.pow(a10, 2) - Math.pow(b10, 2);
        z10 = Math.pow(a10, 2) * Math.pow(b10, 2);
        j10 = Math.pow(a10, 2) / Math.pow(b10, 2);
        System.out.println("a+b=" + x10 + " a-b=" + y10 + " a*b=" + z10 + " a/b=" + j10);
        System.out.println("------------------------------------");

        // 11
        double a11 = 2, b11 = -4, x11, y11, z11, j11;
        x11 = Math.abs(a11) + Math.abs(b11);
        y11 = Math.abs(a11) - Math.abs(b11);
        z11 = Math.abs(a11) * Math.abs(b11);
        j11 = Math.abs(a11) / Math.abs(b11);
        System.out.println("a+b=" + x11 + " a-b=" + y11 + " a*b=" + z11 + " a/b=" + j11);
        System.out.println("------------------------------------");

        // 12
        double a12 = 3, b12 = 5, c12, p12;
        c12 = Math.sqrt(Math.pow(a12, 2) + Math.pow(b12, 2));
        p12 = a12 + b12 + c12;
        System.out.println("c=" + c12 + " P=" + p12);
        System.out.println("------------------------------------");

        // 13
        double r131 = 12, r132 = 10, s131, s132, s133;
        s131 = Math.PI * Math.pow(r131, 2);
        s132 = Math.PI * Math.pow(r132, 2);
        s133 = s131 - s132;
        System.out.println("s1=" + s131 + " s2=" + s131 + " s3=" + s133);
        System.out.println("------------------------------------");

        // 14
        double l14 = 123, r14, s14;
        r14 = l14 / 2 * Math.PI;
        s14 = Math.PI * Math.pow(r14, 2);
        System.out.println("r=" + r14 + " s=" + s14);
        System.out.println("------------------------------------");

        // 15
        double s15 = 123.0, d15, l15;
        d15 = Math.sqrt(s15 * 4 / Math.PI);
        l15 = Math.PI * d15;
        System.out.println("d=" + d15 + " l=" + l15);
        System.out.println("------------------------------------");

        // 16
        int x161 = 2, x162 = 10, r16;
        r16 = Math.abs(x161 - x162);
        System.out.println("r16=|" + r16 + "|");
        System.out.println("------------------------------------");

        // 17
        int a17 = 2, b17 = 3, c17 = 4, ac17, bc17, sum17;
        ac17 = Math.abs(a17 - c17);
        bc17 = Math.abs(b17 - c17);
        sum17 = ac17 + bc17;
        System.out.println("ac=" + ac17 + " bc=" + bc17 + " ac+bc=" + sum17);
        System.out.println("------------------------------------");

        // 18
        int a18 = 1, b18 = 5, c18 = 3, ac18, bc18, mul18;
        ac18 = Math.abs(a18 - c18);
        bc18 = Math.abs(b18 - c18);
        mul18 = ac18 * bc18;
        System.out.println("ac=" + ac18 + " bc=" + bc18 + " ac*bc=" + mul18);
        System.out.println("------------------------------------");

        // 19
        int x191 = 0, y191 = 0, x192 = 4, y192 = 2, p19, s19;
        p19 = 2 * (Math.abs(x191 - x192) + Math.abs(y191 - y192));
        s19 = Math.abs(x191 - x192) * Math.abs(y191 - y192);
        System.out.println("P=" + p19 + " S=" + s19);
        System.out.println("------------------------------------");

        // 20
        double x201 = 1, y201 = 1, x202 = 3, y202 = 4, r20;
        r20 = Math.sqrt(Math.pow(x202 - x201, 2) + Math.pow(y202 - y201, 2));
        System.out.println("r1=" + r20);
        System.out.println("------------------------------------");

        // 21
        double x211 = 1, y211 = 1, x212 = 3, y212 = 4, x213 = 5, y213 = 0, p21, s21, a21, b21, c21;
        a21 = Math.sqrt(Math.pow(x212 - x211, 2) + Math.pow(y212 - y211, 2));
        b21 = Math.sqrt(Math.pow(x213 - x211, 2) + Math.pow(y213 - y211, 2));
        c21 = Math.sqrt(Math.pow(x213 - x212, 2) + Math.pow(y213 - y212, 2));
        p21 = (a21 + b21 + c21) / 2;
        s21 = Math.sqrt(p21 * (p21 - a21) * (p21 - b21) * (p21 - c21));
        System.out.println("S=" + s21);
        System.out.println("------------------------------------");

        // 22
        int a22 = 2, b22 = 3;
        System.out.println("a=" + a22 + " b=" + b22);
        a22 = b22 ^ a22 ^ (b22 = a22);
        System.out.println("a=" + a22 + " b=" + b22);
        System.out.println("------------------------------------");

        // 23
        int a23 = 2, b23 = 3, c23 = 4;
        System.out.println("a=" + a23 + " b=" + b23 + " c=" + c23);
        a23 = a23 ^ b23 ^ (b23 = a23);
        a23 = a23 ^ c23 ^ (c23 = a23);
        System.out.println("a=" + a23 + " b=" + b23 + " c=" + c23);
        System.out.println("------------------------------------");

        // 24
        int a24 = 2, b24 = 3, c24 = 4;
        System.out.println("a=" + a24 + " b=" + b24 + " c=" + c24);
        c24 = c24 ^ b24 ^ (b24 = c24);
        c24 = c24 ^ a24 ^ (a24 = c24);
        System.out.println("a=" + a24 + " b=" + b24 + " c=" + c24);
        System.out.println("------------------------------------");

        // 25
        double x25 = 4, y25;
        y25 = 3 * Math.pow(x25, 6) - 6 * Math.pow(x25, 2) - 7;
        System.out.println("x=" + x25 + " y=" + y25);
        System.out.println("------------------------------------");

        // 26
        double y26, x26 = 3;
        y26 = 4 * Math.pow(x26 - 3, 6) - 7 * Math.pow(x26 - 3, 3) + 2;
        System.out.println("x=" + x26 + " y=" + y26);
        System.out.println("------------------------------------");

        // 27
        int a27 = 2, ax27;
        System.out.println("a=" + a27);
        ax27 = a27 * a27;
        System.out.println("a^2=" + ax27);
        ax27 = ax27 * ax27;
        System.out.println("a^4=" + ax27);
        ax27 = ax27 * ax27;
        System.out.println("a^8=" + ax27);
        System.out.println("------------------------------------");

        // 28
        int a28 = 2, ax28, axx28;
        System.out.println("a=" + a28);
        ax28 = a28 * a28; // ^2
        System.out.println("a^2=" + ax28);
        axx28 = ax28 * a28; // ^3
        System.out.println("a^3=" + axx28);
        axx28 = ax28 * axx28;
        System.out.println("a^5=" + axx28);
        ax28 = axx28 * axx28;
        System.out.println("a^10=" + ax28);
        ax28 = ax28 * axx28;
        System.out.println("a^15=" + ax28);
        System.out.println("------------------------------------");

        // 29
        double alpha29 = 90, rad29;
        rad29 = alpha29 * Math.PI / 180;
        System.out.println("alpha=" + alpha29 + " grad=" + rad29);
        System.out.println("------------------------------------");

        // 30
        double alpha30 = 1.5707963267948966, grad30;
        grad30 = alpha30 * 180 / Math.PI;
        System.out.println("alpha=" + alpha30 + " grad=" + grad30);
        System.out.println("------------------------------------");

        // 31
        double tf31 = 450, tc31;
        tc31 = (tf31 - 32) * 5 / 9;
        System.out.println("tc=" + tc31 + " tf=" + tf31);
        System.out.println("------------------------------------");

        // 32
        double tf32, tc32 = 900;
        tf32 = tc32 / 9 * 5 + 32;
        System.out.println("tc=" + tc32 + " tf=" + tf32);
        System.out.println("------------------------------------");

        // 33
        double x33 = 10, xa33 = 400, price33, sum33, xy33 = 23;
        price33 = xa33 / x33;
        sum33 = xy33 * price33;
        System.out.println("price=" + price33 + " sum=" + sum33);
        System.out.println("------------------------------------");

        // 34
        double x34 = 1, a34 = 98, y34 = 1.2, b34 = 70, price_sh, price_ir, diff;
        price_sh = a34 / x34;
        price_ir = b34 / y34;
        diff = price_sh / price_ir;
        System.out.println("price_sh=" + price_sh + " price_ir=" + price_ir + " how much=" + diff);
        System.out.println("------------------------------------");

        // 35
        double v35 = 10, u35 = 2, t35_1 = 2, t35_2 = 3, s35_1, s35_2;
        s35_1 = v35 * t35_1;
        s35_2 = t35_2 * (v35 - u35);
        System.out.println("s1=" + s35_1 + " s2=" + s35_2);
        System.out.println("------------------------------------");

        // 36
        double v36_1 = 60, v36_2 = 80, s36 = 10, t36 = 1, s36_s;
        s36_s = s36 + t36 * (v36_1 + v36_2);
        System.out.println("Ssum=" + s36_s);
        System.out.println("------------------------------------");

        // 37
        double v37_1 = 60, v37_2 = 55, s37 = 250, t37 = 2, s37_s;
        s37_s = Math.abs(s37 - t37 * (v37_1 + v37_2));
        System.out.println("Ssum=" + s37_s);
        System.out.println("------------------------------------");

        // 38
        double a38 = 3, b38 = 45, x38;
        x38 = -b38 / a38;
        System.out.println("x=" + x38);
        System.out.println("------------------------------------");

        // 39
        double a39 = 2, b39 = -2, c39 = -5, d39, x39_1, x39_2;
        d39 = b39 * b39 - 4 * a39 * c39;
        x39_1 = -b39 + Math.sqrt(d39) / 2 * a39;
        x39_2 = -b39 - Math.sqrt(d39) / 2 * a39;
        System.out.println("x1=" + x39_1 + " x2=" + x39_2);
        System.out.println("------------------------------------");

        // 40
        double x40, y40, a40_1 = 1, a40_2 = 1, b40_1 = 2, b40_2 = 3, c40_1 = 4, c40_2 = 5, d40;
        d40 = a40_1 * b40_2 - a40_2 * b40_1;
        x40 = (c40_1 * b40_2 - c40_2 * b40_1) / d40;
        y40 = (a40_1 * c40_2 - a40_2 * c40_1) / d40;
        System.out.println("x=" + x40 + " y=" + y40);
        System.out.println("------------------------------------");

        System.out.println("------------------------------------");
        System.out.println("-= Begin end =-");
        System.out.println("------------------------------------");

    }

}
