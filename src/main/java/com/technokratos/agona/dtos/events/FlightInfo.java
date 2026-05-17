package com.technokratos.agona.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
