public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {
        super(Math.abs(a), Math.abs(a), Math.abs(a));
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" + "a=b=c=" + getA() + "} ";
    }
}
