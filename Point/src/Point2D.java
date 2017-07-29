public class Point2D extends Point {
    private double y;

    public Point2D() {
    }

    public Point2D(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "y=" + y + super.toString() +
                '}';
    }
}
