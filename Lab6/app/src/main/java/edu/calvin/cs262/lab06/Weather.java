package edu.calvin.cs262.lab06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Weather forecast object (POJO), one per day, based on openweathermap's RESTful API.
 * Based on Deitel's WeatherViewer app (chapter 17).
 *
 * @author deitel
 * @author kvlinden
 * @version spring, 2017
 *
 * @autor Kyle Harkema
 * updated for lab6 of cs262 at calvin college
 */
public class Weather {

    private String day, summary;
    private double min, max;

    public Weather(long dt, double min, double max, String summary) {
        this.day = convertTimeStampToDay(dt);
        this.summary = summary;
        this.min = min;
        this.max = max;
    }

    public String getDay() {
        return day;
    }
    public String getSummary() {
        return summary;
    }
    public double getMin() { return min; } //Accessor for min temp
    public double getMax() { return max; } //Accessor for max temp

    private static String convertTimeStampToDay(long dt) {
        // Convert from datetime in milliseconds to calendar.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dt * 1000);

        // Adjust time for device's time zone.
        TimeZone tz = TimeZone.getDefault();
        calendar.add(Calendar.MILLISECOND, tz.getOffset(calendar.getTimeInMillis()));

        // Format/return the day's name.
        return new SimpleDateFormat("EEEE").format(calendar.getTime());
    }
}
