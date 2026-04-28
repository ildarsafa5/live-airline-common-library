package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.PassengerCategory;
import com.technokratos.agona.enums.SeatClass;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class TicketResponse {
    private UUID id;
    private UUID flightId;
    private String flightNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String passport;
    private PassengerCategory passengerCategory;
    private SeatClass seatClass;
    private BigDecimal price;
    private String seatNumber;
}