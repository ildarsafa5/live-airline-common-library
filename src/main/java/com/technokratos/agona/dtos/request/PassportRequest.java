package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class PassportRequest {
    private String series;
    private String number;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfIssue;


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
}
