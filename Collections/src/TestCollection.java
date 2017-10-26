import javafx.beans.binding.IntegerBinding;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */

public class TestCollection {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2};

        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (!set.add(i)) System.out.println(i);
        }

        ///////////////////////////////////////

        String str = "aabbbcccc";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);

        ///////////////////////////////////////

    }
}
