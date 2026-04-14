package com.technokratos.agona.dtos.request;

import lombok.Data;

@Data
public class AirportRequest {
    private String code;
    private String city;
    private String timezone;
}
