package com.technokratos.agona.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class CabbieRegisterRequest extends RegisterRequest {

    @NotBlank
    @Pattern(regexp = "^[А-ЯЁ][а-яё]*$", message = "Должно содержать только русские буквы, первая буква заглавная")
    private String lastName;
    @NotBlank
    @Pattern(regexp = "^[А-ЯЁ][а-яё]*$", message = "Должно содержать только русские буквы, первая буква заглавная")
    private String firstName;
    @NotBlank
    @Pattern(regexp = "^[А-ЯЁ][а-яё]*$", message = "Должно содержать только русские буквы, первая буква заглавная")
    private String middleName;
    @NotBlank
    @Pattern(regexp = "^\\+7\\d{10}$", message = "Номер телефона должен быть в формате +7XXXXXXXXXX")
    private String phone;
    @NotBlank
    @Pattern(regexp = "^[А-ЯЁ][а-яё]{1,49}$",
            message = "Название города должно начинаться с заглавной буквы, содержать только русские буквы и быть не длиннее 50 символов")
    private String city;
    @NotNull(message = "Цена обязательна")
    @DecimalMin(value = "100.00", message = "Цена должна быть больше 100")
    @DecimalMax(value = "5999.99", message = "Цена слишком большая")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
