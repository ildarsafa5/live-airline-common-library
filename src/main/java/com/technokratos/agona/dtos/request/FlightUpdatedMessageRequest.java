package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;


public class FlightUpdatedMessageRequest extends EmailMessageRequest {
    private String flightNumber;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    private LocalDateTime departureDate;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    private LocalDateTime arrivalDate;


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
