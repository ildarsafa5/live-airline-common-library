package com.technokratos.agona.dtos.yookassa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class YooKassaAmount {
    private String value;
    private String currency;
}