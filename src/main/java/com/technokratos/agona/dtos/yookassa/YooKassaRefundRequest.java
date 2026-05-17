package com.technokratos.agona.dtos.yookassa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YooKassaRefundRequest {

    @JsonProperty("payment_id")
    private String paymentId;

    private YooKassaAmount amount;
}