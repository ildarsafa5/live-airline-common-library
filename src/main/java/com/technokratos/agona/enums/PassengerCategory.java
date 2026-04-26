package com.technokratos.agona.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public enum PassengerCategory {
    ADULT(new BigDecimal("1.00")),
    CHILD(new BigDecimal("0.75")),
    INFANT(new BigDecimal("0.10"));

    private final BigDecimal priceCoefficient;
}
