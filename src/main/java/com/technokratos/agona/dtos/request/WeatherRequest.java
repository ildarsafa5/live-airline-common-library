package com.technokratos.agona.dtos.request;

import java.time.LocalDate;

public class WeatherRequest {
    private String city;
    private LocalDate date;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
