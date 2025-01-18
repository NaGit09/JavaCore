package LTCB.Lab1.Lab1_4;
/*
Write Java class, constructor and test constructor for
representing points in time since midnight.
A point in time consists of three numbers: hours,
minutes, and seconds.
 */
public class Clock {
    public int hour;
    public int minute;
    public int second;
    public Clock(int hour, int minute, int second) {

    minute += second/60;
    hour += minute/60;
    this.hour = hour%12;
    this.minute = minute%60;
    this.second = second%60;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Clock clock = new Clock(23,55,67);
        System.out.println(clock);
    }
}
