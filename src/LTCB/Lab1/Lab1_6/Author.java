package LTCB.Lab1.Lab1_6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Author {
    private String name;
    private GregorianCalendar date;
    public Author(String name, GregorianCalendar date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", Birth year=" + + date.get(Calendar.DAY_OF_MONTH)+"/" + date.get(Calendar.MONTH) +"/"+date.get(Calendar.YEAR) +
        '}';
    }
}
