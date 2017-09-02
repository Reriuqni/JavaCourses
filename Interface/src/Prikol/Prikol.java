package Prikol;

public class Prikol {

    public static void method(int...a) {
        System.out.println("int...");
    }

    public static void method(long a, long b) {
        System.out.println("long");
    }

    public static void method(Integer a, Integer b) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        int a = 1, b = 2, c = 1;
        Prikol.method(a,b);
    }
}
