package com.technokratos.agona.dtos.events;

import lombok.Builder;
import lombok.Data;


import java.time.OffsetDateTime;

@Data
@Builder
public class FlightInfo {
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;

}
