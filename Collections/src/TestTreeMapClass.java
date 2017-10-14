import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class TestTreeMapClass {
    public static void main(String[] args) {
        int[] ar = new int[100];

        Random r = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = r.nextInt(20);
        }
        System.out.println(Arrays.toString(ar));

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i : ar) {
            Integer count;
            count = map.getOrDefault(i, 0);

            map.put(i, ++count);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key= " + entry.getKey() + ", value= " + entry.getValue());
        }

        System.out.println(map);
    }
}
