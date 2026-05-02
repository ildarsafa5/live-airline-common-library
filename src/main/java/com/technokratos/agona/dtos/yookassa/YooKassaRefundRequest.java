package com.technokratos.agona.dtos.yookassa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class YooKassaRefundRequest {

    @JsonProperty("payment_id")
    private String paymentId;

    private YooKassaAmount amount;
}