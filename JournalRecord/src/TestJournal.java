/**
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

        Record d = new Record("2014-01-01 23:01:59 3 ruku avvvvv\n\n\nvvv");
        System.out.println(d);

    }
}
