package Test_mod;

public class tst {
    public static void main(String[] args) {
        A a1 = new A("Tr_A");
        Thread tr = new Thread(a1);
        tr.start();

        A a2 = new A("Tr_B");
        Thread tr2 = new Thread(a2);
        tr2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("UI = " + i);
        }
    }
}
