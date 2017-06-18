public class Begin39 {

    public static void main(String[] args) {

        double a = 2, b = -2, c = -5, d, x1, x2;

        d = b * b - 4 * a * c;
        x1 = -b + Math.sqrt(d) / 2 * a;
        x2 = -b - Math.sqrt(d) / 2 * a;

        System.out.println("x1=" + x1 + " x2=" + x2);

    }
}
