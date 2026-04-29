package com.technokratos.agona.dtos.events;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class FlightInfo {
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private Instant departureTime;
    private Instant arrivalTime;

}
