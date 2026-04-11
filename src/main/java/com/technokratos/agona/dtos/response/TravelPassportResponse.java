package com.technokratos.agona.dtos.response;

import java.time.LocalDate;
import java.util.UUID;

public class TravelPassportResponse {
    private UUID tPassportId;
    private String series;
    private String number;
    private LocalDate dateOfIssue;
    private LocalDate dateOfExpiry;

    public UUID getTPassportId() {
        return tPassportId;
    }

    public void setTPassportId(UUID tPassportId) {
        this.tPassportId = tPassportId;
    }

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

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }
}
