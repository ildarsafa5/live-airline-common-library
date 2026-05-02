package com.technokratos.agona.dtos.yookassa;

import lombok.Data;

@Data
public class YooKassaWebhookObject {
    private String id;
    private String status;
    private YooKassaAmount amount;
}