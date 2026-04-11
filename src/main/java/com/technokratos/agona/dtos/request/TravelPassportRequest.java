package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class TravelPassportRequest {
    private String series;
    private String number;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfIssue;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfExpiry;
}
