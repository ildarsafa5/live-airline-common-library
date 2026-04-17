package com.technokratos.agona.dtos.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class AircraftResponse {
    private UUID id;
    private String model;
    private Integer economySeats;
    private Integer businessSeats;
}
