package com.technokratos.agona.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardingPassGenerationEvent {
    private UUID bookingId;
}
