package com.technokratos.agona.dtos.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
public class FlightSearchResponse {
    private UUID id;
    private String flightNumber;
    private String fromCode;
    private String fromCity;
    private String toCode;
    private String toCity;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;
    private int durationMinutes;
    private BigDecimal price;
    private String aircraftModel;
    private BigDecimal basePriceEconomy;
    private BigDecimal basePriceBusiness;
}