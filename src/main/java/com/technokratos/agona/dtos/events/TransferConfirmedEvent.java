package com.technokratos.agona.dtos.events;

import com.technokratos.agona.enums.CarClass;
import com.technokratos.agona.enums.TransferDirection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TransferConfirmedEvent extends EmailEvent {
    private UUID transferId;
    private UUID bookingId;
    private TransferDirection direction;
    private String address;
    private String city;
    private String airportCode;
    private OffsetDateTime scheduledAt;
    private CarClass carClass;
    private BigDecimal price;
    private String cabbieFirstName;
    private String cabbieLastName;
    private String cabbiePhone;
    private String carModel;
    private String plateNumber;
}
