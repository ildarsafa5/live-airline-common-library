package com.technokratos.agona.dtos.yookassa;

import lombok.Data;

@Data
public class YooKassaWebhookNotification {
    private String type;
    private String event;
    private YooKassaWebhookObject object;
}