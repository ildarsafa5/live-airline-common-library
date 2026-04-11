package com.technokratos.agona.dtos.response;

import java.time.LocalDate;
import java.util.UUID;

public class ClientResponse {

    private UUID accountId;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;
    private PassportResponse passport;
    private TravelPassportResponse travelPassport;

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

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

    public PassportResponse getPassport() {
        return passport;
    }

    public void setPassport(PassportResponse passport) {
        this.passport = passport;
    }

    public TravelPassportResponse getTravelPassport() {
        return travelPassport;
    }

    public void setTravelPassport(TravelPassportResponse travelPassport) {
        this.travelPassport = travelPassport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
