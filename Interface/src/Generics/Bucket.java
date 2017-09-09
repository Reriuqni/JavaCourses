package Generics;

public class Bucket<T> {

    int count = 0;
    private T[] t = (T[]) new Object[100];

    public void add(T t) {
        this.t[count++] = t;
    }

    public T[] getT() {
        return t;
    }

    @Override
    public String toString() {
        return null;
    }

    public static <G> void print(G g) {
        System.out.println(g);
    }
}
