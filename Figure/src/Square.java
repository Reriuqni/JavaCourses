public class Square extends Rectangle {
    public Square(double width) {
        super(Math.abs(width), Math.abs(width));
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + getWidth() +
                "} ";
    }
}
