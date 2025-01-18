package LTCB.Lab1.Lab1_8;

public class ClockTime {
    private int hour;
    private int minute;

    public ClockTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
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

    @Override
    public String toString() {
        return "ClockTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public static void main(String[] args) {
        ClockTime ct = new ClockTime(10, 20);
        System.out.println(ct);
    }
}
