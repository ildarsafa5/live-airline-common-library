package com.technokratos.agona.dtos.request;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import java.util.UUID;

@Data
@Builder
public class SeatSelectionRequest {

    @NotNull
    private UUID flightSeatId;
}