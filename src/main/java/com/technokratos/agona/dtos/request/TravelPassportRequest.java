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


    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
}
