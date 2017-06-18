public class Begin28 {

    public static void main(String[] args) {

        int a = 2, x, x2;

        System.out.println("a=" + a);

        x = a * a; // ^2

        System.out.println("a^2=" + x);

        x2 = x * a; // ^3

        System.out.println("a^3=" + x2);

        x2 = x * x2;

        System.out.println("a^5=" + x2);

        x = x2 * x2;

        System.out.println("a^10=" + x);

        x = x * x2;

        System.out.println("a^15=" + x);

    }
}
