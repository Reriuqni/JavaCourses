public class Triangle extends Figure {
    private double angle, a, b, c;

    Triangle(double a, double b, double c) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.c = Math.abs(c);
    }

    @Override
    double getSquare() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = Math.abs(a);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = Math.abs(b);
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = Math.abs(c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} ";
    }
}
