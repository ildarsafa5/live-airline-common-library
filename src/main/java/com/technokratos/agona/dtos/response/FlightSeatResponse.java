package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.SeatClass;
import com.technokratos.agona.enums.SeatStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightSeatResponse {
    private UUID id;
    private String seatNumber;
    private SeatClass seatClass;
    private SeatStatus status;
    private BigDecimal price;
}