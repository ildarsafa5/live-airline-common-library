package com.technokratos.agona.dtos.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class BookingCreateRequest {

    @NotNull
    private UUID flightId;

    @NotEmpty
    @Size(min = 1)
    @Valid
    private List<PassengerRequest> passengers;
}
