package com.technokratos.agona.dtos.yookassa;

import lombok.Data;

@Data
public class YooKassaPaymentResponse {
    private String id;
    private String status;
    private YooKassaAmount amount;
    private YooKassaConfirmation confirmation;
    private boolean paid;
}