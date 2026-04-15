package com.technokratos.agona.dtos.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AircraftRequest {
    private String model;
    private Integer businessRows;
    private Integer economyRows;
    private String seatsLettersRow;
    private BigDecimal businessExtraPrice;
    private BigDecimal economyExtraPrice;
}
