/**
 * Wrapper class Clock uses Second, Minute, Hour classes
 *
 * @author cortisol
 */

public class Clock {

    /**
     * Class fields
     */
    private Hour hour;
    private Minute minute;
    private Second second;

    Clock() {
        this(0, 0, 0);
    }

    Clock(int hour, int minute, int second) {
        this.hour = new Hour(hour);
        this.minute = new Minute(minute);
        this.second = new Second(second);
    }

    /**
     * @return time as String
     */
    public String getTime() {
        return hour.getTime() + ":" + minute.getTime() + ":" + second.getTime();
    }

    /**
     * @param hour   must be in 0..23 range
     * @param minute must be in 0..59 range
     * @param second must be in 0..59 range
     */
    public void setTime(int hour, int minute, int second) {
        this.hour.setTime(hour);
        this.minute.setTime(minute);
        this.second.setTime(second);
    }

    /**
     * @param second can be any int value, even negative
     */
    public void addSecond(int second) {
        addTime(0, 0, second);
    }

    /**
     * @param minute can be any int value, even negative
     */
    public void addMinute(int minute) {
        addTime(0, minute, 0);
    }

    /**
     * @param hour can be any int value, even negative
     */
    public void addHour(int hour) {
        addTime(hour, 0, 0);
    }

    /**
     * @param hour   can be any int value, even negative
     * @param minute can be any int value, even negative
     * @param second can be any int value, even negative
     */
    public void addTime(int hour, int minute, int second) {

        // timeInSeconds represent time and its shift in seconds
        int timeInSeconds = (this.hour.getTime() + hour) * Constants.SECONDS_IN_HOUR;
        timeInSeconds += (this.minute.getTime() + minute) * Constants.SECONDS_IN_MINUTE;
        timeInSeconds += (this.second.getTime() + second);
        timeInSeconds %= Constants.SECONDS_IN_DAY;

        // if negative, revert it
        if (timeInSeconds < 0) timeInSeconds += Constants.SECONDS_IN_DAY;

        // computing new values of time
        int newHour = timeInSeconds / Constants.SECONDS_IN_HOUR;
        int newMinute = timeInSeconds / Constants.SECONDS_IN_MINUTE - newHour * Constants.MINUTES_IN_HOUR;
        int newSecond = timeInSeconds - newHour * Constants.SECONDS_IN_HOUR - newMinute * Constants.SECONDS_IN_MINUTE;

        setTime(newHour, newMinute, newSecond);
    }

    /**
     * @return String representation of our class and its info
     */
    @Override
    public String toString() {
        return "[" + this.getClass().getName() + " " + getTime() + "]";
    }
}
