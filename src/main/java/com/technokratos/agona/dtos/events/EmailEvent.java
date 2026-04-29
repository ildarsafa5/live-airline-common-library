package com.technokratos.agona.dtos.events;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class EmailEvent {
    private String email;
}