public class Begin23 {

    public static void main(String[] args) {

        int a = 2, b = 3, c = 4;

        System.out.println("a=" + a + " b=" + b + " c=" + c);

        a = a ^ b ^ (b = a);
        a = a ^ c ^ (c = a);

        System.out.println("a=" + a + " b=" + b + " c=" + c);

    }
}
