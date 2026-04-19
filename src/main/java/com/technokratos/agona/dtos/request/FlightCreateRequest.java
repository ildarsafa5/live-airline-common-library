package com.technokratos.agona.dtos.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
public class FlightCreateRequest {
    private String flightNumber;
    private UUID departureAirportId;
    private UUID arrivalAirportId;
    private UUID aircraftId;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;
    private BigDecimal basePriceEconomy;
    private BigDecimal basePriceBusiness;
}