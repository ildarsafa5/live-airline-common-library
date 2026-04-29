package com.technokratos.agona.dtos.events;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.UUID;

@Data
@SuperBuilder
public class BookingCancelledEvent extends EmailEvent {
    private UUID bookingId;
    private FlightInfo flight;
    private Instant cancelledAt;
}