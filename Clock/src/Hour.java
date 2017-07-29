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
     * @param time must be in 0..Constants.HOURS_IN_DAY-1 range
     */
    public void setTime(int time) {
        checkArguments(time < 0 || time > Constants.HOURS_IN_DAY - 1, " must be in range 0.." + (Constants.HOURS_IN_DAY - 1));
        super.time = time;
    }
}
