public class Begin24 {

    public static void main(String[] args) {

        int a = 2, b = 3, c = 4;

        System.out.println("a=" + a + " b=" + b + " c=" + c);

        c = c ^ b ^ (b = c);
        c = c ^ a ^ (a = c);

        System.out.println("a=" + a + " b=" + b + " c=" + c);

    }
}
