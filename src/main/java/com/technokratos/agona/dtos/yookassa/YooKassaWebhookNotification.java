package com.technokratos.agona.dtos.yookassa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YooKassaWebhookNotification {
    private String type;
    private String event;
    private YooKassaWebhookObject object;
}