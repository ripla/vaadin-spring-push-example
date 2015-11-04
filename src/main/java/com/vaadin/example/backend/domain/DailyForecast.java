package com.vaadin.example.backend.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DailyForecast {
    private final String date;
    private final String temperature;
    private final String description;
    private final String windSpeed;
    private final String humidity;

    public DailyForecast(Long date, Double temperature, String description, Double windSpeed, Integer humidity) {
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date(date * 1000));
        this.temperature = String.format("%.2f°C", temperature);
        this.description = description;
        this.windSpeed = String.format("%.2fm/sec", windSpeed);
        this.humidity = String.format("%d%%", humidity);
    }


    public String getDate() {
        return date;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getHumidity() {
        return humidity;
    }


}
