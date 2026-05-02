package com.technokratos.agona.dtos.events;

import com.technokratos.agona.enums.OrderType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class PaymentSucceededEvent {
    private UUID paymentId;
    private UUID orderId;
    private OrderType orderType;
    private BigDecimal amount;
    private Instant paidAt;
}