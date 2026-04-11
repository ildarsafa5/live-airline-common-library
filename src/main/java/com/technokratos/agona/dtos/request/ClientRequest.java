package com.technokratos.agona.dtos.request;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class ClientRequest {
    private String lastName;
    private String firstName;
    private String middleName;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfBirth;
    private PassportRequest passport;
    private TravelPassportRequest travelPassport;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public TravelPassportRequest getTravelPassport() {
        return travelPassport;
    }

    public void setTravelPassport(TravelPassportRequest travelPassport) {
        this.travelPassport = travelPassport;
    }

    public PassportRequest getPassport() {
        return passport;
    }

    public void setPassport(PassportRequest passport) {
        this.passport = passport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
