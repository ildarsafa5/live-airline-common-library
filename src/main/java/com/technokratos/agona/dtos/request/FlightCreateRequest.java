package com.technokratos.agona.dtos.request;


import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
public class FlightCreateRequest {

    @NotBlank
    @Size(max = 10)
    private String flightNumber;

    @NotNull
    private UUID departureAirportId;

    @NotNull
    private UUID arrivalAirportId;

    @NotNull
    private UUID aircraftId;

    @NotNull
    @FutureOrPresent
    private OffsetDateTime departureTime;

    @NotNull
    @FutureOrPresent
    private OffsetDateTime arrivalTime;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal basePriceEconomy;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal basePriceBusiness;
}
