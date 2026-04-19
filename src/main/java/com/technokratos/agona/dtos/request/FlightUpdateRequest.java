package com.technokratos.agona.dtos.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Builder
public class FlightUpdateRequest {
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;
    private BigDecimal basePriceEconomy;
    private BigDecimal basePriceBusiness;
}
