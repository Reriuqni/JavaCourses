import java.util.HashSet;
import java.util.Set;

/**
 *
 */

public class TestCollection {

    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,6,7,8,9,2};

        Set<Integer> set = new HashSet<>();
        for (int i: array) {
            if (!set.add(i)) System.out.println(i);
        }

        ///////////////////////////////////////

        String str = "aabbbcccc";

        char[] cStr = str.toCharArray();

        Set<Character> set1 = new HashSet<>();
        for (char c: cStr) {
            int count = 0;
            if (!set1.add(c)) count++;
            System.out.println(c + " " + count);
        }
    }
}
