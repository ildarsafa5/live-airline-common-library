package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;


public class FlightReminderMessageRequest extends EmailMessageRequest {

    private String flightNumber;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    private LocalDateTime departureDate;
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

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }
}
