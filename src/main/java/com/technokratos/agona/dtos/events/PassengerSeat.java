package com.technokratos.agona.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PassengerSeat {
    private String firstName;
    private String lastName;
    private String middleName;
    private String seatNumber;
}