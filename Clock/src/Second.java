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
     * public void setTime(int time)
     *
     * @param time must be in 0..59 range
     *             method is overrided in Hour class
     */
    public void setTime(int time) {
        checkArguments(time < 0 || time > 59, " must be in range 0..59");
        this.time = time;
    }

    /**
     * public int getTime()
     * method returns time as int
     */
    public int getTime() {
        return time;
    }

    /**
     * protected void checkArguments(boolean condition, String message)
     *
     * @param condition is boolean value
     * @param message   is String value
     *                  method throws an exception with message if condition is true
     */
    protected void checkArguments(boolean condition, String message) {
        if (condition) {
            throw new IllegalArgumentException(this.getClass().getName() + message);
        }
    }

    /**
     * public String toString()
     * method overrides Object.toString() method to represent our class name and info
     */
    @Override
    public String toString() {
        return "[" + this.getClass().getName() + " " + time + "]";
    }
}
