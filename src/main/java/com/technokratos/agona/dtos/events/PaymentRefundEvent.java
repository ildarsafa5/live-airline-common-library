package com.technokratos.agona.dtos.events;

import com.technokratos.agona.enums.OrderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentRefundEvent {
    private UUID orderId;
    private OrderType orderType;
}