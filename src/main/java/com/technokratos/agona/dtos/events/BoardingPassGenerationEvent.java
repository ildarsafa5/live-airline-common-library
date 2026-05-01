package com.technokratos.agona.dtos.events;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BoardingPassGenerationEvent {
    private UUID bookingId;
}
