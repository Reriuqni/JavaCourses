package Generics;

import java.util.Arrays;

public class TestGenerics {

    public static void main(String[] args) {

        Bucket bucket = new Bucket();

        bucket.add("aaa");
        bucket.add(1L);
        bucket.add(100.0);
        bucket.add(10);
        bucket.add(new boolean[]{true,});

        System.out.println(Arrays.deepToString(bucket.getT()));

        Bucket<Integer> bs = new Bucket<>();

        bs.add(100);
        bs.add(200);

        System.out.println(Arrays.deepToString(bs.getT()));

        Function<String> function = new FunctionImpl();
        function.add("feww");
        function.add("asd");

        Bucket.print("aaa");
    }
}
