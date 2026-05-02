package com.technokratos.agona.dtos.events;

import com.technokratos.agona.enums.OrderType;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PaymentRefundEvent {
    private UUID orderId;
    private OrderType orderType;
}