package com.company;

/**
 * Created by nick on 06.05.2016.
 *
 */

public class Main {

    public static void main(String[] args) {

        Test aTest = new Test();
        Test bTest = new Test(10);

        DasNeueKlass eDasNeueKlass = new DasNeueKlass();
        DasNeueKlass cDasNeueKlass = new DasNeueKlass("c", 10);
        DasNeueKlass dDasNeueKlass = new DasNeueKlass("d", 10);

        // new thread
        try {
            cDasNeueKlass.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // another thread
        try {
            dDasNeueKlass.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // yet another new thread
        try {
            eDasNeueKlass.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Getting from 'a': "+ aTest.getT());
        System.out.println("Getting from 'b': "+ bTest.getT());

        System.out.println("Setting 'a' and 'b'");

        aTest.setT(12);
        bTest.setT(13);

        System.out.println("Getting from 'a': "+ aTest.getT());
        System.out.println("Getting from 'b': "+ bTest.getT());

        System.out.println("Zeroing 'a' and 'b'");

        aTest.zeroT();
        bTest.zeroT();

        System.out.println("Getting from 'a': "+ aTest.getT());
        System.out.println("Getting from 'b': "+ bTest.getT());

        Nclass vv = new Nclass();
    }
}
