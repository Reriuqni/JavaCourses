package Glyph;

public class Glyph {

    void draw() {
        System.out.println("Glyph.draw");
    }

    public Glyph() {
        System.out.println("before");
        draw();
        System.out.println("after");
    }
}
