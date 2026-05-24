package com.technokratos.agona.dtos.request;

import com.technokratos.agona.enums.Day;
import jakarta.validation.constraints.NotNull;

import java.time.LocalTime;

public class WorkingHoursRequest {

    @NotNull
    private Day dayOfWeek;
    @NotNull
    private LocalTime startTime;
    @NotNull
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Day getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Day dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
