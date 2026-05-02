package com.technokratos.agona.dtos.yookassa;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class YooKassaAmount {
    private String value;
    private String currency;
}