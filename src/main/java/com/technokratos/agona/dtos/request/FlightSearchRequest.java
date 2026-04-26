package com.technokratos.agona.dtos.request;

import com.technokratos.agona.enums.SeatClass;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FlightSearchRequest {

    @NotBlank
    @Pattern(regexp = "^[A-Z]{3}$")
    private String from;

    @NotBlank
    @Pattern(regexp = "^[A-Z]{3}$")
    private String to;

    @NotNull
    @FutureOrPresent
    private LocalDate date;

    @NotNull
    private SeatClass seatClass;

    @NotNull
    @Min(1)
    private Integer passengers;
}
