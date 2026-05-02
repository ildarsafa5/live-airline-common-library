package com.technokratos.agona.dtos.events;

import lombok.Builder;
import lombok.Data;


import java.time.OffsetDateTime;

@Data
@Builder
public class FlightInfo {
    private String flightNumber;
    private String departureCity;
    private String departureAirportCode;
    private String arrivalCity;
    private String arrivalAirportCode;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;

}
