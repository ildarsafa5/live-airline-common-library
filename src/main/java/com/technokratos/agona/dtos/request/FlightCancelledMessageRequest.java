package com.technokratos.agona.dtos.request;

public class FlightCancelledMessageRequest extends EmailMessageRequest{
    private String flightNumber;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
