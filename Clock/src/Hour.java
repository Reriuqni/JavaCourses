/**
 * Subclass of Minute
 */

public class Hour extends Second {

    Hour() {
    }

    Hour(int time) {
        setTime(time);
    }

    @Override
    public void setTime(int time) {
        checkArguments(time < 0 || time > 23, " must be in range 0..23");
        super.time = time;
    }
}
