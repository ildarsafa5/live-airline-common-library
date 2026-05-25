package com.technokratos.agona.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AirportResponse {
    private UUID id;
    private String code;
    private String city;
    private String timezone;
}
