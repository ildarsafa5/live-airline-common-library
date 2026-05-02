package com.technokratos.agona.dtos.yookassa;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class YooKassaCreatePaymentRequest {
    private YooKassaAmount amount;
    private boolean capture;
    private YooKassaConfirmation confirmation;
    private String description;
}