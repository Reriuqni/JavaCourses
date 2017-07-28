/**
 * Hour class is subclass of Minute class
 *
 * @author cortisol
 */

public class Hour extends Minute {

    Hour() {
    }

    Hour(int time) {
        setTime(time);
    }

    /**
     * method overrides setTime() method of Second superclass
     * because of different values of time
     *
     * @param time must be in 0..23 range
     */
    @Override
    public void setTime(int time) {
        checkArguments(time < 0 || time > 23, " must be in range 0..23");
        super.time = time;
    }
}
