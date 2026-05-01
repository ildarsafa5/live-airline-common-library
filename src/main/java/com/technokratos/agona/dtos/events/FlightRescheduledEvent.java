package com.technokratos.agona.dtos.events;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@SuperBuilder
public class FlightRescheduledEvent extends EmailEvent {
    private UUID bookingId;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private OffsetDateTime oldDepartureTime;
    private OffsetDateTime newDepartureTime;
    private OffsetDateTime oldArrivalTime;
    private OffsetDateTime newArrivalTime;
    private Instant rescheduledAt;
}
