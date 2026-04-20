package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class TravelPassportRequest {
    @NotBlank
    @Pattern(regexp = "^\\d{2}$", message = "Серия загранпаспорта должна содержать 2 цифры")
    private String series;
    @NotBlank
    @Pattern(regexp = "^\\d{7}$", message = "Номер загранпаспорта должен содержать 7 цифр")
    private String number;
    @NotNull
    @Past
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfIssue;
    @NotNull
    @Future
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
