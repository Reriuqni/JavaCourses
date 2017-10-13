import java.util.*;

public class Collection {

    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////

        // Array list

        List<String> list = new ArrayList<>(); // capacity = 16;  load factor = 0.8

        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            list.add("Iterator" + random.nextInt(10000));

        }

        System.out.println(list);

        System.out.println(list.get(5));
        System.out.println(list.get(10));

        ///////////////////////////////////////////////////////////

        // Linked list

        list.clear();

        list.add("1");
        list.add("2");
        list.add("4");
        list.add("5");

        List<String> list1 = new LinkedList<>();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        System.out.println(list1.retainAll(list));
        System.out.println(list1);

        ///////////////////////////////////////////////////////////

        Set set = new HashSet();


    }
}
