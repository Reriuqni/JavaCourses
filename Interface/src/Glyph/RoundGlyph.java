package Glyph;

public class RoundGlyph extends Glyph {

    private int radius = 1;

    @Override
    void draw() {
        System.out.println(radius);
    }

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph");
    }
}
