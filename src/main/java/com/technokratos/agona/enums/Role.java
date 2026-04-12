package com.technokratos.agona.enums;

import java.util.List;

public enum Role {
    CLIENT(List.of("CLIENT")),
    ADMIN(List.of("ADMIN")),
    SCHEDULER(List.of("SCHEDULER")),
    CABBIE(List.of("CABBIE"));

    private final List<String> authorities;

    Role(List<String> authorities) {
        this.authorities = authorities;
    }

    List<String> authorities() {
        return authorities;
    }
}