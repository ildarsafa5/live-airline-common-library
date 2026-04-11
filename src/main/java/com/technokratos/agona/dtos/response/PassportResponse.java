package com.technokratos.agona.dtos.response;

import java.time.LocalDate;
import java.util.UUID;

public class PassportResponse {
    private UUID passportId;
    private String series;
    private String number;
    private LocalDate dateOfIssue;

    public UUID getPassportId() {
        return passportId;
    }

    public void setPassportId(UUID passportId) {
        this.passportId = passportId;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
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
}
