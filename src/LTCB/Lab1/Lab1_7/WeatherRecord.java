package LTCB.Lab1.Lab1_7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeatherRecord {
    private GregorianCalendar date;
    private TemperatureRange today ;
    private TemperatureRange normal ;
    private TemperatureRange record  ;
    private  double precipitation;

    public WeatherRecord(GregorianCalendar date, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double precipitation) {
        this.date = date;
        this.today = today;
        this.normal = normal;
        this.record = record;
        this.precipitation = precipitation;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public TemperatureRange getToday() {
        return today;
    }

    public void setToday(TemperatureRange today) {
        this.today = today;
    }

    public TemperatureRange getNormal() {
        return normal;
    }

    public void setNormal(TemperatureRange normal) {
        this.normal = normal;
    }

    public TemperatureRange getRecord() {
        return record;
    }

    public void setRecord(TemperatureRange record) {
        this.record = record;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    @Override
    public String toString() {
        return "WeatherRecord{" +
                "date=" + date.get(Calendar.DAY_OF_MONTH)+ "/" +date.get(Calendar.MONTH)+ "/" +date.get(Calendar.YEAR) +
                ", today=" + today +
                ", normal=" + normal +
                ", record=" + record +
                ", precipitation=" + precipitation +
                '}';
    }

    public static void main(String[] args) {
            WeatherRecord record = new WeatherRecord(new GregorianCalendar(2024,5,7) , new TemperatureRange(21,28),
                    new TemperatureRange(23,30) , new TemperatureRange(18,32), 34);
        System.out.println(record);
    }
}
