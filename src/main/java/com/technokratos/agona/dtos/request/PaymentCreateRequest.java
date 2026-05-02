package com.technokratos.agona.dtos.request;

import com.technokratos.agona.enums.OrderType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class PaymentCreateRequest {

    @NotNull
    private UUID orderId;

    @NotNull
    private OrderType orderType;

    @NotNull
    @DecimalMin("0.01")
    private BigDecimal amount;

    @NotBlank
    private String returnUrl;
}