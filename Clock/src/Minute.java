/**
 * Minute class
 *
 * @author cortisol
 */

public class Minute extends Second {

    Minute() {
        super(0);
    }

    Minute(int time) {
        super(time);
    }

    /**
     * @param time must be in 0..Constants.MINUTES_IN_HOUR-1 range
     */
    public void setTime(int time) {
        checkArguments(time < 0 || time > Constants.MINUTES_IN_HOUR - 1, " must be in range 0.." + (Constants.MINUTES_IN_HOUR - 1));
        super.setTime(time);
    }
}
