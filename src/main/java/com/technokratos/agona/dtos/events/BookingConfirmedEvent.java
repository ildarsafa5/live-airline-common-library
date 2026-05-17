package com.technokratos.agona.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BookingConfirmedEvent extends EmailEvent {
    private UUID bookingId;
    private FlightInfo flight;
    private List<PassengerSeat> passengers;
    private BigDecimal totalPrice;
    private String boardingPassPdfUrl;
    private Instant confirmedAt;

}
