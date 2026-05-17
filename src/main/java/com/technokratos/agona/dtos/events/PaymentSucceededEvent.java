package com.technokratos.agona.dtos.events;

import com.technokratos.agona.enums.OrderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentSucceededEvent {
    private UUID paymentId;
    private UUID orderId;
    private OrderType orderType;
    private BigDecimal amount;
    private Instant paidAt;
}