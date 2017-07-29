/**
 * Second superclass
 *
 * @author cortisol
 */

public class Second {

    protected int time;

    Second() {
    }

    Second(int time) {
        setTime(time);
    }

    /**
     * method is overrided in Hour class
     *
     * @param time must be in 0..59 range
     */
    public void setTime(int time) {
        checkArguments(time < 0 || time > 59, " must be in range 0..59");
        this.time = time;
    }

    /**
     * @return time as int
     */
    public int getTime() {
        return time;
    }

    /**
     * method throws an exception with message if condition is true
     *
     * @param condition is boolean value
     * @param message   is String value
     */
    protected void checkArguments(boolean condition, String message) {
        if (condition) {
            throw new IllegalArgumentException(this.getClass().getName() + message);
        }
    }

    /**
     * method overrides Object.toString()
     *
     * @return String representation of our class and its info
     */
    @Override
    public String toString() {
        return "[" + this.getClass().getName() + " " + time + "]";
    }
}
