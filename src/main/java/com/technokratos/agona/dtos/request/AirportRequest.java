package com.technokratos.agona.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AirportRequest {

    @NotBlank
    @Pattern(regexp = "^[A-Z]{3}$", message = "Код аэропорта должен содержать 3 заглавные латинские буквы (SVO, KZN...")
    private String code;

    @NotBlank
    @Size(max = 100)
    private String city;

    @NotBlank
    @Size(max = 100)
    @Pattern(regexp = "^[A-Za-z\\s\\-']+$", message = "Название города на английском языке: только латинские буквы, пробелы, дефисы, апострофы")
    private String cityEn;

    @NotBlank
    @Size(max = 40)
    private String timezone;
}