public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double a, double c) {
        super(Math.abs(a), Math.abs(a), Math.abs(c));
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" + "a=b=" + getA() + ", c=" + getC() + "} ";
    }
}
