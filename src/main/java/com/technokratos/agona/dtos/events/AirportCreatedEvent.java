package com.technokratos.agona.dtos.events;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class AirportCreatedEvent extends BasicEvent {
    private String city;
}
