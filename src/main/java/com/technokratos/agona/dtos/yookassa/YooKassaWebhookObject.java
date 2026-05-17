package com.technokratos.agona.dtos.yookassa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YooKassaWebhookObject {
    private String id;
    private String status;
    private YooKassaAmount amount;
}