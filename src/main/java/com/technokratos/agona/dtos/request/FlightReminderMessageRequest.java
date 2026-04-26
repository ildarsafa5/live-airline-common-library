package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class FlightReminderMessageRequest extends EmailMessageRequest {

    private String flightNumber;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate departureDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate arrivalDate;
    private String city;
    private String airportCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

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
