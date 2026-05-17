package com.technokratos.agona.dtos.yookassa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YooKassaCreatePaymentRequest {
    private YooKassaAmount amount;
    private boolean capture;
    private YooKassaConfirmation confirmation;
    private String description;
}