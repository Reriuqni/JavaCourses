public class Begin22 {

    public static void main(String[] args) {

        int a = 2, b = 3;

        System.out.println("a=" + a + " b=" + b);

        a = b ^ a ^ (b = a);

        System.out.println("a=" + a + " b=" + b);

    }
}
