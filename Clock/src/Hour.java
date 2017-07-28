/**
 * Hour class is subclass of Minute class
 *
 * @author cortisol
 */

public class Hour extends Minute {

    Hour() {
    }

    // constructor uses an overrided method setTime() instead of super.setTime()
    Hour(int time) {   
        setTime(time);
    }

    /**
     * public void setTime(int time)
     * @param time must be in 0..23 range
     * method overrides setTime() method of superclass 
     * because of different values of time 
     */
    @Override
    public void setTime(int time) {
        checkArguments(time < 0 || time > 23, " must be in range 0..23");
        super.time = time;
    }
}
