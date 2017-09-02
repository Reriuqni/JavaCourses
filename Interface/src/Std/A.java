package Std;

public class A {

    static {
        a = "ddd";
        //c = 1;
    }

    {
        c = 1;
    }

    public final int c;

    public final static String a;

    public static String b = "1111" + a;

    public A() {
        //c = 1;
    }

}
