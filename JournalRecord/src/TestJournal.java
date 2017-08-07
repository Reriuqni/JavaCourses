import java.util.Date;

/**
 * @author cortisol
 */

public class TestJournal {

    public static void main (String[] args) {

        Date time = new Date();
        time.setTime(6747473);
        Record a = new Record(time,1,"kuku","achtung"  );
        System.out.println(a);

        Record b = new Record("2343242 2 kuku aaa_ffds_gddddfg");
        Record c = new Record("123 3 kuku aaa ffds-gdd d  d f g ");
        Record d = new Record("123 4 kuku aaa ffds-gdd d  d f g ");
        System.out.println(b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(new Record("111 4 asasa       asasasas"));

        System.out.println(new Record(new Date(), 1, "      zxzxc", " ddd"));

       // System.out.println(new Record("111 4            asasa            asasasas"));
    }
}
