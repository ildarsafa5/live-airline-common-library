package com.technokratos.agona.enums;

public enum SeatClass {
    ECONOMY("Эконом"),
    BUSINESS("Бизнес");

    private final String displayName;

    SeatClass(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}