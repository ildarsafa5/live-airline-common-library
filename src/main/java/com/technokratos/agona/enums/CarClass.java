package com.technokratos.agona.enums;

public enum CarClass {
    ECONOMY("Эконом"),
    COMFORT("Комфорт"),
    BUSINESS("Бизнес"),
    PREMIUM("Премиум");

    private final String displayName;

    CarClass(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
