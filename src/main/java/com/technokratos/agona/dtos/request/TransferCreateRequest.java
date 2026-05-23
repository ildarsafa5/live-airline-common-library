package com.technokratos.agona.dtos.request;


import com.technokratos.agona.enums.CarClass;
import com.technokratos.agona.enums.TransferDirection;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransferCreateRequest {

    @NotNull
    private UUID bookingId;

    @NotBlank
    @Size(min = 1, max = 500, message = "Адрес от 1 до 500 символов!")
    private String address;

    @NotNull
    private TransferDirection direction;

    @NotNull
    private CarClass carClass;
}
