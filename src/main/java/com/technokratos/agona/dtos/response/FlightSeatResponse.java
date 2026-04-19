package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.SeatClass;
import com.technokratos.agona.enums.SeatStatus;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class FlightSeatResponse {
    private UUID id;
    private String seatNumber;
    private SeatClass seatClass;
    private SeatStatus status;
    private BigDecimal price;
}