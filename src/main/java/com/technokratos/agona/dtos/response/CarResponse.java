package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.CarClass;

public class CarResponse {

    private CarClass carClass;
    private String model;
    private String plateNumber;

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
