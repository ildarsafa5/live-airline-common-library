package com.technokratos.agona.dtos.request;

import com.technokratos.agona.enums.PassengerCategory;
import com.technokratos.agona.enums.SeatClass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerRequest {

    @NotBlank
    @Size(max = 100)
    private String firstName;

    @NotBlank
    @Size(max = 100)
    private String lastName;

    @Size(max = 100)
    private String middleName;

    @NotBlank
    @Size(max = 20)
    private String passport;

    @NotNull
    private PassengerCategory passengerCategory;

    @NotNull
    private SeatClass seatClass;
}