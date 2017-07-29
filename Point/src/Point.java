/**
 * @author cortisol
 */

public class Point {

    private double x;

    public Point() {
    }

    public Point(double x) {
        this.x = x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }
}
