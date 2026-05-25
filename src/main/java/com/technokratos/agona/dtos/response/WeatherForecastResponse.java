package com.technokratos.agona.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherForecastResponse {
    private String resolvedAddress;
    private String timezone;

    @JsonProperty("days")
    private List<DailySummaryResponse> days;

    public String getResolvedAddress() {
        return resolvedAddress;
    }

    public void setResolvedAddress(String resolvedAddress) {
        this.resolvedAddress = resolvedAddress;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<DailySummaryResponse> getDays() {
        return days;
    }

    public void setDays(List<DailySummaryResponse> days) {
        this.days = days;
    }
}
