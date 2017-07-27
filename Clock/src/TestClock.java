/**
 * Example of OOP
 */

public class TestClock {

    public static void main(String[] argv) {

        Second s = new Second();
        s.setTime(32);
        System.out.println(s);
        System.out.println(s.getTime());

        Second s2 = new Second(22);
        System.out.println(s2);
        System.out.println(s2.getTime());

        Minute m = new Minute();
        m.setTime(2);
        System.out.println(m);
        System.out.println(m.getTime());

        Minute m2 = new Minute(33);
        System.out.println(m2);
        System.out.println(m2.getTime());

        Hour h = new Hour();
        h.setTime(11);
        System.out.println(h);
        System.out.println(h.getTime());

        Hour h2 = new Hour(12);
        System.out.println(h2);
        System.out.println(h2.getTime());

        Clock c = new Clock();

        c.setTime(12,23,34);
        System.out.println(c.getTime());
        System.out.println(c);

        Clock c2 = new Clock(4,12,12);
        System.out.println(c2);

        c2.addTime(0,1,2);
        System.out.println(c2);

        c2.addTime(0,1,45);
        System.out.println(c2);

        c2.addTime(1,0,1);
        System.out.println(c2);

        c.setTime(23,59,59);
        System.out.println(c);

        c.addTime(0,0,1);
        System.out.println(c);


        c.addTime(0,0,3600);
        System.out.println(c);

        c.addTime(0,0,-1);
        System.out.println(c);

        c.setTime(0,0,0);
        System.out.println(c);

        c.addTime(-12,59,59);
        System.out.println(c);

    }
}
