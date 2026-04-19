package com.technokratos.agona.dtos.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Builder
public class FlightUpdateRequest {

    @FutureOrPresent
    private OffsetDateTime departureTime;

    @FutureOrPresent
    private OffsetDateTime arrivalTime;

    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal basePriceEconomy;

    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal basePriceBusiness;
}
