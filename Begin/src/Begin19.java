public class Begin19 {

    public static void main(String[] args) {

        int x1 = 0, y1 = 0, x2 = 4, y2 = 2, p, s;

        p = 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
        s = Math.abs(x1 - x2) * Math.abs(y1 - y2);

        System.out.println("P=" + p + " S=" + s);

    }
}
