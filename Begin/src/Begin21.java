public class Begin21 {

    public static void main(String[] args) {

        double x1 = 1, y1 = 1, x2 = 3, y2 = 4, x3 = 5, y3 = 0, p, s, a, b, c;

        a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("S=" + s);

    }
}
