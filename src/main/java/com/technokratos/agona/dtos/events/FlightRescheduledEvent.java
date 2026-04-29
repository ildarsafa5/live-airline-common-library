package com.technokratos.agona.dtos.events;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.UUID;

@Data
@SuperBuilder
public class FlightRescheduledEvent extends EmailEvent {
    private UUID bookingId;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private Instant oldDepartureTime;
    private Instant newDepartureTime;
    private Instant oldArrivalTime;
    private Instant newArrivalTime;
    private Instant rescheduledAt;
}
