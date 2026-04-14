package com.technokratos.agona.dtos.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class AirportResponse {
    private UUID id;
    private String code;
    private String city;
    private String timezone;
}
