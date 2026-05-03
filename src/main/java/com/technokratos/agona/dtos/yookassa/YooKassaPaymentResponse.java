package com.technokratos.agona.dtos.yookassa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YooKassaPaymentResponse {
    private String id;
    private String status;
    private YooKassaAmount amount;
    private YooKassaConfirmation confirmation;
    private boolean paid;
}