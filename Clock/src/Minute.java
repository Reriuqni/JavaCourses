/**
 * Minute class is subclass of Second class
 *
 * @author cortisol
 */

public class Minute extends Second {

    Minute() {
        super(0);
    }

    Minute(int time) {
        super.setTime(time);
    }
}
