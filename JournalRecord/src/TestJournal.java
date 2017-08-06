import java.util.Date;

/**
 * @author cortisol
 */

public class TestJournal {

    public static void main (String[] args) {

        Date time = new Date();
        time.setTime(123);
        Record a = new Record(time,1,"kuku","achtung"  );
        System.out.println(a);

        Record b = new Record("123 2 kuku aaa");
        System.out.println(b);
    }
}
