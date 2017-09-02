package Std;

import java.util.HashMap;
import java.util.Map;

public class ClassB {

    private String a;
    private String b;

    private static int c = 41;

    static {
        System.out.println(c);
    }

    private Map<String, String> map = new HashMap<String, String>() {{
        put("q", "q");
        put("a", "a");
        put("f", "f");
    }};

    {
        map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");

        System.out.println(map);

        System.out.println("this is non static block");
        System.out.println(c);
    }

    public ClassB(String a, String b) {
        System.out.println("this is constructor");
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
