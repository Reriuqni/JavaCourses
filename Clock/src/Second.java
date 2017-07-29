/**
 * Second superclass
 *
 * @author cortisol
 */

public class Second {

    /**
     * Class fields
     */
    private int time;

    Second() {
        this(0);
    }

    Second(int time) {
        setTime(time);
    }

    /**
     * @param time must be in 0..Constants.SECONDS_IN_MINUTE-1 range
     */
    public void setTime(int time) {
        checkArguments(time < 0 || time > Constants.SECONDS_IN_MINUTE - 1, " must be in range 0.." + (Constants.SECONDS_IN_MINUTE - 1));
        this.time = time;
    }

    /**
     * @return time as int
     */
    public int getTime() {
        return time;
    }

    /**
     * @param condition is boolean value
     * @param message   is String value
     * @throws IllegalArgumentException
     */
    protected void checkArguments(boolean condition, String message) {
        if (condition) {
            throw new IllegalArgumentException(this.getClass().getName() + message);
        }
    }

    /**
     * @return String representation of our class and its info
     */
    @Override
    public String toString() {
        return "[" + this.getClass().getName() + " " + time + "]";
    }
}
