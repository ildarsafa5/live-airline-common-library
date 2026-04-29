package com.technokratos.agona.dtos.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerSeat {
    private String firstName;
    private String lastName;
    private String middleName;
    private String seatNumber;
}