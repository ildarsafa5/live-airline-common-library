package com.technokratos.agona.dtos.response;

public class WeatherResponse {

    private Double temp;
    private Double feelslike;
    private Double pressure;
    private String conditions;


    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Double feelslike) {
        this.feelslike = feelslike;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }
}
