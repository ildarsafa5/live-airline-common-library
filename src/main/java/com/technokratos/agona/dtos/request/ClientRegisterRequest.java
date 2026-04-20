package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public class ClientRegisterRequest extends RegisterRequest {
    @NotBlank
    @Pattern(regexp = "^[А-ЯЁ][а-яё]*$", message = "Должно содержать только русские буквы, первая буква заглавная")
    private String lastName;
    @NotBlank
    @Pattern(regexp = "^[А-ЯЁ][а-яё]*$", message = "Должно содержать только русские буквы, первая буква заглавная")
    private String firstName;
    @Pattern(regexp = "^[А-ЯЁ][а-яё]*$", message = "Должно содержать только русские буквы, первая буква заглавная")
    private String middleName;
    @NotNull
    @Past
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfBirth;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
}
