package com.technokratos.agona.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TransferCancelledEvent extends EmailEvent {
    private UUID transferId;
    private UUID bookingId;
}
