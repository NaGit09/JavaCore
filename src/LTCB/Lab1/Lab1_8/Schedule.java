package LTCB.Lab1.Lab1_8;

public class Schedule {
    ClockTime departure;
    ClockTime arrival;

    public Schedule(ClockTime departure, ClockTime arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                '}';
    }

    public ClockTime getDeparture() {
        return departure;
    }

    public void setDeparture(ClockTime departure) {
        this.departure = departure;
    }

    public ClockTime getArrival() {
        return arrival;
    }

    public void setArrival(ClockTime arrival) {
        this.arrival = arrival;
    }
}
