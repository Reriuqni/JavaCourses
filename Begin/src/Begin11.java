public class Begin11 {

    public static void main(String[] args) {

        double a = 2, b = -4, x, y, z, j;

        x = Math.abs(a) + Math.abs(b);
        y = Math.abs(a) - Math.abs(b);
        z = Math.abs(a) * Math.abs(b);
        j = Math.abs(a) / Math.abs(b);

        System.out.println("a+b=" + x + " a-b=" + y + " a*b=" + z + " a/b=" + j);

    }
}
