package com.technokratos.agona.dtos.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AirportCreatedEvent extends BasicEvent {
    private String city;
}
