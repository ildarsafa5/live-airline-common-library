package com.technokratos.agona.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AirportRequest {

    @NotBlank
    @Pattern(regexp = "^[A-Z]{3}$")
    private String code;

    @NotBlank
    @Size(max = 100)
    private String city;

    @NotBlank
    @Size(max = 40)
    private String timezone;
}