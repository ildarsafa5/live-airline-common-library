package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.BookingStatus;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class BookingResponse {
    private UUID id;
    private String userEmail;
    private BookingStatus bookingStatus;
    private BigDecimal totalPrice;
    private OffsetDateTime createdAt;
    private OffsetDateTime bookedAt;
    private List<TicketResponse> tickets;
}
