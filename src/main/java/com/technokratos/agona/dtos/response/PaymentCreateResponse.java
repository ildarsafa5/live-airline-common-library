package com.technokratos.agona.dtos.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PaymentCreateResponse {
    private UUID paymentId;
    private String confirmationUrl;
}