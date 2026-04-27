package com.technokratos.agona.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherForecastResponse {
    private String resolvedAddress;
    private String timezone;

    @JsonProperty("days")
    private List<DailySummaryResponse> days;
}
