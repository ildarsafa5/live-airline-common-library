package com.technokratos.agona.dtos.events;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@SuperBuilder
public class BookingConfirmedEvent extends EmailEvent {
    private UUID bookingId;
    private FlightInfo flight;
    private List<PassengerSeat> passengers;
    private BigDecimal totalPrice;
    private String boardingPassPdfUrl;
    private Instant confirmedAt;

}
