package com.technokratos.agona.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum PassengerCategory {
    ADULT(new BigDecimal("1.00")),
    CHILD(new BigDecimal("0.75")),
    INFANT(new BigDecimal("0.10"));

    private final BigDecimal priceCoefficient;

    PassengerCategory(BigDecimal priceCoefficient) {
        this.priceCoefficient = priceCoefficient;
    }
}
