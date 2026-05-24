package com.technokratos.agona.dtos.request;

import com.technokratos.agona.enums.CarClass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CarRequest {
    @NotNull
    private CarClass carClass;
    @NotBlank(message = "Модель автомобиля обязательна")
    @Size(min = 2, max = 50, message = "Модель должна быть от 2 до 50 символов")
    @Pattern(regexp = "^[A-Za-zА-Яа-я0-9\\s\\-]+$",
            message = "Модель может содержать только буквы, цифры, пробелы и дефисы")
    private String model;
    @NotBlank(message = "Номерной знак обязателен")
    @Size(min = 5, max = 15, message = "Номерной знак должен содержать от 5 до 15 символов")
    private String plateNumber;


    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
