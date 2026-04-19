package com.technokratos.agona.dtos.request;

import com.technokratos.agona.enums.SeatClass;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FlightSearchRequest {

    @NotBlank
    private String from;

    @NotBlank
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
