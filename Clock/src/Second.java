/**
 * Super class Second
 */

public class Second {

    protected int time;

    Second() {
    }

    Second(int time) {
        setTime(time);
    }

    protected void checkArguments(boolean condition, String message) {
        if (condition) {
            throw new IllegalArgumentException(this.getClass().getName() + message);
        }
    }

    public void setTime(int time) {
        checkArguments(time < 0 || time > 59, " must be in range 0..59");
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getName() + " " + time + "]";
    }
}
