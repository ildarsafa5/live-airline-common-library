package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class FlightUpdatedMessageRequest extends EmailMessageRequest {
    private String flightNumber;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate departureDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate arrivalDate;


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
