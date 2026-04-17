package com.technokratos.agona.dtos.request;

import com.technokratos.agona.enums.SeatClass;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FlightSearchRequest {
    private String from;
    private String to;
    private LocalDate date;
    private SeatClass seatClass;
    private Integer passenger;
}
