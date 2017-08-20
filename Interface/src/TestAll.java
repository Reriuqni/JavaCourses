public class TestAll {

    public static void main(String[] args) {

        MyMonth m = MyMonth.FEB;
        System.out.println(m);

        Figure f = new Figure();

        f.draw(2,3);

        System.out.println(m.getValue(1));

        P p = new P(1);
        System.out.println(p);

        A a = new B();
        System.out.println(a.getVal(a));
    }
}
