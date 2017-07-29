/**
 * Hour class
 *
 * @author cortisol
 */

public class Hour extends Minute {

    Hour() {
        this(0);
    }

    Hour(int time) {
        setTime(time);
    }

    /**
     * @param time must be in 0..23 range
     */
    @Override
    public void setTime(int time) {
        checkArguments(time < 0 || time > 23, " must be in range 0..23");
        super.time = time;
    }
}
