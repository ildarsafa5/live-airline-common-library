package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.FlightStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightResponse {
    private UUID id;
    private String flightNumber;
    private String fromCode;
    private String fromCity;
    private String toCode;
    private String toCity;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;
    private int durationMinutes;
    private String aircraftModel;
    private BigDecimal basePriceEconomy;
    private BigDecimal basePriceBusiness;
    private FlightStatus status;
}