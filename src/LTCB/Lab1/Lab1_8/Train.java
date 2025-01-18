package LTCB.Lab1.Lab1_8;

public class Train {
    private Schedule schedule;
    private Route route;
    private Boolean local;

    public Train(Schedule schedule, Route route, Boolean local) {
        this.schedule = schedule;
        this.route = route;
        this.local = local;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Boolean getLocal() {
        return local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Train{" +
                "schedule=" + schedule +
                ", route=" + route +
                ", local=" + local +
                '}';
    }

    public static void main(String[] args) {
        Train train1 = new Train(new Schedule(new ClockTime(7,20),new ClockTime(22,30)),
                new Route("HCM","HN"),true);
        System.out.println(train1);
    }
}
