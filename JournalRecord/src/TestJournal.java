/**
 * Main test class for Journal, Record classes
 *
 * @author cortisol
 */

import java.util.Date;

public class TestJournal {

    public static void main(String[] args) {git

        Date time = new Date();
        time.setTime(6747473);
        Record a = new Record(time, 1, "kuku", "achtung");
        Record b = new Record("2014-04-12       23:59:59       2 kuku     aaa    d fg dfg ffds_\ngddddfg");
        Record c = new Record("2014-01-01 23:01:59 3 ruku bbb");
        Record d = new Record("2014-02-01 23:01:59 4 ruku avvvvv\n\n\nvvv");

        Journal j = new Journal(2);
        j.add(a);
        j.add(b);
        System.out.println("Add\n" + j);

        j.removeAll();
        System.out.println("Removeall\n" + j);

        j.add(a);
        j.add(b);
        j.add(c);
        j.add(d);
        System.out.println("Add\n" + j);

        j.remove(b);
        System.out.println("Remove b\n" + j);

        j.add(a);
        System.out.println("Add a\n" + j);

        j.remove(0);
        System.out.println("Remove 0\n" + j);

        j.remove(0, 1);
        System.out.println("Remove 0,1\n" + j);

        j.add(b);
        System.out.println("Add b\n" + j);

        Journal z = new Journal();
        z.add(a);
        z.add(b);
        System.out.println("new j\n" + z);

        j.add(z);
        System.out.println("add new journal to journal\n" + j);

        j.add(c);
        System.out.println("FilterString\n" + j.filter("bbb"));

        Date from = new Date();
        from.setTime(1111111);
        Date to = new Date();
        System.out.println("FilterDate\n" + j.filter(from, to));

        j.add(a);
        j.add(b);
        j.add(c);
        j.add(d);

        j.sortByDate();

        System.out.println("sort date\n" + j);

        j.sortByImportanceDate();

        System.out.println("sort importance date\n" + j);

        j.sortBySourceDate();

        System.out.println("sort source date\n" + j);

        j.sortByImportanceSourceDate();

        System.out.println("sort importance source date\n" + j);
    }
}
