public class Integer {

    public static void main(String[] args) {

        // 1
        int lcm = 123, lmeters = lcm / 100;
        System.out.println("meters=" + lmeters);
        System.out.println("------------------------------------");

        // 2
        int mass_kg = 1234, mass_ton = mass_kg / 1000;
        System.out.println("tons=" + mass_ton);
        System.out.println("------------------------------------");

        // 3
        int size_byte = 2345, size_kb = size_byte / 1024;
        System.out.println("Size kb=" + size_kb);
        System.out.println("------------------------------------");

        // 4
        int otr_a = 12, otr_b = 5, otr_kol = otr_a / otr_b;
        System.out.println("Otr kol=" + otr_kol);
        System.out.println("------------------------------------");

        // 5
        int otr_c = 12, otr_d = 5, otr_ost = otr_c % otr_d;
        System.out.println("Otr ost=" + otr_ost);
        System.out.println("------------------------------------");

        // 6
        int num = 23, num_d = num / 10, num_e = num % 10;
        System.out.println("Num d=" + num_d + " Num_e=" + num_e);
        System.out.println("------------------------------------");

        // 7
        num = 23;
        num_d = num / 10;
        num_e = num % 10;
        int num_s = num_d + num_e, num_m = num_d * num_e;
        System.out.println("Num s=" + num_s + " Num_m=" + num_m);
        System.out.println("------------------------------------");

        // 8
        num = 23;
        num_d = num / 10;
        num_e = num % 10;
        int num_rev = num_e * 10 + num_d;
        System.out.println("Num rev=" + num_rev);
        System.out.println("------------------------------------");

        // 9
        num = 123;
        System.out.println("num=" + num + " sotni=" + num / 100);
        System.out.println("------------------------------------");


        // 10
        num = 234;
        System.out.println("edin=" + num % 10 + " des=" + num / 10 % 10);
        System.out.println("------------------------------------");

        // 11
        num = 234;
        num_s = num / 100;
        num_d = num / 10 % 10;
        num_e = num % 10;
        int summ_c = num_s + num_d + num_e, pro_c = num_s * num_d * num_e;
        System.out.println("summ_c=" + summ_c + " pro_c=" + pro_c);
        System.out.println("------------------------------------");

        // 12
        num = 234;
        num_s = num / 100;
        num_d = num / 10 % 10;
        num_e = num % 10;
        int new_num = num_e * 100 + num_d * 10 + num_s;
        System.out.println("num=" + num + "new num=" + new_num);
        System.out.println("------------------------------------");

        // 13
        num = 234;
        new_num = num % 100 * 10 + num / 100;
        System.out.println("num=" + num + " new num=" + new_num);
        System.out.println("------------------------------------");

        // 14
        num = 234;
        new_num = num / 10 + num % 10 * 100;
        System.out.println("num=" + num + " new num=" + new_num);
        System.out.println("------------------------------------");

        // 15
        num = 123;
        new_num = num % 100 / 10 * 100 + num / 100 * 10 + num % 10;
        System.out.println("num=" + num + " new num=" + new_num);
        System.out.println("------------------------------------");

        // 16
        num = 123;
        new_num = num / 100 * 100 + num / 10 % 10 + num % 10 * 10;
        System.out.println("num=" + num + " new num=" + new_num);
        System.out.println("------------------------------------");

        // 17
        num = 1234;
        int sot = num / 100 % 10;
        System.out.println("sotni=" + sot);
        System.out.println("------------------------------------");

        // 18
        num = 1234;
        int tys = num / 1000;
        System.out.println("tys=" + tys);
        System.out.println("------------------------------------");

        // 19
        int sec = 3479;
        int min = sec / 60;
        System.out.println("mins=" + min);
        System.out.println("------------------------------------");

        // 20
        sec = 14479;
        int hours = sec / 3600;
        System.out.println("hours=" + hours);
        System.out.println("------------------------------------");

        // 21
        sec = 3479;
        int sec_ost = sec % 60;
        System.out.println("sec ost=" + sec_ost);
        System.out.println("------------------------------------");

        // 22
        sec = 14479;
        int hours_ost = sec % 3600;
        System.out.println("hours_ost=" + hours_ost);
        System.out.println("------------------------------------");

        // 23
        sec = 14479;
        int min_ost = sec % 3600 / 60;
        System.out.println("min_ost=" + min_ost);
        System.out.println("------------------------------------");

        // 24
        int day = 24, weekday = day % 7;
        System.out.println("Weekday=" + weekday);
        System.out.println("------------------------------------");

        // 25
        day = 24;
        weekday = (day + 3) % 7;
        System.out.println("Weekday=" + weekday);
        System.out.println("------------------------------------");

        // 26
        day = 24;
        weekday = (day - 1 + 1) % 7 + 1;
        System.out.println("Weekday=" + weekday);
        System.out.println("------------------------------------");

        // 27
        day = 24;
        weekday = (day - 1 + 6 - 1) % 7 + 1;
        System.out.println("Weekday=" + weekday);
        System.out.println("------------------------------------");

        // 28
        day = 24;
        int nday = 4;
        weekday = (day - 1 + nday - 1) % 7 + 1;
        System.out.println("Weekday=" + weekday);
        System.out.println("------------------------------------");

        // 29
        int A = 3, B = 5, C = 2;
        int K = (A / C) * (B / C), Sf = A * B - K * C * C;
        System.out.println("K=" + K + " Sf=" + Sf);
        System.out.println("------------------------------------");

        // 30
        int year = 1600;
        int stoletie = (year - 1) / 100 + 1;
        System.out.println("year=" + year + " stoletie=" + stoletie);

    }
}
