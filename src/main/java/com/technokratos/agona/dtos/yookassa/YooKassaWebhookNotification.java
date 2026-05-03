package com.technokratos.agona.dtos.yookassa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YooKassaWebhookNotification {
    private String type;
    private String event;
    private YooKassaWebhookObject object;
}