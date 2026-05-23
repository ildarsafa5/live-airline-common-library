package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.Day;

import java.time.LocalTime;

public class WorkingHoursResponse {
    private Day dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public Day getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Day dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

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
}
