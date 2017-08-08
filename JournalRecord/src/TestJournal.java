/**
 * Main test class
 *
 * @author cortisol
 */

import java.util.Date;

public class TestJournal {

    public static void main(String[] args) {

        Date time = new Date();
        time.setTime(6747473);
        Record a = new Record(time, 1, "kuku", "achtung");
        System.out.println(a);

        Record b = new Record("2014-04-12       23:59:59       2 kuku     aaa    d fg dfg ffds_\ngddddfg");
        System.out.println(b);

        Record c = new Record("2014-01-01 23:01:59 3 ruku bbb");
        System.out.println(c);

        Record d = new Record("2014-01-01 23:01:59 4 ruku avvvvv\n\n\nvvv");
        System.out.println(d);

        Journal j = new Journal(2);
        j.add(a);
        j.add(b);
        System.out.println(j);

        j.removeAll();
        System.out.println(j);

        j.add(a);
        System.out.println(j);
        j.add(b);
        System.out.println(j);
        j.add(c);
        System.out.println(j);
        j.add(d);
        System.out.println(j);

        j.remove(b);
        System.out.println(j);

        j.add(a);
        System.out.println(j);

        j.remove(0);
        System.out.println(j);

        j.remove(0,1);
        System.out.println(j);

    }
}
