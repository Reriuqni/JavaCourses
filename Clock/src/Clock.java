/**
 * Wrapper class for Second, Minute, Hour
 */

public class Clock {

    final int SECONDS_IN_HOUR = 3600;
    final int SECONDS_IN_MINUTE = 60;
    final int SECONDS_IN_DAY = 86400;
    final int MINUTES_IN_HOUR = 60;

    private Hour hour;
    private Minute minute;
    private Second second;

    Clock() {
        hour = new Hour();
        minute = new Minute();
        second = new Second();
    }

    Clock(int hour, int minute, int second) {
        this.hour = new Hour(hour);
        this.minute = new Minute(minute);
        this.second = new Second(second);
    }

    public String getTime() {
        return hour.getTime() + ":" + minute.getTime() + ":" + second.getTime();
    }

    public void setTime(int hour, int minute, int second) {
        this.hour.setTime(hour);
        this.minute.setTime(minute);
        this.second.setTime(second);
    }

    public void addTime(int hour, int minute, int second) {

        int timeInSeconds = (this.hour.getTime() + hour) * SECONDS_IN_HOUR;
        timeInSeconds += (this.minute.getTime() + minute) * SECONDS_IN_MINUTE;
        timeInSeconds += (this.second.getTime() + second);
        timeInSeconds %= SECONDS_IN_DAY;

        if (timeInSeconds < 0) timeInSeconds = SECONDS_IN_DAY + timeInSeconds;

        int newHour = timeInSeconds / SECONDS_IN_HOUR;
        int newMinute = timeInSeconds / SECONDS_IN_MINUTE - newHour * MINUTES_IN_HOUR;
        int newSecond = timeInSeconds - newHour * SECONDS_IN_HOUR - newMinute * SECONDS_IN_MINUTE;

        setTime(newHour, newMinute, newSecond);
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getName() + " " + getTime() + "]";
    }
}
