package com.technokratos.agona.dtos.request;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AircraftRequest {

    @NotBlank
    @Size(max = 200)
    private String model;

    @NotNull
    @PositiveOrZero
    private Integer businessRows;

    @NotNull
    @PositiveOrZero
    private Integer economyRows;

    @NotBlank
    @Pattern(regexp = "^[A-Z]+$")
    @Size(min = 2, max = 10)
    private String seatsLettersRow;

    @NotNull
    @DecimalMin(value = "0.0")
    private BigDecimal businessExtraPrice;

    @NotNull
    @DecimalMin(value = "0.0")
    private BigDecimal economyExtraPrice;
}
